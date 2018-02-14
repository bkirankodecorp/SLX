package Shift_Subclasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class Delete_Functionality {
	
	private static int ColNum=5;
	
	public static void shift(WebDriver driver) throws Exception{
		
		
	Shift_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(42, ColNum));
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.search(driver).sendKeys(Keys.CONTROL,"a");
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.search(driver).sendKeys(Keys.ENTER);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.delete(driver).click();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.delmsgcont(driver);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.ok(driver).click();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);

	Shift_Methods.deleteconfirmedmesssgae(driver);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.search(driver).sendKeys(Keys.CONTROL,"a");
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.search(driver).sendKeys(Keys.DELETE);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	
	
	
	

}
}