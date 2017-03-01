package financing.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class order_confirm {
	private static WebElement element = null;

	//ÌìÊý
	public static List<WebElement>  DaysOptions(WebDriver driver){
		List<WebElement> element = driver.findElements(By.tagName("option"));
		return element;
	}
	//
	public static WebElement  JspWl(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[2]"));
		return element;
	}
	
	public static WebElement  JAddr(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[2]"));
		return element;
	}
	
	public static WebElement  ZT(WebDriver driver){
		element = driver.findElement(By.xpath("//div[@class='payType_choc tabTol_con']//li[2]"));
		return element;
	}
		
	public static WebElement  ZName(WebDriver driver){
		element = driver.findElement(By.id("deliveryName"));
		return element;
	}
	
	public static WebElement  ZTel(WebDriver driver){
		element = driver.findElement(By.id("deliveryMobile"));
		return element;
	}
	
	public static WebElement  ISFP(WebDriver driver){
		element = driver.findElement(By.id("fp_choice"));
		
		return element;
	}
	
	public static WebElement  ISAgree(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[4]/p/div"));
		return element;
	}
	
	public static WebElement QuRongZi(WebDriver driver){
		element = driver.findElement(By.xpath("//p/input[@class='submit']"));
		return element;
	}
	
}
