
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();

driver.get("http://www.leafground.com/pages/Dropdown.html");

WebElement index=driver.findElement(By.id("dropdown1"));
Select select=new Select(index);
	select.selectByIndex(3);
	
	WebElement text=driver.findElement(By.name("dropdown2"));
	Select sel=new Select(text);
	sel.selectByVisibleText("Appium");
	
	WebElement value=driver.findElement(By.id("dropdown3"));
	Select select1=new Select(value);
	select1.selectByValue("1");

	WebElement options=driver.findElement(By.className("dropdown"));
	options.click();
	Thread.sleep(3000);
	Select sel2=new Select(options);	
	int c= sel2.getOptions().size();
	System.out.println("the size of dropdown is"+c);
	
	WebElement selec=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select/option[1]"));
	selec.sendKeys("Appium");
	
	WebElement prog=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select/option[1]"));
	prog.click();
	
	
	
	}
	
	
	

}
