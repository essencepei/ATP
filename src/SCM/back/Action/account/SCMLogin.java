package SCM.back.Action.account;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SCM.back.Page.account.login;
import utils.PropertyUtil;

public class SCMLogin {
	public static void Login(WebDriver driver){
		String logintoken = null;
		login.Login_UserName(driver).sendKeys(PropertyUtil.getProperties().getProperty("username"));
		login.pwd(driver).sendKeys(PropertyUtil.getProperties().getProperty("password"));
		login.click_button(driver).click();
	}
	
	public void fLogin(WebDriver driver){
		String logintoken = null;
		login.Login_UserName(driver).sendKeys(PropertyUtil.getProperties().getProperty("fusername"));
		login.pwd(driver).sendKeys(PropertyUtil.getProperties().getProperty("fpassword"));
		login.click_button(driver).click();
	}
}
