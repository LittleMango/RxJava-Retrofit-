package mango.mango.rxjavaretrofitreview.Http;

import mango.mango.rxjavaretrofitreview.Bean.BoxData;
import mango.mango.rxjavaretrofitreview.Bean.CommentData;
import mango.mango.rxjavaretrofitreview.Bean.HttpBean;
import mango.mango.rxjavaretrofitreview.Bean.TopicData;
import mango.mango.rxjavaretrofitreview.Consts.RequestCons;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by mango on 2016/10/8.
 */
public interface DataService {

    @GET(RequestCons.MY_BOX)
    Observable<HttpBean<BoxData>> getBox(@Query("client_id") String client_id, @Query("client_secret") String secret, @Query("visit_user_id") long user_id);

    @GET(RequestCons.COMMENTS_LIST)
    Observable<HttpBean<CommentData>> getComments(@Query("client_id") String client_id, @Query("client_secret") String secret, @Query("object_id") long object_id);

    @GET(RequestCons.TOPIC)
    Observable<HttpBean<TopicData>> getTopic(@Query("client_id") String client_id, @Query("client_secret") String secret, @Query("id") long id);
}
