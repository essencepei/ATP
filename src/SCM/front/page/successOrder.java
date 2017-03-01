package SCM.front.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class successOrder {
	private static WebElement element = null;
	public static WebElement  chakandingdan(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[3]/div/div/a[1]"));
		return element;
	}
	public static WebElement  fanhuishouye(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[3]/div/div/a[2]"));
		return element;
	}
}
