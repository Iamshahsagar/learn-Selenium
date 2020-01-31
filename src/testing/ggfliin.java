package testing;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;


public class ggfliin {
	
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
						//WebDriver driver =new ChromeDriver();
		driver.get("https://www.globalgarner.in/");
		//driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id=\"root\"]/div[2]/div[1]/div/div[2]/div/div[1]/span[2]")).click();

		Actions act = new Actions(driver);
		
		driver.findElement(By.id("react-select-3-input")).sendKeys("Ahmedabad");
		
		Thread.sleep(5000);
		
		act.sendKeys(Keys.ENTER).build().perform();
		
	
	
		driver.findElement(By.id("react-select-4-input")).sendKeys("Mumbai");
		
		Thread.sleep(5000);
		
		act.sendKeys(Keys.ENTER).build().perform();
		
		WebElement td= driver.findElement(By.xpath(".//*[@id=\"root\"]/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[3]/span[1]/span/div/input"));
		td.clear();
		td.sendKeys("01/20/2020");
		
		
		
		driver.findElement(By.xpath(".//*[@id=\"root\"]/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[5]/div/span")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(".//div[@class='row ml-0 mr-0 mt-2']//button[@class='bp3-button bp3-button bp3-increase bp3-increase-small']")).click();
		driver.findElement(By.xpath(".//div[@class='row ml-0 mr-0']//button[@class='bp3-button bp3-button bp3-increase bp3-increase-small']")).click();
		driver.findElement(By.xpath(".//button[@class='bp3-button bp3-intent-primary search-btn']")).click();

				
		Thread.sleep(5000);


		
	//	tes.sendKeys("ahme");
		
		Thread.sleep(1000);
		 
	//	Actions act = new Actions(driver);
		//tes.sendKeys("Ahmedabad,India(AMD)" +Keys.ENTER);
		//tes.build().perform();
		
		//driver.close();
}
}	