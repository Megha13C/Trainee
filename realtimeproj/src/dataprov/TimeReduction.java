package dataprov;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class TimeReduction {

	String[] [] details=null;
    WebDriver driver;
	
	@BeforeSuite
	public void urllaunch() {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@DataProvider(name="credentials")
	public String[][] login() throws BiffException, IOException {
		
		details=getExcelData();
		return details;
	}
	public String[][] getExcelData() throws IOException, BiffException{
		FileInputStream excel=new FileInputStream("D:\\selenium codes\\Book1.xls");
	
		Workbook workbook=Workbook.getWorkbook(excel);
		
		Sheet sheet=workbook.getSheet(0);
		
		int rowCount=sheet.getRows();
		int columnCount=sheet.getColumns();
		
		String testData[][]=new String[rowCount-1][columnCount];
		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<columnCount;j++) {
				testData[i-1][j]=sheet.getCell(j,i).getContents();			
		}
	}
	return testData;
}
	
      @Test(dataProvider="credentials")
    
      public void main(String uname ,String password) {
    	  
	WebElement username=driver.findElement(By.id("txtUsername"));
	username.sendKeys(uname);
	
	WebElement passwd=driver.findElement(By.id("txtPassword"));
	passwd.sendKeys(password);
	
	WebElement loginbtn=driver.findElement(By.id("btnLogin"));
	loginbtn.click();
      }
      
      @AfterSuite
      public void closeurl() {
	driver.quit();
}
}
