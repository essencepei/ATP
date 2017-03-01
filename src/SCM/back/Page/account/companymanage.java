package SCM.back.Page.account;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import SCM.back.Action.account.SCMLogin;

public class companymanage {
	private static WebElement element = null;
	
	public static WebElement  accountManage(WebDriver driver){
		WebElement kehuguanli = driver.findElement(By.xpath("/html/body/div[3]/ul/li[3]/h3"));
		String shifoudakai = kehuguanli.findElement(By.tagName("dl")).getAttribute("style");
		if(shifoudakai.equals("display: block;")){
			kehuguanli.click();
			element = driver.findElement(By.id("PPN31"));
		}else{
			element = driver.findElement(By.id("PPN31"));
		}
		return element;
	}
	
	public static WebElement  OrderManage(WebDriver driver){
		element = driver.findElement(By.partialLinkText("��������"));
		return element;
	}
	
	public static WebElement  FoodClass(WebDriver driver){
		element = driver.findElement(By.partialLinkText("ʳ�ķ���"));
		return element;
	}
	
	public static WebElement  FoodList(WebDriver driver){
		element = driver.findElement(By.partialLinkText("ʳ���б�"));
		return element;
	}
	
	public static WebElement  Statistics(WebDriver driver){
		element = driver.findElement(By.partialLinkText("�ŵ�ɹ�ͳ��"));
		return element;
	}
	
	public static WebElement  Message(WebDriver driver){
		element = driver.findElement(By.partialLinkText("�ŵ�����"));
		return element;
	}
	
	public static WebElement  qty(WebDriver driver){
		element = driver.findElement(By.partialLinkText("����ѯ"));
		return element;
	}
}
