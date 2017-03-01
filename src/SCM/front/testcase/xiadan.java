package SCM.front.testcase;
import static org.testng.Assert.assertEquals;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import SCM.back.Page.account.login;
import SCM.front.page.PersonC;
import SCM.front.page.shouye;
import SCM.front.page.successOrder;
import utils.DriverUtils;
import utils.PropertyUtil;

public class xiadan {
	private static WebDriver driver = null;
	
	@BeforeTest
	public void Init()   {
		driver = DriverUtils.getChromeDriver();
		login.frontLogin(driver);
		try {
			String text = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/span/a/i")).getText();
			assertEquals(text, PropertyUtil.getProperties().getProperty("fusername"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void buy() throws Exception {
		// TODO Auto-generated method stub
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
		Thread.sleep(1000);
		successOrder.chakandingdan(driver).click();
//	�ص���ҳ
		Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/a[1]")).click();
	

	}
//	@DataProvider(name = "orderNo")
	@Test
	public static void order() throws Exception {
		shouye.pc(driver).click();
		Thread.sleep(1000);
		PersonC.MyOrder(driver).click();
		Assert.assertEquals("selected",PersonC.MyOrder(driver).getAttribute("class") );
		String menuname = PersonC.MyOrder(driver).findElement(By.tagName("a")).getText();
		String daohanglan=PersonC.First(driver).getText();
		//�ж�ѡ�еĺ͵������Ƿ��Ӧ
		Assert.assertEquals(menuname,daohanglan);
		List<WebElement> trs =driver.findElements(By.xpath("//*[@id='mainList_tbody']/tr"));
		System.out.println(trs.size());
		WebElement tr = trs.get(0);
		tr.click();
		//�ж�tr�Ƿ��
		Assert.assertEquals("cls open", tr.getAttribute("class"));
		//�ж��µ���Ķ���״̬
		String dingdanzhuangtai = tr.findElements(By.tagName("td")).get(5).getText();
		Assert.assertEquals("�����",dingdanzhuangtai);
		
		String orderNo = tr.findElements(By.tagName("td")).get(0).getText();
		System.out.println(orderNo);
		//�����Ÿ���̨���
//		return orderNo;
	}
	
}
