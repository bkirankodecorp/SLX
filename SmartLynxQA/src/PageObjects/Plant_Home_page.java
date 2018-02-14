package PageObjects;

import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Plant_Home_page {
	
	private static WebElement elment=null;
	private static MouseHandler mouse=null;
	private static WebElement button=null;
	private static WebElement name=null;
	private static WebElement description=null;
	private static WebElement save=null;
	private static WebElement edit=null;
	private static WebElement delete=null;
	private static WebElement alreadyexistfile=null;
	private static WebElement undelete=null;
public static MouseHandler mouse(WebDriver driver){
		
		WebElement element=driver.findElement(By.xpath(".//*[@id='main']/div[1]/div/div[2]/div/div/ul/li[1]/a"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(element).moveToElement(driver.findElement(By.xpath(".//*[@id='main']/div[1]/div/div[2]/div/div/ul/li[1]/ul/li[14]/a"))).click().build().perform();
		
		return mouse;
		
		
	}


public static WebElement button(WebDriver driver){
	
	button=driver.findElement(By.id("btncreate"));
	return button;
	
}

public static WebElement name(WebDriver driver){
	
	name=driver.findElement(By.id("BasePlant_NameCode"));
	return name;
	
	
}

public static WebElement description(WebDriver driver){
	description=driver.findElement(By.id("BasePlant_NumDesc"));
	return description;
	
	
}

public static WebElement save(WebDriver driver){
	
	save=driver.findElement(By.id("btnCreate"));
	return save;
	
}
public static WebElement edit(WebDriver driver){
	
	edit=driver.findElement(By.xpath(".//*[@id='PlantGrid']/div[2]/table/tbody/tr[1]/td[3]/a/i"));
	
	
	return edit;
	
	
}

public static WebElement delete(WebDriver driver){
	
	 delete=driver.findElement(By.xpath(".//*[@id='PlantGrid']/div[2]/table/tbody/tr[1]/td[4]/a"));
	 return delete;
}
	
public static WebElement alreadyexistfile(WebDriver driver){
	
	alreadyexistfile=driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[1]/div/div/p"));
	
	
	return alreadyexistfile;
	
	
}
	
public static WebElement undelete(WebDriver driver){
	
	undelete=driver.findElement(By.id("BasePlant_IsRecordActive"));
	return undelete;
	
	
}

	
	
}
