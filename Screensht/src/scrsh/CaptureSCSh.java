package scrsh;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureSCSh {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
			
		 WebElement login=driver.findElement(By.id("btnLogin"));
			login.click();

       Robot r=new Robot();
	   Dimension size=Toolkit.getDefaultToolkit().getScreenSize();
	   Rectangle rec=new Rectangle(size);
	   BufferedImage src=r.createScreenCapture(rec);
	   File desloc=new File("D:\\selenium codes\\instascsh.png");
	   ImageIO.write(src,"png",desloc);
	
	  
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
