package SCM.back.TestCase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import SCM.back.Action.account.OpenList;
import SCM.back.Action.account.SCMLogin;

public class TableCell {
	private static WebDriver driver = null;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\SCMtest\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://169.254.0.190/scm/view/order/orderManagement.jsp");
		SCMLogin.Login(driver);
		
		OpenList.openOrder(driver);
		driver.manage().window().maximize();
		
		WebElement tbody = driver.findElement(By.id("main_tbody"));
		List<WebElement> trs = tbody.findElements(By.tagName("tr"));
		int i =0;
		for(WebElement tr :trs){
			if(tr.getAttribute("class").equals("cls")){
				i++;
			}
			System.out.println(i);
			Thread.sleep(2000);
			//�õ�td
			List<WebElement> tds =tr.findElements(By.tagName("td"));
			System.out.println("td����"+tds.size());
			if(tds.size()!=0){
				 for(WebElement td : tds){
//					//�õ�a����
//					 List<WebElement> as = td.findElements(By.tagName("a"));
//					 for(WebElement a : as){
//						 a.click();
//						 //����ҳ���Ƿ�����������¼�˺��Ƿ����б��еĵ�¼�˺�һ��
//						 a.findElement(By.xpath("/html/body/div/div[3]/div[2]/div[12]/button[@type='button']")).click();;
//						 System.out.println(a.getText());
//					 }
				 }
			}else{
			}
		}
	}
}
