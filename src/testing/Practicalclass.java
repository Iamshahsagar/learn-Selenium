package testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class Practicalclass {
	WebDriver driver ; 
	
	
  @Test(priority=1)
  public void Windowchange() throws IOException, InterruptedException {
	  String handle= driver.getWindowHandle();
      driver.findElement(By.xpath(".//button[contains(text(),'New Message Window')]")).click();
      Thread.sleep(2000);  

      Set handles = driver.getWindowHandles();
     
      System.out.println(handles);
     
      // Pass a window handle to the other window

      for (String handle1 : driver.getWindowHandles()) {
	      Thread.sleep(2000);  

       System.out.println(handle1);
	      Thread.sleep(2000);  

             driver.switchTo().window(handle);
   	      Thread.sleep(2000);  

	  
  }
  }
      
      @Test(priority=2)
      public void altmessage() throws IOException, InterruptedException {
	      Thread.sleep(2000);  

    	  driver.findElement(By.id("alert")).click();
             WebDriverWait wait = new WebDriverWait(driver, 10);
            Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
  	      Thread.sleep(2000);  
  	      myAlert.accept();
	      Thread.sleep(2000);  
 }
      
      
      @Test(priority=3)
      public void doubleclick() throws IOException, InterruptedException {
	      Thread.sleep(2000);  

    	  driver.findElement(By.partialLinkText("Tooltip and Double click")).click();
    	  Thread.sleep(2000); 
    	  Actions act = new Actions(driver);
    	  WebElement td=driver.findElement(By.id("doubleClickBtn"));
    	  act.doubleClick(td).perform();
    	  WebDriverWait wait = new WebDriverWait(driver, 10);
          Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
	      Thread.sleep(2000);  
	      myAlert.accept();
	      Thread.sleep(2000);
 }
      
      @Test(priority=4)
      public void RightClick() throws IOException, InterruptedException {
	      Thread.sleep(2000);  

    	  driver.findElement(By.partialLinkText("Tooltip and Double click")).click();
    	  Thread.sleep(2000); 
    	  Actions act = new Actions(driver);
    	  WebElement td=driver.findElement(By.id("rightClickBtn"));
    	  act.contextClick(td).perform();
    	  
    	  driver.findElement(By.cssSelector("[onclick='callOnItemClick('Copy')']")).click();
    	
    	  WebDriverWait wait = new WebDriverWait(driver, 10);
          Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
	      Thread.sleep(2000);  
	      myAlert.accept();
	      Thread.sleep(2000);
 }   
      
  @BeforeMethod
  public void beforeTest() throws IOException, InterruptedException{
	  ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver(options);
					
			//redirect to gmail
		driver.get("https://demoqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		
		System.out.println("redirect proper");
		

  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
