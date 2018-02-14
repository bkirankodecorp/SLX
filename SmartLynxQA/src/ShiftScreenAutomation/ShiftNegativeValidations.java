package ShiftScreenAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Login_page;
import PageObjects.screenshot;
import PageObjects.Shift_Home_page;



public class ShiftNegativeValidations {
	
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
		
		Shift_Home_page.mouse(driver);
		
		
		Thread.sleep(3000);
		
		Shift_Home_page.button(driver).click();
		Thread.sleep(3000);
		
		Shift_Home_page.shift(driver).clear();
		
		Thread.sleep(3000);
		
		
		
		Shift_Home_page.description(driver).clear();
		
		Thread.sleep(3000);
		
		WebElement toclear=Shift_Home_page.starttime(driver);
		toclear.sendKeys(Keys.CONTROL + "a");
		toclear.sendKeys(Keys.DELETE);
		Thread.sleep(3000);
		
		
		
		
		
		WebElement toclear1=Shift_Home_page.endtime(driver);
		toclear1.sendKeys(Keys.CONTROL + "a");
		toclear1.sendKeys(Keys.DELETE);
		Thread.sleep(3000);
		
	
		
		
		WebElement toclear2=Shift_Home_page.showscheduleuntil(driver);
		toclear2.sendKeys(Keys.CONTROL + "a");
		toclear2.sendKeys(Keys.DELETE);
		
		Thread.sleep(3000);
		
        Shift_Home_page.save(driver).click();
		
		Thread.sleep(3000);
		
		
		screenshot.CaptureScreenshot(driver);
		Thread.sleep(3000);
		
		
		Shift_Home_page.save(driver).click();
		
		Thread.sleep(3000);
		
		

	}

}
