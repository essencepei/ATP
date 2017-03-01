package SCM.front.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Message {
	public static WebElement element =null;
	public static WebElement add(WebDriver driver){
		element = driver.findElement(By.xpath("//html/body/div[2]/div/div[2]/div[2]"));
		return element;
	}
	
	public static WebElement agreeModal(WebDriver driver){
		element = driver.findElement(By.id("agreeModal"));
		return element;
	}
	
	public static WebElement title(WebDriver driver){
		element = driver.findElement(By.id("title"));
		return element;
	}
	
	public static WebElement content(WebDriver driver){
		element = driver.findElement(By.id("content"));
		return element;
	}
	
	public static WebElement cancel(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[1]"));
		return element;
	}
	
	public static WebElement confirm(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]"));
		return element;
	}
	
	public static WebElement message(WebDriver driver){
		element = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div"));
		return element;
	}
}
