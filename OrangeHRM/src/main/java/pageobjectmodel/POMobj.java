package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POMobj {
	
	//LOGIN data//
	@FindBy(xpath="//*[@id=\"forgotPasswordLink\"]/a")
	public static WebElement forgotpwd;
	
	@FindBy(id="btnCancel")
	public static WebElement btncl;
	
	@FindBy(id="txtUsername")
	public static WebElement username;
	
	@FindBy(id="txtPassword")
	public static WebElement password;

	@FindBy(id="btnLogin")
	public static WebElement loginbtn;
	
	//xpath for logo is broken or not//
	@FindBy(xpath="//*[@id=\"branding\"]/a[1]/img")
	public static WebElement logo;
	
	//xpath for Admin//
	@FindBy(xpath ="//*[@id=\"menu_admin_viewAdminModule\"]/b")
	public static WebElement Admin;
	
	@FindBy(id="menu_admin_UserManagement")
	public static WebElement Usermanagement;
	
	@FindBy(id="menu_admin_viewSystemUsers")
	public static WebElement Users;
	
	@FindBy(id="btnAdd")
	public static WebElement Add;
	
	@FindBy(xpath="//*[@id=\"systemUser_userType\"]")
	public static WebElement UserRole ;
	
	@FindBy(xpath="//*[@id=\"systemUser_employeeName_empName\"]")
	public static WebElement EmpName;
	
	@FindBy(xpath="//*[@id=\"systemUser_userName\"]")
	public static WebElement User;
	
	@FindBy(xpath="//*[@id=\"systemUser_status\"]")
	public static WebElement status;
	
	@FindBy(xpath="//*[@id=\"systemUser_password\"]")
	public static WebElement pword;
	
	@FindBy(id="systemUser_confirmPassword")
	public static WebElement confirmPassword;
	
	@FindBy(xpath="//*[@id=\"btnSave\"]")
	public static WebElement save;
	//xpath for searching the added user//
	@FindBy(xpath="//*[@id=\"searchSystemUser_userName\"]")
	public static WebElement uname;
	
	@FindBy(xpath="//*[@id=\"searchSystemUser_userType\"]")
	public static WebElement uRole;
	
	@FindBy(xpath="//*[@id=\"searchSystemUser_employeeName_empName\"]")
	public static WebElement eName;
	
	@FindBy(xpath="//*[@id=\"searchSystemUser_status\"]")
	public static WebElement searchStatus;
	
	@FindBy(xpath="//*[@id=\"searchBtn\"]")
	public static WebElement search;
	
	@FindBy(id="menu_admin_Job")
	public static WebElement job;	
	
	@FindBy(xpath="//*[@id=\"menu_admin_viewJobTitleList\"]")
	public static WebElement jobtitle;	
	
	@FindBy(xpath="//*[@id=\"btnAdd\"]")
	public static WebElement add;	
	
	@FindBy(xpath="//*[@id=\"jobTitle_jobTitle\"]")
	public static WebElement JT;	
	
	@FindBy(xpath="//*[@id=\"jobTitle_jobDescription\"]")
	public static WebElement JD;	
	
	//@FindBy(xpath="//*[@id=\"jobTitle_jobSpec\"]")
	//public static WebElement JS;	
	
	@FindBy(xpath="//*[@id=\"jobTitle_note\"]")
	public static WebElement Note;	
	
	@FindBy(xpath="//*[@id=\"btnSave\"]")
	public static WebElement Jsave;	
	
	@FindBy(xpath="//*[@id=\"menu_admin_viewPayGrades\"]")
	public static WebElement paygrades;	
	
	@FindBy(xpath="//*[@id=\"btnAdd\"]")
	public static WebElement payAdd;	
	
	@FindBy(xpath="//*[@id=\"payGrade_name\"]")
	public static WebElement name;	
	
	@FindBy(xpath="//*[@id=\"btnSave\"]")
	public static WebElement btn;	
	
	@FindBy(xpath="//*[@id=\"menu_admin_employmentStatus\"]")
	public static WebElement empstatus;
	
	@FindBy(xpath="//*[@id=\"btnAdd\"]")
	public static WebElement Empadd;
	
	@FindBy(xpath="//*[@id=\"empStatus_name\"]")
	public static WebElement Name;
	
	@FindBy(xpath="//*[@id=\"btnSave\"]")
	public static WebElement Save;
	
	@FindBy(xpath="//*[@id=\"menu_admin_Organization\"]")
	public static WebElement Organization;
	
	@FindBy(xpath="//*[@id=\"menu_admin_viewLocations\"]")
	public static WebElement location;
	
	@FindBy(xpath="//*[@id=\"btnAdd\"]")
	public static WebElement locAdd;
	
	@FindBy(id="location_name")
	public static WebElement Lname;
	
	@FindBy(id="location_country")
	public static WebElement Lcountry;
	
	@FindBy(id="location_province")
	public static WebElement Lprovince;
	
	@FindBy(id="location_city")
	public static WebElement Lcity;
	
	@FindBy(id="location_phone")
	public static WebElement Lphone;
	
	@FindBy(id="btnSave")
	public static WebElement Lsave;
	
	@FindBy(id="searchLocation_name")
	public static WebElement locsearch_name;
	
	@FindBy(id="searchLocation_city")
	public static WebElement Locsearch_city;
	
	@FindBy(xpath="//*[@id=\"searchLocation_country\"]")
	public static WebElement locsearch_status;
	
	@FindBy(id="btnSearch")
	public static WebElement locsearch;
	
	@FindBy(xpath="//*[@id=\"menu_admin_Qualifications\"]")
	public static WebElement Qualifications;
	
	@FindBy(xpath="//*[@id=\"menu_admin_viewSkills\"]")
	public static WebElement skills;
	
	@FindBy(id="btnAdd")
	public static WebElement skill_add;
	
	@FindBy(id="skill_name")
	public static WebElement skill_name;
	
	@FindBy(id="skill_description")
	public static WebElement skill_des;
	
	@FindBy(id="btnSave")
	public static WebElement skill_save;
	
	@FindBy(id="menu_admin_viewEducation")
	public static WebElement Education;
	
	@FindBy(id="btnAdd")
	public static WebElement eduAdd;
	
	@FindBy(xpath="//*[@id=\"education_name\"]")
	public static WebElement eduLevel;
	
	@FindBy(id="btnSave")
	public static WebElement eduSave;

	//xpaths for PIM Configuration//
	
	@FindBy(xpath="//*[@id=\"menu_pim_viewPimModule\"]/b")
	public static WebElement PIM;

    @FindBy(xpath="//*[@id=\"menu_pim_Configuration\"]")
    public static WebElement PIMconfig;

    @FindBy(xpath="//*[@id=\"menu_pim_configurePim\"]")
    public static WebElement PIM_optionalfields;

    @FindBy(xpath="//*[@id=\"btnSave\"]")
    public static WebElement PIMedit;

    @FindBy(xpath="//*[@id=\"btnSave\"]")
    public static WebElement PIMsave;

    @FindBy(xpath="//*[@id=\"menu_pim_listCustomFields\"]")
    public static WebElement customfields;
    
    @FindBy(xpath="//*[@id=\"buttonAdd\"]")
    public static WebElement customAdd;
    
    @FindBy(xpath="//*[@id=\"customField_name\"]")
    public static WebElement PIM_customfield;

    @FindBy(xpath="//*[@id=\"customField_screen\"]")
    public static WebElement PIMscreen;

    @FindBy(xpath="//*[@id=\"customField_type\"]")
    public static WebElement PIMtype;

    @FindBy(xpath="//*[@id=\"btnSave\"]")
    public static WebElement customfield_save;
    
	//xpaths for employee list//
	
	@FindBy(xpath="//*[@id=\"menu_pim_viewEmployeeList\"]")
	public static WebElement Emplyoee_list;
	
	@FindBy(xpath="//*[@id=\"btnAdd\"]")
	public static WebElement EmpAdd;
	
	@FindBy(id="firstName")
	public static WebElement Emp_firstname;
	
	@FindBy(id="lastName")
	public static WebElement Emp_lastname;
	
	@FindBy(xpath="//*[@id=\"employeeId\"]")
	public static WebElement Emp_empId;
	
	@FindBy(xpath="//*[@id=\"btnSave\"]")
	public static WebElement Emp_save;
	
	@FindBy(xpath="//*[@id=\"empsearch_employee_name_empName\"]")
	public static WebElement Empsearch_name;
	
	@FindBy(xpath="//*[@id=\"empsearch_id\"]")
	public static WebElement Empsearch_id;
	
	@FindBy(xpath="//*[@id=\"empsearch_employee_status\"]")
	public static WebElement Empsearch_empstatus;
	
	@FindBy(xpath="//*[@id=\"empsearch_supervisor_name\"]")
	public static WebElement Empsearch_supervisor;
	
	@FindBy(xpath="//*[@id=\"empsearch_job_title\"]")
	public static WebElement Empsearch_JT;
	
	@FindBy(xpath="//*[@id=\"empsearch_sub_unit\"]")
	public static WebElement Empsearch_subunit;
	
    @FindBy(id="searchBtn")
    public static WebElement Empsearch;
    
    //Leave module//
    @FindBy(xpath="//*[@id=\"menu_leave_viewLeaveModule\"]/b")
    public static WebElement Leave;
    
    @FindBy(xpath="//*[@id=\"menu_leave_Configure\"]")
    public static WebElement Leave_config;
    
    @FindBy(xpath="//*[@id=\"menu_leave_defineLeavePeriod\"]")
    public static WebElement Leave_period;
    
    @FindBy(xpath="//*[@id=\"btnEdit\"]")
    public static WebElement L_edit;
    
    @FindBy(xpath="//*[@id=\"leaveperiod_cmbStartMonth\"]")
    public static WebElement L_startmonth;
    
    @FindBy(xpath="//*[@id=\"leaveperiod_cmbStartDate\"]")
    public static WebElement L_startdate;
    
    @FindBy(xpath="//*[@id=\"btnEdit\"]")
    public static WebElement L_save;
    
    @FindBy(xpath="//*[@id=\"btnReset\"]")
    public static WebElement L_reset;
    
    @FindBy(xpath="//*[@id=\"menu_leave_leaveTypeList\"]")
    public static WebElement Leavetype;
    
    @FindBy(xpath="//*[@id=\"btnAdd\"]")
    public static WebElement LT_add;
    
    @FindBy(xpath="//*[@id=\"leaveType_txtLeaveTypeName\"]")
    public static WebElement LT_name;
    
    @FindBy(xpath="//*[@id=\"saveButton\"]")
    public static WebElement LT_save;
    
    @FindBy(xpath="//*[@id=\"backButton\"]")
    public static WebElement LT_cancel;
    
    @FindBy(xpath="//*[@id=\"btnDelete\"]")
    public static WebElement LT_delete;
    
    
    
}