package PlantScreenAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Login_page;
import PageObjects.Plant_Home_page;

public class AlreadyExistFileFunctionality {

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
		
		Plant_Home_page.mouse(driver);
		Thread.sleep(3000);
		
		
	
		
		Plant_Home_page.button(driver).click();
		Thread.sleep(3000);
		
		Plant_Home_page.name(driver).sendKeys("1");
		Thread.sleep(3000);
		Plant_Home_page.description(driver).clear();
		Thread.sleep(3000);
		
		Plant_Home_page.description(driver).sendKeys("PLANTWAREHOUse#4");
		Thread.sleep(3000);
		
		Plant_Home_page.save(driver).click();
		Thread.sleep(3000);
		
		if(Plant_Home_page.alreadyexistfile(driver).isDisplayed()){
			Thread.sleep(3000);
			Plant_Home_page.description(driver).clear();
			Thread.sleep(3000);
			
			Plant_Home_page.description(driver).sendKeys("bulking1234");
			Thread.sleep(3000);
			
			Plant_Home_page.save(driver).click();
			Thread.sleep(3000);

	}

	}
}
