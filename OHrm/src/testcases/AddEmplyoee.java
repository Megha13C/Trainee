package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddEmplyoee {

	public static WebElement Admin(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
		}
	
	public static WebElement Add(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"btnAdd\"]"));	
		}
		public static WebElement UserRole(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"systemUser_userType\"]"));
		}
		
		public static WebElement EmployeeName(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"systemUser_employeeName_empName\"]"));
		}
		public static WebElement Username(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"systemUser_userName\"]"));	
		}
		public static WebElement status(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"systemUser_status\"]"));
		}
		public static WebElement password(WebDriver driver) {
			return driver.findElement(By.id("systemUser_password"));
		}
		public static WebElement confirmpword(WebDriver driver) {
			return driver.findElement(By.id("systemUser_confirmPassword"));
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
