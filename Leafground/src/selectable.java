import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();

		driver.get("http://www.leafground.com/pages/selectable.html");
	List<WebElement> items=driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
    int totalele=items.size();
    System.out.println("count is"+totalele);
	
	Actions act=new Actions(driver);
  // act.dragAndDrop(items.get(1), items.get(5));
	
	//act.clickAndHold(items.get(1));
	//act.clickAndHold(items.get(5));
	//act.build().perform();
	
	act.keyDown(Keys.CONTROL).click(items.get(5)).click(items.get(1));
	//act.build().perform();
	}

}
