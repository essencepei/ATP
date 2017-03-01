package SCM.front.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PersonC {
	
	
	private static WebElement element = null;
	//个人中心
	public static WebElement  PersonCenter(WebDriver driver){
		element = driver.findElement(By.xpath("//body/div[3]//div[1]//ul/li[1]"));
		return element;
	}
	
	//一级导航
	public static WebElement  First(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div[1]/span"));
		return element;
	}
	//我的订单
	public static WebElement  MyOrder(WebDriver driver){
		element = driver.findElement(By.xpath("//body/div[3]//div[1]//ul/li[2]"));
		return element;
	}
	//我的消息
	public static WebElement  MyMessage(WebDriver driver){
		element = driver.findElement(By.xpath("//body/div[3]//div[1]//ul/li[2]"));
		return element;
	}
	
	//采购统计
	public static WebElement  OrderCount(WebDriver driver){
		element = driver.findElement(By.xpath("//body/div[3]//div[1]//ul/li[3]"));
		return element;
	}
	
	//我的留言
	public static WebElement  MyLiuyan(WebDriver driver){
		element = driver.findElement(By.xpath("//body/div[3]//div[1]//ul/li[4]"));
		return element;
	}
	
	//异常管理
	public static WebElement  ManageAbnormal(WebDriver driver){
		element = driver.findElement(By.xpath("//body/div[3]//div[1]//ul/li[5]"));
		return element;
	}
	
	//账号管理
	public static WebElement  ManageAccount(WebDriver driver){
		element = driver.findElement(By.xpath("//body/div[3]//div[1]//ul/li[6]"));
		return element;
	}
	
	//修改密码
	public static WebElement  Updatemm(WebDriver driver){
		element = driver.findElement(By.xpath("//body/div[3]//div[1]//ul/li[7]"));
		return element;
		}
	
	//管理收货地址
	public static WebElement ManageAdress(WebDriver driver){
		element = driver.findElement(By.xpath("//body/div[3]//div[1]//ul/li[8]"));
		return element;
		}
	
	//意见反馈
	public static WebElement yijianfankui(WebDriver driver){
		element = driver.findElement(By.xpath("//body/div[3]//div[1]//ul/li[9]"));
		return element;
		}
	
}
