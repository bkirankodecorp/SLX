package WareHouseScreenAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Login_page;
import PageObjects.Warehouse_Home_page;
import PageObjects.screenshot;



public class DeleteFuntionality {
	
	//private static WebDriver driver=null;
	
	
public static void main(String[] args) throws Exception {
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.p2pfuel.com/SLMain/");
		screenshot.CaptureScreenshot(driver);
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login_page.txtbx_Username(driver).sendKeys("spladmin");
		
		Thread.sleep(3000);
		screenshot.CaptureScreenshot(driver);
		
		Login_page.txtbx_Password(driver).sendKeys("P@ssw0rd");
		Thread.sleep(3000);
		screenshot.CaptureScreenshot(driver);
		Login_page.btn_Login(driver).click();
		Thread.sleep(3000);
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Home_page.mouse(driver);
		Thread.sleep(3000);
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Home_page.delete(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Home_page.confirm(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		
		
		
		
	}

}
