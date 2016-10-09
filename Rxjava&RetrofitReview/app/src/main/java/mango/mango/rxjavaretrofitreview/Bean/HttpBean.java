package mango.mango.rxjavaretrofitreview.Bean;


/**
 * Created by mango on 2016/10/8.
 */
public class HttpBean<T> {
    private String msg;
    private T data;
    private int status;
    private long ts;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getTs() {
        return ts;
    }

    public void setTs(long ts) {
        this.ts = ts;
    }

    @Override
    public String toString() {
        return "HttpBean{" +
                "msg='" + msg + '\'' +
                ", data=" + data +
                ", status=" + status +
                ", ts=" + ts +
                '}';
    }
}
