package org.base;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class BaseClass {

	public static WebDriver driver;

	public static Actions n;

	public static Robot s;

	public static Select a;
	
	public static 	JavascriptExecutor js;

	public static void lanchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\elcot\\eclipse-workspace\\Testng\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();

	}

	public static void toPassUrl(String url) {

		driver.get(url);
		
	}
	public static void toMax() {

		driver.manage().window().maximize();
	}

	public static void toCloseWindow() {

		driver.close();

	}

	public static void toGetCurrentUrl() {

		driver.getCurrentUrl();

	}

	public static void toQuitWindow() {

		driver.quit();

	}

	private void toGetTitle() {

		driver.getTitle();
	}

	private void toSwitchTo() {

		driver.switchTo();

	}

	public static void toClick(WebElement element) {

		element.click();

	}

	public static void toClear(WebElement element) {

		element.clear();
	}

	public static void toSendKeys(WebElement element, String data) {

		element.sendKeys(data);

	}

	public static void toGetText(WebElement element) {

		String text = element.getText();

		System.out.println(text);
	}

	public static String toGetAttribute(WebElement element ) {

		
		String text1 = element.getAttribute("value");

	    return text1;
		

	}

	public static void toDoubleClick() {

		n = new Actions(driver);

		n.doubleClick().perform();

	}

	public static void toMoveToElement(WebElement element) {

		n.moveToElement(element).perform();

	}

	public static void toRightClick() {

		n.contextClick().perform();
	}

	public static void toDragandDrop(WebElement element, WebElement element1) {

		n.dragAndDrop(element, element1).perform();

	}

	public static void toAcceptAlert() {

		driver.switchTo().alert().accept();

	}

	public static void toDismissAlert() {

		driver.switchTo().alert().dismiss();
	}

	public static void toScreenshot(String filename) throws IOException {

		TakesScreenshot js = (TakesScreenshot) driver;

		File src = js.getScreenshotAs(OutputType.FILE);

		File dest = new File("C:\\Users\\elcot\\eclipse-workspace\\SeleniumTask 7\\ScreenShot\\" + filename + ".png");

		FileUtils.copyFile(src, dest);

	}

	public static void toWait(int second) {

		driver.manage().timeouts().implicitlyWait(second, TimeUnit.SECONDS);

	}

	public static void toKeyControlA() throws AWTException {

		s = new Robot();
		s.keyPress(KeyEvent.VK_CONTROL);
		s.keyPress(KeyEvent.VK_A);
		s.keyRelease(KeyEvent.VK_CONTROL);
		s.keyRelease(KeyEvent.VK_A);
	}

	public static void toControlV() {
		s.keyPress(KeyEvent.VK_CONTROL);
		s.keyPress(KeyEvent.VK_V);
		s.keyRelease(KeyEvent.VK_CONTROL);
		s.keyRelease(KeyEvent.VK_V);
	}

	public static void toKeyUp() {

		s.keyPress(KeyEvent.VK_UP);
		s.keyRelease(KeyEvent.VK_UP);

	}

	public static void toKeyDown() {

		s.keyPress(KeyEvent.VK_DOWN);
		s.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void toKeyLeft() {
		s.keyPress(KeyEvent.VK_LEFT);
		s.keyRelease(KeyEvent.VK_LEFT);
	}

	public static void toKeyRight() {
		s.keyPress(KeyEvent.VK_RIGHT);
		s.keyRelease(KeyEvent.VK_RIGHT);
	}

	public static void toKeyEnter() {
		s.keyPress(KeyEvent.VK_ENTER);
		s.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void toKeyTab() {
		s.keyPress(KeyEvent.VK_TAB);
		s.keyRelease(KeyEvent.VK_TAB);
	}

	public static void toSelectByValue(WebElement element, String text) {
		a = new Select(element);
		a.selectByValue(text);
	}
	public static void toSelectByVisibleText(String text) {

		a.selectByVisibleText(text);
	}
	public static void toSelectByIndex(int value) {
		a.selectByIndex(value);
	}
	public static void toIsMultiple() {
		a.isMultiple();
	}
	public static void toGetOptions() {
		a.getOptions();
	}
	public static void toGetAllSelectedOptions() {

		a.getAllSelectedOptions();
	}
	public static void toGetFirstSelectedOptions() {
		a.getFirstSelectedOption();
	}
	public static void toDeSelectAll() {
		a.deselectAll();
	}

	public static void toDeSelectByIndex(int text) {
		a.deselectByIndex(text);
	}
	public static void toDeSelectByValue(String element) {
		a.deselectByValue(element);
	}

	public static void toDeSelectByVisibleText(String text) {
		a.deselectByVisibleText(text);	
	}
	public static void toJavaScriptSendKey(String text,String locater) {
		
	 js=(JavascriptExecutor)driver;
	 
	 WebElement findElement = driver.findElement(By.xpath(locater));
	 
	 js.executeScript("arguments[0].setAttribute('value',"+text+")",findElement );
	}
	public static void toJavaScriptGetKey(String locater,String key) {
		 
		 WebElement findElement = driver.findElement(By.xpath(locater));
		 
		 js.executeScript("arguments[0].setAttribute('value',"+key+")",findElement );
		 Object c = js.executeScript("return arguments[0].getAttribute('value')",findElement);
		 System.out.println(c);

	}
	public static void toJavaScriptClick(String locater) {
		WebElement findElement = driver.findElement(By.xpath(locater));
		js.executeScript("arguments[0].click()",findElement);
	}
	public static void toWindow(String windowid ) {

		driver.switchTo().window(windowid);
		
	}
	
	public  static String toExcelRead(int bb,int ll) throws IOException {
		
		File file =new File("C:\\Users\\elcot\\eclipse-workspace\\PomProject\\Excel\\Book1.xlsx");
		
		//2.file inputstream which is used for read the file location
		
		FileInputStream f=new FileInputStream(file);
		
		//3.Workbook intanciation
		
		Workbook w=new XSSFWorkbook(f);
		
		Sheet s = w.getSheet("Sheet1");
			
			Row row = s.getRow(bb);
			
			Cell cell = row.getCell(ll);
				
				int cellType = cell.getCellType();
				
				String value;
				
				if (cellType==1) {
					
					 value = cell.getStringCellValue();
					
				}
				else if (DateUtil.isCellDateFormatted(cell)) {
					
				     Date d = cell.getDateCellValue();
				     
				    SimpleDateFormat sim=new SimpleDateFormat("DD/MM/YYYY");
				    
				    value = sim.format(d);
				      
				 }
				else {
					
					double dd = cell.getNumericCellValue();
					
					long l=(long)dd;
					
					value = String.valueOf(l);
					
					
				}
				return value;
			}

	public static void toImplicitWait(int second) {

		driver.manage().timeouts().implicitlyWait(second, TimeUnit.SECONDS);
	}
	
	

		}

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


