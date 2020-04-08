package dataprov;

import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class LoginByexcel {
	
	String[] [] details=null;
	                                                       
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
      public static void main(String name ,String pword) throws InterruptedException {
	// TODO Auto-generated method stub
	
	System.setProperty("webdriver.gecko.driver","D:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	WebElement username=driver.findElement(By.id("txtUsername"));
	username.sendKeys(name);
	
	WebElement passwd=driver.findElement(By.id("txtPassword"));
	passwd.sendKeys(pword);
	
	WebElement loginbtn=driver.findElement(By.id("btnLogin"));
	loginbtn.click();
	Thread.sleep(1000);
	
	driver.quit();
	
}	
}
