package testing;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class pattern {
public static void main(String[] args) throws IOException, InterruptedException
	
	{
	ChromeOptions options = new ChromeOptions();
	options.addArguments("disable-notifications");
	System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(options);
	driver.get("https://www.globalgarner.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath(".//a[@class='dropdown-toggle header-profile-name p-0']")).click();
	//driver.findElement(By.xpath(".//*[@id=\"root\"]/div/div[1]/nav/div/div/div[4]/div/ul/li[4]/span/span/a")).click();
	
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/ul/li[1]/a")).click();

	//driver.findEleme nt(By.name("username")).sendKeys("8780326282");
//	driver.findElement(By.name("password")).sendKeys("sagar1997");
	
	Actions act = new Actions(driver);
	act.sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(5000);
 driver.findElement(By.xpath("//span[@class='bp3-popover-wrapper login-menu']")).click();
	
	
	driver.findElement(By.xpath("//div[contains(text(),'Logout')]")).click();
	
	
	driver.findElement(By.xpath("//button[@class='bp3-button bp3-intent-danger']")).click();
	
	}
}
