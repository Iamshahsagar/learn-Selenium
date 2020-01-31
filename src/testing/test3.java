package testing;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class test3 {

	
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
						//WebDriver driver =new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.manage().window().maximize();
		
	
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "Keys.SHIFT" + "N");  
	    driver.get("http://www.gmail.com");  
		
		 // driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");   
		//  WebDriver driver1 = new ChromeDriver();
	   //   driver1.get("http://www.gmail.com");  
	      
	      driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "keys.TAB");  
	      driver.switchTo().defaultContent();  
	      Thread.sleep(2000);  
	    
		
		
		
	
//	WebDriver driver1 = new ChromeDriver();
//	driver1.get("https://www.google.com");
//        driver1.switchTo.windows(driver);	         
 //       driver1.switchTo().window(driver.last);
		//Actions act = new Actions(driver);
		
	//	act.sendKeys(Keys.ALT,Keys.TAB).build().perform();
        
      

}
}
