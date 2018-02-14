package Shift_Subclasses;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class Save_Functionality {
	
	private static int ColNum=5;
	


	public static void shift(WebDriver driver) throws Exception{
	
	
		Shift_Methods.create(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Shift_Methods.shift(driver).clear();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Shift_Methods.shift(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(12, ColNum)));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Shift_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(13, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Shift_Methods.starttime(driver).sendKeys(Keys.CONTROL,"a");
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Shift_Methods.starttime(driver).sendKeys(Keys.DELETE);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Shift_Methods.starttime(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(14, ColNum)));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Shift_Methods.endtime(driver).sendKeys(Keys.CONTROL,"a");
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Shift_Methods.endtime(driver).sendKeys(Keys.DELETE);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);

		Shift_Methods.endtime(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(15, ColNum)));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Shift_Methods.showscheduleuntil(driver).sendKeys(Keys.CONTROL,"a");
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Shift_Methods.showscheduleuntil(driver).sendKeys(Keys.DELETE);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Shift_Methods.showscheduleuntil(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(16, ColNum)));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Shift_Methods.save(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Shift_Methods.verifysavemesage(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Shift_Methods.closeconfirmationmessage(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	}


}
