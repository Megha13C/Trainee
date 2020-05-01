import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\selenium codes\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/table.html");
		
		List<WebElement> colCount=driver.findElements(By.tagName("th"));
	       int C=colCount.size();
		System.out.println("Column count is"+C);
		
		List<WebElement> rowCount=driver.findElements(By.tagName("tr"));
		int r=rowCount.size();
		System.out.println("Row Count is"+r);
		
		//WebElement iwe=driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[3]/td[1]"));
		
		
		WebElement iwe= driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		System.out.println("Progress :" + iwe.getText());

		List<WebElement> td=driver.findElements(By.xpath("//td[2]"));
		
		List<Integer> valueList= new ArrayList<Integer>();
		
		for (WebElement webElement : td) {
			String newValue=webElement.getText().replace("%", "");
			valueList.add(Integer.parseInt(newValue));
		}
		
		 System.out.println(valueList);
		
	     int minimumValue= Collections.min(valueList);
		String finalValue=Integer.toString(minimumValue)+"%";
		//System.out.println(minimumValue);
		String finalXpath="//td[normalize-space()="+"\""+ finalValue +"\""+"]"+"//following::td[1]/input";
		//*[@id=\"table_id\"]/tbody/tr[4]/td[3]/input
		//td[normalize-space()="+"\""+ finalValue +"\""+"]"+"//following::td[1]/input
		
		WebElement minCheckBox=driver.findElement(By.xpath(finalXpath));
		minCheckBox.click();
		
		System.out.println(finalXpath);
		
	}

}
