package WareHouseScreenAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Login_page;
import PageObjects.Warehouse_Home_page;
import PageObjects.screenshot;



public class UndeleteFunctionality {
	
	//private static WebDriver driver=null;

	public static void main(String[] args) throws Exception {
		
		
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.p2pfuel.com/SLMain/");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Login_page.txtbx_Username(driver).sendKeys("spladmin");
			Thread.sleep(3000);
			
			Login_page.txtbx_Password(driver).sendKeys("P@ssw0rd");
			Thread.sleep(3000);
			
			Login_page.btn_Login(driver).click();
			Thread.sleep(3000);
			
			Warehouse_Home_page.mouse(driver);
			Thread.sleep(3000);
			
			Warehouse_Home_page.button(driver).click();
			Thread.sleep(3000);
			
			
			Warehouse_Home_page.name(driver).clear();
			Thread.sleep(3000);
			
			Warehouse_Home_page.name(driver).sendKeys("mek");
			Thread.sleep(3000);
			
			
			
			Warehouse_Home_page.description(driver).clear();
			Thread.sleep(3000);
			
			Warehouse_Home_page.description(driver).sendKeys("BULK produts");
			Thread.sleep(3000);
			
			
			
			Warehouse_Home_page.save(driver).click();
			Thread.sleep(3000);
			
			screenshot.CaptureScreenshot(driver);
			
			
			
			if(driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[1]/div/div/p")).isDisplayed()){
				Thread.sleep(3000);
				Warehouse_Home_page.undelete(driver).click();
				Thread.sleep(3000);
				screenshot.CaptureScreenshot(driver);
				
				Warehouse_Home_page.save(driver).click();
				Thread.sleep(3000);
				screenshot.CaptureScreenshot(driver);
				
				
				
			}
			
			
			
			
			
			screenshot.CaptureScreenshot(driver);
			
			
			
		
		
		

	}

}
