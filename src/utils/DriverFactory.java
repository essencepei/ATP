package utils;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	private static String chromedriver;
	WebDriver driver;
	//Chrome
	public  static WebDriver getChromeDriver(WebDriver driver) {
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\ATP\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	//firefox
	public  static WebDriver getFirefox(WebDriver driver) {
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
        driver = new FirefoxDriver();
		return driver;
	}
	//IE
	public  static WebDriver getIE(WebDriver driver) {
		System.setProperty("webdriver.ie.bin", "C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe");
        driver = new FirefoxDriver();
		return driver;
	}
	
}
