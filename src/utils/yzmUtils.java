package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yzmUtils {
	//public static String getYZM(){
	public static void main(String[] args) {
		String yzm = null;
		String phone = "18672387288";
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\SCMtest\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://fc.lbd99.com/sms/smstemplate/index.do");
		driver.manage().window().maximize();
		driver.switchTo().frame("tables_iframe");
		WebElement phoneId =driver.findElement(By.id("phoneId"));
		phoneId.clear();
		phoneId.sendKeys("18672387288");
		WebElement click=driver.findElement(By.className("btn btn-warning"));
		click.click();
//		WebElement tbody =driver.findElement(By.tagName("tbody"));
//
//		
//		List<WebElement> tr = driver.findElements(By.tagName("tr"));
//		for(WebElement index : tr){
//			
//		}
//		System.out.println(tbody);
	}
		
}
