package SCM.back.Page.order;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QTY {
	private static WebElement element = null;
	public static WebElement  ProductClass(WebDriver driver){
		element = driver.findElement(By.id("classId"));
		return element;
	}
	
	public static List<WebElement>  ClassOptions(WebDriver driver){
		WebElement li1=driver.findElement(By.id("classId"));
		List<WebElement> element = li1.findElements(By.tagName("option"));
		return element;
	}
	
	public static  List<WebElement>  VMOptions(WebDriver driver){
		WebElement li2=driver.findElement(By.id("wmCode"));
		List<WebElement> element = li2.findElements(By.tagName("option"));
		return element;
	}
	
	public static WebElement  skuName(WebDriver driver){
		element = driver.findElement(By.id("skuName"));
		return element;
	}
	
	public static WebElement  skuCode(WebDriver driver){
		element = driver.findElement(By.id("skuCode"));
		return element;
	}
	
	public static  List<WebElement>  StylenoOptions(WebDriver driver){
		WebElement li3=driver.findElement(By.id("styleno"));
		List<WebElement> element = li3.findElements(By.tagName("option"));
		return element;
	}
	
	public static WebElement  query(WebDriver driver){
		element = driver.findElement(By.id("query"));
		return element;
	}
	
	public static WebElement  tbody(WebDriver driver){
		element = driver.findElement(By.id("tbody"));
		return element;
	}
}
