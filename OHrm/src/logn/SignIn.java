package logn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import testcases.AssignLeave;
import testcases.EntertoPortal;
import testcases.Reports;

public class SignIn {
	@Test
	public void main() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium codes\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
    	driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();    

		PageFactory.initElements(driver,EntertoPortal.class);
	    
		EntertoPortal.username.sendKeys("Admin");
	    EntertoPortal.password.sendKeys("admin123");
	    EntertoPortal.loginbtn.click();
	    
	    PageFactory.initElements(driver,Reports.class);
	    
	    Reports.leave.click();
	    Reports.reports.click();
	    Reports.entitlement_usage.click();
	    
	    Select sel=new Select(Reports.generate);
	    sel.selectByIndex(1);
	    Reports.generate.click();
	    
	 /*   Reports.viewbalanceReport.click();
	    Thread.sleep(1000);
	    
	    Select type=new Select(Reports.reportType);
	    type.selectByIndex(1);
	    Reports.reportType.click(); 
	    Thread.sleep(1000);
*/	    
	    Select Ltype=new Select(Reports.Leavetype);
	    Ltype.selectByIndex(1);
	    Reports.Leavetype.click();
	    Thread.sleep(1000);
	    
	    Select date=new Select(Reports.date);
	    date.selectByIndex(4);
	    Reports.date.click();
	    Thread.sleep(1000);
	    
	    Select title=new Select(Reports.jobtitle);
	    title.selectByVisibleText("HR Manager");
	    Reports.jobtitle.click();
	    
	    Select loc=new Select(Reports.location);
	    loc.selectByIndex(5);
	    Reports.location.click();
	    
	    Select sb=new Select(Reports.subunit);
	    sb.selectByIndex(3);
	    Reports.subunit.click();
	    Thread.sleep(1000);
	    
	    Reports.view.click();
	 
	    PageFactory.initElements(driver, AssignLeave.class);
	    
	    AssignLeave.leave.click();
        AssignLeave.assignleave.click();
        AssignLeave.empName.sendKeys("Linda Anderson");

     Select s1=new Select(AssignLeave.type);
     s1.selectByVisibleText("Maternity US");
     AssignLeave.type.click();

   //  AssignLeave.balance.click();

    Select s2=new Select(AssignLeave.fromDate);
    s2.selectByIndex(8);
     AssignLeave.fromDate.click();

      AssignLeave.toDate.sendKeys("2020-04-10");
      AssignLeave.comment.sendKeys("Leave form for maternity");
      AssignLeave.assign.click();
	}
	}




















