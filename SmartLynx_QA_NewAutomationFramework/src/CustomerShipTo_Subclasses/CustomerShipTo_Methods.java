package CustomerShipTo_Subclasses;

import java.util.List;

import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import Utility.ExcelUtils;

public class CustomerShipTo_Methods {
	
	
	private static int ColNum=4;
	
	private static MouseHandler mouse =null;
	
	private static WebElement create=null;
	
	private static WebElement shipto=null;
	
	private static WebElement shiptoacct=null;
	
	private static WebElement masteracctsearchicon=null;
	
	private static WebElement masteracctsearchbox=null;
	
	private static WebElement masteracctselect=null;
	
	private static WebElement masteracctok=null;
	
	private static WebElement masteracctcancel=null;
	
	private static WebElement name=null;
	
	private static WebElement name2=null;
	
	private static WebElement address1=null;
	
	private static WebElement address2=null;
	
	private static WebElement city=null;
	
	private static WebElement stateclick=null;
	
	private static WebElement statesearch=null;
	
	private static WebElement zip=null;
	
	private static WebElement country=null;
	
	private static WebElement phone=null;
	
	private static WebElement faxtoname=null;
	
	private static WebElement fax=null;
	
	private static WebElement contact1name1=null;
	
	private static WebElement contact1phone1=null;
	
	private static WebElement contact1ext1=null;
	
	private static WebElement contact1email1=null;
	
	private static WebElement contact1emailtkt1click=null;
	
	private static WebElement contact1emailtkt1dropdownlist=null;
	
	private static WebElement contact1emailtkt1select=null;
	
	private static WebElement contact2name2=null;
	
	private static WebElement contact2phone2=null;
	
	private static WebElement contact2ext2=null;
	
	private static WebElement contact2email2=null;
	
	private static WebElement contact2emailtkt2click=null;
	
	private static WebElement contact2emailtkt2dropdownlist=null;
	
	private static WebElement contact2emailtkt2select=null;
	
	private static WebElement latitude=null;
	
	private static WebElement longitude=null;
	
	private static WebElement tktcopies=null;
	
	private static WebElement ordertypeclick=null;
	
	private static WebElement ordertypedropdownlist=null;
	
	private static WebElement ordertypeselect=null;
	
	private static WebElement deliveryfeeclick=null;
	
	private static WebElement deliveryfeesearch=null;
	
	private static WebElement targetmarginreportclassclick=null;
	
	private static WebElement targetmarginreportclassselect=null;
	
	private static WebElement orderholdclick=null;
	
	private static WebElement orderholdsearch=null;
	
	private static WebElement vendorcrossref=null;
	
	private static WebElement bsnflocname=null;
	
	private static WebElement avgdeltime=null;
	
	private static WebElement fuelradiusclick=null;
	
	private static WebElement fuelradiusdropdownlist=null;
	
	private static WebElement fuelradiusselect=null;
	
	private static WebElement salesrepname1searchicon=null;
	
	private static WebElement salesrepname1searchbox=null;
	
	private static WebElement salesrepname1select=null;
	
	private static WebElement salesrepname1ok=null;
	
	private static WebElement salesrepname1cancel=null;
	
	private static WebElement salesrepname1del=null;
	
	private static WebElement salesrepname2searchicon=null;
	
	private static WebElement salesrepname2searchbox=null;
	
	private static WebElement salesrepname2select=null;
	
	private static WebElement salesrepname2ok=null;
	
	private static WebElement salesrepname2cancel=null;
	
	private static WebElement salesrepname2del=null;
	
	private static WebElement userdef1=null;
	
	private static WebElement userdef2=null;
	
	private static WebElement userdef3=null;
	
	private static WebElement userdef4=null;
	
	private static WebElement signaturereq=null;
	
	private static WebElement  PrintTotalizersonTicket=null;
	
	private static WebElement StickReadingRequired=null;
	
	private static WebElement PrintPriceOnticket=null;
	
	private static WebElement poreq=null;
	
	private static WebElement pumpreq=null;
	
	private static WebElement notetypeclick=null;
	
	private static WebElement notetypedropdownlist=null;
	
	private static WebElement notetypeselect=null;
	
	private static WebElement targettypeselect=null;
	
	private static WebElement targettypeselect2=null;
	
	private static WebElement note=null;
	
	
	
	private static WebElement fleetvehicles=null;
	
	private static WebElement PrintUnfueledVehicles=null;
	
	private static WebElement  PrintUnfueledVehicleReasonCode=null;
	
	private static WebElement UnfueledReasonCoderequired=null;
	
	private static WebElement maxfueltankspervehicle=null;
	
	private static WebElement  SetNewVehiclesToTransient=null;
	
	private static WebElement OdometerRequired=null;
	
	private static WebElement  LockVehicleList=null;
	
	
	
	private static WebElement vehdetailsadd=null;
	
	private static WebElement vehdetailsfleetvehiclelink=null;
	
	private static WebElement vehnumber=null;
	
	private static WebElement vehfueltanks=null;
	
	private static WebElement vehcapacity=null;
	
	private static WebElement vehproductclick=null;
	
	private static WebElement vehproductsearch=null;
	
	private static WebElement vehproductselect=null;
	
	private static WebElement vehproductok=null;
	
	private static WebElement vehbarcode=null;
	
	private static WebElement vehtankcapacity=null;
	
	private static WebElement vehtankdes=null;
	
	private static WebElement model=null;
	
	private static WebElement year=null;
	
	private static WebElement vin=null;
	
	private static WebElement tag=null;
	
	private static WebElement vehuserdef1=null;
	
	private static WebElement vehuserdef2=null;
	
	private static WebElement vehuserdef3=null;
	
	private static WebElement vehuserdef4=null;
	
	private static WebElement vehcrossref=null;
	
	private static WebElement smartapmacaddress=null;
	
	private static WebElement manufacturer=null;
	
	private static WebElement vehtransient=null;
	
	private static WebElement reqodometer=null;
	
	private static WebElement fleetvehbarcodedetailsadd=null;
	
	private static WebElement fleetvehbarcodedetailsprodclick=null;
	
	private static WebElement fleetvehbarcodedetailsprodsearchbox=null;
	
	private static WebElement fleetvehbarcodedetailsprodselect=null;
	
	private static WebElement fleetvehbarcodedetailsprodok=null;
	
	private static WebElement fleetvehbarcodedetailsdiv=null;
	
	private static WebElement fleetvehbarcodedetailsbarcodeactive=null;
	
	private static WebElement fleetvehbarcodedetailsbarcode=null;
	
	private static WebElement fleetvehbarcodedetailscapacityactive=null;
	
	private static WebElement fleetvehbarcodedetailscapacity=null;
	
	private static WebElement fleetvehbarcodedetailstankdesactive=null;
	
	private static WebElement fleetvehbarcodedetailstankdes=null;
	
	
	
	private static WebElement deliverytanks=null;
	
	private static WebElement locktanklist=null;
	
	private static WebElement taxfeeprofile=null;
	
	private static WebElement taxfeeprofileactive=null;
	
	private static WebElement taxfeeprofileclick=null;
	
	private static WebElement taxfeeprofileselect=null;
	
	private static WebElement taxfeeprofileunassign=null;
	
	
	
	private static WebElement priceclassmap=null;
	
	private static WebElement priceclassactive=null;
	
	private static WebElement priceclassclick=null;
	
	private static WebElement priceclassselect=null;
	
	private static WebElement priceclassvaractive=null;
	
	private static WebElement priceclassvarinsert=null;
	
	private static WebElement priceclassvarperactive=null;
	
	private static WebElement priceclassvarperinsert=null;
	
	private static WebElement priceclassmapunassign=null;
	
	private static WebElement priceclassmapdiv=null;
	
	private static WebElement regionmap=null;
	
	private static WebElement regionmapsearchbox=null;
	
	private static WebElement manuallock=null;
	
	private static WebElement primaryactive=null;
	
	private static WebElement primarycheck=null;
	
	private static WebElement primarydiv=null;
	
	private static WebElement territoryactive=null;
	
	private static WebElement territoryclick=null;
	
	private static WebElement territorydropdownlist=null;
	
	private static WebElement territoryselect=null;
	
	private static WebElement regionmapunassign=null;
	
	private static WebElement regionmapautoupdate=null;
	
	
	
	private static WebElement defproductload=null;
	
	private static WebElement prodetdiv=null;
	
	private static WebElement productdetailsadd=null;
	
	private static WebElement prodetserach=null;
	
	private static WebElement Checkproduct=null;
	
	private static WebElement prodetallcheck=null;
	
	private static WebElement prodetindvcheck=null;
	
	private static WebElement prodetok=null;
	
	private static WebElement prodetcancel=null;
	
	
	
	private static WebElement estimatevolactive=null;
	
	private static WebElement estimatevolinsert=null;
	
	private static WebElement ordertouseactive=null;
	
	private static WebElement ordertouseclick=null;
	
	private static WebElement ordertouseforavgdropdownlist=null;
	
	private static WebElement ordertouseselect=null;
	
	private static WebElement monthstouseactive=null;
	
	private static WebElement monthstouseinsert=null;
	

	
	private static WebElement defloadsadd=null;
	
	private static WebElement defloadsprodsearch=null;
	
	private static WebElement defloadsprodcheckall=null;
	
	private static WebElement defloadsprodindvcheck=null;
	
	private static WebElement defloadsprodok=null;
	
	private static WebElement defloadsprodcancel=null;
	
	private static WebElement volumecellactive=null;
	
	private static WebElement volume=null;
	
	private static WebElement terminalcellactive=null;
	
	private static WebElement terminalclick=null;
	
	private static WebElement terminalselect=null;
	
	private static WebElement suppliercellactive=null;
	
	private static WebElement supplierclick=null;
	
	private static WebElement supplierlist=null;
	
	private static WebElement supplierselect=null;
	
	private static WebElement vendorcellactive=null;
	
	private static WebElement vendorclick=null;
	
	private static WebElement vendorlist=null;
	
	private static WebElement vendorselect=null;
	
	private static WebElement pincellactive=null;
	
	private static WebElement pin=null;
	
	private static WebElement internaltankidcellactive=null;
	
	private static WebElement internaltankid=null;
	
	private static WebElement contractlink=null;
	
	private static WebElement contractselect=null;
	
	private static WebElement contractok=null;
	
	private static WebElement contractcancel=null;
	
	
	
	private static WebElement defaultloadsaddoption=null;
	
