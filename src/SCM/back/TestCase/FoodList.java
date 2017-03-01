package SCM.back.TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SCM.back.Action.account.FoodListSearch;
import SCM.back.Action.account.OpenList;
import SCM.back.Action.account.SCMLogin;
import SCM.back.Page.account.login;
import utils.PropertyUtil;
import utils.TakeScreenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FoodList {
	public static WebDriver driver;
//	private static WebDriver driver = null;
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver","D:\\workspace\\SCMtest\\WebDriver\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.get(PropertyUtil.getProperties().getProperty("url"));
//		SCMLogin.Login(driver);
//		OpenList.openFoodList(driver);
//		//按名称查询
//		//名称可参数化
//		FoodListSearch.NameSearch(driver, "牛肉");
//		//assert表格“食材名称”正则表达式  牛肉
//		
//		FoodListSearch.StatusSearch(driver, 1);
//		FoodListSearch.StatusSearch(driver, 2);
//		FoodListSearch.StatusSearch(driver, 0);
//	
//		//assert表格“产品状态”equals “未上架”
//	
//	}
	@BeforeClass
	  public void setUp() {
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\SCMtest\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(PropertyUtil.getProperties().getProperty("url"));
		SCMLogin.Login(driver);
	  }
	@Test
	public  void foodlist() throws Exception {
		OpenList.openFoodList(driver);
		//按名称查询
		//名称可参数化
		FoodListSearch.NameSearch(driver, "牛肉");
		//assert表格“食材名称”正则表达式  牛肉
		FoodListSearch.StatusSearch(driver, 1);
		FoodListSearch.StatusSearch(driver, 2);
		FoodListSearch.StatusSearch(driver, 0);
		//assert表格“产品状态”equals “未上架”
	}
	
	  @AfterClass
	  public void tearDown() {
	    driver.close();
	    driver.quit();
	  }
}
