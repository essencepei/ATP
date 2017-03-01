package SCM.back.Page.order;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Order {
	private static WebElement element = null;
	public static WebElement  orderNo(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[4]/form/ul/li[1]/input[@name='shop_name']"));
		return element;
	}
	public static WebElement  shopName(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[4]/form/ul/li[2]/input[@name='shop_name']"));
		return element;
	}
	public static WebElement  sku_name(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[4]/form/ul/li[3]/input[@name='sku_name']"));
		return element;
	}
	public static List<WebElement>  StatusOptions(WebDriver driver){
		WebElement li1=driver.findElement(By.id("handle_status"));
		List<WebElement> element = li1.findElements(By.tagName("option"));
		return element;
	}
	
	public static WebElement  group_code(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[4]/form/ul/li[3]/input[@name='group_code']"));
		return element;
	}
	
	public static WebElement  beginDate(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[4]/form/ul/li[3]/input[@name='beginDate']"));
		return element;
	}
	
	public static WebElement  endDate(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[4]/form/ul/li[3]/input[@name='endDate']"));
		return element;
	}

	public static WebElement  search(WebDriver driver){
		element = driver.findElement(By.id("formSearch"));
		return element;
	}
	
	public static WebElement  table(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[4]/div[2]/table"));
		return element;
	}
	
	public static WebElement  downloadtemple(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[4]/div[1]/a[1]"));
		return element;
	}
	
	public static WebElement  importOrder(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[4]/div[1]/a[2]"));
		return element;
	}
	
	public static WebElement  ExportOrder(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[4]/div[1]/a[3]"));
		return element;
	}
	
	public static WebElement  mergeOrder(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[4]/div[1]/a[4]"));
		return element;
	}
	
}
