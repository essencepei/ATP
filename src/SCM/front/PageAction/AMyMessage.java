package SCM.front.PageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import SCM.front.page.PersonC;

public class AMyMessage {
	public static WebDriver driver;
		public static void DeledeMessage(WebDriver driver,String index){
			WebElement delede = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/table/tbody/tr["+index+"]/td[3]/button"));
			delede.click();
		}
}

