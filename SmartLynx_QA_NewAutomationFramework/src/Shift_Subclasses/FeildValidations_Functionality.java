package Shift_Subclasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class FeildValidations_Functionality {
	
private static int ColNum=5;
	
	public static void shift(WebDriver driver) throws Exception{
		
		
	Shift_Methods.create(driver);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.starttime(driver).sendKeys(Keys.CONTROL,"a");
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.starttime(driver).sendKeys(Keys.DELETE);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.endtime(driver).sendKeys(Keys.CONTROL,"a");
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.endtime(driver).sendKeys(Keys.DELETE);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.showscheduleuntil(driver).sendKeys(Keys.CONTROL,"a");
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.showscheduleuntil(driver).sendKeys(Keys.DELETE);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.save(driver).click();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.shift(driver).click();

	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.blankinputinshift(driver);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.shift(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(92, ColNum)));
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.description(driver).click();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.blankinputindescription(driver);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(94, ColNum));
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.starttime(driver).click();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.blankinputinstarttime(driver);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.starttime(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(96, ColNum)));
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.endtime(driver).click();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.blankinputinendtime(driver);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);

	Shift_Methods.endtime(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(98, ColNum)));
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.showscheduleuntil(driver).click();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.blankinputinshowscheduleuntil(driver);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);

	Shift_Methods.showscheduleuntil(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(100, ColNum)));
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);

	Shift_Methods.back(driver).click();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.create(driver);
	
	screenshot.CaptureScreenshot(driver);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.shift(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(103, ColNum)));
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(104, ColNum));
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.starttime(driver).sendKeys(Keys.CONTROL,"a");
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.starttime(driver).sendKeys(Keys.DELETE);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.starttime(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(105, ColNum)));
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.endtime(driver).sendKeys(Keys.CONTROL,"a");
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.endtime(driver).sendKeys(Keys.DELETE);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.endtime(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(106, ColNum)));
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.showscheduleuntil(driver).sendKeys(Keys.CONTROL,"a");
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.showscheduleuntil(driver).sendKeys(Keys.DELETE);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.showscheduleuntil(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(107, ColNum)));
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.save(driver).click();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.shift(driver).click();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.invalidinputinshift(driver);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.shift(driver).clear();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.shift(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(110, ColNum)));
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.description(driver).click();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.invalidinputindescription(driver);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.description(driver).clear();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(112, ColNum));
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Shift_Methods.back(driver).click();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	
	
	
	
	
	
	
	}

	
	

}
