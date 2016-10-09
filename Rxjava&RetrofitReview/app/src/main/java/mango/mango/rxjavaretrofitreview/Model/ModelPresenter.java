package mango.mango.rxjavaretrofitreview.Model;

import mango.mango.rxjavaretrofitreview.Bean.BoxData;
import mango.mango.rxjavaretrofitreview.Bean.CommentData;
import mango.mango.rxjavaretrofitreview.Bean.TopicData;
import rx.Observable;

/**
 * Created by mango on 16/8/18.
 */
public interface ModelPresenter {

    /**
     * 下载box数据接口
     */
    Observable<BoxData> loadBoxData(String client_id, String secret, long user_id);

    /**
     * 下载评论数据接口
     */
    Observable<CommentData> loadCommentData(String client_id, String secret, long object_id);

    /**
     * 下载Topic商品
     */
    Observable<TopicData> loadTopic(String client_id, String secret, long id);

}
