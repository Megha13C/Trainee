import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class edit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://www.leafground.com/pages/Edit.html");
		
		WebElement mail=driver.findElement(By.id("email"));
		mail.sendKeys("skillpixels.com");
		
        WebElement clr=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
        clr.clear();
		WebElement append=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		append.sendKeys("photography");
		
		 WebElement clr0=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input"));
	     clr0.clear();
			 
		WebElement defaultxt=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input"));
        defaultxt.sendKeys("passion");
	
        WebElement clr1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clr1.clear();
		
		WebElement disable=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		      disable.isEnabled();
		      System.out.println("the field is disabled");
	}

}
