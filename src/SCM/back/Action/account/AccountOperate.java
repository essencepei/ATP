package SCM.back.Action.account;

import org.openqa.selenium.WebDriver;

import SCM.back.Page.account.companymanage;

public class AccountOperate {
	public static void openaccountmanage(WebDriver driver){
		companymanage.accountManage(driver).click();
	}
}
