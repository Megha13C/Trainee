package testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Reports {

	@FindBy(xpath="//*[@id=\"menu_leave_viewLeaveModule\"]/b")
	public static WebElement leave;
	
	@FindBy(xpath="//*[@id=\"menu_leave_Reports\"]")
	public static WebElement reports;
	
	@FindBy(xpath="//*[@id=\"menu_leave_viewLeaveBalanceReport\"]")
	public static WebElement entitlement_usage;
	
	@FindBy(xpath="//*[@id=\"leave_balance_report_type\"]")
	public static WebElement generate;
	
	/*@FindBy(id="menu_leave_viewLeaveBalanceReport")
	public static WebElement viewbalanceReport;
	
	@FindBy(id="leave_balance_report_type")
	public static WebElement reportType;
*/	
	
	@FindBy(id="leave_balance_leave_type")
	public static WebElement Leavetype;
	
	@FindBy(id="period")
	public static WebElement date;
	
	
	@FindBy(xpath="//*[@id=\"leave_balance_job_title\"]")
	public static WebElement jobtitle;
	
	@FindBy(xpath="//*[@id=\"leave_balance_location\"]")
	public static WebElement location;
	
	@FindBy(xpath="//*[@id=\"leave_balance_sub_unit\"]")
	public static WebElement subunit;
	
	@FindBy(id="viewBtn")
	public static WebElement view;
}
