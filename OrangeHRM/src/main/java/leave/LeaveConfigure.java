package leave;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobjectmodel.POMobj;

public class LeaveConfigure {
	@Test
	public void main() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium codes\\chromedriver.exe" );	
            WebDriver driver=new ChromeDriver();	

		    driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		    driver.manage().window().maximize();
		    
		    PageFactory.initElements(driver, POMobj.class);
		   /*Login page*/ 
		    POMobj.forgotpwd.click();
		    POMobj.btncl.click();
		   POMobj.username.sendKeys("Admin");
		   POMobj.password.sendKeys("admin123");
		   POMobj.loginbtn.click();
		   
		   /*Leave config module*/
		   POMobj.Leave.click();
		   POMobj.Leave_config.click();
		   POMobj.Leave_period.click();
		   POMobj.L_edit.click();
		   
		   Select month=new Select(POMobj.L_startmonth);
		   month.selectByVisibleText("July");
		   POMobj.L_startmonth.click();
		  
		   Select date=new Select(POMobj.L_startdate);
		   date.selectByIndex(12);
		   POMobj.L_startdate.click();
	 
		  // POMobj.L_reset.click();
		   POMobj.L_save.click();
		   POMobj.Leave_config.click();
		   
		   POMobj.Leavetype.click();
		   POMobj.LT_add.click();
		   POMobj.LT_name.sendKeys("SickLeave");
		   
		   //POMobj.LT_cancel.click();
		   POMobj.LT_save.click();
		   POMobj.LT_delete.click();
}
	}
