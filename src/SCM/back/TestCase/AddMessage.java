package SCM.back.TestCase;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import SCM.front.PageAction.Amessage;
import SCM.front.page.Message;

public class AddMessage {
	WebDriver driver;
	
	@Test
	public void messageWindow() {
		Amessage.clickAdd(driver);
		Boolean style = Message.agreeModal(driver).getAttribute("style").equals("display: block;");
		//ÅĞ¶ÏÌí¼Ó´°¿ÚÊÇ·ñµ¯³ö
		Assert.assertEquals(style, "true");
	}
	
	@Test(dependsOnMethods="messageWindow")
	public void add() {
		//Ìí¼ÓÁôÑÔ
		String title = "ninhaoa ";
		Amessage.addtitle(driver, title);
		Amessage.addContent(driver, "buhao buahao buhao ");
		Amessage.clickConfirm(driver);
		Assert.assertEquals(title, Amessage.message(driver));
	}
	
}
