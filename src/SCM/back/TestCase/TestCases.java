package SCM.back.TestCase;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SCM.back.Action.account.OpenList;
import SCM.back.Action.account.QTYSearch;
import SCM.back.Action.account.SCMLogin;
import SCM.back.Action.order.orderSearch;
import SCM.back.Page.order.QTY;
import utils.PropertyUtil;

public class TestCases {
	private static WebDriver driver = null;
	
//订单测试用例	
  @Test
  public void shopNameSearch()  {
	  OpenList.openOrder(driver);
	  try {
		orderSearch.shopNameSearch(driver, "高新");
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
  }
  
//  @Test
//  private void foodNameSearch() throws Exception {
//			OrderSearch.foodNameSearch(driver, "兔排");
//}
  @Test
  private void StatusSearch() {
}
  @BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\SCMtest\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(PropertyUtil.getProperties().getProperty("url"));
		SCMLogin.Login(driver);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
