package mango.mango.rxjavaretrofitreview;

import android.app.Application;
import android.content.Context;

/**
 * Created by mango on 16/8/16.
 */
public class MyApplication extends Application {
    public static Context mAppContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppContext = this;
    }
}
