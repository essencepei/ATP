package SCM.front.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PersonC {
	
	
	private static WebElement element = null;
	//��������
	public static WebElement  PersonCenter(WebDriver driver){
		element = driver.findElement(By.xpath("//body/div[3]//div[1]//ul/li[1]"));
		return element;
	}
	
	//һ������
	public static WebElement  First(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div[1]/span"));
		return element;
	}
	//�ҵĶ���
	public static WebElement  MyOrder(WebDriver driver){
		element = driver.findElement(By.xpath("//body/div[3]//div[1]//ul/li[2]"));
		return element;
	}
	//�ҵ���Ϣ
	public static WebElement  MyMessage(WebDriver driver){
		element = driver.findElement(By.xpath("//body/div[3]//div[1]//ul/li[2]"));
		return element;
	}
	
	//�ɹ�ͳ��
	public static WebElement  OrderCount(WebDriver driver){
		element = driver.findElement(By.xpath("//body/div[3]//div[1]//ul/li[3]"));
		return element;
	}
	
	//�ҵ�����
	public static WebElement  MyLiuyan(WebDriver driver){
		element = driver.findElement(By.xpath("//body/div[3]//div[1]//ul/li[4]"));
		return element;
	}
	
	//�쳣����
	public static WebElement  ManageAbnormal(WebDriver driver){
		element = driver.findElement(By.xpath("//body/div[3]//div[1]//ul/li[5]"));
		return element;
	}
	
	//�˺Ź���
	public static WebElement  ManageAccount(WebDriver driver){
		element = driver.findElement(By.xpath("//body/div[3]//div[1]//ul/li[6]"));
		return element;
	}
	
	//�޸�����
	public static WebElement  Updatemm(WebDriver driver){
		element = driver.findElement(By.xpath("//body/div[3]//div[1]//ul/li[7]"));
		return element;
		}
	
	//�����ջ���ַ
	public static WebElement ManageAdress(WebDriver driver){
		element = driver.findElement(By.xpath("//body/div[3]//div[1]//ul/li[8]"));
		return element;
		}
	
	//�������
	public static WebElement yijianfankui(WebDriver driver){
		element = driver.findElement(By.xpath("//body/div[3]//div[1]//ul/li[9]"));
		return element;
		}
	
}
