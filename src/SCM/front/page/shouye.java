package SCM.front.page;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import SCM.back.Page.account.client;

public class shouye {
	private static WebElement element = null;
	public static WebElement  shopName(WebDriver driver){
		element = driver.findElement(By.id("shopName"));
		return element;
	}
	//搜索关键字
	public static WebElement  key(WebDriver driver){
		element = driver.findElement(By.id("key"));
		return element;
	}
	//退出按钮
	public static WebElement  brandId(WebDriver driver){
		element = driver.findElement(By.tagName("button"));
		return element;
	}
	//购物车
	public static WebElement  gouwuche(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[3]/div/ul[2]/li[1]/a"));
		return element;
	}
	
	//进入个人中心
	public static WebElement  pc(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[3]/div/ul[2]/li[2]/a"));
		return element;
	}
	
	public static WebElement  tclass(WebDriver driver){
		element = driver.findElement(By.id("tclass"));
		return element;
	}
	
	public static WebElement  NewAccount(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div/div[3]/div[3]/a"));
		return element;
	}
	
	
	public  void inCar(WebDriver driver,int index,String munit,String funit) {
		shouye sy = new shouye();
		WebElement tclass = sy.tclass(driver);
		List<WebElement> lis = tclass.findElements(By.tagName("li"));
		if(index-1<lis.size()){
//		WebElement  li = lis.get(index-1);
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/ul/li["+index+"]/div/div[1]/input")).sendKeys(funit);
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/ul/li["+index+"]/div/div[2]/input")).sendKeys(munit);
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/ul/li["+index+"]/div/div[3]/a/span")).click();
		}else{
			System.out.println("没有足够的商品");
		}
	}
	
	public  void goCar(WebDriver driver) {
		shouye.gouwuche(driver).click();
	}
	
	public static WebElement  tbody(WebDriver driver){
		element = driver.findElement(By.xpath("//table[@id='table']/tbody"));
		return element;
	}
	
	public static List<HashMap<String,String>> getProductList(WebDriver driver){
		List<WebElement> trs = client.tbody(driver).findElements(By.tagName("tr"));
//		System.out.println("tr的数量：："+trs.size());
		Map<String,String> map = null;
		List<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
		for(WebElement tr :trs){
			List<WebElement>  tds = tr.findElements(By.tagName("td"));
//			System.out.println("td的数量：：："+tds.size());
			String s = tds.get(0).getText();
				map = new HashMap<String,String>();
				map.put("name", tds.get(1).getText());
				map.put("price", tds.get(2).getText());
				map.put("guige", tds.get(3).getText());
				map.put("kucun", tds.get(4).getText());
				list.add((HashMap<String, String>) map);
		}
		return list;
	}
	
}
