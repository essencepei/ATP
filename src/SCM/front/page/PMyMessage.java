package SCM.front.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PMyMessage {
	private static WebElement element = null;
	//个人中心
	public static WebElement  PersonCenter(WebDriver driver){
		element = driver.findElement(By.xpath("//html//div[2]//li[1]/a"));
		return element;
	}

}
