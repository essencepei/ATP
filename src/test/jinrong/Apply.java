package test.jinrong;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.PropertyUtil;

public class Apply {
	
	
	private static WebDriver driver = null;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\SCMtest\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
//		System.setProperty("webdriver.firefox.bin", "D:/Program Files (x86)/Mozilla Firefox/firefox.exe");
//		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//���Ե�ַ
		driver.get(PropertyUtil.getProperties().getProperty("jphdemo"));
		driver.manage().window().maximize();
		Apply a = new Apply();
		a.orderConfirm();
	}
	
	public void orderConfirm() {
		//�����¶���ҳ��
		WebElement username = driver.findElement(By.xpath("/html/body/form/div[2]/div/input"));
		username.clear();
		username.sendKeys("13260605891");
		WebElement id = driver.findElement(By.xpath("/html/body/form/div[3]/div/input"));
		id.clear();
		id.sendKeys("810");
		WebElement dianjigoumai = driver.findElement(By.xpath("/html/body/form/div[7]/div/input"));
		dianjigoumai.click();
	}
	
	//�������ҳ��
	//����״̬$("ul.clearfix>li.step").text()
	
	//�������밴ť$("input.mar_t50").click()
//	WebElement e =driver.findElement(By.) 
	
	//��������ҳ��
	//����$("#realname")
	//���֤$("#idcard")
	//����$("#email")
	//��ַ$("#homeadress")
	//��Ӫ��λ����$("#companyname")
	//$("#fctotal")
//	$("#license")
//	$("#companyadress")
//	$("#scope")
//	$("input[type=submit]")
}
