package admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobjectmodel.POMobj;

public class Admindata {

	@Test
	public void main() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium codes\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().window().maximize();
	    
	    PageFactory.initElements(driver, POMobj.class);
	    
	  POMobj.username.sendKeys("Admin");
	  POMobj.password.sendKeys("admin123");
	  POMobj.loginbtn.click();
	
	  POMobj.Admin.click();
	  Thread.sleep(1000);
	  POMobj.Usermanagement.click();
	  POMobj.Users.click(); 
	  POMobj.Add.click();
	  
	  Select role=new Select(POMobj.UserRole);
	  role.selectByIndex(0);
	  POMobj.UserRole.click();
	  
	  POMobj.EmpName.sendKeys("Robert Craig");
	  POMobj.User.sendKeys("Priya");
	  
	  Select st=new Select(POMobj.status);
	  st.selectByIndex(0);
	  POMobj.status.click();
	
	  POMobj.pword.sendKeys("Moon#sun!12");
	  POMobj.confirmPassword.sendKeys("Moon#sun!12");
	  POMobj.save.click();
	
	  POMobj.Usermanagement.click();
	  POMobj.Users.click();
	  POMobj.uname.sendKeys("Priya");
	  Select uR=new Select(POMobj.uRole);
	  uR.selectByIndex(2);
	  POMobj.uRole.click();
	  
	  POMobj.eName.sendKeys("Robert Craig");
	  
	  Select sst=new Select(POMobj.searchStatus);
	  sst.selectByIndex(1);
	  POMobj.searchStatus.click();
	
	  POMobj.search.click();
	  Thread.sleep(1000);
	
	}
}
