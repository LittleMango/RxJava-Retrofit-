package mango.mango.rxjavaretrofitreview.Model;

import mango.mango.rxjavaretrofitreview.Bean.BoxData;
import mango.mango.rxjavaretrofitreview.Bean.CommentData;
import mango.mango.rxjavaretrofitreview.Bean.TopicData;
import rx.Observable;

/**
 * Created by mango on 2016/10/9.
 */
public class ModelPresenterImpl extends BaseModelImpl implements ModelPresenter {

    @Override
    public Observable<BoxData> loadBoxData(String client_id, String secret, long user_id) {
        return filterStatus(mDataService.getBox(client_id,secret,user_id));
    }

    @Override
    public Observable<CommentData> loadCommentData(String client_id, String secret, long object_id) {
        return filterStatus(mDataService.getComments(client_id,secret,object_id));
    }

    @Override
    public Observable<TopicData> loadTopic(String client_id, String secret, long id) {
        return filterStatus(mDataService.getTopic(client_id,secret,id));
    }

}
