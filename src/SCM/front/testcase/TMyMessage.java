package SCM.front.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import SCM.front.PageAction.AMyMessage;
import SCM.front.page.PersonC;

public class TMyMessage {
	public static WebDriver driver;
	@Test
	public static void main(String[] args) {
		PersonC.MyMessage(driver).click();
		AMyMessage.DeledeMessage(driver, "1");
		
	}
	

}