	private static WebElement defaultloadsaddoptionvolumeactive=null;
	
	private static WebElement defaultloadsaddoptionterminalcellactive=null;
	
	private static WebElement defaultloadsaddoptionterminalselect=null;
	
	private static WebElement defaultloadsaddoptionsuppliercellactive=null;
	
	private static WebElement defaultloadsaddoptionsupplierlist=null;
	
	private static WebElement defaultloadsaddoptionsupplierselect=null;
	
	private static WebElement defaultloadsaddoptionvendorcellactive=null;
	
	private static WebElement defaultloadsaddoptionvendorlist=null;
	
	private static WebElement defaultloadsaddoptionvendorselect=null;
	
	private static WebElement defaultloadsaddoptionpincellactive=null;
	
	private static WebElement defaultloadsaddoptioninternaltankidcellactive=null;
	
	private static WebElement defloadsdiv=null;
	
	
	
	private static WebElement receivinghours=null;
	
	private static WebElement receivinghoursadd=null;
	
	private static WebElement receivinghoursdaystartclick=null;
	
	private static WebElement receivinghoursdaystartselect=null;
	
	private static WebElement receivinghoursdiv=null;
	
	private static WebElement receivinghoursstarttimeactive=null;
	
	private static WebElement receivinghoursstarttimeinsert=null;
	
	private static WebElement receivinghoursdayendactive=null;
	
	private static WebElement receivinghoursdayendclick=null;
	
	private static WebElement receivinghoursdayendselect=null;
	
	private static WebElement receivinghoursendtimeactive=null;
	
	private static WebElement receivinghoursendtimeinsert=null;
	
	
	
	private static WebElement purchaseorder=null;
	
	private static WebElement purchaseorderadd=null;
	
	private static WebElement ponumber=null;
	
	private static WebElement purchaseorderdiv=null;
	
	private static WebElement purchaseorderdatefromactive=null;
	
	private static WebElement purchaseorderdatefrominsert=null;
	
	private static WebElement purchaseorderdatefromcaliconclick=null;
	
	private static WebElement purchaseorderdatefromcalprevicon=null;
	
	private static WebElement purchaseorderdatefromcalnexticon=null;
	
	private static WebElement purchaseorderdatefromcalmonthhead=null;
	
	private static WebElement purchaseorderdatefromcalmonthhead2=null;
	
	private static WebElement verifyallyearslist=null;
	
	private static WebElement poallyear=null;
	
	private static WebElement datefromselect=null;
	
	private static WebElement datetoselect=null;
	
	private static WebElement pomonth=null;
	
	private static WebElement podate=null;
	
	private static WebElement purchaseorderdatefromcalmonthselect=null;
	
	private static WebElement purchaseorderdatefromcalyearheadselect=null;
	
	private static WebElement purchaseorderdatefromcalyearselect=null;
	
	private static WebElement purchaseorderdatefromcalpresentdaylink=null;
	
	private static WebElement purchaseorderdatetoactive=null;
	
	private static WebElement purchaseorderdatetoinsert=null;
	
	private static WebElement purchaseorderdatetocaliconclick=null;
	
	private static WebElement purchaseorderdatetocalprevicon=null;
	
	private static WebElement purchaseorderdatetocalnexticon=null;
	
	private static WebElement purchaseorderdatetocalmonthhead=null;
	
	private static WebElement purchaseorderdatetocalmonthselect=null;
	
	private static WebElement purchaseorderdatetocalyearheadselect=null;
	
	private static WebElement purchaseorderdatetocalyearselect=null;
	
	private static WebElement purchaseorderdatetopresentdaylink=null;
	
	
	
	private static WebElement servicecharges=null;
	
	private static WebElement servicechargesadd=null;
	
	private static WebElement servicechargesdayclick=null;
	
	private static WebElement servicechargesdayselect=null;
	
	private static WebElement servicechargesdiv=null;
	
	private static WebElement servicechargesminvoldelactive=null;
	
	private static WebElement servicechargesminvoldelinsert=null;
	
	private static WebElement servicechargesnonbulkclick=null;
	
	private static WebElement servicechargesnonbulksearchbox=null;
	
	private static WebElement servicechargesnonbulkselect=null;
	
	private static WebElement servicechargesnonbulkok=null;
	
	private static WebElement servicechargesamountactive=null;
	
	private static WebElement servicechargesamountinsert=null;
	
	private static WebElement servicechargesdatefromactive=null;
	
	private static WebElement servicechargesdatefrominsert=null;
	
	private static WebElement servicechargesdatefromcaliconclick=null;
	
	private static WebElement servicechargesdatefromcalpresentdaylink=null;
	
	private static WebElement servicechargesdatetoactive=null;
	
	private static WebElement servicechargesdatetoinsert=null;
	
	private static WebElement servicechargesdatetocaliconclick=null;
	
	
	
	
	

	
	private static WebElement save=null;
	
	private static WebElement back=null;
	
	private static WebElement sort=null;
	
	private static WebElement search=null;
	
	private static WebElement mainpagenavbuttons=null;
	
	
	
	public static MouseHandler mouse(WebDriver driver) throws Exception{
		
		WebElement element=driver.findElement(By.xpath(ExcelUtils.getstringCellData(8, ColNum)));
		
		WebElement element1=driver.findElement(By.xpath(ExcelUtils.getstringCellData(9, ColNum)));
		
		
		Actions action=new Actions(driver);
		
		action.moveToElement(element).moveToElement(element1).build().perform();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		element1.click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		return mouse;
		
		
	}
	

	
	public static WebElement create(WebDriver driver) throws Exception{
		
		
		
		create=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		create.click();
		
		
		return create;
		
		
	}
	
	public static WebElement shipto(WebDriver driver) throws Exception{
		
		shipto=driver.findElement(By.linkText(ExcelUtils.getstringCellData(11, ColNum)));
		
			return shipto;
			
			
		}
		
		
		
		public static WebElement shiptoacct(WebDriver driver) throws Exception{
			
			shiptoacct=driver.findElement(By.id(ExcelUtils.getstringCellData(12, ColNum)));
			
			
					return shiptoacct;
			
			
		}
		
	public static WebElement masteracctsearchicon(WebDriver driver) throws Exception{
			
		masteracctsearchicon=driver.findElement(By.id(ExcelUtils.getstringCellData(13, ColNum)));
			
			return masteracctsearchicon;
			
		}
		
		public static WebElement masteracctsearchbox(WebDriver driver) throws Exception{
			
			masteracctsearchbox=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return masteracctsearchbox;
			
		}
		
	public static WebElement masteracctselect(WebDriver driver) throws Exception{
			
		masteracctselect=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return masteracctselect;
			
		}
	public static WebElement masteracctok(WebDriver driver) throws Exception{
		
		masteracctok=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return masteracctok;
			
		}

	public static WebElement masteracctcancel(WebDriver driver) throws Exception{
		
		masteracctcancel=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return masteracctcancel;
			
		}

		
	
public static WebElement name(WebDriver driver) throws Exception{
		
		name=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return name;
			
		}

	public static WebElement name2(WebDriver driver) throws Exception{
		
		name2=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return name2;
			
		}
	public static WebElement address1(WebDriver driver) throws Exception{
		
		address1=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return address1;
			
		}

	public static WebElement address2(WebDriver driver) throws Exception{
		
		address2=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return address2;
			
		}

	public static WebElement city(WebDriver driver) throws Exception{
		
		city=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return city;
			
		}
	public static WebElement stateclick(WebDriver driver) throws Exception{
		
		stateclick=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return stateclick;
			
		}

	public static WebElement statesearch(WebDriver driver) throws Exception{
		
		statesearch=driver.findElement(By.xpath(ExcelUtils.getstringCellData(41, ColNum)));
		
		int ok_size=driver.findElements(By.xpath(ExcelUtils.getstringCellData(41, ColNum))).size();

		Thread.sleep(3000);
		
		driver.findElements(By.xpath(ExcelUtils.getstringCellData(41, ColNum))).get(ok_size-1).sendKeys(ExcelUtils.getstringCellData(41, 5));
		
		Thread.sleep(3000);
		
		driver.findElements(By.xpath(ExcelUtils.getstringCellData(41, ColNum))).get(ok_size-1).sendKeys(Keys.ENTER);
			
			return statesearch;
			
		}

	public static WebElement zip(WebDriver driver) throws Exception{
		
		zip=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return zip;
			
		}


	public static WebElement country(WebDriver driver) throws Exception{
		
		country=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return country;
			
		}

	public static WebElement phone(WebDriver driver) throws Exception{
		
		phone=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return phone;
			
		}

	public static WebElement faxtoname(WebDriver driver) throws Exception{
		
		faxtoname=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return faxtoname;
			
		}
	public static WebElement fax(WebDriver driver) throws Exception{
		
		fax=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return fax;
			
		}

	public static WebElement contact1name1(WebDriver driver) throws Exception{
		
		contact1name1=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return contact1name1;
			
		}
	public static WebElement contact1phone1(WebDriver driver) throws Exception{
		
		contact1phone1=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return contact1phone1;
			
		}

	public static WebElement contact1ext1(WebDriver driver) throws Exception{
		
		contact1ext1=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return contact1ext1;
			
		}

	public static WebElement contact1email1(WebDriver driver) throws Exception{
		
		contact1email1=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return contact1email1;
			
		}



	public static WebElement contact1emailtkt1click(WebDriver driver) throws Exception{
		
		contact1emailtkt1click=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		
			
			return contact1emailtkt1click;
			
		}

	public static WebElement contact1emailtkt1dropdownlist(WebDriver driver) throws Exception{
		
		By mySelector = By.xpath(ExcelUtils.getstringCellData(31, ColNum));

		List<WebElement> myElements = driver.findElements(mySelector);

		for(WebElement e : myElements) {
			
			ExcelUtils.setCellData("Email Ticket When Has Following Dropdown List \n"+e.getText(),31, 8);
			
		  System.out.println("Email Ticket When Has Following Dropdown List \n" + e.getText());
			
		}
			
			return contact1emailtkt1dropdownlist;
			
		}
	
