package admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjectmodel.POMobj;

public class Qualifications {

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
	   POMobj.Qualifications.click();
	   POMobj.skills.click();
	   
	   POMobj.skill_add.click();
	   POMobj.skill_name.sendKeys("Megha");
	   POMobj.skill_des.sendKeys("Selenium");
	   POMobj.skill_save.click();
	   
	   POMobj.Qualifications.click();
	   POMobj.Education.click();
	   POMobj.eduAdd.click();
	   POMobj.eduLevel.sendKeys("UG");
	   POMobj.eduSave.click();
}
}