package test.jinrong;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.PropertyUtil;

public class Order {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\SCMtest\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
//		System.setProperty("webdriver.firefox.bin", "D:/Program Files (x86)/Mozilla Firefox/firefox.exe");
//		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//测试地址
		driver.get(PropertyUtil.getProperties().getProperty("jphdemo"));
		//正式地址
		//driver.get(PropertyUtil.getProperties().getProperty("fanurl"));

		driver.manage().window().maximize();
		Order order = new Order();
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]")).click();
		order.orderConfirm("100");
		order.ChooseJSP();
//		order.chooseZT("ziti", "18672387288");
		order.qurongzi();
		
		//不下单直接进入我的金融
		//order.Myfc("100", "");

	}
	
//	public static void startDriver() {
//		System.setProperty("webdriver.chrome.driver","D:\\workspace\\SCMtest\\WebDriver\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		//测试地址
//		driver.get(PropertyUtil.getProperties().getProperty("jphdemo"));
//		//正式地址
//		//driver.get(PropertyUtil.getProperties().getProperty("fanurl"));
//		driver.manage().window().maximize();
//	}
	
	public void ChooseJSP() {
		WebElement addr = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[2]"));
		addr.click();
	}

	//模拟下单
	public void orderConfirm(String pNum) {
		//进入下订单页面
		WebElement username = driver.findElement(By.xpath("/html/body/form/div[2]/div/input"));
		username.clear();
		username.sendKeys("18672387288");
		WebElement id = driver.findElement(By.xpath("/html/body/form/div[3]/div/input"));
		id.clear();
		id.sendKeys("701");
		WebElement shuliang = driver.findElement(By.xpath("/html/body/form/div[6]/div/input"));
		shuliang.clear();
		shuliang.sendKeys(pNum);
		WebElement dianjigoumai = driver.findElement(By.xpath("/html/body/form/div[7]/div/input"));
		dianjigoumai.click();
		//取订单数量和金额
		String sum = driver.findElement(By.xpath("//i[@class='red bold']")).getText();
		System.out.println("sum === " +sum);
		//处理超过融资额度的情况
	}
	
	//spNum为空的时候 进入我的金融列表
	public void Myfc(String pNum,String spNum) {
		//进入下订单页面
		WebElement username = driver.findElement(By.xpath("//input[@name='account']"));
		username.clear();
		username.sendKeys("18672387288");
		WebElement id = driver.findElement(By.xpath("//input[@name='mid']"));
		id.clear();
		id.sendKeys("701");
		WebElement shuliang = driver.findElement(By.xpath("/html/body/form/div[6]/div/input"));
		shuliang.clear();
		shuliang.sendKeys(pNum);
		WebElement dianjigoumai = driver.findElement(By.xpath("//input[@name='pNum']"));
		WebElement spbh = driver.findElement(By.xpath("//div/input[@class='btn btn-primary']"));
		spbh.clear();
		spbh.sendKeys(spNum);
		shuliang.clear();
		shuliang.sendKeys(pNum);
		dianjigoumai.click();
	}
	
	//正式下单
	private void LBDFC() {

	}
	
	//选择自提
	public void chooseZT(String deliveryName,String deliveryMobile) {
		WebElement ziti = driver.findElement(By.xpath("//div[@class='payType_choc tabTol_con']//li[2]"));
		ziti.click();
		WebElement thrxm=driver.findElement(By.id("deliveryName"));
		thrxm.clear();
		thrxm.sendKeys(deliveryName);
		WebElement tel=driver.findElement(By.id("deliveryMobile"));
		tel.clear();
		tel.sendKeys(deliveryMobile);
	}
	
	//是否要发票
	public void IsFP() {
		WebElement FP =driver.findElement(By.id("fp_choice"));
		FP.isSelected();
	}
	
	public void qurongzi() {
		WebElement gogo =driver.findElement(By.xpath("//p/input[@class='submit']"));
		gogo.click();
		//click后可能存在融资额度不够的情况
		
		//取订单金额、总融资额度、已融资额度、可融资额度
		String orderPrice =driver.findElement(By.xpath("//div[@class='list']//li[1]/i")).getText();
		System.out.println("订单金额==="+orderPrice);
		String sum =driver.findElement(By.xpath("//div[@class='list']//li[2]/i")).getText();
		System.out.println("总融资额度==="+sum);
		String old =driver.findElement(By.xpath("//div[@class='list']//li[3]/i")).getText();
		System.out.println("已用额度==="+old);
		String future =driver.findElement(By.xpath("//div[@class='list']//li[4]/i")).getText();
		System.out.println("可用额度==="+future);
		//提交订单
		WebElement submit =driver.findElement(By.xpath("//button[@class='submit_btn']"));
		submit.click();
		//获取订单号
		String orderNo = driver.findElement(By.xpath("//div//p[2]/i")).getText();
		System.out.println("下单成功的订单号====" + orderNo);
		//检查收货信息
		
		
		//处理<10000
		//处理>可融资额度
//		if(orderPrice<10000){
//			
//		}
		
	
		//订单详情
		WebElement order =driver.findElement(By.xpath("//div//p[2][@class='order_det']"));
		order.click();
		//订单提交成功页面点击我的金融title进入订单列表
		WebElement title =driver.findElement(By.xpath("//span[@class='title']"));
		title.click();
		
		//检查物流信息
		
		//找到刚下的订单进行操作
		//处理订单号    找到当前页所有的订单号 //div//p[2]/span[2]
		//	var s = $x("//div[1]/div[2]/p[2]/span[2]")
		//$(s).parent(".order_item").children("div")
		List<WebElement> orderlist = driver.findElements(By.xpath("//div//p[2]/span[2]"));
		for(WebElement o : orderlist){
			//截取最后16个字符串匹配刚下的订单
			String uu = o.getText();
			String oo =uu.substring(uu.length()-16, uu.length());
			if( oo.equals(orderNo)){
				System.out.println(o);
				System.out.println(o.getText());
//				WebElement s = o.findElement(By.cssSelector(ss));
				
			
				//找不到
			//	WebElement lijizhifu = o.findElement(By.xpath("/parent::p/parent::div/div/div[2]/a"));
			}
		}
		//轴    //div[@class='order_right']/p[2]/span[2]/parent::p/parent::div/div/div[2]/a
		
	}
	
	private void orderXQ() {
		List<WebElement> fOrder_result = driver.findElements(By.xpath(" //div[@class='fOrder_result']/div"));
		
		
	}
	

}