	public static WebElement contact1emailtkt1select(WebDriver driver) throws Exception{
		
		
		List<WebElement> emailticketwhen1=driver.findElements(By.xpath(ExcelUtils.getstringCellData(32, ColNum)));
		
		
		for(WebElement ele:emailticketwhen1)
		{
			
			String emailticketwhen1select=ele.getText();
			
			if(emailticketwhen1select.equalsIgnoreCase(ExcelUtils.getstringCellData(32, 5)))
			{
				ele.click();
				break;
			}
			
		}
		
		Thread.sleep(3000);
		
		ExcelUtils.setCellData("Email Ticket When is " + (ExcelUtils.getstringCellData(32, 5)),32, 8);
		
		 System.out.println("Email Ticket When is " + (ExcelUtils.getstringCellData(32, 5)));
			
			return contact1emailtkt1select;
			
		}

	public static WebElement contact2name2(WebDriver driver) throws Exception{
		
		contact2name2=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return contact2name2;
			
		}

	public static WebElement contact2phone2(WebDriver driver) throws Exception{
		
		contact2phone2=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return contact2phone2;
			
		}

	public static WebElement contact2ext2(WebDriver driver) throws Exception{
		
		contact2ext2=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return contact2ext2;
			
		}

	public static WebElement contact2email2(WebDriver driver) throws Exception{
		
		contact2email2=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
				
			return contact2email2;
			
		}
	public static WebElement contact2emailtkt2click(WebDriver driver) throws Exception{
		
		contact2emailtkt2click=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return contact2emailtkt2click;
			
		}

	public static WebElement contact2emailtkt2dropdownlist(WebDriver driver) throws Exception{
		
		By mySelector = By.xpath(ExcelUtils.getstringCellData(31, ColNum));

		List<WebElement> myElements = driver.findElements(mySelector);

		for(WebElement e : myElements) {
			
			ExcelUtils.setCellData("Email Ticket When Has Following Dropdown List \n"+e.getText(),31, 8);
			
		  System.out.println("Email Ticket When Has Following Dropdown List \n" + e.getText());
			
		}
			
			return contact2emailtkt2dropdownlist;
			
		}
	

	public static WebElement contact2emailtkt2select(WebDriver driver) throws Exception{
		
		
		
		List<WebElement> emailticketwhen2=driver.findElements(By.xpath(ExcelUtils.getstringCellData(32, ColNum)));
		
		
		for(WebElement ele:emailticketwhen2)
		{
			
			String emailticketwhen2select=ele.getText();
			
			if(emailticketwhen2select.equalsIgnoreCase(ExcelUtils.getstringCellData(32, 5)))
			{
				ele.click();
				break;
			}
			
		}
		
		Thread.sleep(3000);
		
		ExcelUtils.setCellData("Email Ticket When is " + (ExcelUtils.getstringCellData(32, 5)),32, 8);
		
		 System.out.println("Email Ticket When is " + (ExcelUtils.getstringCellData(32, 5)));
			
			return contact2emailtkt2select;
			
		}

	public static WebElement latitude(WebDriver driver) throws Exception{
		
		latitude=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return latitude;
			
		}
	public static WebElement longitude(WebDriver driver) throws Exception{
		
		longitude=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return longitude;
			
		}

	public static WebElement tktcopies(WebDriver driver) throws Exception{
		
		tktcopies=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return tktcopies;
			
		}
	public static WebElement ordertypeclick(WebDriver driver) throws Exception{
		
		ordertypeclick=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return ordertypeclick;
			
		}
	
public static WebElement ordertypedropdownlist(WebDriver driver) throws Exception{
		
		By mySelector = By.xpath(ExcelUtils.getstringCellData(31, ColNum));

		List<WebElement> myElements = driver.findElements(mySelector);

		for(WebElement e : myElements) {
			
			ExcelUtils.setCellData("Order Type Has Following Dropdown List \n"+e.getText(),31, 8);
			
		  System.out.println("Order Type Has Following Dropdown List \n" + e.getText());
			
		}
			
			return ordertypedropdownlist;
			
		}
	

	public static WebElement ordertypeselect(WebDriver driver) throws Exception{
		
		
		
		List<WebElement> ordertype=driver.findElements(By.xpath(ExcelUtils.getstringCellData(32, ColNum)));
		
		
		for(WebElement ele:ordertype)
		{
			
			String ordertypeselect=ele.getText();
			
			if(ordertypeselect.equalsIgnoreCase(ExcelUtils.getstringCellData(32, 5)))
			{
				ele.click();
				break;
			}
			
		}
		
		Thread.sleep(3000);
		
		ExcelUtils.setCellData("Order Type is " + (ExcelUtils.getstringCellData(32, 5)),32, 8);
		
		 System.out.println("Order Type When is " + (ExcelUtils.getstringCellData(32, 5)));
			
			return ordertypeselect;
			
		}
	public static WebElement deliveryfeeclick(WebDriver driver) throws Exception{
		
		deliveryfeeclick=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return deliveryfeeclick;
			
		}
	
	public static WebElement deliveryfeesearch(WebDriver driver) throws Exception{
		
		deliveryfeesearch=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		

		
		int ok_size=driver.findElements(By.xpath(ExcelUtils.getstringCellData(41, ColNum))).size();

		Thread.sleep(3000);
		
		driver.findElements(By.xpath(ExcelUtils.getstringCellData(41, ColNum))).get(ok_size-1).sendKeys(ExcelUtils.getstringCellData(41, 5));
		
		Thread.sleep(3000);
		
		driver.findElements(By.xpath(ExcelUtils.getstringCellData(41, ColNum))).get(ok_size-1).sendKeys(Keys.ENTER);
			
			
			
			return deliveryfeesearch;
			
		}

	public static WebElement targetmarginreportclassclick(WebDriver driver) throws Exception{
		
		targetmarginreportclassclick=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return targetmarginreportclassclick;
			
		}
	public static WebElement targetmarginreportclassselect(WebDriver driver) throws Exception{
		
		targetmarginreportclassselect=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return targetmarginreportclassselect;
			
		}	

	public static WebElement orderholdclick(WebDriver driver) throws Exception{
		
		orderholdclick=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return orderholdclick;
			
		}

	public static WebElement orderholdsearch(WebDriver driver) throws Exception{
		
		orderholdsearch=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		int ok_size=driver.findElements(By.xpath(ExcelUtils.getstringCellData(41, ColNum))).size();

		Thread.sleep(3000);
		
		driver.findElements(By.xpath(ExcelUtils.getstringCellData(41, ColNum))).get(ok_size-1).sendKeys(ExcelUtils.getstringCellData(41, 5));
		
		Thread.sleep(3000);
		
		driver.findElements(By.xpath(ExcelUtils.getstringCellData(41, ColNum))).get(ok_size-1).sendKeys(Keys.ENTER);
			
		
			
			return orderholdsearch;
			
		}

	public static WebElement vendorcrossref(WebDriver driver) throws Exception{
		
		vendorcrossref=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return vendorcrossref;
			
		}
	public static WebElement bsnflocname(WebDriver driver) throws Exception{
		
		bsnflocname=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return bsnflocname;
			
		}

	public static WebElement avgdeltime(WebDriver driver) throws Exception{
		
		avgdeltime=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return avgdeltime;
			
		}
	public static WebElement fuelradiusclick(WebDriver driver) throws Exception{
		
		fuelradiusclick=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return fuelradiusclick;
			
		}
	
public static WebElement fuelradiusdropdownlist(WebDriver driver) throws Exception{
		
		By mySelector = By.xpath(ExcelUtils.getstringCellData(31, ColNum));

		List<WebElement> myElements = driver.findElements(mySelector);

		for(WebElement e : myElements) {
			
			ExcelUtils.setCellData("Order Type Has Following Dropdown List \n"+e.getText(),31, 8);
			
		  System.out.println("Order Type Has Following Dropdown List \n" + e.getText());
			
		}
			
			return fuelradiusdropdownlist;
			
		}
	

	public static WebElement fuelradiusselect(WebDriver driver) throws Exception{
		
		fuelradiusselect=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		

		List<WebElement> fuelradius=driver.findElements(By.xpath(ExcelUtils.getstringCellData(32, ColNum)));
		
		
		for(WebElement ele:fuelradius)
		{
			
			String fuelradiusselect=ele.getText();
			
			if(fuelradiusselect.equalsIgnoreCase(ExcelUtils.getstringCellData(32, 5)))
			{
				ele.click();
				break;
			}
			
		}
		
		Thread.sleep(3000);
		
		ExcelUtils.setCellData("fuelradius is " + (ExcelUtils.getstringCellData(32, 5)),32, 8);
		
		 System.out.println("fuelradius is " + (ExcelUtils.getstringCellData(32, 5)));
			
			return fuelradiusselect;
			
		}

	public static WebElement salesrepname1searchicon(WebDriver driver) throws Exception{
		
		salesrepname1searchicon=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return salesrepname1searchicon;
			
		}

	public static WebElement salesrepname1searchbox(WebDriver driver) throws Exception{
		
		salesrepname1searchbox=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return salesrepname1searchbox;
			
		}

	public static WebElement salesrepname1select(WebDriver driver) throws Exception{
		
		salesrepname1select=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return salesrepname1select;
			
		}
	public static WebElement salesrepname1ok(WebDriver driver) throws Exception{
		
		salesrepname1ok=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return salesrepname1ok;
			
		}

	public static WebElement salesrepname1cancel(WebDriver driver) throws Exception{
		
		salesrepname1cancel=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return salesrepname1cancel;
			
		}
	
	public static WebElement salesrepname1del(WebDriver driver) throws Exception{
		
		salesrepname1del=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return salesrepname1del;
			
		}

	public static WebElement salesrepname2searchicon(WebDriver driver) throws Exception{
		
		salesrepname2searchicon=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return salesrepname2searchicon;
			
		}

	public static WebElement salesrepname2searchbox(WebDriver driver) throws Exception{
		
		salesrepname2searchbox=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return salesrepname2searchbox;
			
		}

	public static WebElement salesrepname2select(WebDriver driver) throws Exception{
		
		salesrepname2select=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return salesrepname2select;
			
		}
	public static WebElement salesrepname2ok(WebDriver driver) throws Exception{
		
		salesrepname2ok=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return salesrepname2ok;
			
		}

	public static WebElement salesrepname2cancel(WebDriver driver) throws Exception{
		
		salesrepname2cancel=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return salesrepname2cancel;
			
		}

	


	public static WebElement salesrepname2del(WebDriver driver) throws Exception{
		
		salesrepname2del=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return salesrepname2del;
			
		}

	public static WebElement userdef1(WebDriver driver) throws Exception{
		
		userdef1=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return userdef1;
			
		}

	public static WebElement userdef2(WebDriver driver) throws Exception{
		
		userdef2=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return userdef2;
			
		}

