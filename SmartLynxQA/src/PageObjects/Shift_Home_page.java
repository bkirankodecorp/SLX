package PageObjects;

import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Shift_Home_page {
	
	private static WebElement element=null;
	private static MouseHandler mouse =null;
	private static WebElement button=null;
	private static WebElement shift=null;
	private static WebElement description=null;
	private static WebElement starttime=null;
	private static WebElement endtime=null;
	private static WebElement showscheduleuntil=null;
	private static WebElement save=null;
	private static WebElement alert=null;
	private static WebElement border=null; 
	
	
	
	public static MouseHandler mouse(WebDriver driver){
		
		WebElement element=driver.findElement(By.xpath(".//*[@id='main']/div[1]/div/div[2]/div/div/ul/li[1]/a"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(element).moveToElement(driver.findElement(By.xpath(".//*[@id='main']/div[1]/div/div[2]/div/div/ul/li[1]/ul/li[22]/a"))).click().build().perform();
		
		return mouse;
		
		
	}
	
	public static WebElement button(WebDriver driver){
		
		button=driver.findElement(By.xpath(".//*[@id='btncreate']"));
		
		
		return button;
		
		
	}
	
	public static WebElement shift(WebDriver driver){
		
		shift=driver.findElement(By.id("BaseShift_ShiftId"));
		
				return shift;
		
		
	}
	
	public static WebElement description(WebDriver driver){
		
		description=driver.findElement(By.id("BaseShift_Description"));
		return description;
		
	}
	
	public static WebElement starttime(WebDriver driver){
		
		starttime=driver.findElement(By.id("BaseShift_StartTimehhmm"));
		return starttime;
		
	}
	
	public static WebElement endtime(WebDriver driver){
		
		endtime=driver.findElement(By.id("BaseShift_EndTimehhmm"));
		return endtime;
		
		
	}
	
	public static WebElement showscheduleuntil(WebDriver driver){
		
		showscheduleuntil=driver.findElement(By.id("BaseShift_SchEndTimehhmm"));
		return showscheduleuntil;
		
	}
	
	public static WebElement save(WebDriver driver){
		
		save=driver.findElement(By.id("btnsubmit"));
		return save;
		
		
	}
	
	public static WebElement alert(WebDriver driver){
		
		alert=driver.findElement(By.id("btnAlertOK"));
		return alert;
		
		
	}
	
	public static WebElement border(WebDriver driver){
		
		border=driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/fieldset"));
		return border;
	}

	
	

}
