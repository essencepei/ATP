package SCM.front.testcase;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import SCM.back.Page.account.login;
import SCM.front.page.Morder;
import SCM.front.page.PersonC;
import SCM.front.page.shouye;
import utils.PropertyUtil;

public class frontTest {
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
		login.frontLogin(driver);
		String text = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/span/a/i")).getText();
		assertEquals(text, PropertyUtil.getProperties().getProperty("fusername"));
	}
	
	@Test(dependsOnMethods = { "login" })
	public void Buy() {
		shouye sy = new shouye();
		sy.inCar(driver,  1,"2","3");
	}
	
	@Test(dependsOnMethods = { "Buy" })
	public void Order() {
		shouye sy = new shouye();
		sy.goCar(driver);
	}
	
	@Test(dependsOnMethods = { "Buy" })
	public void personC() {
		shouye.pc(driver).click();
//		PersonC.grzx(driver).click();
//		PersonC.md(driver).click();
		int qb = Integer.parseInt((driver.findElement(By.xpath("//body//div[2]//li[1]/span")).getText()));
		int sum =Integer.parseInt((driver.findElement(By.xpath("//body//div[2]//li[2]/span")).getText()))+
				Integer.parseInt((driver.findElement(By.xpath("//body//div[2]//li[3]/span")).getText()))+
				Integer.parseInt((driver.findElement(By.xpath("//body//div[2]//li[4]/span")).getText()))+
				Integer.parseInt((driver.findElement(By.xpath("//body//div[2]//li[5]/span")).getText()));
		//验证订单数量
		//assertEquals(qb,sum);
		
		WebElement li2= driver.findElement(By.xpath("html/body/div[2]/div/div[2]/div[2]/ul/li[2]"));
		li2.click();	
		
		List<WebElement> trs = li2.findElements(By.xpath("//div[1]/table/tbody/tr[@class!='bgc']"));
		//点开订单详情
		for(WebElement tr : trs){
			tr.click();
		}
		
		Morder.go(Morder.grzx(driver));
		String a = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/a[1]/p[2]/span")).getText();
		assertEquals(a,"待收货");
		Morder.go(Morder.shouye(driver));
		String b = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/ul/li[1]/a")).getText();
		assertEquals(b,"全部");
	}
	
//	@Test(dependsOnMethods = { "personC" })
	public void personCLink(){
		Morder.go(Morder.grzx(driver));
		String a = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/a[1]/p[2]/span")).getText();
		assertEquals(a,"待收货");
		Morder.go(Morder.shouye(driver));
		String b = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/ul/li[1]/a")).getText();
		assertEquals(b,"全部");
	}
	
//	@AfterClass
//	public void tearDown() {
//		driver.close();
//		driver.quit();
//	}
}
