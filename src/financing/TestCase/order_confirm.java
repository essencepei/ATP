package financing.TestCase;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import financing.pageAction.order_confirm_action;
import utils.PropertyUtil;

public class order_confirm {
	private static WebDriver driver = null;
	public static void main(String[] args) throws Exception  {
	System.setProperty("webdriver.chrome.driver","D:\\workspace\\SCMtest\\WebDriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get(PropertyUtil.getProperties().getProperty("fanurl"));
	
	driver.manage().window().maximize();
//	a_order_confirm.ChooseADD(driver);
//	p_order_confirm.ADD(driver).click();
//	a_order_confirm.ChooseFP(driver);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[4]/p/input")).click();
	driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("taitou");
	driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("��Ʊ����ŷŵ��");
	
	//����begin
//	a_order_confirm.ChooseZT(driver);
//	WebElement target = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/ul/li[2]"));
//	 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", target);
//	 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[2]/p[1]/input")).sendKeys("lisi");
//	 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[2]/p[2]/input")).sendKeys("123");
	//����end
//	driver.findElement(By.id("myModal"));
//    (new WebDriverWait(driver, 10)).until(
//            new ExpectedCondition<Boolean>() {
//                public Boolean apply(WebDriver d) {
//                    return d.findElement(By.id("myModal")).isDisplayed();
//                }
//            }
//    );
//    
    //       ����Ի����е�����
    //       ���ڶԻ����е�Ԫ�ر��ɰ����ڵ���ֱ�ӵ���ᱨ Element is not clickable�Ĵ���
    //       ����ʹ��js��ģ��click
    //       ��watir-webdriver��ֻ��Ҫfire_event(:click)�Ϳ�����
//            WebElement  name = driver.findElement(By.id("myModal")).findElement(By.xpath("/div/div[2]/p[1]/input"));
//            name.sendKeys("����");
//            WebElement  Tel = driver.findElement(By.id("myModal")).findElement(By.xpath("/div/div/div[2]/p[2]/input"));
//            name.sendKeys("13232323232");
////            WebElement  Add = driver.findElement(By.id("myModal")).findElement(By.xpath("/div/div/div[2]/p[3]/input"));
////            name.sendKeys("����");
//            WebElement  DetailAdd = driver.findElement(By.id("myModal")).findElement(By.xpath("/div/div/div[2]/p[4]/input"));
//            name.sendKeys("�ǶԷ��������ʽ���ͷ�");
//            Thread.sleep(1000);
//            System.out.println("browser will be close");
	
	}
}
//ģ̬���ڴ���
/*public class Modal {

    public static void main(String[] args) throws InterruptedException {
        WebDriver dr = new ChromeDriver();

        File file = new File("src/modal.html");
        String filePath = "file:///" + file.getAbsolutePath();
        System.out.printf("now accesss %s \n", filePath);

        dr.get(filePath);
        Thread.sleep(1000);

//      �򿪶Ի���
        dr.findElement(By.id("show_modal")).click();

        (new WebDriverWait(dr, 10)).until(
                new ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver d) {
                        return d.findElement(By.id("myModal")).isDisplayed();
                    }
                }
        );

//       ����Ի����е�����
//       ���ڶԻ����е�Ԫ�ر��ɰ����ڵ���ֱ�ӵ���ᱨ Element is not clickable�Ĵ���
//       ����ʹ��js��ģ��click
//       ��watir-webdriver��ֻ��Ҫfire_event(:click)�Ϳ�����
        WebElement link = dr.findElement(By.id("myModal")).findElement(By.id("click"));
        ((JavascriptExecutor)dr).executeScript("$(arguments[0]).click()", link);

        Thread.sleep(1000);
        System.out.println("browser will be close");
        dr.quit();  
    }
}*/