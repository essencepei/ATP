package SCM.back.TestCase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SCM.back.Action.account.LeftMenu;
import SCM.back.Action.account.SCMLogin;
import SCM.back.Action.order.orderA;
import SCM.back.Page.order.Order;
import utils.DriverUtils;

public class ExcuteOrder {
	private static WebDriver driver = null;
	
	@BeforeTest
	public void Init() throws Exception   {
		driver = DriverUtils.getChromeDriver();
		SCMLogin.Login(driver);
		Thread.sleep(5000);
		try {
			LeftMenu.openOrderManage(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//	@Test(dataProvider= "orderNo")
	@Test
	public void  ordermanage() throws Exception {
		
		
		List<WebElement> order =driver.findElements(By.cssSelector("html body div.main-content div.container table#JColResizer0.list_table.table_drag.JColResizer tbody#main_tbody tr.cls"));
		WebElement first = order.get(0);
//		//点击打开订单明细
//		first.findElements(By.tagName("td")).get(1).click();
//		List<WebElement> orders = driver.findElements(By.tagName("tr"));
//		Thread.sleep(2000);
//		List<HashMap<String,String>> detail =ExcuteOrder.getAllclient(driver);
//		System.out.println(detail.size());

		
		WebElement table = Order.table(driver);
		orderA.getTableHead1(table);
//		//如果状态是待审核，那么点审核
		if(ExcuteOrder.infomap(first).get("zhuangtai").equals("待审核")){
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/table/tbody/tr[2]/td/div/button[2]")).click();
			//输入审核意见，点确定
//			driver.findElement(By.)
		}
	}
	
	public static List<HashMap<String,String>> getAllclient(WebDriver driver){
		List<WebElement> detailtable = driver.findElements(By.xpath("/html/body/div[4]/div[2]/table/tbody/tr[2]/td/table/tbody/tr"));
		Map<String,String> map = null;
		List<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
		for(WebElement tr :detailtable){
			List<WebElement>  tds = tr.findElements(By.tagName("td"));
//			System.out.println("td的数量：：："+tds.size());
				map = new HashMap<String,String>();
				map.put("skucode", tds.get(0).getText());
				map.put("skuname", tds.get(1).getText());
				map.put("attribute", tds.get(2).getText());
				map.put("num", tds.get(3).getText());
				map.put("price", tds.get(4).getText());
				map.put("kucun", tds.get(5).getText());
				list.add((HashMap<String, String>) map);
		}
		return list;
	}
	
	 public static HashMap<String,String> infomap(WebElement first) {
			Map<String,String>  info = null;
			List<WebElement> tds=	first.findElements(By.tagName("td"));
			info = new HashMap<String,String>();
			info.put("orderNo", tds.get(2).getText());
			info.put("caigoukehu", tds.get(3).getText());
			info.put("totalPrice", tds.get(4).getText());
			info.put("yunfei", tds.get(5).getText());
			info.put("time", tds.get(6).getText());
			info.put("zhuangtai", tds.get(7).getText());
			info.put("address", tds.get(8).getText());
			info.put("vmhouse", tds.get(9).getText());
			return (HashMap<String, String>) info;
	}
	
	
//	@AfterTest
//	public void logout() {
//		driver.findElement(By.xpath("/html/body/div[1]/ul/li[3]/a")).click();
//		driver.quit();
//	}
//	
}
