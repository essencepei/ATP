package financing.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase {
//	@Test
	private void testinput() {
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\SCMtest\\WebDriver\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.navigate().to("http://order.lbd99.com");
		
	}
}
