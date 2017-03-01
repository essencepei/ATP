package SCM.back.TestCase;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SCM.back.Action.account.FoodListSearch;
import SCM.back.Action.account.OpenList;
import SCM.back.Action.account.QTYSearch;
import SCM.back.Action.account.SCMLogin;
import SCM.back.Action.order.orderSearch;

import static org.testng.Assert.assertEquals;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.PropertyUtil;

public class LoginTest {
	public static WebDriver driver;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\SCMtest\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(PropertyUtil.getProperties().getProperty("url"));
	}
	@Test
	public void login() {
		SCMLogin.Login(driver);
		String text = driver.findElement(By.xpath("/html/body/div/div[2]/ul/li[1]/a/span[2]")).getText();
		assertEquals(text, "bhcy，欢迎进入企业会员中心");
	}

	@Test(dependsOnMethods = { "login" })
	public void OrderSearch() throws Exception {
		OpenList.openOrder(driver);
		orderSearch.foodNameSearch(driver, "兔排");
		orderSearch.StatusSearch(driver, 1);
		orderSearch.StatusSearch(driver, 2);
		orderSearch.StatusSearch(driver, 3);
		orderSearch.StatusSearch(driver, 0);
	}

	@Test(dependsOnMethods = { "login" })
	public void foodlistSearch() throws Exception {
		OpenList.openFoodList(driver);
		// 按名称查询
		// 名称可参数化
		FoodListSearch.NameSearch(driver, "牛肉");
		// assert表格“食材名称”正则表达式 牛肉
		FoodListSearch.StatusSearch(driver, 1);
		FoodListSearch.StatusSearch(driver, 2);
		FoodListSearch.StatusSearch(driver, 0);
		// assert表格“产品状态”equals “未上架”
	}

	@Test
	public void kuncunchaxun() throws Exception {
		OpenList.openqty(driver);
		System.out.println("按商品分类");
		QTYSearch.FLSearch(driver, 1);
		System.out.println("按仓库位置");
		QTYSearch.wmCodeSearch(driver, 2);
		System.out.println("按商品名称");
		QTYSearch.skuNameSearch(driver, "babi");
		System.out.println("按skucode");
		QTYSearch.skuCodeSearch(driver, "03010501");
		System.out.println("按商品规格");
		QTYSearch.stylenoSearch(driver, 3);
	}

	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
