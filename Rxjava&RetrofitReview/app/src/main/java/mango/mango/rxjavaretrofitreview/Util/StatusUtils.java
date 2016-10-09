package mango.mango.rxjavaretrofitreview.Util;

import mango.mango.rxjavaretrofitreview.Consts.ResponseCons;

/**
 * Created by mango on 2016/10/8.
 */
public class StatusUtils {

    public static class StatusResult{
        public int status;
        public String desc;
        public boolean isSuccess;
    }

    private static StatusResult mStatusResult = new StatusResult();

    public static StatusResult judgeStatus(int status) {

        String desc = "";
        boolean isSuccess = false;
        switch (status) {
            case ResponseCons.STATUS_SUCCESS:
                desc = ResponseCons.SUCCESS_MSG;
                isSuccess = true;
                break;
            case ResponseCons.STATU_1000:
                desc = ResponseCons.FAILURE_1000;
                break;

        }
        mStatusResult.status = status;
        mStatusResult.desc = desc;
        mStatusResult.isSuccess = isSuccess;
        return mStatusResult;
    }
}
