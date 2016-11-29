package mango.mango.rxjavaretrofitreview.Presenter;


import mango.mango.rxjavaretrofitreview.Bean.BoxData;
import mango.mango.rxjavaretrofitreview.Bean.CommentData;
import mango.mango.rxjavaretrofitreview.Bean.TopicData;
import mango.mango.rxjavaretrofitreview.Http.FilterSubscriber;
import mango.mango.rxjavaretrofitreview.Model.ModelPresenter;
import mango.mango.rxjavaretrofitreview.Model.ModelPresenterImpl;
import mango.mango.rxjavaretrofitreview.Util.MLog;
import mango.mango.rxjavaretrofitreview.View.MainView;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.schedulers.Schedulers;

/**
 * Created by mango on 2016/10/8.
 */
public class DataPresenterImpl implements DataPresenter {

    private MainView mMainView;
    private ModelPresenter mModelPresenter;

    public DataPresenterImpl(MainView mMainView) {
        this.mMainView = mMainView;
        mModelPresenter = new ModelPresenterImpl();
    }


    @Override
    public void loadBoxFailure() {
        Observable<BoxData> observable = mModelPresenter.loadBoxData("bt_app_ios", "1", 250844);
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe(new Action0() {
                    @Override
                    public void call() {
                        MLog.d("开始下载box信息" + Thread.currentThread());
                    }
                }).subscribeOn(AndroidSchedulers.mainThread())
                .subscribe(new FilterSubscriber<BoxData>() {
                    @Override
                    public void onCompleted() {
                        MLog.d("box信息下载完毕");
                    }

                    @Override
                    public void onNext(BoxData data) {
                        mMainView.showSuccess(data);
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        mMainView.showError(error);
                    }
                });
    }

    @Override
    public void loadBoxSuccess() {
        Observable<BoxData> observable = mModelPresenter.loadBoxData("bt_app_ios", "9c1e6634ce1c5098e056628cd66a17a5", 250844);
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe(new Action0() {
                    @Override
                    public void call() {
                        MLog.d("开始下载box信息" + Thread.currentThread());
                    }
                }).subscribeOn(AndroidSchedulers.mainThread())
                .subscribe(new FilterSubscriber<BoxData>() {
                    @Override
                    public void onCompleted() {
                        MLog.d("box信息下载完毕");
                    }

                    @Override
                    public void onNext(BoxData data) {
                        mMainView.showSuccess(data);
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        mMainView.showError(error);
                    }
                });
    }

    @Override
    public void loadCommentFailure() {
        Observable<CommentData> observable = mModelPresenter.loadCommentData("bt_app_ios", "1", 65666);
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe(new Action0() {
                    @Override
                    public void call() {
                        MLog.d("开始下载comment信息" + Thread.currentThread());
                    }
                }).subscribeOn(AndroidSchedulers.mainThread())
                .subscribe(new FilterSubscriber<CommentData>() {
                    @Override
                    public void onCompleted() {
                        MLog.d("comment信息下载完毕");
                    }

                    @Override
                    public void onNext(CommentData data) {
                        mMainView.showSuccess(data);
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        mMainView.showError(error);
                    }
                });
    }

    @Override
    public void loadCommentSuccess() {
        Observable<CommentData> observable = mModelPresenter.loadCommentData("bt_app_ios", "9c1e6634ce1c5098e056628cd66a17a5", 65666);
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe(new Action0() {
                    @Override
                    public void call() {
                        MLog.d("开始下载comment信息" + Thread.currentThread());
                    }
                }).subscribeOn(AndroidSchedulers.mainThread())
                .subscribe(new FilterSubscriber<CommentData>() {
                    @Override
                    public void onCompleted() {
                        MLog.d("comment信息下载完毕");
                    }

                    @Override
                    public void onNext(CommentData data) {
                        mMainView.showSuccess(data);
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        mMainView.showError(error);
                    }
                });
    }

    @Override
    public void loadTopicFailure() {
        Observable<TopicData> observable = mModelPresenter.loadTopic("bt_app_ios", "1", 1346);
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe(new Action0() {
                    @Override
                    public void call() {
                        MLog.d("开始下载Topic信息" + Thread.currentThread());
                    }
                }).subscribeOn(AndroidSchedulers.mainThread())
                .subscribe(new FilterSubscriber<TopicData>() {
                    @Override
                    public void onCompleted() {
                        MLog.d("Topic信息下载完毕");
                    }

                    @Override
                    public void onNext(TopicData data) {
                        mMainView.showSuccess(data);
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        mMainView.showError(error);
                    }
                });
    }

    @Override
    public void loadTopicSuccess() {
        Observable<TopicData> observable = mModelPresenter.loadTopic("bt_app_ios", "9c1e6634ce1c5098e056628cd66a17a5", 1346);
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new FilterSubscriber<TopicData>() {
                    @Override
                    public void onCompleted() {
                        MLog.d("Topic信息下载完毕");
                    }

                    @Override
                    public void onNext(TopicData data) {
                        mMainView.showSuccess(data);
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        mMainView.showError(error);
                    }
                });
    }
}
