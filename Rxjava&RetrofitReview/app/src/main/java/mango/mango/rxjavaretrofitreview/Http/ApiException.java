package mango.mango.rxjavaretrofitreview.Http;


import mango.mango.rxjavaretrofitreview.Util.StatusUtils;

/**
 * Created by mango on 16/8/18.
 */
public class ApiException extends RuntimeException {

    public ApiException(int status) {
        super(getErrorDesc(status));
    }

    private static String getErrorDesc(int status){
        return StatusUtils.judgeStatus(status).desc;
    }
}
