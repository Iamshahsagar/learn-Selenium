package testing;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class GGBSW {
	 
	
	
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
					
			//redirect to gmail
		 driver.get("https://demoqa.com/automation-practice-switch-windows/");
		 
         // Store and Print the name of the First window on the console
	
         String handle= driver.getWindowHandle();
         driver.findElement(By.xpath(".//button[contains(text(),'New Message Window')]")).click();
 
        // System.out.println(handle);
 
         // Click on the Button "New Message Window"
 
        // driver.findElement(By.id("alert")).click();
      //   WebDriverWait wait = new WebDriverWait(driver, 10);
     //    Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
     //    myAlert.accept();
     	
       

 
         // Store and Print the name of all the windows open	              
 
        Set handles = driver.getWindowHandles();
 
         System.out.println(handles);
        
         // Pass a window handle to the other window
 
         for (String handle1 : driver.getWindowHandles()) {
 
          System.out.println(handle1);
          
          WebElement td=driver.findElement(By.xpath("/html/body"));
       //   td.getText();
          System.out.println(td);
          driver.switchTo().window(handle);
	//	}
	}
	}}

