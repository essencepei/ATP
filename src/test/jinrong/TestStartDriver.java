package test.jinrong;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestStartDriver {
	
	private WebDriver driver;
	
	public void startFirefox(){
		System.setProperty("webdriver.firefox.bin", "D:/Program Files (x86)/Mozilla Firefox/firefox.exe");
		driver = new FirefoxDriver();
	}
	
	public void startChrome(){
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\SCMtest\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public void startFirefoxWithAddon(){
		File file = new File("D:\\workspace\\ATP\\WebDriver\\firebug-2.0.14.xpi");
		FirefoxProfile profile = new FirefoxProfile();
		try {
			profile.addExtension(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver = new FirefoxDriver(profile);
	}
	
	public void startFirefoxWithProfile(){
		ProfilesIni profiles = new ProfilesIni();
		FirefoxProfile profile = profiles.getProfile("default");
		driver = new FirefoxDriver(profile);
	}
	
	public void startFirefoxWithOtherProfile(){
		File profileDir = new File("Profiles/amblaz0z.default");
		FirefoxProfile profile = new FirefoxProfile(profileDir);
		driver = new FirefoxDriver(profile);
	}
	
	public void startFirefoxSetDownloadDir(){
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.download.downloadDir", "c:\\");
		profile.setPreference("browser.download.folderlist", 2);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/octet-stream, application/vnd.ms-excel, text/csv, application/zip");
		driver = new FirefoxDriver(profile);
	}
	
	public void startFirefoxWithProxy(){
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("network.proxy.type", 1);
		profile.setPreference("network.proxy.http", "proxyIp");
		profile.setPreference("network.proxy.http_port", "proxyPort");
		driver = new FirefoxDriver(profile);
	}
	
	public void startChromeWithAddon(){
		System.setProperty("webdriver.chrome.driver", "files/chromedriver.exe");
		File file = new File("files/Video-Sorter-for-YouTube_v1.1.2.crx");
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(file);
		driver = new ChromeDriver(options);
	}
	
	public void startChromeWithUserData(){
		System.setProperty("webdriver.chrome.driver", "files/chromedriver.exe");
		File file = new File("User Data");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir="+file.getAbsolutePath());
		driver = new ChromeDriver(options);
	}
	
	public void startChromeWithTestType(){
		System.setProperty("webdriver.chrome.driver", "files/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--test-type");
		driver = new ChromeDriver(options);
	}
	
	public void startIE(){
		System.setProperty("webdriver.ie.driver", "files/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}
	
	public void startIEWithSettings(){
		System.setProperty("webdriver.ie.driver", "files/IEDriverServer.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capabilities.setCapability("ignoreProtectedModeSettings", true);
		driver = new InternetExplorerDriver(capabilities);
	}
	
	public void startFirefoxWithEnableEvent(){
		FirefoxProfile profile = new FirefoxProfile();
		profile.setEnableNativeEvents(true);		
		driver = new FirefoxDriver(profile);
	}
	
	public void maxBrowser(){
		driver.manage().window().maximize();
	}
	
	public void closeBrowser(){
		driver.close();
		driver.quit();
	}
	
	public static void main(String[] args) {
		TestStartDriver t = new TestStartDriver();
	//	t.startChromeWithAddon();
		t.startFirefoxWithAddon();
		t.maxBrowser();
		//t.closeBrowser();
	}
	
}
