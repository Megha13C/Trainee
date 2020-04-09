package payment;

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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PaymentFGateway {
	WebDriver driver;
@BeforeSuite
	public void main() {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
 driver=new ChromeDriver();
	
	driver.get("http://demo.guru99.com");
driver.manage().window().maximize();    
}
@Test
public void paymenttab() throws IOException, InterruptedException, AWTException {
	 WebElement paymentgateway=driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[9]/a"));
     paymentgateway.click();
     
   WebElement quant=driver.findElement(By.xpath("//*[@id=\"three\"]/div/form/div/div[4]/select"));
   Select select=new Select(quant);
   select.selectByIndex(3);
	
   WebElement buy=driver.findElement(By.xpath("//*[@id=\"three\"]/div/form/div/div[8]/ul/li/input"));
	buy.click();
	

	WebElement cardnum=driver.findElement(By.id("card_nmuber"));
	cardnum.sendKeys("2345257634820134");
	
	WebElement expmonth=driver.findElement(By.id("month"));
	Select selc=new Select(expmonth);
	selc.selectByIndex(5);
	
	WebElement expyear=driver.findElement(By.id("year"));
	Select selc1=new Select(expyear);
	selc1.selectByIndex(3);
	
	WebElement cvvcode=driver.findElement(By.id("cvv_code"));
	cvvcode.sendKeys("903");
	
	WebElement paynow=driver.findElement(By.xpath("//*[@id=\"three\"]/div/form/div[2]/div/ul/li/input"));
	paynow.click();
        Thread.sleep(5000);
    WebElement orderid=driver.findElement(By.xpath("//*[@id=\"three\"]/div/div/table/tbody/tr[1]/td[2]/h3/strong"));    
        orderid.getText();
      System.out.println("order id is"+orderid.getText());

Robot robot=new Robot();
Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();

Rectangle rec=new Rectangle(screensize);

BufferedImage src=robot.createScreenCapture(rec);

File des=new File("C:\\Users\\MEGHANA\\Downloads\\scsh.png");

ImageIO.write(src,"png",des);
WebElement home=driver.findElement(By.xpath("//*[@id=\"three\"]/div/div/ul/li/a"));
home.click();
}

@AfterSuite
public void quit() {
	driver.quit();
}
}