	public static WebElement userdef3(WebDriver driver) throws Exception{
		
		userdef3=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return userdef3;
			
		}

	public static WebElement userdef4(WebDriver driver) throws Exception{
		
		userdef4=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return userdef4;
			
		}
	public static WebElement signaturereq(WebDriver driver) throws Exception{
		
		signaturereq=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return signaturereq;
			
		}
	public static WebElement PrintTotalizersonTicket(WebDriver driver) throws Exception{
		
		PrintTotalizersonTicket=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return PrintTotalizersonTicket;
			
		}

	public static WebElement StickReadingRequired(WebDriver driver) throws Exception{
		
		StickReadingRequired=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return StickReadingRequired;
			
		}

	public static WebElement PrintPriceOnticket(WebDriver driver) throws Exception{
		
		PrintPriceOnticket=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return PrintPriceOnticket;
			
		}

	public static WebElement poreq(WebDriver driver) throws Exception{
		
		poreq=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return poreq;
			
		}

	public static WebElement pumpreq(WebDriver driver) throws Exception{
		
		pumpreq=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return pumpreq;
			
		}


	public static WebElement notetypeclick(WebDriver driver) throws Exception{
		
		notetypeclick=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return notetypeclick;
			
		}
	
public static WebElement notetypedropdownlist(WebDriver driver) throws Exception{
		
		By mySelector = By.xpath(ExcelUtils.getstringCellData(31, ColNum));

		List<WebElement> myElements = driver.findElements(mySelector);

		for(WebElement e : myElements) {
			
			ExcelUtils.setCellData("Order Type Has Following Dropdown List \n"+e.getText(),31, 8);
			
		  System.out.println("Order Type Has Following Dropdown List \n" + e.getText());
			
		}
			
			return notetypedropdownlist;
			
		}
	

	public static WebElement notetypeselect(WebDriver driver) throws Exception{
		
		
		
		List<WebElement> notetype=driver.findElements(By.xpath(ExcelUtils.getstringCellData(32, ColNum)));
		
		
		for(WebElement ele:notetype)
		{
			
			String notetypeselect=ele.getText();
			
			if(notetypeselect.equalsIgnoreCase(ExcelUtils.getstringCellData(32, 5)))
			{
				ele.click();
				
				break;
			}
			
		}
		
		Thread.sleep(3000);
		
		ExcelUtils.setCellData("Note Type is " + (ExcelUtils.getstringCellData(32, 5)),32, 8);
		
		 System.out.println("Note Type is " + (ExcelUtils.getstringCellData(32, 5)));
			
			return notetypeselect;
			
		}

	public static WebElement targettypeselect(WebDriver driver) throws Exception{
		
		targettypeselect=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return targettypeselect;
			
		}

	public static WebElement targettypeselect2(WebDriver driver) throws Exception{
		
		targettypeselect2=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return targettypeselect2;
			
		}

	public static WebElement note(WebDriver driver) throws Exception{
		
		note=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return note;
	}

	
public static WebElement fleetvehicles(WebDriver driver) throws Exception{
		
		fleetvehicles=driver.findElement(By.linkText(ExcelUtils.getstringCellData(11, ColNum)));
			
			return fleetvehicles;
			
		}

	public static WebElement PrintUnfueledVehicles(WebDriver driver) throws Exception{
		
		PrintUnfueledVehicles=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return PrintUnfueledVehicles;
	}

	public static WebElement PrintUnfueledVehicleReasonCode(WebDriver driver) throws Exception{
		
		PrintUnfueledVehicleReasonCode=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return PrintUnfueledVehicleReasonCode;
	}

	public static WebElement UnfueledReasonCoderequired(WebDriver driver) throws Exception{
		
		UnfueledReasonCoderequired=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return UnfueledReasonCoderequired;
	}

	public static WebElement maxfueltankspervehicle(WebDriver driver) throws Exception{
		
		maxfueltankspervehicle=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return maxfueltankspervehicle;
	}

	public static WebElement SetNewVehiclesToTransient(WebDriver driver) throws Exception{
		
		SetNewVehiclesToTransient=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return SetNewVehiclesToTransient;
	}

	public static WebElement OdometerRequired(WebDriver driver) throws Exception{
		
		OdometerRequired=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return OdometerRequired;
	}

	public static WebElement LockVehicleList(WebDriver driver) throws Exception{
		
		LockVehicleList=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return LockVehicleList;
	}

	public static WebElement vehdetailsadd(WebDriver driver) throws Exception{
		
		vehdetailsadd=driver.findElement(By.linkText(ExcelUtils.getstringCellData(11, ColNum)));
			
			return vehdetailsadd;
	}

	public static WebElement vehdetailsfleetvehiclelink(WebDriver driver) throws Exception{
		
		vehdetailsfleetvehiclelink=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return vehdetailsfleetvehiclelink;
	}





	public static WebElement vehnumber(WebDriver driver) throws Exception{
		
		vehnumber=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return vehnumber;
	}

	public static WebElement vehfueltanks(WebDriver driver) throws Exception{
		
		vehfueltanks=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return vehfueltanks;
	}

	public static WebElement vehcapacity(WebDriver driver) throws Exception{
		
		vehcapacity=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return vehcapacity;
	}

	public static WebElement vehproductclick(WebDriver driver) throws Exception{
		
		vehproductclick=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return vehproductclick;
	}

	public static WebElement vehproductsearch(WebDriver driver) throws Exception{
		
		vehproductsearch=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return vehproductsearch;
	}

	public static WebElement vehproductselect(WebDriver driver) throws Exception{
		
		vehproductselect=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
				
			return vehproductselect;
	}

	public static WebElement vehproductok(WebDriver driver) throws Exception{
		
		vehproductok=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
				
			return vehproductok;
	}


	public static WebElement vehbarcode(WebDriver driver) throws Exception{
		
		vehbarcode=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return vehbarcode;
	}

	public static WebElement vehtankcapacity(WebDriver driver) throws Exception{
		
		vehtankcapacity=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return vehtankcapacity;
	}
			
	public static WebElement vehtankdes(WebDriver driver) throws Exception{
		
		vehtankdes=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return vehtankdes;
			
		}

	public static WebElement model(WebDriver driver) throws Exception{
		
		model=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return model;
	}

	public static WebElement year(WebDriver driver) throws Exception{
		
		year=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return year;
	}

	public static WebElement vin(WebDriver driver) throws Exception{
		
		vin=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return vin;
			
	}
	public static WebElement tag(WebDriver driver) throws Exception{
		
		tag=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return tag;
		
		
	}

	public static WebElement vehuserdef1(WebDriver driver) throws Exception{
		
		vehuserdef1=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return vehuserdef1;
		
		
	}
	public static WebElement vehuserdef2(WebDriver driver) throws Exception{
		
		vehuserdef2=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return vehuserdef2;
		
		
	}
	public static WebElement vehuserdef3(WebDriver driver) throws Exception{
		
		vehuserdef3=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return vehuserdef3;
		
		
	}
	public static WebElement vehuserdef4(WebDriver driver) throws Exception{
		
		vehuserdef4=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return vehuserdef4;
		
		
	}

	public static WebElement vehcrossref(WebDriver driver) throws Exception{
		
		vehcrossref=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return vehcrossref;
		
		
	}
	public static WebElement smartapmacaddress(WebDriver driver) throws Exception{
		
		smartapmacaddress=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return smartapmacaddress;
		
		
	}
	public static WebElement manufacturer(WebDriver driver) throws Exception{
		
		manufacturer=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return manufacturer;
		
		
	}

	public static WebElement vehtransient(WebDriver driver) throws Exception{
		
		vehtransient=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return vehtransient;
		
		
	}
	public static WebElement reqodometer(WebDriver driver) throws Exception{
		
		reqodometer=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return reqodometer;
		
		
	}
	public static WebElement fleetvehbarcodedetailsadd(WebDriver driver) throws Exception{
		
		fleetvehbarcodedetailsadd=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return fleetvehbarcodedetailsadd;
		
		
	}

	public static WebElement fleetvehbarcodedetailsprodclick(WebDriver driver) throws Exception{
		
		fleetvehbarcodedetailsprodclick=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return fleetvehbarcodedetailsprodclick;
	}

	public static WebElement fleetvehbarcodedetailsprodsearchbox(WebDriver driver) throws Exception{
		
		fleetvehbarcodedetailsprodsearchbox=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return fleetvehbarcodedetailsprodsearchbox;
	}

	public static WebElement fleetvehbarcodedetailsprodselect(WebDriver driver) throws Exception{
		
		fleetvehbarcodedetailsprodselect=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return fleetvehbarcodedetailsprodselect;
	}

	public static WebElement fleetvehbarcodedetailsprodok(WebDriver driver) throws Exception{
		
		fleetvehbarcodedetailsprodok=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return fleetvehbarcodedetailsprodok;
	}

	public static WebElement fleetvehbarcodedetailsbarcodeactive(WebDriver driver) throws Exception{
		
		fleetvehbarcodedetailsbarcodeactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return fleetvehbarcodedetailsbarcodeactive;
	}

	public static WebElement fleetvehbarcodedetailsbarcode(WebDriver driver) throws Exception{
		
		fleetvehbarcodedetailsbarcode=driver.findElement(By.name(ExcelUtils.getstringCellData(11, ColNum)));
			
			return fleetvehbarcodedetailsbarcode;
	}

	public static WebElement fleetvehbarcodedetailscapacityactive(WebDriver driver) throws Exception{
		
		fleetvehbarcodedetailscapacityactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return fleetvehbarcodedetailscapacityactive;
	}

	public static WebElement fleetvehbarcodedetailscapacity(WebDriver driver) throws Exception{
		
		fleetvehbarcodedetailscapacity=driver.findElement(By.name(ExcelUtils.getstringCellData(11, ColNum)));
			
			return fleetvehbarcodedetailscapacity;
	}

	public static WebElement fleetvehbarcodedetailstankdesactive(WebDriver driver) throws Exception{
		
		fleetvehbarcodedetailstankdesactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return fleetvehbarcodedetailstankdesactive;
	}

	public static WebElement fleetvehbarcodedetailstankdes(WebDriver driver) throws Exception{
		
		fleetvehbarcodedetailstankdes=driver.findElement(By.name(ExcelUtils.getstringCellData(11, ColNum)));
			
			return fleetvehbarcodedetailstankdes;
	}



public static WebElement fleetvehbarcodedetailsdiv(WebDriver driver) throws Exception{
		
		fleetvehbarcodedetailsdiv=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return fleetvehbarcodedetailsdiv;
	}

