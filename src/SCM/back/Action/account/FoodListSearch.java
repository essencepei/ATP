package SCM.back.Action.account;

import org.openqa.selenium.WebDriver;

import SCM.back.Page.order.FoodList;

public class FoodListSearch {
	public static void NameSearch(WebDriver driver,String FoodName){
		FoodList.foodName(driver).sendKeys(FoodName);
		FoodList.search(driver).click();
		FoodList.foodName(driver).clear();
		FoodList.search(driver).click();
	}
	
	public static void StatusSearch(WebDriver driver, int index) throws InterruptedException{
		FoodList.options(driver).get(index).click();
		Thread.sleep(2000);		
		FoodList.search(driver).click();
	}
}
