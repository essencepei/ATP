package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import SCM.back.TestCase.LoginTest;

public class PropertyUtil {
	private static Properties  props = new Properties();
	public static Properties  getProperties(){
		//配置文件放在当前包下
		try {
			props.load(PropertyUtil.class.getResourceAsStream("/utils/login.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
		}
	//配置文件放在工程下
//		String basePath = logintest.class.getResource("/").getPath();
//		basePath = basePath.substring(0,basePath.lastIndexOf("/bin"));
//		String path =basePath+"/config/url.properties";
//		File file = new File(path);
//		InputStream inStream;
//		try {
//			inStream = new FileInputStream(file);
//			props.load(inStream);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

}
