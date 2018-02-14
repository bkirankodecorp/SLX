package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {
	
	
	
	
	public static void browse(WebDriver driver) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        ChromeDriver driver1=new ChromeDriver();
		
		driver1.get("https://www.p2pfuel.com/SLMain/");
		
		
		driver1.manage().window().maximize();
		return;
		
		
	}
	
	
	


	

	
		
		
		
		
	}
	
	



