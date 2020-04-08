package logn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import testcases.AddEmplyoee;
import testcases.LoginusingPOM;

public class Login {
@Test
	public void main() {
		System.setProperty("webdriver,chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

	driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();    
		
		LoginusingPOM.username(driver).sendKeys("Admin");
		LoginusingPOM.password(driver).sendKeys("admin123");
		LoginusingPOM.loginbtn(driver).click();
		
		//driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		AddEmplyoee.Admin(driver).click();
		AddEmplyoee.Add(driver).click();
		
		AddEmplyoee.UserRole(driver);
		Select sel=new Select(AddEmplyoee.UserRole(driver));
		sel.selectByIndex(1);
		
		
		AddEmplyoee.EmployeeName(driver).sendKeys("Robert Craig");
		AddEmplyoee.Username(driver).sendKeys("robert craig");
		AddEmplyoee.status(driver).click();
		Select selec=new Select(AddEmplyoee.status(driver));
		selec.selectByIndex(0);
		
		AddEmplyoee.password(driver).sendKeys("ilu_chai");
		AddEmplyoee.confirmpword(driver).sendKeys("ilu_chai");
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
