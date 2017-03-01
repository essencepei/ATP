package SCM.back.Page.order;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FoodList {
	private static WebElement element = null;
	public static WebElement  foodName(WebDriver driver){
		element = driver.findElement(By.id("shop_name"));
		return element;
	}
//	
//	public static WebElement status(WebDriver driver){
//		element = driver.findElement(By.id("status"));
//		return element;
//	}
	public static List<WebElement> options(WebDriver driver){
		List<WebElement> element = driver.findElements(By.tagName("option"));
		return element;
	}
	
	public static WebElement search(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/form/ul/li[3]/button[1]"));
		return element;
	}
}
