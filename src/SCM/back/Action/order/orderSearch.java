package SCM.back.Action.order;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import SCM.back.Page.order.Order;

public class orderSearch {
	public static void shopNameSearch(WebDriver driver,String shopName) throws InterruptedException{
		Order.shopName(driver).sendKeys(shopName);
		Order.search(driver).click();
		Thread.sleep(1000);
//		Order.shopName(driver).clear();
//		Order.search(driver).click();
	}
	
	public static void foodNameSearch(WebDriver driver,String foodName) throws InterruptedException{
		Order.sku_name(driver).sendKeys(foodName);
		Order.search(driver).click();
		Thread.sleep(1000);
		Order.sku_name(driver).clear();
		Order.search(driver).click();
	}
	
	public static void StatusSearch(WebDriver driver,int index) throws Exception{
		Order.StatusOptions(driver).get(index).click();
		Order.search(driver).click();
		Thread.sleep(1000);
	}
}
