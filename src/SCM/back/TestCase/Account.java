package SCM.back.TestCase;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import SCM.back.Action.account.SCMLogin;
import SCM.back.Page.account.client;
import utils.PropertyUtil;

public class Account {
	private static WebDriver driver = null;
	public static void main(String[] args) throws Exception  {
	System.setProperty("webdriver.chrome.driver","D:\\workspace\\ATP\\WebDriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get(PropertyUtil.getProperties().getProperty("url"));
	SCMLogin.Login(driver);
	
	driver.findElement(By.id("PPN32")).click();
	WebElement tableaccount = client.tbody(driver);
//	List<HashMap<String, String>>  list = Client.getEvery(tableaccount);
	
	driver.findElement(By.xpath("//*[@id='table']/tbody/tr[1]/td[9]/a[2]")).click();
	//�򿪱༭ҳ��
//	Assert.assertEquals(driver.findElement(By.id("account")).getAttribute("value"), accounttd.get("name"));
	 //��ȷ���ж���ʾ��
	driver.findElement(By.xpath("//*[@id='form']/div[2]/button[2]")).click();
	String tishi = driver.findElement(By.xpath("/html/body/div[7]/div[2]")).getText();
	Assert.assertEquals(tishi,"����˻��Ѿ��¹�������޸�");
	driver.findElement(By.xpath("/html/body/div[7]/div[3]/a")).click();
	Thread.sleep(2000);
	//��ȡ������б�ҳ��
	driver.findElement(By.xpath("//body/div[4]/div/form/div[2]/button[1]")).click();
}
}
