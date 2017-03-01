package phpWind;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import utils.PropertyUtil;

public class phpwind {
	static WebDriver driver = null;
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\workspace\\SCMtest\\WebDriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get(PropertyUtil.getProperties().getProperty("phpurl"));
	
	WebElement login = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/table/tbody/tr/td[2]/form/dl/dd[2]/span[1]/span/span/button"));
	login.click();
	WebElement user = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div/dl[1]/dd[1]/div/input"));
	user.clear();
	user.sendKeys("user");
	WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div/dl[2]/dd[1]/div/input"));
	password.clear();
	password.sendKeys("useruser");
	WebElement loginbutton = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div/dl[5]/dd/span/span/button"));
	loginbutton.click();
	
//	Alert alert = driver.switchTo().alert();
//	alert.accept();
//	driver.switchTo().window(arg0);
	
	WebElement element = driver.findElement(By.id("td_mymenu"));
	Actions action = new Actions(driver);
	action.moveToElement(element).perform();
	WebElement mynote = driver.findElement(By.xpath("/html/body/div[1]/ul/li[3]/a"));
	mynote.click();
	
	WebElement newnote = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/table/tbody/tr/td/div/div[1]/span/span/button"));
	newnote.click();
	//*[@id="atc_title"]
	String framepath = "/html/body/div[2]/div[3]/div[2]/table/tbody/tr/td/div/div[3]/form/div[1]/div[2]/div/div[2]/iframe";
	driver.switchTo().frame("framepath");
	
	}
}
