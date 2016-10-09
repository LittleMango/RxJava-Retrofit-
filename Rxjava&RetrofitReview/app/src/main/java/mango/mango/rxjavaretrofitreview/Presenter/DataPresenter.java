package mango.mango.rxjavaretrofitreview.Presenter;


/**
 * Created by mango on 2016/10/8.
 */
public interface DataPresenter {

    /**
     * 下载Box失败的结果
     */
    void loadBoxFailure();

    /**
     * 下载Box成功的结果
     */
    void loadBoxSuccess();

    /**
     * 下载Comment失败的结果
     */
    void loadCommentFailure();

    /**
     * 下载Comment成功的结果
     */
    void loadCommentSuccess();

    /**
     * 下载Topic失败的结果
     */
    void loadTopicFailure();

    /**
     * 下载Topic成功的结果
     */
    void loadTopicSuccess();
}