	public static WebElement deliverytanks(WebDriver driver) throws Exception{
		
		deliverytanks=driver.findElement(By.linkText(ExcelUtils.getstringCellData(11, ColNum)));
			
			return deliverytanks;
	}

	public static WebElement locktanklist(WebDriver driver) throws Exception{
		
		locktanklist=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return locktanklist;
		
		
	}

	public static WebElement taxfeeprofile(WebDriver driver) throws Exception{
		
		taxfeeprofile=driver.findElement(By.linkText(ExcelUtils.getstringCellData(11, ColNum)));
			
			return taxfeeprofile;
	}

	public static WebElement taxfeeprofileactive(WebDriver driver) throws Exception{
		
		taxfeeprofileactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return taxfeeprofileactive;
	}

	public static WebElement taxfeeprofileclick(WebDriver driver) throws Exception{
		
		taxfeeprofileclick=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return taxfeeprofileclick;
	}

	public static WebElement taxfeeprofileselect(WebDriver driver) throws Exception{
		
		taxfeeprofileselect=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		List<WebElement> taxfeeprofile=driver.findElements(By.xpath(ExcelUtils.getstringCellData(32, ColNum)));
		
		
		for(WebElement ele:taxfeeprofile)
		{
			
			String taxfeeprofileselect=ele.getText();
			
			if(taxfeeprofileselect.equalsIgnoreCase(ExcelUtils.getstringCellData(32, 5)))
			{
				ele.click();
				
				break;
			}
			
		}
		
		Thread.sleep(3000);
		
		ExcelUtils.setCellData("Tax Fee Profile is " + (ExcelUtils.getstringCellData(32, 5)),32, 8);
		
		 System.out.println("Tax Fee Profile is " + (ExcelUtils.getstringCellData(32, 5)));
			
		
		
			
			return taxfeeprofileselect;
	}
	public static WebElement taxfeeprofileunassign(WebDriver driver) throws Exception{
		
		taxfeeprofileunassign=driver.findElement(By.linkText(ExcelUtils.getstringCellData(11, ColNum)));
			
			return taxfeeprofileunassign;
	}

	
	public static WebElement priceclassmap(WebDriver driver) throws Exception{
		
		priceclassmap=driver.findElement(By.linkText(ExcelUtils.getstringCellData(11, ColNum)));
			
			return priceclassmap;
	}

	public static WebElement priceclassactive(WebDriver driver) throws Exception{
		
		priceclassactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return priceclassactive;
	}

	public static WebElement priceclassclick(WebDriver driver) throws Exception{
		
		priceclassclick=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return priceclassclick;
	}

	public static WebElement priceclassselect(WebDriver driver) throws Exception{
		
		
		
		List<WebElement> priceclass=driver.findElements(By.xpath(ExcelUtils.getstringCellData(32, ColNum)));
		
		
		for(WebElement ele:priceclass)
		{
			
			String priceclassselect=ele.getText();
			
			if(priceclassselect.equalsIgnoreCase(ExcelUtils.getstringCellData(32, 5)))
			{
				ele.click();
				
				break;
			}
			
		}
		
		Thread.sleep(3000);
		
		ExcelUtils.setCellData("Price Class is " + (ExcelUtils.getstringCellData(32, 5)),32, 8);
		
		 System.out.println("Price Class is " + (ExcelUtils.getstringCellData(32, 5)));
			
			return priceclassselect;
	}

	public static WebElement priceclassvaractive(WebDriver driver) throws Exception{
		
		priceclassvaractive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return priceclassvaractive;
	}

	public static WebElement priceclassvarinsert(WebDriver driver) throws Exception{
		
		priceclassvarinsert=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return priceclassvarinsert;
	}

	public static WebElement priceclassvarperactive(WebDriver driver) throws Exception{
		
		priceclassvarperactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return priceclassvarperactive;
	}

	public static WebElement priceclassvarperinsert(WebDriver driver) throws Exception{
		
		priceclassvarperinsert=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return priceclassvarperinsert;
	}

	public static WebElement priceclassmapunassign(WebDriver driver) throws Exception{
		
		priceclassmapunassign=driver.findElement(By.linkText(ExcelUtils.getstringCellData(11, ColNum)));
			
			return priceclassmapunassign;
	}

	public static WebElement priceclassmapdiv(WebDriver driver) throws Exception{
		
		priceclassmapdiv=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return priceclassmapdiv;
	}

	

	public static WebElement regionmap(WebDriver driver) throws Exception{
		
		regionmap=driver.findElement(By.linkText(ExcelUtils.getstringCellData(11, ColNum)));
			
			return regionmap;
	}

	public static WebElement manuallock(WebDriver driver) throws Exception{
		
		manuallock=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return manuallock;
	}

	public static WebElement regionmapsearchbox(WebDriver driver) throws Exception{
		
		regionmapsearchbox=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return regionmapsearchbox;
	}



	public static WebElement primaryactive(WebDriver driver) throws Exception{
		
		primaryactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return primaryactive;
	}

	public static WebElement primarycheck(WebDriver driver) throws Exception{
		
		primarycheck=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return primarycheck;
		
		
	}

	public static WebElement primarydiv(WebDriver driver) throws Exception{
		
		primarydiv=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return primarydiv;
	}

	public static WebElement territoryactive(WebDriver driver) throws Exception{
		
		territoryactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return territoryactive;
	}

	public static WebElement territoryclick(WebDriver driver) throws Exception{
		
		territoryclick=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return territoryclick;
	}
	
public static WebElement territorydropdownlist(WebDriver driver) throws Exception{
		
		By mySelector = By.xpath(ExcelUtils.getstringCellData(31, ColNum));

		List<WebElement> myElements = driver.findElements(mySelector);

		for(WebElement e : myElements) {
			
			ExcelUtils.setCellData("Territories are \n"+e.getText(),31, 8);
			
		  System.out.println("Territories are List \n" + e.getText());
			
		}
			
			return territorydropdownlist;
			
		}
	

	public static WebElement territoryselect(WebDriver driver) throws Exception{
		
		
		
		List<WebElement> territory=driver.findElements(By.xpath(ExcelUtils.getstringCellData(32, ColNum)));
		
		
		for(WebElement ele:territory)
		{
			
			String territoryselect=ele.getText();
			
			if(territoryselect.equalsIgnoreCase(ExcelUtils.getstringCellData(32, 5)))
			{
				ele.click();
				
				break;
			}
			
		}
		
		Thread.sleep(3000);
		
		ExcelUtils.setCellData("Territory is " + (ExcelUtils.getstringCellData(32, 5)),32, 8);
		
		 System.out.println("Territory is " + (ExcelUtils.getstringCellData(32, 5)));
			
			return territoryselect;
	}

	public static WebElement regionmapunassign(WebDriver driver) throws Exception{
		
		regionmapunassign=driver.findElement(By.linkText(ExcelUtils.getstringCellData(11, ColNum)));
			
			return regionmapunassign;
	}

	
	public static WebElement regionmapautoupdate(WebDriver driver) throws Exception{
		
		regionmapautoupdate=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return regionmapautoupdate;
		
		
	}

	public static WebElement defproductload(WebDriver driver) throws Exception{
		
		defproductload=driver.findElement(By.linkText(ExcelUtils.getstringCellData(11, ColNum)));
		
		return defproductload;
		
		
	}

	public static WebElement productdetailsadd(WebDriver driver) throws Exception{
		
		productdetailsadd=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return productdetailsadd;
		
		
	}

	public static WebElement prodetserach(WebDriver driver) throws Exception{
		
		prodetserach=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return prodetserach;
		
		
	}
	public static WebElement Checkproduct(WebDriver driver){
		
		//Checkproduct=driver.findElement(By.id("txtSearchProductGrid"));
		
		List<WebElement> els = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for ( WebElement el : els ) {
		    if ( !el.isSelected() ) {
		        el.click();
		    }
		}
		
		return Checkproduct;
		
		
	}
	



	public static WebElement prodetallcheck(WebDriver driver) throws Exception{
		
		prodetallcheck=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return prodetallcheck;
		
		
	}

	public static WebElement prodetindvcheck(WebDriver driver) throws Exception{
		
		prodetindvcheck=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return prodetindvcheck;
		
		
	}

	public static WebElement prodetok(WebDriver driver) throws Exception{
		
		prodetok=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return prodetok;
		
		
	}

	public static WebElement prodetcancel(WebDriver driver) throws Exception{
		
		prodetcancel=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return prodetcancel;
		
		
	}

	

	public static WebElement estimatevolactive(WebDriver driver) throws Exception{
		
		estimatevolactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return estimatevolactive;
	}

	public static WebElement estimatevolinsert(WebDriver driver) throws Exception{
		
		estimatevolinsert=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return estimatevolinsert;
	}

	public static WebElement ordertouseactive(WebDriver driver) throws Exception{
		
		ordertouseactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return ordertouseactive;
	}

	public static WebElement ordertouseclick(WebDriver driver) throws Exception{
		
		ordertouseclick=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return ordertouseclick;
	}
	
public static WebElement ordertouseforavgdropdownlist(WebDriver driver) throws Exception{
		
		By mySelector = By.xpath(ExcelUtils.getstringCellData(31, ColNum));

		List<WebElement> myElements = driver.findElements(mySelector);

		for(WebElement e : myElements) {
			
			ExcelUtils.setCellData("Order to Use for Avg. has following dropdown list \n"+e.getText(),31, 8);
			
		  System.out.println("Order to Use for Avg. has following dropdown list \n" + e.getText());
			
		}
			
			return ordertouseforavgdropdownlist;
			
		}
	
	public static WebElement ordertouseselect(WebDriver driver) throws Exception{
		
		
		
		List<WebElement> ordertouseforavg=driver.findElements(By.xpath(ExcelUtils.getstringCellData(32, ColNum)));
		
		
		for(WebElement ele:ordertouseforavg)
		{
			
			String ordertouseforavgselect=ele.getText();
			
			if(ordertouseforavgselect.equalsIgnoreCase(ExcelUtils.getstringCellData(32, 5)))
			{
				ele.click();
				
				break;
			}
			
		}
		
		Thread.sleep(3000);
		
		ExcelUtils.setCellData("Order to Use for Avg. is " + (ExcelUtils.getstringCellData(32, 5)),32, 8);
		
		 System.out.println("Order to Use for Avg. is " + (ExcelUtils.getstringCellData(32, 5)));
			
			return ordertouseselect;
	}


