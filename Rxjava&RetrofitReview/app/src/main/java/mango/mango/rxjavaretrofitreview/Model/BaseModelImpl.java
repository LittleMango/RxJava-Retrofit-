package mango.mango.rxjavaretrofitreview.Model;

import java.util.concurrent.TimeUnit;

import mango.mango.rxjavaretrofitreview.Bean.HttpBean;
import mango.mango.rxjavaretrofitreview.Consts.RequestCons;
import mango.mango.rxjavaretrofitreview.Http.ApiException;
import mango.mango.rxjavaretrofitreview.Http.DataService;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.functions.Func1;

/**
 * 创建retrofit对象和modelService对象
 * 以及状态码的判断
 * Created by mango on 16/8/18.
 */
public class BaseModelImpl<T> {
    private String baseUrl;
    private Retrofit mRetrofit;
    public DataService mDataService;

    public BaseModelImpl() {
        this.baseUrl = RequestCons.BASE_URL;
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .build();
        mRetrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        mDataService = mRetrofit.create(DataService.class);

    }

    /**
     * 给返回结果去掉状态码等属性,
     * 如果是查询出错,则返回状态码对应的描述给用户
     * @param observable
     * @return
     */
    public Observable filterStatus(Observable observable){
        return observable.map(new ResultFilter());
    }

    private class ResultFilter<T> implements Func1<HttpBean<T>, T> {
        @Override
        public T call(HttpBean<T> tHttpBean) {
            if (tHttpBean.getStatus() != 1){
                throw new ApiException(tHttpBean.getStatus());
            }
            return tHttpBean.getData();
        }
    }

}
