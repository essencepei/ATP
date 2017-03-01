package SCM.back.TestCase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyTicket {
	private static WebDriver driver = null;
	public static void main(String[] args) throws Exception  {
	System.setProperty("webdriver.chrome.driver","D:\\workspace\\ATP\\WebDriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	//登录
//	driver.get("https://kyfw.12306.cn/otn/login/init");
//	driver.findElement(By.id("username")).sendKeys("13657296691");
//	driver.findElement(By.id("password")).sendKeys("464762497hH");
//	Thread.sleep(10000);
//	driver.findElement(By.id("loginSub")).click();
	
	//进入定车票界面
	driver.get("https://kyfw.12306.cn/otn/leftTicket/init");
//	driver.findElement(By.xpath("//*[@id='selectYuding']/a")).click();
	Thread.sleep(2000);
	setMessage(driver,"北京", "上海", "2016-12-30");
	//选择车辆信息
//	driver.findElement(By.id("fromStationText")).click();
//	driver.findElement(By.xpath("//*[@id='nav_list3']")).click();
//	driver.findElement(By.xpath("//*[@id='flip_cities2']/a")).click();
//	driver.findElement(By.xpath("//*[@id='ul_list3']/ul[4]/li[7]")).click();
//	driver.findElement(By.id("toStationText")).click();
//	driver.findElement(By.xpath("//*[@id='nav_list6']")).click();
//	driver.findElement(By.xpath("//*[@id='ul_list6']/ul[3]/li[10]")).click();
//	driver.findElement(By.id("train_date")).click();
//	driver.findElement(By.xpath("/html/body/div[30]/div[2]/div[2]/div[15]/div")).click();
	
//	WebElement dc =driver.findElement(By.id("dc"));
//	WebElement wf =driver.findElement(By.id("wf"));
//	if(dc.isSelected()){
//		setOneway(driver,"北京", "上海", "2016-12-30");
//	}if(wf.isSelected()){
//		setRoundway("北京", "上海", "2016-12-30","2017-01-24");
//	}
/*	
	WebElement fromStationText = driver.findElement(By.id("fromStationText"));
	fromStationText.click();
	fromStationText.sendKeys("SH");
	Thread.sleep(8000);
	By sh = new By.ByXPath(
			//*[@id="citem_0"]/span[1][contains(text(),'上海')]
			//*[@id="citem_0"]
			"//div[@class='qcbox-fixed js-suggestcontainer']//td[contains(text(),'上海')]");
	if (isElementPresent(driver, sh, 20)) {
		driver.findElement(sh).click();
	}*/
	
	
	//点查询
	driver.findElement(By.id("query_ticket")).click();
	Thread.sleep(2000);
	
	//处理表格
	WebElement table = driver.findElement(By.id("queryLeftTable"));
	List<WebElement> list = table.findElements(By.xpath("//tr[@class='bgc']"));
	for(WebElement ticket : list){
		String ticketNum = ticket.getAttribute("id");//ticket_630000K3560A
		//获得当前行的硬座的数量
		String  num = ticket.findElements(By.tagName("td")).get(9).getText();
		System.out.println("硬座数量"+num);
		if(num!="无"){
			BuyTicket(ticketNum);
			}
		}
	}
	
	public static void setMessage(WebDriver driver,String from , String to , String begin) {
		driver.findElement(By.id("fromStationText")).click();
		driver.findElement(By.xpath("//*[@id='nav_list3']")).click();
		driver.findElement(By.xpath("//*[@id='flip_cities2']/a")).click();
		driver.findElement(By.xpath("//*[@id='ul_list3']/ul[4]/li[7]")).click();
		driver.findElement(By.id("toStationText")).click();
		driver.findElement(By.xpath("//*[@id='nav_list6']")).click();
		driver.findElement(By.xpath("//*[@id='ul_list6']/ul[3]/li[10]")).click();
		driver.findElement(By.id("train_date")).click();
		driver.findElement(By.xpath("/html/body/div[30]/div[2]/div[2]/div[15]/div")).click();

	}
	
	private static void setRoundway(String from , String to , String begin ,String end) {
		WebElement from_inpox = driver.findElement(By.id("fromStationText"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].value=\""+from+"\"", from_inpox);
	    
		WebElement toStationText = driver.findElement(By.id("toStationText"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].value=\""+to+"\"", toStationText);
	    
		WebElement train_date = driver.findElement(By.id("train_date"));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].value=\""+begin+"\"", train_date);
	    
		WebElement back_train_date = driver.findElement(By.id("back_train_date"));
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].value=\""+end+"\"", back_train_date);

	}
	
	private static void setOneway(WebDriver driver,String from , String to , String begin) {
		WebElement from_inpox = driver.findElement(By.id("fromStationText"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].value=\""+from+"\"", from_inpox);
	    
		WebElement toStationText = driver.findElement(By.id("toStationText"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].value=\""+to+"\"", toStationText);
	    
		WebElement train_date = driver.findElement(By.id("train_date"));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].value=\""+begin+"\"", train_date);

	}
	
	
	
	private static void BuyTicket(String ticketNum) {
		driver.findElement(By.xpath("//*[@id='"+ticketNum+"']/td[13]")).click();
	}
	
	public static boolean isElementPresent(WebDriver driver, final By by,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		boolean isPresent = false;
		try {
			isPresent = wait.until(new ExpectedCondition<WebElement>() {
				@Override
				public WebElement apply(WebDriver d) {
					return d.findElement(by);
				}
			}).isDisplayed();
		} catch (Exception e) {
			isPresent = false;
		}
		return isPresent;
	}
}
