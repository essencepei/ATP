package SCM.back.Action.account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import SCM.back.Page.account.client;

public class LeftMenu {
	public static void openClientManage(WebDriver driver) throws Exception{
		
		String kehuguanli = driver.findElement(By.xpath("/html/body/div[3]/ul/li[3]")).getAttribute("class");
		if(kehuguanli.equals("active")){
			driver.findElement(By.id("PPN31")).click();
			Thread.sleep(2000);
		}else{
			driver.findElement(By.xpath("/html/body/div[3]/ul/li[3]/h3")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("PPN31")).click(); 
			Thread.sleep(2000);
		};
	}
	public static void openAccountManage(WebDriver driver) throws Exception{
		String kehuguanli = driver.findElement(By.xpath("/html/body/div[3]/ul/li[2]")).getAttribute("class");
		if(kehuguanli.equals("active")){
			driver.findElement(By.id("PPN32")).click();
			Thread.sleep(2000);
		}else{
			driver.findElement(By.xpath("/html/body/div[3]/ul/li[2]/h3"));
			driver.findElement(By.id("PPN32")).click(); 
			Thread.sleep(2000);
		};
	}
	
	
	public static void openOrderManage(WebDriver driver) throws Exception{
		
		String kehuguanli = driver.findElement(By.xpath("/html/body/div[3]/ul/li[2]")).getAttribute("class");
		if(kehuguanli.equals("active")){
			driver.findElement(By.id("PM6")).click();
			Thread.sleep(2000);
		}else{
			driver.findElement(By.xpath("/html/body/div[3]/ul/li[2]/h3"));
			driver.findElement(By.id("PM6")).click(); 
			Thread.sleep(2000);
		};
	}
	

}