	public static WebElement monthstouseactive(WebDriver driver) throws Exception{
		
		monthstouseactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return monthstouseactive;
	}

	public static WebElement monthstouseinsert(WebDriver driver) throws Exception{
		
		monthstouseinsert=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return monthstouseinsert;
	}


	public static WebElement prodetdiv(WebDriver driver) throws Exception{
		
		prodetdiv=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
			
			return prodetdiv;
	}

	


public static WebElement defloadsadd(WebDriver driver) throws Exception{
		
		defloadsadd=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return defloadsadd;
		
		
	}

	public static WebElement defloadsprodsearch(WebDriver driver) throws Exception{
		
		defloadsprodsearch=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return defloadsprodsearch;
		
		
	}

	public static WebElement defloadsprodcheckall(WebDriver driver) throws Exception{
		
		defloadsprodcheckall=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return defloadsprodcheckall;
		
		
	}

	public static WebElement defloadsprodindvcheck(WebDriver driver) throws Exception{
		
		defloadsprodindvcheck=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return defloadsprodindvcheck;
		
		
	}

	public static WebElement defloadsprodok(WebDriver driver) throws Exception{
		
		defloadsprodok=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return defloadsprodok;
		
		
	}

	public static WebElement defloadsprodcancel(WebDriver driver) throws Exception{
		
		defloadsprodcancel=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return defloadsprodcancel;
		
		
	}

	
	public static WebElement volumecellactive(WebDriver driver) throws Exception{
		
		volumecellactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return volumecellactive;
		
		
	}

	public static WebElement volume(WebDriver driver) throws Exception{
		
		volume=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return volume;
		
		
	}

	public static WebElement terminalcellactive(WebDriver driver) throws Exception{
		
		terminalcellactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return terminalcellactive;
		
		
	}

	public static WebElement terminalclick(WebDriver driver) throws Exception{
		
		terminalclick=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return terminalclick;
		
		
	}

	public static WebElement terminalselect(WebDriver driver) throws Exception{
		
		
		
		List<WebElement> terminal=driver.findElements(By.xpath(ExcelUtils.getstringCellData(32, ColNum)));
		
		
		for(WebElement ele:terminal)
		{
			
			String terminalselect=ele.getText();
			
			if(terminalselect.equalsIgnoreCase(ExcelUtils.getstringCellData(32, 5)))
			{
				ele.click();
				
				break;
			}
			
		}
		
		Thread.sleep(3000);
		
		ExcelUtils.setCellData("Terminal  is " + (ExcelUtils.getstringCellData(32, 5)),32, 8);
		
		 System.out.println("Terminal is " + (ExcelUtils.getstringCellData(32, 5)));
		
		return terminalselect;
		
		
	}
	public static WebElement suppliercellactive(WebDriver driver) throws Exception{
		
		suppliercellactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return suppliercellactive;
		
		
	}
	
	public static WebElement supplierclick(WebDriver driver) throws Exception{
		
		supplierclick=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return supplierclick;
		
		
	}

	
public static WebElement supplierlist(WebDriver driver) throws Exception{
		
		By mySelector = By.xpath(ExcelUtils.getstringCellData(31, ColNum));

		List<WebElement> myElements = driver.findElements(mySelector);

		for(WebElement e : myElements) {
			
			ExcelUtils.setCellData("Terminal has following Mapped Supplier List \n"+e.getText(),31, 8);
			
		  System.out.println("Terminal has following Mapped Supplier List \n" + e.getText());
			
		}
			
			return supplierlist;
			
		}
	

	public static WebElement supplierselect(WebDriver driver) throws Exception{
		
		
		
		List<WebElement> supplier=driver.findElements(By.xpath(ExcelUtils.getstringCellData(32, ColNum)));
		
		
		for(WebElement ele:supplier)
		{
			
			String supplierselect=ele.getText();
			
			if(supplierselect.equalsIgnoreCase(ExcelUtils.getstringCellData(32, 5)))
			{
				ele.click();
				
				break;
			}
			
		}
		
		Thread.sleep(3000);
		
		ExcelUtils.setCellData("Supplier  is " + (ExcelUtils.getstringCellData(32, 5)),32, 8);
		
		 System.out.println("Supplier is " + (ExcelUtils.getstringCellData(32, 5)));
		
		return supplierselect;
		
		
	}

	public static WebElement vendorcellactive(WebDriver driver) throws Exception{
		
		vendorcellactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return vendorcellactive;
		
		
	}
public static WebElement vendorclick(WebDriver driver) throws Exception{
		
	vendorclick=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return vendorclick;
		
		
	}
	
	

	
	
public static WebElement vendorlist(WebDriver driver) throws Exception{
		
		By mySelector = By.xpath(ExcelUtils.getstringCellData(31, ColNum));

		List<WebElement> myElements = driver.findElements(mySelector);

		for(WebElement e : myElements) {
			
			ExcelUtils.setCellData("Terminal and Supplier has following Mapped Vendor List \n"+e.getText(),31, 8);
			
		  System.out.println("Terminal and Supplier has following Mapped Vendor List \n" + e.getText());
			
		}
			
			return vendorlist;
			
		}

	public static WebElement vendorselect(WebDriver driver) throws Exception{
		
		List<WebElement> vendor=driver.findElements(By.xpath(ExcelUtils.getstringCellData(32, ColNum)));
		
		
		for(WebElement ele:vendor)
		{
			
			String vendorselect=ele.getText();
			
			if(vendorselect.equalsIgnoreCase(ExcelUtils.getstringCellData(32, 5)))
			{
				ele.click();
				
				break;
			}
			
		}
		
		Thread.sleep(3000);
		
		ExcelUtils.setCellData("Vendor  is " + (ExcelUtils.getstringCellData(32, 5)),32, 8);
		
		 System.out.println("Vendor is " + (ExcelUtils.getstringCellData(32, 5)));
		
		return vendorselect;
		
		
	}

	public static WebElement pincellactive(WebDriver driver) throws Exception{
		
		pincellactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return pincellactive;
		
		
	}

	public static WebElement pin(WebDriver driver) throws Exception{
		
		pin=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return pin;
		
		}
	

	public static WebElement internaltankidcellactive(WebDriver driver) throws Exception{
		
		internaltankidcellactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return internaltankidcellactive;
		
		
	}

	public static WebElement internaltankid(WebDriver driver) throws Exception{
		
		internaltankid=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return internaltankid;
		
		}
	
	
	public static WebElement contractlink(WebDriver driver) throws Exception{
		
		contractlink=driver.findElement(By.linkText(ExcelUtils.getstringCellData(11, ColNum)));
		
		return contractlink;
		
		
	}

	public static WebElement contractselect(WebDriver driver) throws Exception{
		
		contractselect=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		if(contractselect.isDisplayed()){
			
			contractselect.click();
			
			Thread.sleep(3000);
			
			
		}else{
			
			contractcancel.click();
			
			Thread.sleep(3000);
		}
		
		return contractselect;
		
		
	}

	public static WebElement contractok(WebDriver driver) throws Exception{
		
		contractok=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return contractok;
		
		}

	public static WebElement contractcancel(WebDriver driver) throws Exception{
		
		contractcancel=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return contractcancel;
		
		}

	
	public static WebElement defloadsdiv(WebDriver driver) throws Exception{
		
		defloadsdiv=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return defloadsdiv;
		
		
	}
	
public static WebElement defaultloadsaddoption(WebDriver driver) throws Exception{
		
	defaultloadsaddoption=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return defaultloadsaddoption;
		
		
	}

public static WebElement defaultloadsaddoptionvolumeactive(WebDriver driver) throws Exception{
	
	defaultloadsaddoptionvolumeactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
	
	return defaultloadsaddoptionvolumeactive;
	
	
}

public static WebElement defaultloadsaddoptionterminalcellactive(WebDriver driver) throws Exception{
	
	defaultloadsaddoptionterminalcellactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
	
	return defaultloadsaddoptionterminalcellactive;
	
	
}



public static WebElement defaultloadsaddoptionterminalselect(WebDriver driver) throws Exception{
	
	
	
	List<WebElement> terminal=driver.findElements(By.xpath(ExcelUtils.getstringCellData(32, ColNum)));
	
	
	for(WebElement ele:terminal)
	{
		
		String terminalselect=ele.getText();
		
		if(terminalselect.equalsIgnoreCase(ExcelUtils.getstringCellData(32, 5)))
		{
			ele.click();
			
			break;
		}
		
	}
	
	Thread.sleep(3000);
	
	ExcelUtils.setCellData("Terminal  is " + (ExcelUtils.getstringCellData(32, 5)),32, 8);
	
	 System.out.println("Terminal is " + (ExcelUtils.getstringCellData(32, 5)));
	
	return defaultloadsaddoptionterminalselect;
	
	
}
public static WebElement defaultloadsaddoptionsuppliercellactive(WebDriver driver) throws Exception{
	
	defaultloadsaddoptionsuppliercellactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
	
	return defaultloadsaddoptionsuppliercellactive;
	
	
}



public static WebElement defaultloadsaddoptionsupplierlist(WebDriver driver) throws Exception{
	
	By mySelector = By.xpath(ExcelUtils.getstringCellData(31, ColNum));

	List<WebElement> myElements = driver.findElements(mySelector);

	for(WebElement e : myElements) {
		
		ExcelUtils.setCellData("Terminal has following Mapped Supplier List \n"+e.getText(),31, 8);
		
	  System.out.println("Terminal has following Mapped Supplier List \n" + e.getText());
		
	}
		
		return defaultloadsaddoptionsupplierlist;
		
	}


public static WebElement defaultloadsaddoptionsupplierselect(WebDriver driver) throws Exception{
	
	
	
	List<WebElement> supplier=driver.findElements(By.xpath(ExcelUtils.getstringCellData(32, ColNum)));
	
	
	for(WebElement ele:supplier)
	{
		
		String supplierselect=ele.getText();
		
		if(supplierselect.equalsIgnoreCase(ExcelUtils.getstringCellData(32, 5)))
		{
			ele.click();
			
			break;
		}
		
	}
	
	Thread.sleep(3000);
	
	ExcelUtils.setCellData("Supplier  is " + (ExcelUtils.getstringCellData(32, 5)),32, 8);
	
	 System.out.println("Supplier is " + (ExcelUtils.getstringCellData(32, 5)));
	
	return defaultloadsaddoptionsupplierselect;
	
	
}

public static WebElement defaultloadsaddoptionvendorcellactive(WebDriver driver) throws Exception{
	
	defaultloadsaddoptionvendorcellactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
	
	return defaultloadsaddoptionvendorcellactive;
	
	
}



public static WebElement defaultloadsaddoptionvendorlist(WebDriver driver) throws Exception{
	
	By mySelector = By.xpath(ExcelUtils.getstringCellData(31, ColNum));

	List<WebElement> myElements = driver.findElements(mySelector);

	for(WebElement e : myElements) {
		
		ExcelUtils.setCellData("Terminal and Supplier has following Mapped Vendor List \n"+e.getText(),31, 8);
		
	  System.out.println("Terminal and Supplier has following Mapped Vendor List \n" + e.getText());
		
	}
		
		return defaultloadsaddoptionvendorlist;
		
	}

public static WebElement defaultloadsaddoptionvendorselect(WebDriver driver) throws Exception{
	
	List<WebElement> vendor=driver.findElements(By.xpath(ExcelUtils.getstringCellData(32, ColNum)));
	
	
	for(WebElement ele:vendor)
	{
		
		String vendorselect=ele.getText();
		
		if(vendorselect.equalsIgnoreCase(ExcelUtils.getstringCellData(32, 5)))
		{
			ele.click();
			
			break;
		}
		
	}
	
	Thread.sleep(3000);
	
	ExcelUtils.setCellData("Vendor  is " + (ExcelUtils.getstringCellData(32, 5)),32, 8);
	
	 System.out.println("Vendor is " + (ExcelUtils.getstringCellData(32, 5)));
	
	return defaultloadsaddoptionvendorselect;
	
	
}

public static WebElement defaultloadsaddoptionpincellactive(WebDriver driver) throws Exception{
	
	defaultloadsaddoptionpincellactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
	
	return defaultloadsaddoptionpincellactive;
	
	
}



public static WebElement defaultloadsaddoptioninternaltankidcellactive(WebDriver driver) throws Exception{
	
	defaultloadsaddoptioninternaltankidcellactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
	
	return defaultloadsaddoptioninternaltankidcellactive;
	
	
}
	public static WebElement receivinghours(WebDriver driver) throws Exception{
		
		receivinghours=driver.findElement(By.linkText(ExcelUtils.getstringCellData(11, ColNum)));
		
		return receivinghours;
		
		
	}

