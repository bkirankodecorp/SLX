package ShiftScreenAutomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageObjects.Login_page;
import PageObjects.screenshot;
import PageObjects.Shift_Home_page;



public class ShiftPageObjectModel {

	private static WebDriver driver=null;
	
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"E://chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-web-security");
		options.addArguments("--start-maximized");
		options.addArguments("--no-proxy-server");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("disable-infobars");
		driver = new ChromeDriver(options);

		driver.get("https://www.p2pfuel.com/SLMain/");




		Login_page.txtbx_Username(driver).sendKeys("seller");
		Thread.sleep(3000);

		Login_page.txtbx_Password(driver).sendKeys("P@ssw0rd");
		Thread.sleep(3000);

		Login_page.btn_Login(driver).click();
		Thread.sleep(3000);

		Shift_Home_page.mouse(driver);


		Thread.sleep(3000);
		
		try
	      {

			String excelFilePath = "C:\\Users\\svcs\\Dropbox\\QA\\BulkUpload.xlsx";
			FileInputStream inputStream = new FileInputStream(new File(excelFilePath));


			@SuppressWarnings("resource")
			XSSFWorkbook wb = new XSSFWorkbook(inputStream);
			XSSFSheet sheet = wb.getSheet("Sheet1");

			int rowCount = sheet.getLastRowNum();
			System.out.println("the no of rows are : " + rowCount);
			for (int row=1; row<=rowCount; row++)
			{
				Thread.sleep(3000);
				Shift_Home_page.button(driver).click();
				Thread.sleep(3000);




				Shift_Home_page.shift(driver).clear();
				Thread.sleep(3000);



				int shift = (int) sheet.getRow(row).getCell(0).getNumericCellValue();

				Shift_Home_page.shift(driver).sendKeys(String.valueOf(shift));
				Thread.sleep(3000);
				screenshot.CaptureScreenshot(driver);


				String description = sheet.getRow(row).getCell(1).getStringCellValue();

				Shift_Home_page.description(driver).sendKeys(description);
				Thread.sleep(3000);
				screenshot.CaptureScreenshot(driver);

				Shift_Home_page.starttime(driver).sendKeys(Keys.CONTROL,"a");
				Thread.sleep(3000);
				Shift_Home_page.starttime(driver).sendKeys(Keys.DELETE);

				Thread.sleep(3000);

				screenshot.CaptureScreenshot(driver);


				double starttime = sheet.getRow(row).getCell(2).getNumericCellValue();
				Shift_Home_page.starttime(driver).sendKeys(String.valueOf(starttime));
				Thread.sleep(3000);
				screenshot.CaptureScreenshot(driver);

				Shift_Home_page.endtime(driver).sendKeys(Keys.CONTROL,"a");

				Shift_Home_page.endtime(driver).sendKeys(Keys.DELETE);
				screenshot.CaptureScreenshot(driver);
				Thread.sleep(3000);

				double endtime = sheet.getRow(row).getCell(3).getNumericCellValue();

				Shift_Home_page.endtime(driver).sendKeys(String.valueOf(endtime));
				Thread.sleep(3000);
				screenshot.CaptureScreenshot(driver);

				Shift_Home_page.showscheduleuntil(driver).sendKeys(Keys.CONTROL,"a");

				Shift_Home_page.showscheduleuntil(driver).sendKeys(Keys.DELETE);
				Thread.sleep(3000);
				screenshot.CaptureScreenshot(driver);

				double showscheduleuntil = sheet.getRow(row).getCell(4).getNumericCellValue();

				Shift_Home_page.showscheduleuntil(driver).sendKeys(String.valueOf(showscheduleuntil));

				Thread.sleep(3000);
				screenshot.CaptureScreenshot(driver);

				Shift_Home_page.save(driver).click();
				Thread.sleep(3000);

				screenshot.CaptureScreenshot(driver);

				if(showscheduleuntil < endtime){

					screenshot.CaptureScreenshot(driver);

					Shift_Home_page.alert(driver).click();
					Thread.sleep(3000);
					screenshot.CaptureScreenshot(driver);


					Shift_Home_page.showscheduleuntil(driver).clear();
					Thread.sleep(3000);
					screenshot.CaptureScreenshot(driver);
					double showscheduleuntil1 = sheet.getRow(row).getCell(5).getNumericCellValue();
					Shift_Home_page.showscheduleuntil(driver).sendKeys(String.valueOf(showscheduleuntil1));
					Thread.sleep(3000);
					screenshot.CaptureScreenshot(driver);

					driver.findElement(By.id("btnsubmit")).click();
					Thread.sleep(3000);
					screenshot.CaptureScreenshot(driver);
				}

				try   
				{    
					if(driver.findElement(By.xpath("//p[contains(text(),'An entered Shift already exists. Please edit this one or create a new with unique value.')]")).isDisplayed())     
					{      

						System.out.println("An entered Shift already exists. Please edit this one or create a new with unique value.is displayed");

						driver.findElement(By.id("btnsubmit")).click();

						Thread.sleep(3000);

					}
				}

				catch(Exception e)     
				{       

				}  

				try{

					if(driver.findElement(By.xpath("//p[contains(text(),'An entered Shift already exists in a deleted or disabled state. Please select to undelete/activate this record or create a new one.')]")).isDisplayed()){


						System.out.println("An entered Shift already exists in a deleted or disabled state. Please select to undelete/activate this record or create a new one.is displayed");


						driver.findElement(By.id("BaseShift_IsRecordActive")).click();

						Thread.sleep(3000);

						driver.findElement(By.id("btnsubmit")).click();

						Thread.sleep(3000);



					}   
				} 

				catch(Exception e)     
				{       

				}  


			}     


			inputStream.close();
	      }
		catch (IOException e)
		{
			e.printStackTrace();
		}


		
		
		
		
	}

	
}
