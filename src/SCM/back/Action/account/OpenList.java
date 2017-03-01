package SCM.back.Action.account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import SCM.back.Page.account.companymanage;

public class OpenList {
	public static void openaccountmanage(WebDriver driver){
		companymanage.accountManage(driver).click();
		//id="tbody"
	}
	
	public static void openOrder(WebDriver driver){
		companymanage.OrderManage(driver).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void openFoodClass(WebDriver driver){
		companymanage.FoodClass(driver).click();
		//id="tbody"
	}
	
	public static void openFoodList(WebDriver driver){
		companymanage.FoodList(driver).click();
	}
	
	public static void openMessage(WebDriver driver){
		companymanage.Message(driver).click();
		//id="tbody"
	}
	
	public static void openqty(WebDriver driver){
		companymanage.qty(driver).click();
		//id="tbody"
	}
}
