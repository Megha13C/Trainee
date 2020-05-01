package testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AssignLeave {

	@FindBy(xpath="//*[@id=\"menu_leave_viewLeaveModule\"]/b")
	public static WebElement leave;
	
	@FindBy(id="menu_leave_assignLeave")
	public static WebElement assignleave;
	
	@FindBy(id="assignleave_txtEmployee_empName")
	public static WebElement empName;

    @FindBy(id="assignleave_txtLeaveType")
    public static WebElement type;
    
   // @FindBy(id="assignleave_leaveBalance")
    //public static WebElement balance;
    
    @FindBy(id="assignleave_txtFromDate")
    public static WebElement fromDate;
    
    @FindBy(xpath="//*[@id=\"frmLeaveApply\"]/fieldset/ol/li[5]/img")
    public static WebElement toDate;

    @FindBy(id="assignleave_txtComment")
    public static WebElement comment;
    
    @FindBy(id="assignBtn")
    public static WebElement assign;
	
	
}
