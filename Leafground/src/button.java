import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");

WebDriver driver=new FirefoxDriver();
driver.get("http://www.leafground.com/pages/Button.html");

WebElement home=driver.findElement(By.id("home"));
home.click();
Thread.sleep(5000);

WebElement position=driver.findElement(By.id("position"));
int xvalue=position.getLocation().getX();
int yvalue=position.getLocation().getY();
System.out.println("x value is"+xvalue+"y value is"+yvalue);
	
	WebElement color=driver.findElement(By.id("color"));
	String btncolor=color.getCssValue("background-color");
	System.out.println("color of the button is"+btncolor);
	
	WebElement size=driver.findElement(By.id("size"));
	int height=size.getSize().getHeight();
	int width=size.getSize().getWidth();
	System.out.println("Height is"+height+"width is"+width);
	
	
	}

}

