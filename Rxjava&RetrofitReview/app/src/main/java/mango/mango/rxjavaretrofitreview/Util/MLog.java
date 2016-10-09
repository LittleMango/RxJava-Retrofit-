package mango.mango.rxjavaretrofitreview.Util;

import android.util.Log;

/**
 * 關於日誌的工具類
 */
public class MLog {
	/**
	 * 是否顯示log
	 */
	public static boolean isShow = true; 
	/**
	 * 自定義的tag配置
	 * 如果這個是null的話，會使用自動生成的tag的方式
	 */
	public static String customTagPrefix = null;
	/**
	 * App前缀，方便手机查看log
	 */
	private static String APPCONST = "og_";
	
	/**
	 * 輸出D級別的Log
	 * @param content
	 */
	public static void d(String content) {
		if(!isShow)return;
		Log.d(generateTag(),content);
    }
	/**
	 * 輸出E級別的Log
	 * @param content
	 */
	public static void e(String content) {
		if(!isShow)return;
		Log.e(generateTag(),content);
    }
	/**
	 * 輸出I級別的Log
	 * @param content
	 */
	public static void i(String content) {
		if(!isShow)return;
		Log.i(generateTag(),content);
    }
	/**
	 * 輸出W級別的Log
	 * @param content
	 */
	public static void w(String content) {
		if(!isShow)return;
		Log.w(generateTag(),content);
	}
	/**
	 * 輸出V級別的Log
	 * @param content
	 */
	public static void v(String content) {
		if(!isShow)return;
		Log.v(generateTag(),content);
	}
	/**
	 * 输出assert级别的Log
	 * @param content
	 */
	public static void ass(String content){
		if(!isShow)return;
		Log.wtf(generateTag(),content);
	}
	/**
	 * 生成Tag
	 * @return
	 */
	public static String generateTag(){
		if (customTagPrefix != null) return customTagPrefix;
		StackTraceElement caller = Thread.currentThread().getStackTrace()[4];
		String tag = "%s.%s(L:%d)";
        String callerClazzName = caller.getClassName();
        callerClazzName = callerClazzName.substring(callerClazzName.lastIndexOf(".") + 1);
        tag = String.format(tag, callerClazzName, caller.getMethodName(), caller.getLineNumber());
        tag = APPCONST + tag;
		return tag;
	}
}
