package utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties; 

public class ReadLoginInfo {
    public static void main(String[] args) throws Exception { 

    } 
	public ArrayList<HashMap<String, String>> parser3Xml() throws Exception {
		ArrayList<HashMap<String, String>>list = new ArrayList<HashMap<String, String>>();
    	Properties props = new Properties();
    	props.load(ReadLoginInfo.class.getClassLoader().getResourceAsStream("utils/login.properties"));
  	  	String url = props.getProperty("url");
  	  	String username = props.getProperty("username");
  	  	String password = props.getProperty("password");
  	  	System.out.println("url==="+url +"\n"+"username==="+username +"\n"+"password==="+password); 
		return list;
	}
}
