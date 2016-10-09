package mango.mango.rxjavaretrofitreview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import mango.mango.rxjavaretrofitreview.Bean.BoxData;
import mango.mango.rxjavaretrofitreview.Bean.Boxlist;
import mango.mango.rxjavaretrofitreview.Bean.CommentData;
import mango.mango.rxjavaretrofitreview.Bean.TopicData;
import mango.mango.rxjavaretrofitreview.Presenter.DataPresenter;
import mango.mango.rxjavaretrofitreview.Presenter.DataPresenterImpl;
import mango.mango.rxjavaretrofitreview.Util.MLog;
import mango.mango.rxjavaretrofitreview.View.MainView;


public class MainActivity extends BaseAppCompActivity implements View.OnClickListener,MainView {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @BindView(R.id.bt_box_failure)
    Button mBtn_box_failure;

    @BindView(R.id.bt_box_success)
    Button mBtn_box_success;

    @BindView(R.id.bt_comment_failure)
    Button mBtn_com_failure;

    @BindView(R.id.bt_comment_success)
    Button mBtn_com_success;

    @BindView(R.id.bt_topic_failure)
    Button mBtn_top_failure;

    @BindView(R.id.bt_topic_success)
    Button mBtn_top_success;

    private DataPresenter mDataPresenter;


    /**
     * 个人中心的
     * http://open3.bantangapp.com/users/likes/myBox?client_id=bt_app_ios&visit_user_id=250844
     * http://open3.bantangapp.com/users/likes/myBox?client_id=bt_app_ios&client_secret=9c1e6634ce1c5098e056628cd66a17a5&visit_user_id=250844
     */

    /**
     * 评论
     * http://open3.bantangapp.com/comm/comments/list?client_id=bt_app_ios&object_id=65666
     * http://open3.bantangapp.com/comm/comments/list?client_id=bt_app_ios&client_secret=9c1e6634ce1c5098e056628cd66a17a5&object_id=65666
     */

    /**
     * 专题详情
     * http://open3.bantangapp.com/topic/info?client_id=bt_app_ios&id=1346
     * http://open3.bantangapp.com/topic/info?client_id=bt_app_ios&client_secret=9c1e6634ce1c5098e056628cd66a17a5&id=1346
     */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        mToolbar.setTitle("Title");
        mToolbar.setSubtitle("Subtitle");

        mDataPresenter = new DataPresenterImpl(this);

        initListener();
    }

    private void initListener() {
        mBtn_box_failure.setOnClickListener(this);
        mBtn_box_success.setOnClickListener(this);
        mBtn_com_failure.setOnClickListener(this);
        mBtn_com_success.setOnClickListener(this);
        mBtn_top_failure.setOnClickListener(this);
        mBtn_top_success.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int ids = v.getId();
        switch (ids){
            case R.id.bt_box_failure:
                MLog.d("点击了Box下载失败按钮");
                mDataPresenter.loadBoxFailure();
                break;
            case R.id.bt_box_success:
                MLog.d("点击了Box下载成功按钮");
                mDataPresenter.loadBoxSuccess();
                break;
            case R.id.bt_comment_failure:
                MLog.d("点击了Comment下载失败按钮");
                mDataPresenter.loadCommentFailure();
                break;
            case R.id.bt_comment_success:
                MLog.d("点击了Comment下载成功按钮");
                mDataPresenter.loadCommentSuccess();
                break;
            case R.id.bt_topic_failure:
                MLog.d("点击了Topic下载失败按钮");
                mDataPresenter.loadTopicFailure();
                break;
            case R.id.bt_topic_success:
                MLog.d("点击了Topic下载成功按钮");
                mDataPresenter.loadTopicSuccess();
                break;
        }
    }

    @Override
    public void showError(String error) {
        MLog.d("下载失败:" + error);
    }

    @Override
    public void showSuccess(BoxData boxData) {
        MLog.d("下载到的box信息:" + boxData);
    }

    @Override
    public void showSuccess(CommentData commentData) {
        MLog.d("下载到的评论信息:" + commentData);
    }

    @Override
    public void showSuccess(TopicData topicData) {
        MLog.d("下载到的Topic信息:" + topicData);
    }
}
