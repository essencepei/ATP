package SCM.back.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SCM.back.Action.account.ClientA;
import SCM.back.Action.account.LeftMenu;
import SCM.back.Action.account.SCMLogin;
import SCM.back.Page.account.client;
import utils.DriverUtils;

public class Client {
	private static WebDriver driver = null;
	
	@BeforeTest
	public void Init()   {
		driver = DriverUtils.getChromeDriver();
		SCMLogin.Login(driver);
		String  yanzheng= driver.findElement(By.xpath("/html/body/div[1]/ul/li[3]/a/span")).getText();
		Assert.assertEquals("退出登录", yanzheng);
		try {
			LeftMenu.openClientManage(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void CompareFirstClient() {
		driver.navigate().refresh();
		String name = ClientA.getAllclient(driver).get(0).get("name");
		ClientA.searchClient(driver, name);
		Assert.assertEquals(ClientA.getAllclient(driver).get(0).get("name"),"上海申康广州白云店");
		System.out.println("清除搜索记录::"+name);
		client.shopname(driver).clear();
		client.searchButton(driver).click();
	}
	
	@Test
	public void DuoResult() {
	driver.navigate().refresh();
	String sb="上海申康";
	ClientA.searchClient(driver, sb);
	int num = ClientA.getAllclient(driver).size();

	for(int i = 0 ;i<num;i++){
		String s =ClientA.getAllclient(driver).get(i).get("name");
		Boolean b =s.contains(sb);
		//模糊匹配
		Assert.assertEquals(s.contains(sb), true);
		System.out.println(ClientA.getAllclient(driver).get(i).get("name"));
	}
	System.out.println("清除搜索记录::"+sb);
	client.shopname(driver).clear();
	client.searchButton(driver).click();
	}
	
	@Test
	public void three() throws Exception{
		driver.navigate().refresh();
		//停用启用门店
		WebElement TQ= driver.findElement(By.xpath("//table//tbody/tr[1]/td[7]/a[1]"));
		Thread.sleep(1000);
		String ss = TQ.getText();
		TQ.click();
		driver.findElement(By.cssSelector("a.layui-layer-btn0")).click();
		Thread.sleep(1000);
	}
	
	@AfterTest
	public void logout() {
		driver.findElement(By.xpath("/html/body/div[1]/ul/li[3]/a")).click();
		driver.quit();
	}
	
}
