package dataprov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class logindetails {

	String[] [] details= {{"admin", "Admin213"},{"Admin", "admin123"},{"admin1","admin123"},{"Admin","admIn2341"}};
	
	@DataProvider (name="credentials")
	public String[] [] login(){
		return details;
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
