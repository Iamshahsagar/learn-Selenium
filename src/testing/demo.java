 package testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class demo {
	WebDriver driver ; 
  @Test(priority=0)
  public void login() throws IOException, InterruptedException{
	  
		driver.findElement(By.xpath(".//a[@class='dropdown-toggle header-profile-name p-0']")).click();
		//driver.findElement(By.xpath(".//*[@id=\"root\"]/div/div[1]/nav/div/div/div[4]/div/ul/li[4]/span/span/a")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/ul/li[1]/a")).click();

		driver.findElement(By.name("username")).sendKeys("8780326282");
		driver.findElement(By.name("password")).sendKeys("sagar1997");
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		  
	 
  }
  
  @Test(priority=1)
  public void logincheck() throws IOException, InterruptedException{
	  String expectedTitle = "Hi, Sagar Shah";
      Thread.sleep(9000);  
      Thread.sleep(9000);
	driver.findElement(By.xpath("//span[@class='bp3-popover-wrapper login-menu']")).click();
	
	
	
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    String actualTitle = driver.findElement(By.xpath(".//div[@class='bp3-fill bp3-text-overflow-ellipsis p-2']")).getText();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Assert.assertEquals(actualTitle, expectedTitle);
    Thread.sleep(9000);  

    System.out.println("login pass");
  }
  
  
  @Test(priority=2)
  public void logout() throws IOException, InterruptedException{
      Thread.sleep(9000);  

	//  driver.findElement(By.xpath("//span[@class='bp3-popover-wrapper login-menu']")).click();
      Thread.sleep(9000);  

	  driver.findElement(By.xpath("//div[contains(text(),'Logout')]")).click();
	  

		driver.findElement(By.xpath("//button[@class='bp3-button bp3-intent-danger']")).click();
	  
  }
  
 

  @BeforeTest
  public void beforeTest() throws IOException, InterruptedException{
	  ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver(options);
					
			//redirect to gmail
		driver.get("https://www.globalgarner.com/");
		driver.manage().window().maximize();
		
		System.out.println("redirect proper");
  }

  @AfterTest
  public void driverclose(){
 
	driver.close();
	System.out.println("Chrome Close");

	
}
}
