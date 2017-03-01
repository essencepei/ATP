package SCM.back.Page.account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class client {
	private static WebElement element = null;
	public static WebElement  shopname(WebDriver driver){
		element = driver.findElement(By.id("shopName"));
		return element;
	}
	
	public static WebElement  tbody(WebDriver driver){
		element = driver.findElement(By.xpath("//table[@id='table']/tbody"));
		return element;
	}
	
	public static WebElement  pagination(WebDriver driver){
		element = driver.findElement(By.cssSelector("span.pagination-info"));
		return element;
	}
	
	public static WebElement  addclient(WebDriver driver){
		element = driver.findElement(By.cssSelector("body > div.main-content > div > div.scm-toolbar > a:nth-child(1)"));
		return element;
	}
	
	public static WebElement  importclient(WebDriver driver){
		element = driver.findElement(By.cssSelector("body > div.main-content > div > div.scm-toolbar > a:nth-child(2)"));
		return element;
	}
	
	public static WebElement searchButton(WebDriver driver) {
		element = driver.findElement(By.cssSelector("html body div.main-content div.container form.scm-form-filter ul li button.scm-btn-oper"));
		return element;
	}
	
}
