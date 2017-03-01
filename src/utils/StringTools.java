package utils;

public class StringTools {
	public static boolean isNull(String str){
		return(str == null ? true : false);
	}
	public static boolean isEmpty(String str){
		return(str.equals("") ? true : false);
	}
	public static boolean isNullorEmpty(String str){
		return(isNull(str)||isEmpty(str));
	}
}
