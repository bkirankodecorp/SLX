package WareHouseScreenAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Login_page;
import PageObjects.Warehouse_Home_page;
import PageObjects.screenshot;


public class SpecialCharactersNegativeFunctionality {
	
	//private static WebDriver driver=null;

	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		

		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.p2pfuel.com/SLMain/");
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Login_page.txtbx_Username(driver).sendKeys("spladmin");
		screenshot.CaptureScreenshot(driver);
		Thread.sleep(3000);
		
		Login_page.txtbx_Password(driver).sendKeys("P@ssw0rd");
		screenshot.CaptureScreenshot(driver);
		Thread.sleep(3000);
		
		Login_page.btn_Login(driver).click();
		Thread.sleep(3000);
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Home_page.mouse(driver);
		Thread.sleep(3000);
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Home_page.button(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Home_page.name(driver).clear();
		
		Warehouse_Home_page.name(driver).sendKeys("@da");
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Home_page.description(driver).clear();
		
		Warehouse_Home_page.description(driver).sendKeys("@BULK pro_duts");
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Home_page.save(driver).click();
		
		
		screenshot.CaptureScreenshot(driver);
		

	}

}
