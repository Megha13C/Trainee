package pim;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobjectmodel.POMobj;

public class Configuration {
	
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
		   Thread.sleep(1000);
		   
		   /*PIM Configuration*/
		   POMobj.PIM.click();
		   POMobj.PIMconfig.click();
		   POMobj.PIM_optionalfields.click();
		   POMobj.PIMedit.click();
		   POMobj.PIMsave.click();
		   
		   POMobj.PIMconfig.click();
		   POMobj.customfields.click();
		   POMobj.customAdd.click();
		   POMobj.PIM_customfield.sendKeys("Lolo");
		   
		   Select scr=new Select(POMobj.PIMscreen);
		   scr.selectByVisibleText("Job");
		   POMobj.PIMscreen.click();
		   Select type=new Select(POMobj.PIMtype);
		   type.selectByIndex(1);
		   POMobj.PIMtype.click();
		   POMobj.customfield_save.click();
		   
		   /*PIM Employee list*/ 
		   POMobj.PIM.click();
		   POMobj.Emplyoee_list.click();
		   POMobj.EmpAdd.click();
		   POMobj.Emp_firstname.sendKeys("Meghana");
		   POMobj.Emp_lastname.sendKeys("LOLO");
		   POMobj.Emp_empId.sendKeys("85410");
		   POMobj.Emp_save.click();
		   
		   POMobj.PIM.click();
		   POMobj.Empsearch_name.sendKeys("Linda Anderson");
		   POMobj.Empsearch_id.sendKeys("85410");
		   
		   Select empst=new Select(POMobj.Empsearch_empstatus);
		   empst.selectByIndex(3);
		   POMobj.Empsearch_empstatus.click();
		   POMobj.Empsearch_supervisor.sendKeys("John Smith");
		   
		   Select JobTitle=new Select(POMobj.JT);
		   JobTitle.selectByVisibleText("HR Manager");
		   POMobj.Empsearch_JT.click();
		   
		   Select subunit=new Select(POMobj.Empsearch_subunit);
		   subunit.selectByIndex(2);
		   POMobj.Empsearch_subunit.click();
		   
		   POMobj.Empsearch.click();
		  

}	
}