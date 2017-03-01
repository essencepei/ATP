package SCM.back.Action.account;

import org.openqa.selenium.WebDriver;

import SCM.back.Page.order.FoodList;
import SCM.back.Page.order.Order;
import SCM.back.Page.order.QTY;

public class QTYSearch {
	public static void FLSearch(WebDriver driver, int index) throws InterruptedException{
		QTY.ClassOptions(driver).get(index).click();
		Thread.sleep(2000);		
		QTY.query(driver).click();
		//�����ѯ����򣬻ָ�ԭʼtable����
		QTY.ClassOptions(driver).get(0).click();
		QTY.query(driver).click();
	}
	
	public static void wmCodeSearch(WebDriver driver,int index) throws Exception{
		QTY.VMOptions(driver).get(index).click();
		Thread.sleep(2000);
		QTY.query(driver).click();
		//�����ѯ����򣬻ָ�ԭʼtable����
		QTY.VMOptions(driver).get(0).click();
		QTY.query(driver).click();
	}
	
	public static void skuNameSearch(WebDriver driver,String skuName) throws InterruptedException{
		QTY.skuName(driver).sendKeys(skuName);
		Thread.sleep(1000);
		QTY.query(driver).click();
		Thread.sleep(1000);
		//�����ѯ����򣬻ָ�ԭʼtable����
		QTY.skuName(driver).clear();
		QTY.query(driver).click();
	}
	
	public static void skuCodeSearch(WebDriver driver,String skuCode){
		QTY.skuCode(driver).sendKeys(skuCode);
		QTY.query(driver).click();
		//�����ѯ����򣬻ָ�ԭʼtable����
		QTY.skuCode(driver).clear();
		QTY.query(driver).click();
	}
	
	public static void stylenoSearch(WebDriver driver,int index) throws Exception{
		QTY.StylenoOptions(driver).get(index).click();
		Thread.sleep(2000);		
		QTY.query(driver).click();
		//�����ѯ����򣬻ָ�ԭʼtable����
		QTY.StylenoOptions(driver).get(0).click();
		QTY.query(driver).click();
	}
}
