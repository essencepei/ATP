package SCM.back.Page.account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.PropertyUtil;

public class login {
	private static WebElement element = null;
	
	public static WebElement  Login_UserName(WebDriver driver){
		element = driver.findElement(By.id("account"));
		return element;
	}
	
	public static WebElement  pwd(WebDriver driver){
		element = driver.findElement(By.id("pwd"));
		return element;
	}
	
	public static WebElement  click_button(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='frm']/div[5]/input"));
		return element;
	}
	public static void frontLogin(WebDriver driver){
		login.Login_UserName(driver).sendKeys(PropertyUtil.getProperties().getProperty("fusername"));
		login.pwd(driver).sendKeys(PropertyUtil.getProperties().getProperty("fpassword"));
		login.click_button(driver).click();
	}
	
	public static void backLogin(WebDriver driver){
		login.Login_UserName(driver).sendKeys(PropertyUtil.getProperties().getProperty("username"));
		login.pwd(driver).sendKeys(PropertyUtil.getProperties().getProperty("password"));
		login.click_button(driver).click();
	}
}
