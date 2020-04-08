package testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginbyPIM {

	@FindBy(how=How.ID, using="txtUsername")
	public static WebElement username;
	
	@FindBy(how=How.ID, using="txtPassword")
	
	public static WebElement password;
	
	@FindBy(id="btnLogin")
	
	public static WebElement loginbtn;
	
	
}
