package SCM.back.Page.order;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FoodClass {
	private static WebElement element = null;
	public static WebElement  shopName(WebDriver driver){
		element = driver.findElement(By.id("shop_name"));
		return element;
	}
	
	public static WebElement SearchBtn(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/ul/li[2]/input[@type ='submit']"));
		return element;
	}
}
