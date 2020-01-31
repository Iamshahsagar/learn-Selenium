package testing;

import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ggbusin {
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
						//WebDriver driver =new ChromeDriver();
		driver.get("https://www.globalgarner.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath(".//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/span[3]")).click();
		
		Actions act = new Actions(driver);
		driver.findElement(By.xpath(".//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div/div/div[1]")).click();
		act.sendKeys("Surat" +Keys.ENTER).build().perform();
		
		driver.findElement(By.xpath(".//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div/div/div/div/div[1]")).click();
		act.sendKeys("Ahmedabad" +Keys.ENTER).build().perform();
		
	//	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//act.sendKeys(Keys.ENTER).build().perform();
		
		
		
	}
}
