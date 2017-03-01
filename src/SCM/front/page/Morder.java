package SCM.front.page;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import SCM.back.Page.account.client;

public class Morder {
	private static WebElement element = null;
	
	public static WebElement  shouye(WebDriver driver){
		element = driver.findElement(By.xpath("html/body/div[2]/div/div[2]/div[1]/h3/a[1]"));
		return element;
	}
	
	public static WebElement  grzx(WebDriver driver){
		element = driver.findElement(By.xpath("html/body/div[2]/div/div[2]/div[1]/h3/a[2]"));
		return element;
	}
	
	public static void go(WebElement elment){
		elment.click();
	}
	
	public static WebElement tbody(WebDriver driver){
		element = driver.findElement(By.xpath("//tbody[@id='mainList_tbody']"));
		return element;
	}
	
	public static List<HashMap<String,String>> getOrder(WebDriver driver){
//		List<WebElement> trs = Morder.tbody(driver).findElements(By.tagName("tr"));
		List<WebElement> trs =driver.findElements(By.xpath("//*[@id='mainList_tbody']/tr"));
		System.out.println("tr的数量：："+trs.size());
		Map<String,String> map = null;
		List<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
		for(WebElement tr :trs){
			List<WebElement>  tds = tr.findElements(By.tagName("td"));
			System.out.println("td的数量：：："+tds.size());
			String s = tds.get(0).getText();
				map = new HashMap<String,String>();
				map.put("orderNo", tds.get(0).getText());
				map.put("zhonglei", tds.get(1).getText());
				map.put("totalPrice", tds.get(2).getText());
				map.put("yunfei", tds.get(3).getText());
				map.put("time", tds.get(4).getText());
				map.put("zhuangtai", tds.get(5).getText());
				list.add((HashMap<String, String>) map);
		}
		return list;
	}
}
