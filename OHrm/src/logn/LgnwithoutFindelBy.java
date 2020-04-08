package logn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import testcases.AddEmployeedata;
import testcases.withoutfindelement;

public class LgnwithoutFindelBy {
	@Test
	public void main() {
		System.setProperty("webdriver,chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

	driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();    
		
		PageFactory.initElements(driver, withoutfindelement.class);
		
	withoutfindelement.username.sendKeys("Admin");
	withoutfindelement.password.sendKeys("admin123");
	withoutfindelement.loginbtn.click();
	
	
	
	PageFactory.initElements(driver, AddEmployeedata.class);
	
	AddEmployeedata.Admin.click();
	
	AddEmployeedata.Add.click();
	
AddEmployeedata.UserRole.click();
	Select sel=new Select(AddEmployeedata.UserRole);
	sel.selectByIndex(1);
	
	
	AddEmployeedata.EmployeeName.sendKeys("Robert Craig");
	AddEmployeedata.Username.sendKeys("robert craig");
	AddEmployeedata.status.click();
	Select selec=new Select(AddEmployeedata.status);
	selec.selectByIndex(0);
	
	AddEmployeedata.password.sendKeys("i_c_m");
	AddEmployeedata.confirmpword.sendKeys("i_c_m");
	
	}
	
}
