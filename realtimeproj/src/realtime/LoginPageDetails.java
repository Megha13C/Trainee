package realtime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginPageDetails {

	@Test
	@Parameters({"username","password"})
	public void main(String name, String passwrd) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement uname=driver.findElement(By.id("txtUsername"));
		uname.sendKeys(name);
		
		WebElement passwd=driver.findElement(By.id("txtPassword"));
		passwd.sendKeys(passwrd);
		
		WebElement loginbtn=driver.findElement(By.id("btnLogin"));
		loginbtn.click();
		
		driver.quit();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
