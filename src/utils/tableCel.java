package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tableCel {
	public static List<HashMap<String,String>> getEvery(WebElement tbody) {
		List<WebElement> trs = tbody.findElements(By.tagName("tr"));
		Map<String,String> map = null;
		List<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
		for(WebElement tr :trs){
			List<WebElement>  tds = tr.findElements(By.tagName("td"));
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
	
	//取指定行列的值
	public static String tableCell(WebDriver driver,int row, int column)
	{
	    String text = null;
	    row=row+1;
	    String xpath="//tbody/tr["+row+"]/td["+column+"]";
	    WebElement table=driver.findElement(By.xpath(xpath)); 
	    text=table.getText();
	    return text;
		}
}
