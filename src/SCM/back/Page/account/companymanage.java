package SCM.back.Page.account;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import SCM.back.Action.account.SCMLogin;

public class companymanage {
	private static WebElement element = null;
	
	public static WebElement  accountManage(WebDriver driver){
		WebElement kehuguanli = driver.findElement(By.xpath("/html/body/div[3]/ul/li[3]/h3"));
		String shifoudakai = kehuguanli.findElement(By.tagName("dl")).getAttribute("style");
		if(shifoudakai.equals("display: block;")){
			kehuguanli.click();
			element = driver.findElement(By.id("PPN31"));
		}else{
			element = driver.findElement(By.id("PPN31"));
		}
		return element;
	}
	
	public static WebElement  OrderManage(WebDriver driver){
		element = driver.findElement(By.partialLinkText("订单管理"));
		return element;
	}
	
	public static WebElement  FoodClass(WebDriver driver){
		element = driver.findElement(By.partialLinkText("食材分类"));
		return element;
	}
	
	public static WebElement  FoodList(WebDriver driver){
		element = driver.findElement(By.partialLinkText("食材列表"));
		return element;
	}
	
	public static WebElement  Statistics(WebDriver driver){
		element = driver.findElement(By.partialLinkText("门店采购统计"));
		return element;
	}
	
	public static WebElement  Message(WebDriver driver){
		element = driver.findElement(By.partialLinkText("门店留言"));
		return element;
	}
	
	public static WebElement  qty(WebDriver driver){
		element = driver.findElement(By.partialLinkText("库存查询"));
		return element;
	}
}
