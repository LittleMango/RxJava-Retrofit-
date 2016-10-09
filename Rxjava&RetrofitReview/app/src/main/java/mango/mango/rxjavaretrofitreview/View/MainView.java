package mango.mango.rxjavaretrofitreview.View;

import java.util.ArrayList;

import mango.mango.rxjavaretrofitreview.Bean.BoxData;
import mango.mango.rxjavaretrofitreview.Bean.Boxlist;
import mango.mango.rxjavaretrofitreview.Bean.CommentData;
import mango.mango.rxjavaretrofitreview.Bean.TopicData;

/**
 * Created by mango on 2016/10/8.
 */
public interface MainView {

    /**
     * 呈现失败的结果
     * @param error
     */
    void showError(String error);

    /**
     * 呈现Box成功的结果
     * @param boxData
     */
    void showSuccess(BoxData boxData);

    /**
     * 呈现Comment成功的结果
     * @param commentData
     */
    void showSuccess(CommentData commentData);

    /**
     * 呈现Topic成功的结果
     * @param topicData
     */
    void showSuccess(TopicData topicData);
}
