package testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddEmployeedata {

	@FindBy(how=How.XPATH,using="//*[@id=\"menu_admin_viewAdminModule\"]/b")

	public static WebElement Admin;
	
	/*@FindBy(id="menu_admin_UserManagement")

	public static WebElement usermanagement;
	
	@FindBy(id="menu_admin_viewSystemUsers")
	public static WebElement users;*/
	
	
	@FindBy(xpath="//*[@id=\"btnAdd\"]")
	public static WebElement Add;
	
	@FindBy(id="systemUser_userType")

	public static WebElement UserRole ;

	@FindBy(xpath="//*[@id=\"systemUser_employeeName_empName\"]")

	public static WebElement EmployeeName;
	
	@FindBy(id="systemUser_userName")

	public static WebElement Username ;

	@FindBy(xpath="//*[@id=\"systemUser_status\"]")

	public static WebElement status;
	
	@FindBy(id="systemUser_password")

	public static WebElement password;

	@FindBy(id="systemUser_confirmPassword")

	public static WebElement confirmpword;
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
