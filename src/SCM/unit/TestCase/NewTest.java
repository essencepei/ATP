package SCM.unit.TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import utils.PropertyUtil;

public class NewTest {
	private static WebDriver driver = null;
	@BeforeTest
	private void open() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\SCMtest\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(PropertyUtil.getProperties().getProperty("fanurl"));
		driver.manage().window().maximize();
	}
	@Test
	public void FP() {
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("taitou");
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("·¢Æ±ÄáÈÕÅ·Åµ¸ö");
  }
}
