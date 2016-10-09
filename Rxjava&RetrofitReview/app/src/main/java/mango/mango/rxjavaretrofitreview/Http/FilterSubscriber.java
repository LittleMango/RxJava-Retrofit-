package mango.mango.rxjavaretrofitreview.Http;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeoutException;

import rx.Subscriber;

/**
 * Created by mango on 16/8/18.
 */
public abstract class FilterSubscriber<T> extends Subscriber<T> {

    public String error;
    @Override
    public abstract void onCompleted();

    @Override
    public void onError(Throwable e) {
        if (e instanceof TimeoutException || e instanceof SocketTimeoutException
                || e instanceof ConnectException){
            error = "超时了";
        }else {
            error = e.getMessage();
        }
    }

    @Override
    public abstract void onNext(T data);
}
