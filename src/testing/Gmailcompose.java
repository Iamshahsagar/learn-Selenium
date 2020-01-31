package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmailcompose {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
					
			//redirect to gmail
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		// enter username and click next
		
		driver.findElement(By.id("identifierId")).sendKeys("sagar.shah@globalgarner.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span")).click();
		Thread.sleep(5000);
		
		
		// enter password and click next
		
		
		driver.findElement(By.name("password")).sendKeys("sagar1997" +Keys.ENTER);
		
		Thread.sleep(5000);
		
		// Click on compose button
		driver.findElement(By.xpath("//*[@id=':j3']/div")).click();
		
		
		// enter to Email address
		
	//	Recipients
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("[aria-label='To - Select contacts']")).sendKeys("iamshahsagar@gmail.com"  +Keys.TAB );
		Thread.sleep(5000);

		
		//enter Subject aria-label="To - Select contacts"
		
		
		driver.findElement(By.cssSelector("[aria-label='Subject']")).sendKeys("Testing of Selenium"  +Keys.TAB +"Hello");
		
		Thread.sleep(5000);

		
		// in subject all time is will change then we apply one condition
	/*WebElement elem=null;
		elem=driver.findElement(By.xpath("//*[@id=':o0']"));
		if(elem==null){
			driver.findElement(By.xpath("//*[@id=':o5']"));
		}
		//driver.findElement(By.xpath("//*[@id=':o0']")).
		if(elem!=null){
			elem.sendKeys("Testing of Selenium");
	}else{
		
	}*/
		
		
		
	
		
		// click on send
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("[aria-label='Send ‪(Ctrl-Enter)‬']")).click();
		
		
		Thread.sleep(5000);

				

		
}
}
