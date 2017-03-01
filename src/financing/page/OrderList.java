package financing.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderList {
	private WebDriver driver;
	

	public OrderList(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}


	@FindBy(xpath="/html/body/form/div[2]/div/input")
	public WebElement  account;
	
	public void account(String username){
		this.account.sendKeys(username);
	}
	
	@FindBy(xpath="/html/body/form/div[3]/div/input")
	public WebElement mid;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\SCMtest\\WebDriver\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.navigate().to("http://169.254.0.192:8080/financing2/web/jphdemo.jsp");
		OrderList ol = new OrderList(driver);
		ol.account("ÂíÔÆ");
	}
}
