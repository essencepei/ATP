package SCM.back.Action.account;

import org.openqa.selenium.WebDriver;

import SCM.back.Page.order.Order;

public class accountSearch {
	public static void shopNameSearch(WebDriver driver,String shopName){
		Order.shopName(driver).sendKeys(shopName);
		Order.search(driver).click();
	}
	
	public static void roleSearch(WebDriver driver,String role){
		Order.sku_name(driver).sendKeys(role);
		Order.search(driver).click();
	}
	
	public static void brandIdSearch(WebDriver driver,String brandId){
		Order.sku_name(driver).sendKeys(brandId);
		Order.search(driver).click();
	}
	
	public static void orderSearch(WebDriver driver,String shopName,String role){
		Order.shopName(driver).sendKeys(shopName);
		Order.sku_name(driver).sendKeys(role);
		Order.search(driver).click();
	}
}