	public static WebElement receivinghoursadd(WebDriver driver) throws Exception{
		
		receivinghoursadd=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return receivinghoursadd;
		
		
	}

	public static WebElement receivinghoursdaystartclick(WebDriver driver) throws Exception{
		
		receivinghoursdaystartclick=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return receivinghoursdaystartclick;
		
		
	}

	public static WebElement receivinghoursdaystartselect(WebDriver driver) throws Exception{
		
		receivinghoursdaystartselect=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return receivinghoursdaystartselect;
		
		
	}

	public static WebElement receivinghoursstarttimeactive(WebDriver driver) throws Exception{
		
		receivinghoursstarttimeactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return receivinghoursstarttimeactive;
		
		
	}

	public static WebElement receivinghoursstarttimeinsert(WebDriver driver) throws Exception{
		
		receivinghoursstarttimeinsert=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return receivinghoursstarttimeinsert;
		
		
	}

	public static WebElement receivinghoursdayendactive(WebDriver driver) throws Exception{
		
		receivinghoursdayendactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return receivinghoursdayendactive;
		
		
	}

	public static WebElement receivinghoursdayendclick(WebDriver driver) throws Exception{
		
		receivinghoursdayendclick=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return receivinghoursdayendclick;
		
		
	}

	public static WebElement receivinghoursdayendselect(WebDriver driver) throws Exception{
		
		receivinghoursdayendselect=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return receivinghoursdayendselect;
		
		
	}

	public static WebElement receivinghoursendtimeactive(WebDriver driver) throws Exception{
		
		receivinghoursendtimeactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return receivinghoursendtimeactive;
		
		
	}

	public static WebElement receivinghoursendtimeinsert(WebDriver driver) throws Exception{
		
		receivinghoursendtimeinsert=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return receivinghoursendtimeinsert;
		
		
	}



	public static WebElement receivinghoursdiv(WebDriver driver) throws Exception{
		
		receivinghoursdiv=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return receivinghoursdiv;
		
		
	}

	

	public static WebElement purchaseorder(WebDriver driver) throws Exception{
		
		purchaseorder=driver.findElement(By.linkText(ExcelUtils.getstringCellData(218, ColNum)));
		
		return purchaseorder;
		
		
	}

	public static WebElement purchaseorderadd(WebDriver driver) throws Exception{
		
		purchaseorderadd=driver.findElement(By.xpath(ExcelUtils.getstringCellData(219, ColNum)));
		
		return purchaseorderadd;
		
		
	}
	public static WebElement ponumber(WebDriver driver) throws Exception{
		
		ponumber=driver.findElement(By.id(ExcelUtils.getstringCellData(220, ColNum)));
		
		return ponumber;
		
		
	}

	public static WebElement purchaseorderdiv(WebDriver driver) throws Exception{
		
		purchaseorderdiv=driver.findElement(By.xpath(".//*[@id='tabPurchaseOrder']/div/div/fieldset"));
		
		return purchaseorderdiv;
		
		
	}

	public static WebElement purchaseorderdatefromactive(WebDriver driver) throws Exception{
		
		purchaseorderdatefromactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(221, ColNum)));
		
		return purchaseorderdatefromactive;
		
		
	}


public static WebElement purchaseorderdatefromcaliconclick(WebDriver driver) throws Exception{
		
		purchaseorderdatefromcaliconclick=driver.findElement(By.xpath(ExcelUtils.getstringCellData(222, ColNum)));
		
		return purchaseorderdatefromcaliconclick;
		
		
	}


public static WebElement purchaseorderdatefromcalmonthhead(WebDriver driver) throws Exception{
	
	purchaseorderdatefromcalmonthhead=driver.findElement(By.xpath(ExcelUtils.getstringCellData(223, ColNum)));
	
	return purchaseorderdatefromcalmonthhead;
	
	
}

public static WebElement purchaseorderdatefromcalmonthhead2(WebDriver driver) throws Exception{
	
	
	purchaseorderdatefromcalmonthhead2=driver.findElement(By.xpath(ExcelUtils.getstringCellData(224, ColNum)));
	
	for(int i=0;i<=3;i++){
		
		purchaseorderdatefromcalmonthhead2.click();
		
		Thread.sleep(3000);
		
		
		
	}
	
	return purchaseorderdatefromcalmonthhead2;
	
}


