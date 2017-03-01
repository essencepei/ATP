package SCM.front.testcase;

import static org.testng.Assert.assertEquals;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SCM.back.Page.account.login;
import SCM.front.page.Morder;
import SCM.front.page.shouye;
import SCM.front.page.successOrder;
import utils.DriverUtils;
import utils.PropertyUtil;

public class PreOrderTest {
	WebDriver driver = DriverUtils.getChromeDriver();
	
	@BeforeTest
	private void init() {
		login.frontLogin(driver);
		String text = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/span/a/i")).getText();
		assertEquals(text, PropertyUtil.getProperties().getProperty("fusername"));
	}
	
	@Test
	private void preOrder() throws Exception {
		WebElement table = driver.findElement(By.id("list"));
		//�����Ʒ
			List<WebElement> lists =table.findElements(By.tagName("tr"));
			for(int i=0;i<7;i++){
				WebElement button = lists.get(i).findElement(By.tagName("button"));
				button.click();
			}
			//�����ﳵ
			shouye.gouwuche(driver).click();
			//��ӱ�ע���ύ����
			driver.findElement(By.id("remark")).sendKeys("��ע����");
			driver.findElement(By.xpath("//body/div[3]/div/div[3]/div/form/div[2]/div[2]/button[2]")).click();
			Thread.sleep(1000);
			WebElement buhebing =driver.findElement(By.xpath("//*[@id='mergeOrderViewModal']/div/div/div[3]/button[1]"));
			buhebing.click();
			//�����ύ�ɹ����棬����鿴����
			successOrder.chakandingdan(driver).click();
			Morder.getOrder(driver);
	}
}
