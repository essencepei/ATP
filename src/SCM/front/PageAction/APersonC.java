package SCM.front.PageAction;

import org.openqa.selenium.WebDriver;

import SCM.front.page.PersonC;

public class APersonC {
	public void GoMyOrder(WebDriver driver){
		PersonC.MyOrder(driver).click();
	}
	
	public void GoMyMessage(WebDriver driver){
		PersonC.MyMessage(driver).click();
	}
	
	public void GoOrderCount(WebDriver driver){
		PersonC.OrderCount(driver).click();
	}
	
	public void GoMyLiuyan(WebDriver driver){
		PersonC.MyLiuyan(driver).click();
	}
	
	public void GoManageAbnormal(WebDriver driver){
		PersonC.ManageAbnormal(driver).click();
	}
	
	public void GoManageAccount(WebDriver driver){
		PersonC.ManageAccount(driver).click();
	}
	
	public void GoUpdatemm(WebDriver driver){
		PersonC.Updatemm(driver).click();
	}
	
	public void GoManageAdress(WebDriver driver){
		PersonC.ManageAdress(driver).click();
	}
	
}
