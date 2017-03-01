package financing.pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import financing.page.order_confirm;

public class order_confirm_action {
//	public  static void ChooseDays(WebDriver driver,int index) throws Exception{
//		order_confirm.DaysOptions(driver).get(index).click();
//		Thread.sleep(1000);
//	}
	
	public static void ChooseJPLWL(WebDriver driver) {
		order_confirm.JAddr(driver).click();
	}
	
	public static void ChooseZT(WebDriver driver,String deliveryName,String deliveryMobile ) {
		order_confirm.ZT(driver).click();
		WebElement thrxm=driver.findElement(By.id("deliveryName"));
		thrxm.clear();
		thrxm.sendKeys(deliveryName);
		WebElement tel=driver.findElement(By.id("deliveryMobile"));
		tel.clear();
		tel.sendKeys(deliveryMobile);
	}
	
	public static void ChooseFP(WebDriver driver) {
		order_confirm.ISFP(driver).isSelected();
	}
	
	public static void ChooseAgree(WebDriver driver) {
		order_confirm.ISAgree(driver).isSelected();
	}
	
	private void goRongZi(WebDriver driver) {
		order_confirm.QuRongZi(driver).click();
	}
}
