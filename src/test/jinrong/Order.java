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
		//���Ե�ַ
		driver.get(PropertyUtil.getProperties().getProperty("jphdemo"));
		//��ʽ��ַ
		//driver.get(PropertyUtil.getProperties().getProperty("fanurl"));

		driver.manage().window().maximize();
		Order order = new Order();
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]")).click();
		order.orderConfirm("100");
		order.ChooseJSP();
//		order.chooseZT("ziti", "18672387288");
		order.qurongzi();
		
		//���µ�ֱ�ӽ����ҵĽ���
		//order.Myfc("100", "");

	}
	
//	public static void startDriver() {
//		System.setProperty("webdriver.chrome.driver","D:\\workspace\\SCMtest\\WebDriver\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		//���Ե�ַ
//		driver.get(PropertyUtil.getProperties().getProperty("jphdemo"));
//		//��ʽ��ַ
//		//driver.get(PropertyUtil.getProperties().getProperty("fanurl"));
//		driver.manage().window().maximize();
//	}
	
	public void ChooseJSP() {
		WebElement addr = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[2]"));
		addr.click();
	}

	//ģ���µ�
	public void orderConfirm(String pNum) {
		//�����¶���ҳ��
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
		//ȡ���������ͽ��
		String sum = driver.findElement(By.xpath("//i[@class='red bold']")).getText();
		System.out.println("sum === " +sum);
		//���������ʶ�ȵ����
	}
	
	//spNumΪ�յ�ʱ�� �����ҵĽ����б�
	public void Myfc(String pNum,String spNum) {
		//�����¶���ҳ��
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
	
	//��ʽ�µ�
	private void LBDFC() {

	}
	
	//ѡ������
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
	
	//�Ƿ�Ҫ��Ʊ
	public void IsFP() {
		WebElement FP =driver.findElement(By.id("fp_choice"));
		FP.isSelected();
	}
	
	public void qurongzi() {
		WebElement gogo =driver.findElement(By.xpath("//p/input[@class='submit']"));
		gogo.click();
		//click����ܴ������ʶ�Ȳ��������
		
		//ȡ�����������ʶ�ȡ������ʶ�ȡ������ʶ��
		String orderPrice =driver.findElement(By.xpath("//div[@class='list']//li[1]/i")).getText();
		System.out.println("�������==="+orderPrice);
		String sum =driver.findElement(By.xpath("//div[@class='list']//li[2]/i")).getText();
		System.out.println("�����ʶ��==="+sum);
		String old =driver.findElement(By.xpath("//div[@class='list']//li[3]/i")).getText();
		System.out.println("���ö��==="+old);
		String future =driver.findElement(By.xpath("//div[@class='list']//li[4]/i")).getText();
		System.out.println("���ö��==="+future);
		//�ύ����
		WebElement submit =driver.findElement(By.xpath("//button[@class='submit_btn']"));
		submit.click();
		//��ȡ������
		String orderNo = driver.findElement(By.xpath("//div//p[2]/i")).getText();
		System.out.println("�µ��ɹ��Ķ�����====" + orderNo);
		//����ջ���Ϣ
		
		
		//����<10000
		//����>�����ʶ��
//		if(orderPrice<10000){
//			
//		}
		
	
		//��������
		WebElement order =driver.findElement(By.xpath("//div//p[2][@class='order_det']"));
		order.click();
		//�����ύ�ɹ�ҳ�����ҵĽ���title���붩���б�
		WebElement title =driver.findElement(By.xpath("//span[@class='title']"));
		title.click();
		
		//���������Ϣ
		
		//�ҵ����µĶ������в���
		//��������    �ҵ���ǰҳ���еĶ����� //div//p[2]/span[2]
		//	var s = $x("//div[1]/div[2]/p[2]/span[2]")
		//$(s).parent(".order_item").children("div")
		List<WebElement> orderlist = driver.findElements(By.xpath("//div//p[2]/span[2]"));
		for(WebElement o : orderlist){
			//��ȡ���16���ַ���ƥ����µĶ���
			String uu = o.getText();
			String oo =uu.substring(uu.length()-16, uu.length());
			if( oo.equals(orderNo)){
				System.out.println(o);
				System.out.println(o.getText());
//				WebElement s = o.findElement(By.cssSelector(ss));
				
			
				//�Ҳ���
			//	WebElement lijizhifu = o.findElement(By.xpath("/parent::p/parent::div/div/div[2]/a"));
			}
		}
		//��    //div[@class='order_right']/p[2]/span[2]/parent::p/parent::div/div/div[2]/a
		
	}
	
	private void orderXQ() {
		List<WebElement> fOrder_result = driver.findElements(By.xpath(" //div[@class='fOrder_result']/div"));
		
		
	}
	

}
