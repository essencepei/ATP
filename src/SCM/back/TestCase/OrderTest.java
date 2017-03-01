package SCM.back.TestCase;

import java.util.List;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.PropertyUtil;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SCM.back.Action.account.OpenList;
import SCM.back.Action.account.SCMLogin;
import SCM.back.Action.order.orderSearch;

import static org.testng.Assert.assertEquals;

public class OrderTest {
	private static WebDriver driver = null;
	@BeforeClass
	public void setUp() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","D:\\workspace\\SCMtest\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
//		System.setProperty("webdriver.firefox.bin","D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
//		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(PropertyUtil.getProperties().getProperty("url"));
		Thread.sleep(1000);
		
		SCMLogin.Login(driver);
		driver.manage().window().maximize();
		
		
		//表格xpath//*[@id='main_tbody']/tr[@class='cls']
		
		orderSearch.shopNameSearch(driver, "高新");
		WebElement tbody = driver.findElement(By.id("main_tbody"));
		//bycss：：：tr[class='cls']
		List<WebElement> trcls = tbody.findElements(By.xpath("//tr[@class='cls']"));
		//根据订单编号打开订单详情
			for(WebElement tr :trcls){
				boolean pp = tr.getText().toString().contains("7160630114746834");
				if(pp){
					tr.click();
					//点击修改价格
					driver.findElement(By.xpath("//*[@id='main_tbody']/tr[2]/td/div/span[2]")).click();
					WebElement jiage = driver.findElement(By.xpath("//*[@id='main_tbody']/tr[2]/td/table/tbody/tr/td[5]/input"));
					 //run JS to modify hidden element 
					// ((JavascriptExecutor)driver).executeScript("document.getElementById(\"em\").type ='text';");
						jiage.sendKeys(Keys.BACK_SPACE);
						jiage.sendKeys(Keys.BACK_SPACE);
						jiage.sendKeys(Keys.BACK_SPACE);
						jiage.sendKeys(Keys.BACK_SPACE);
						jiage.sendKeys(Keys.BACK_SPACE);
						jiage.sendKeys(Keys.BACK_SPACE);
						jiage.sendKeys("44");
						Thread.sleep(1000);
						jiage.sendKeys(Keys.ENTER);
						Alert alert = driver.switchTo().alert();
						alert.getText();
						alert.accept();
					}
				}
//		OrderSearch.foodNameSearch(driver, "兔排");
//		OrderSearch.StatusSearch(driver, 1);
//		OrderSearch.StatusSearch(driver, 2);
//		OrderSearch.StatusSearch(driver, 3);
//		OrderSearch.StatusSearch(driver, 0);
		
	}
	@Test
	public void Search() throws Exception{
		OpenList.openOrder(driver);
		orderSearch.foodNameSearch(driver, "兔排");
		orderSearch.StatusSearch(driver, 1);
		orderSearch.StatusSearch(driver, 2);
		orderSearch.StatusSearch(driver, 3);
		orderSearch.StatusSearch(driver, 0);
	}
	
	  @AfterClass
	  public void tearDown() {
	    driver.close();
	    driver.quit();
	  }
}
