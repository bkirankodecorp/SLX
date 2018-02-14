package CustomerShipTo_Subclasses;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


import Utility.ExcelUtils;

public class Save_Functionality {
	
	private static int ColNum=5;
	


	public static void customershipto(WebDriver driver) throws Exception{
		
		CustomerShipTo_Methods.create(driver);
		
		Thread.sleep(3000);
		
		CustomerShipTo_Methods.purchaseorder(driver).click();
		
		Thread.sleep(3000);
		
		CustomerShipTo_Methods.purchaseorderadd(driver).click();
		
		Thread.sleep(3000);
		
		CustomerShipTo_Methods.ponumber(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(220, ColNum)));
		
		Thread.sleep(3000);
		
		CustomerShipTo_Methods.purchaseorderdiv(driver).click();
		
		Thread.sleep(3000);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",CustomerShipTo_Methods.purchaseorderdatefromactive(driver));
		
		Thread.sleep(3000);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",CustomerShipTo_Methods.purchaseorderdatefromcaliconclick(driver));
		
		Thread.sleep(3000);
		
		CustomerShipTo_Methods.purchaseorderdatefromcalmonthhead(driver).click();
		
		Thread.sleep(3000);
		
		CustomerShipTo_Methods.purchaseorderdatefromcalmonthhead2(driver);
		
		Thread.sleep(3000);
		
		CustomerShipTo_Methods.datefromselect(driver);
		
		Thread.sleep(3000);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",CustomerShipTo_Methods.purchaseorderdatetoactive(driver));
		
		Thread.sleep(3000);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",CustomerShipTo_Methods.purchaseorderdatetocaliconclick(driver));
		
		Thread.sleep(3000);
	
		CustomerShipTo_Methods.datetoselect(driver);
		
		Thread.sleep(3000);
		
		
	}
}
