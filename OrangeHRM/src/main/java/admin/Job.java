package admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobjectmodel.POMobj;

public class Job {
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

	    POMobj.job.click();
	    POMobj.jobtitle.click();
	    POMobj.add.click();

	    POMobj.JT.sendKeys("HR");
	    POMobj.JD.sendKeys("Human resources");

	   // POMobj.JS.click();

	    POMobj.Note.sendKeys("Job details");
	    POMobj.Jsave.click();
	
	    POMobj.job.click();
	    POMobj.paygrades.click();
	    POMobj.payAdd.click();
	    POMobj.name.sendKeys("Meghana");
	    POMobj.btn.click();
	    
	   POMobj.job.click();
	   POMobj.empstatus.click();
	   POMobj.Empadd.click();
	   POMobj.Name.sendKeys("PAT");
	   POMobj.Save.click();
	}
	
}
