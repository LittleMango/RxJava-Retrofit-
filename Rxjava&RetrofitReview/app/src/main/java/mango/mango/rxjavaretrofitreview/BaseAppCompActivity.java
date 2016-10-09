package mango.mango.rxjavaretrofitreview;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by mango on 16/8/16.
 */
public class BaseAppCompActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            //防止v21的style属性没有设置状态栏颜色为透明
//            getWindow().setStatusBarColor(getResources().getColor(android.R.color.transparent));
//            getWindow()
//                    .getDecorView()
//                    .setSystemUiVisibility(
//                            View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
//
//        } else
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window window = getWindow();
            // Translucent status bar
            window.setFlags(
                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        super.onCreate(savedInstanceState);
    }
}
