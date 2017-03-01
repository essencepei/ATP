package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtils {
	public static WebDriver getChromeDriver(){
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\ATP\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(PropertyUtil.getProperties().getProperty("url"));
		return driver;
	}
	
	public static WebDriver getFirefoxDriver(){
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\ATP\\WebDriver\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(PropertyUtil.getProperties().getProperty("url"));
		return driver;
	}
}
