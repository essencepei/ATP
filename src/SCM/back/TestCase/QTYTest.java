package SCM.back.TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import SCM.back.Action.account.OpenList;
import SCM.back.Action.account.QTYSearch;
import SCM.back.Action.account.SCMLogin;
import utils.PropertyUtil;

public class QTYTest {
	private static WebDriver driver = null;
	@BeforeClass
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\SCMtest\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(PropertyUtil.getProperties().getProperty("url"));
		SCMLogin.Login(driver);
		

	}
	@Test
	public void kuncunchaxun() throws Exception{
		OpenList.openqty(driver);
		driver.manage().window().maximize();
		
		System.out.println("����Ʒ����");
		QTYSearch.FLSearch(driver, 1);
		System.out.println("���ֿ�λ��");
		QTYSearch.wmCodeSearch(driver, 2);
		System.out.println("����Ʒ����");
		QTYSearch.skuNameSearch(driver, "babi");
		System.out.println("��skucode");
		QTYSearch.skuCodeSearch(driver, "03010501");
		System.out.println("����Ʒ���");
		QTYSearch.stylenoSearch(driver, 3);
	}
	  @AfterClass
	  public void tearDown() {
	    driver.close();
	    driver.quit();
	  }
}
