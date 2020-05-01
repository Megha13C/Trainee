package admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobjectmodel.POMobj;

public class Organization {
	@Test
	public void main() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium codes\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().window().maximize();
	    
	    PageFactory.initElements(driver, POMobj.class);
	    
	      POMobj.username.sendKeys("Admin");
	 	  POMobj.password.sendKeys("admin123");
     	  POMobj.loginbtn.click();
	
	   POMobj.Admin.click();
       POMobj.Organization.click();
       POMobj.location.click();
       POMobj.locAdd.click();
       POMobj.Lname.sendKeys("Priyanka");
       
       Select select=new Select(POMobj.Lcountry);
       select.selectByIndex(13);
       POMobj.Lcountry.click();
       POMobj.Lprovince.sendKeys("Victoria");
       POMobj.Lcity.sendKeys("sydney");
       POMobj.Lphone.sendKeys("8474154698");
	   POMobj.Lsave.click();
	   
	   POMobj.Organization.click();
	   POMobj.locsearch_name.sendKeys("Priyanka");
	   POMobj.Locsearch_city.sendKeys("sydney");
	   
	   Select Locstatus=new Select(POMobj.locsearch_status);
	   Locstatus.selectByIndex(13);
	   POMobj.locsearch_status.click();
	   POMobj.locsearch.click();
	}
	
	}
