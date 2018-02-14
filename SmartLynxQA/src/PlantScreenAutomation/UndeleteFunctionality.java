package PlantScreenAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Login_page;
import PageObjects.Plant_Home_page;

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
		
		Plant_Home_page.mouse(driver);
		Thread.sleep(3000);
		
		
		
		Plant_Home_page.button(driver).click();
		Thread.sleep(3000);
		
		Plant_Home_page.name(driver).sendKeys("1");
		Thread.sleep(3000);
		
		
		
		Plant_Home_page.description(driver).sendKeys("#include PLANT More(0)12 3");
		Thread.sleep(3000);
		
		
		Plant_Home_page.save(driver).click();
		Thread.sleep(3000);
		
		if(driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[1]/div/div/p")).isDisplayed()){
			
			Plant_Home_page.undelete(driver).click();
			Plant_Home_page.save(driver).click();
			
		}
		
		
		


	}

}
