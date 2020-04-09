import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiobtn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.leafground.com/pages/radio.html");
	
		
		WebElement classes=driver.findElement(By.id("no"));
	    classes.click();
	
		WebElement defaultbtn=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[2]/input"));
		boolean uncheck=defaultbtn.isSelected();
		
		WebElement defaultBtn=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]/input"));
		boolean check=defaultBtn.isSelected();
		
		System.out.println("The button clicked is"+uncheck);
		System.out.println("The button clicked is"+check);
		
	/*	WebElement agegrp=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[1]"));
		WebElement age=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[2]"));
		WebElement ag=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[3]"));
		
		if(agegrp.isSelected()) {
					agegrp.click();
	}
		else if(age.isSelected()) {
		age.click();
	}
		else if(ag.isSelected()) {
		ag.click();
	}*/
	
}
	}
