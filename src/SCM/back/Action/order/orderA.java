package SCM.back.Action.order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import SCM.back.Page.account.client;
import SCM.back.Page.order.Order;

public class orderA {
	public static List<HashMap<String,String>> getAllOrder(WebDriver driver,Map<String,String> head){
		WebElement table = Order.table(driver);
		List<WebElement> trs = client.tbody(driver).findElements(By.tagName("tr"));
//		System.out.println("tr的数量：："+trs.size());
		Map<String,String> map = null;
		List<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
		for(WebElement tr :trs){
			List<WebElement>  tds = tr.findElements(By.tagName("td"));
//			System.out.println("td的数量：：："+tds.size());
			String s = tds.get(0).getText();
				map = new HashMap<String,String>();
				map.put("no", tds.get(0).getText());
				map.put("name", tds.get(1).getText());
				map.put("type", tds.get(2).getText());
				map.put("area", tds.get(3).getText());
				map.put("vmhouse", tds.get(4).getText());
				map.put("time", tds.get(5).getText());
				map.put("operate", tds.get(6).getText());
				list.add((HashMap<String, String>) map);
		}
		return list;
	}
	
	public static Map<String,String> getTableHead(WebElement table) {
		Map<String,String> thead = null;
		
		return thead;
	}
	
	public static List<String> getTableHead1(WebElement table) {
		List<String> thead = null;
		List<WebElement> ths =table.findElements(By.tagName("th"));
		for(WebElement th:ths){
		System.out.println(th.getText());
//		if(th.getText()!=null){
//			thead.add(th.getText());
//		}
		}
		return thead;
	}
}