public static WebElement verifyallyearslist(WebDriver driver) throws Exception{
	
	By mySelector = By.xpath(ExcelUtils.getstringCellData(225, ColNum));

	List<WebElement> myElements = driver.findElements(mySelector);

	for(WebElement e : myElements) {
		
		//ExcelUtils.setCellData("Total years are \n"+e.getText(),225, 8);
		
	  System.out.println("Total Years Are \n" + e.getText());
		
	}
		
		return verifyallyearslist;
		
	}





	public static WebElement datefromselect(WebDriver driver) throws Exception{
		
		
	List<WebElement> maxyears=driver.findElements(By.xpath(ExcelUtils.getstringCellData(226, ColNum)));


		for(WebElement ele:maxyears)
			
		{
			
			String date=ele.getText();
			
			if(date.equalsIgnoreCase(ExcelUtils.getstringCellData(226, 5)))
				
			{
				
				//CustomerShipTo_Methods.verifyallyearslist(driver);
				
				//Thread.sleep(3000);
				
				ele.click();
				
				Thread.sleep(3000);
				
				//System.out.println("The Year is in between " + ExcelUtils.getstringCellData(226, 5) );
				
				//Thread.sleep(3000);
				
				//ExcelUtils.setCellData("The Year is in between " + ExcelUtils.getstringCellData(226, 5),226,8);
				
				
				break;
			}
			
		}
		
	List<WebElement> allyears=driver.findElements(By.xpath(ExcelUtils.getstringCellData(226, ColNum)));


		
		for(WebElement ele:allyears)
		{
			
			String date=ele.getText();
			
			if(date.equalsIgnoreCase(String.valueOf(ExcelUtils.getintCellData(227, 5))))
				
			{
				
				//CustomerShipTo_Methods.verifyallyearslist(driver);
				
				//Thread.sleep(3000);
				
				ele.click();
				
				Thread.sleep(3000); 
				
				//System.out.println("The Year is  " + ExcelUtils.getintCellData(227, 5) );
				
				//Thread.sleep(3000);
				
				//ExcelUtils.setCellData("The Year is  " + ExcelUtils.getintCellData(227, 5),227,8);
				
				
				break;
			}
			
		}
		
		
		
		List<WebElement> allmonths=driver.findElements(By.xpath(ExcelUtils.getstringCellData(226, ColNum)));
		
		
		for(WebElement ele:allmonths)
		{
			
			String date=ele.getText();
			
			if(date.equalsIgnoreCase(ExcelUtils.getstringCellData(228, 5)))
				
			{
				
				//CustomerShipTo_Methods.verifyallyearslist(driver);
				
				//Thread.sleep(3000);
				
				ele.click();
				
				Thread.sleep(3000);
				
				//System.out.println("The Month is " + ExcelUtils.getstringCellData(228, 5) );
				
				//Thread.sleep(3000);
				
				
				//ExcelUtils.setCellData("The Month is  " + ExcelUtils.getstringCellData(228, 5),228,8);
				
				
				break;
			}
			
		}
		
		
		List<WebElement> allDates=driver.findElements(By.xpath(ExcelUtils.getstringCellData(226, ColNum)));
		
		for(WebElement ele:allDates)
		{
			
			String date=ele.getText();
			
			if(date.equalsIgnoreCase(String.valueOf(ExcelUtils.getintCellData(229, 5))))
				
				
			{
				
				//CustomerShipTo_Methods.verifyallyearslist(driver);
				
				//Thread.sleep(3000);
				
				ele.click();
				
				Thread.sleep(3000);
				
				//System.out.println("The Date is " + ExcelUtils.getintCellData(229, 5) );
				
				//Thread.sleep(3000);
				
				//ExcelUtils.setCellData("The Date is in  " + ExcelUtils.getintCellData(229, 5),229,8);
				
				
				break;
			}
			
		}
		
		
		
return datefromselect;
		
		
	}

	
	

	public static WebElement datetoselect(WebDriver driver) throws Exception{
		
		
	List<WebElement> maxyears=driver.findElements(By.xpath(ExcelUtils.getstringCellData(226, ColNum)));


		for(WebElement ele:maxyears)
			
		{
			
			String date=ele.getText();
			
			if(date.equalsIgnoreCase(ExcelUtils.getstringCellData(233, 5)))
				
			{
				
				//CustomerShipTo_Methods.verifyallyearslist(driver);
				
				//Thread.sleep(3000);
				
				ele.click();
				
				Thread.sleep(3000);
				
				//System.out.println("The Year is in between " + ExcelUtils.getstringCellData(233, 5) );
				
				//Thread.sleep(3000);
				
				//ExcelUtils.setCellData("The Year is in between " + ExcelUtils.getstringCellData(233, 5),233,8);
				
				
				break;
			}
			
		}
		
	List<WebElement> allyears=driver.findElements(By.xpath(ExcelUtils.getstringCellData(226, ColNum)));


		
		for(WebElement ele:allyears)
		{
			
			String date=ele.getText();
			
			if(date.equalsIgnoreCase(String.valueOf(ExcelUtils.getintCellData(234, 5))))
				
			{
				
				//CustomerShipTo_Methods.verifyallyearslist(driver);
				
				//Thread.sleep(3000);
				
				ele.click();
				
				Thread.sleep(3000); 
				
				//System.out.println("The Year is  " + ExcelUtils.getintCellData(234, 5) );
				
				//Thread.sleep(3000);
				
				//ExcelUtils.setCellData("The Year is  " + ExcelUtils.getintCellData(234, 5),234,8);
				
				
				break;
			}
			
		}
		
		
		
		List<WebElement> allmonths=driver.findElements(By.xpath(ExcelUtils.getstringCellData(226, ColNum)));
		
		
		for(WebElement ele:allmonths)
		{
			
			String date=ele.getText();
			
			if(date.equalsIgnoreCase(ExcelUtils.getstringCellData(235, 5)))
				
			{
				
				//CustomerShipTo_Methods.verifyallyearslist(driver);
				
				//Thread.sleep(3000);
				
				ele.click();
				
				Thread.sleep(3000);
				
				//System.out.println("The Month is " + ExcelUtils.getstringCellData(235, 5) );
				
				//Thread.sleep(3000);
				
				
				//ExcelUtils.setCellData("The Month is  " + ExcelUtils.getstringCellData(235, 5),235,8);
				
				
				break;
			}
			
		}
		
		
		List<WebElement> allDates=driver.findElements(By.xpath(ExcelUtils.getstringCellData(226, ColNum)));
		

		

		
		for(WebElement ele:allDates)
		{
			
			String date=ele.getText();
			
			if(date.equalsIgnoreCase(String.valueOf(ExcelUtils.getintCellData(236, 5))))
				
				
			{
				
				//CustomerShipTo_Methods.verifyallyearslist(driver);
				
				//Thread.sleep(3000);
				
				ele.click();
				
				Thread.sleep(3000);
				
				//System.out.println("The Date is " + ExcelUtils.getintCellData(236, 5) );
				
				//Thread.sleep(3000);
				
				//ExcelUtils.setCellData("The Date is in  " + ExcelUtils.getintCellData(236, 5),236,8);
				
				
				break;
			}
			
		}
		
		
		
return datetoselect;
		
		
	}
	

	public static WebElement purchaseorderdatefromcalpresentdaylink(WebDriver driver) throws Exception{
		
		purchaseorderdatefromcalpresentdaylink=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return purchaseorderdatefromcalpresentdaylink;
		
		
	}

	public static WebElement purchaseorderdatetoactive(WebDriver driver) throws Exception{
		
		purchaseorderdatetoactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(230, ColNum)));
		
		return purchaseorderdatetoactive;
		
		
	}

	public static WebElement purchaseorderdatetoinsert(WebDriver driver) throws Exception{
		
		purchaseorderdatetoinsert=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return purchaseorderdatetoinsert;
		
		
	}

	public static WebElement purchaseorderdatetocaliconclick(WebDriver driver) throws Exception{
		
		purchaseorderdatetocaliconclick=driver.findElement(By.xpath(ExcelUtils.getstringCellData(231, ColNum)));
		
		return purchaseorderdatetocaliconclick;
		
		
	}

	public static WebElement purchaseorderdatetocalprevicon(WebDriver driver) throws Exception{
		
		purchaseorderdatetocalprevicon=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return purchaseorderdatetocalprevicon;
		
		
	}

	public static WebElement purchaseorderdatetocalnexticon(WebDriver driver) throws Exception{
		
		purchaseorderdatetocalnexticon=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return purchaseorderdatetocalnexticon;
		
		
	}

	public static WebElement purchaseorderdatetocalmonthhead(WebDriver driver) throws Exception{
		
		purchaseorderdatetocalmonthhead=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return purchaseorderdatetocalmonthhead;
		
		
	}
	

	public static WebElement purchaseorderdatetopresentdaylink(WebDriver driver) throws Exception{
		
		purchaseorderdatetopresentdaylink=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return purchaseorderdatetopresentdaylink;
		
		
	}



	public static WebElement servicecharges(WebDriver driver) throws Exception{
		
		servicecharges=driver.findElement(By.linkText(ExcelUtils.getstringCellData(11, ColNum)));
		
		return servicecharges;
		
		
	}

	public static WebElement servicechargesadd(WebDriver driver) throws Exception{
		
		servicechargesadd=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return servicechargesadd;
		
		
	}

	public static WebElement servicechargesdayclick(WebDriver driver) throws Exception{
		
		servicechargesdayclick=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return servicechargesdayclick;
		
		
	}

	public static WebElement servicechargesdayselect(WebDriver driver) throws Exception{
		
		servicechargesdayselect=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return servicechargesdayselect;
		
		
	}

	public static WebElement servicechargesminvoldelactive(WebDriver driver) throws Exception{
		
		servicechargesminvoldelactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return servicechargesminvoldelactive;
		
		
	}

	public static WebElement servicechargesminvoldelinsert(WebDriver driver) throws Exception{
		
		servicechargesminvoldelinsert=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return servicechargesminvoldelinsert;
		
		
	}

	public static WebElement servicechargesnonbulkclick(WebDriver driver) throws Exception{
		
		servicechargesnonbulkclick=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return servicechargesnonbulkclick;
		
		
	}

	public static WebElement servicechargesnonbulksearchbox(WebDriver driver) throws Exception{
		
		servicechargesnonbulksearchbox=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return servicechargesnonbulksearchbox;
		
		
	}

	public static WebElement servicechargesnonbulkselect(WebDriver driver) throws Exception{
		
		servicechargesnonbulkselect=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return servicechargesnonbulkselect;
		
		
	}

	public static WebElement servicechargesnonbulkok(WebDriver driver) throws Exception{
		
		servicechargesnonbulkok=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return servicechargesnonbulkok;
		
		
	}

	public static WebElement servicechargesamountactive(WebDriver driver) throws Exception{
		
		servicechargesamountactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return servicechargesamountactive;
		
		
	}

	public static WebElement servicechargesamountinsert(WebDriver driver) throws Exception{
		
		servicechargesamountinsert=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return servicechargesamountinsert;
		
		
	}

	public static WebElement servicechargesdatefromactive(WebDriver driver) throws Exception{
		
		servicechargesdatefromactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return servicechargesdatefromactive;
		
		
	}

	public static WebElement servicechargesdatefrominsert(WebDriver driver) throws Exception{
		
		servicechargesdatefrominsert=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return servicechargesdatefrominsert;
		
		
	}

	public static WebElement servicechargesdatefromcaliconclick(WebDriver driver) throws Exception{
		
		servicechargesdatefromcaliconclick=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return servicechargesdatefromcaliconclick;
		
		
	}

	

	public static WebElement servicechargesdatefromcalpresentdaylink(WebDriver driver) throws Exception{
		
		servicechargesdatefromcalpresentdaylink=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return servicechargesdatefromcalpresentdaylink;
		
		
	}

	public static WebElement servicechargesdatetoactive(WebDriver driver) throws Exception{
		
		servicechargesdatetoactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return servicechargesdatetoactive;
		
		
	}

	public static WebElement servicechargesdatetoinsert(WebDriver driver) throws Exception{
		
		servicechargesdatetoinsert=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return servicechargesdatetoinsert;
		
		
	}

	public static WebElement servicechargesdatetocaliconclick(WebDriver driver) throws Exception{
		
		servicechargesdatetocaliconclick=driver.findElement(By.xpath(ExcelUtils.getstringCellData(11, ColNum)));
		
		return servicechargesdatetocaliconclick;
		
		
	}

	

	

	public static WebElement servicechargesdiv(WebDriver driver){
		
		servicechargesdiv=driver.findElement(By.xpath(".//*[@id='tabServiceCharges']/div/div/fieldset"));
		
		return servicechargesdiv;
		
		
	}



		public static WebElement save(WebDriver driver) throws Exception{
			
			save=driver.findElement(By.name(ExcelUtils.getstringCellData(11, ColNum)));
			
			return save;
			
			
		}
		
		public static WebElement search(WebDriver driver) throws Exception{
			
			search=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
			
			return search;
			
		}


		public static WebElement back(WebDriver driver) throws Exception{
			
			back=driver.findElement(By.linkText(ExcelUtils.getstringCellData(11, ColNum)));
			
			return back;
		}
		
	public static WebElement sort(WebDriver driver){
		
		sort=driver.findElement(By.linkText(""));
		
		return sort;
		
		
	}

	public static WebElement mainpagenavbuttons(WebDriver driver) throws Exception{
		
		//Last Page Click
		
		driver.findElement(By.xpath("//span[@class='k-icon k-i-seek-e']")).click();
		
		 Thread.sleep(3000);
		
		//First page Click
		
		driver.findElement(By.xpath("//span[@class='k-icon k-i-seek-w']")).click();
		
		 Thread.sleep(3000);
		
		//Next Page Click
		
		driver.findElement(By.xpath("//span[@class='k-icon k-i-arrow-e']")).click();
		
		 Thread.sleep(3000);
		
		//Previous Page Click
		
		driver.findElement(By.xpath("//span[@class='k-icon k-i-arrow-w']")).click();
		
		 Thread.sleep(3000);
		
		return mainpagenavbuttons;
	}
}