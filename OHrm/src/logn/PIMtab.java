package logn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import testcases.EnterPIMdata;
import testcases.loginbyPIM;

public class PIMtab {

	@Test
	public void main() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

	driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();    
		
		PageFactory.initElements(driver, loginbyPIM.class);
		
		loginbyPIM.username.sendKeys("Admin");
		loginbyPIM.password.sendKeys("admin123");
		loginbyPIM.loginbtn.click();
		
		PageFactory.initElements(driver, EnterPIMdata.class);
	
	EnterPIMdata.PIM.click();
	EnterPIMdata.configuration.click();
	EnterPIMdata.optionalfields.click();

	/*EnterPIMdata.Edit.click();
	EnterPIMdata.save.click();*/
	
	EnterPIMdata.employeelist.click();
	
	EnterPIMdata.empName.sendKeys("Linda Anderson");
    EnterPIMdata.ID.sendKeys("0001");
    
  
    Select select=new Select(EnterPIMdata.status);
    select.selectByIndex(3);
    EnterPIMdata.status.click();
    
    EnterPIMdata.supervisor.sendKeys("John Smith");

    Select selc1=new Select(EnterPIMdata.jobTitle);
    selc1.selectByVisibleText("HR Manager");
    EnterPIMdata.jobTitle.click();
    
    Select select2=new Select(EnterPIMdata.subunit);
    select2.selectByIndex(2);
    EnterPIMdata.subunit.click();   
    
}
}