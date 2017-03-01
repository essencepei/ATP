package SCM.back.Action.account;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import SCM.back.Page.account.client;

public class ClientA {
	
	public static List<HashMap<String,String>> getAllclient(WebDriver driver){
		List<WebElement> trs = client.tbody(driver).findElements(By.tagName("tr"));
//		System.out.println("tr����������"+trs.size());
		Map<String,String> map = null;
		List<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
		for(WebElement tr :trs){
			List<WebElement>  tds = tr.findElements(By.tagName("td"));
//			System.out.println("td������������"+tds.size());
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
	
	public static void searchClient(WebDriver driver,String clientname){
		client.shopname(driver).sendKeys(clientname);
		client.searchButton(driver).click();
	}
	
}
