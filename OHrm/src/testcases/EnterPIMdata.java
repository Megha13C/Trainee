package testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterPIMdata {

     @FindBy(xpath="//*[@id=\"menu_pim_viewPimModule\"]/b")	
	public static WebElement PIM;
	
	@FindBy(id="menu_pim_Configuration")
	public static WebElement configuration;
	
	@FindBy(id="menu_pim_configurePim")
	public static WebElement optionalfields;
	
	/*@FindBy(className="btnSave")
	public static WebElement Edit;
	
	@FindBy(xpath="//*[@id=\"btnSave\"]")
	public static WebElement save;*/
	
	@FindBy(id="menu_pim_viewEmployeeList")
	public static WebElement employeelist;
	
	@FindBy(xpath="//*[@id=\"empsearch_employee_name_empName\"]")
	public static WebElement empName;
	
	@FindBy(xpath="//*[@id=\"empsearch_id\"]")
	public static WebElement ID;
	
	@FindBy(xpath="//*[@id=\"empsearch_employee_status\"]")
	public static WebElement status;

    @FindBy(xpath="//*[@id=\"empsearch_supervisor_name\"]")
    public static WebElement supervisor;

    @FindBy(xpath="//*[@id=\"empsearch_job_title\"]")
    public static WebElement jobTitle;
  
    @FindBy(xpath="//*[@id=\"empsearch_sub_unit\"]")
  public static WebElement subunit;
}
