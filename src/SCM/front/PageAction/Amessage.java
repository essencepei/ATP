package SCM.front.PageAction;
import org.openqa.selenium.WebDriver;
import SCM.front.page.Message;

public class Amessage {
	public static WebDriver driver;
	
	public static void clickAdd(WebDriver driver) {
		Message.add(driver).click();
	}
	
	public static void addtitle(WebDriver driver,String title) {
		Message.title(driver).sendKeys(title);
	}
	
	public static void addContent(WebDriver driver,String content) {
		Message.content(driver).sendKeys(content);
	}
	public static void clickConfirm(WebDriver driver) {
		Message.confirm(driver).click();
	}
	
	public static void clickCancel(WebDriver driver) {
		Message.cancel(driver).click();
	}
	
	public static String message(WebDriver driver) {
		return Message.message(driver).getText();
	}
	
	

}
