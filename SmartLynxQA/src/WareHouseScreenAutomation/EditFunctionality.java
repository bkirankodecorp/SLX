package WareHouseScreenAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Login_page;
import PageObjects.Warehouse_Home_page;
import PageObjects.screenshot;



public class EditFunctionality {

	//private static WebDriver driver=null;
	
	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.p2pfuel.com/SLMain/");
		
		screenshot.CaptureScreenshot(driver);
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Login_page.txtbx_Username(driver).sendKeys("spladmin");
		screenshot.CaptureScreenshot(driver);
		
		
		Thread.sleep(3000);
		
		
		Login_page.txtbx_Password(driver).sendKeys("P@ssw0rd");
		
		Thread.sleep(3000);
		screenshot.CaptureScreenshot(driver);
		
		Login_page.btn_Login(driver).click();
		screenshot.CaptureScreenshot(driver);
		Thread.sleep(3000);
		
		
		Warehouse_Home_page.mouse(driver);
		screenshot.CaptureScreenshot(driver);
		Thread.sleep(3000);
		
		Warehouse_Home_page.edit(driver).click();
		
		Thread.sleep(3000);
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Home_page.description(driver).clear();
		
		Thread.sleep(3000);
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Home_page.description(driver).sendKeys("Paul's bulk Warehouse 132 3441");
		screenshot.CaptureScreenshot(driver);
		Thread.sleep(3000);
		
		Warehouse_Home_page.save(driver).click();
		
		Thread.sleep(3000);
		screenshot.CaptureScreenshot(driver);
		
		
		

	}

}
