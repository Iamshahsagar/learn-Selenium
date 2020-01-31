package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
						//WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("nav-hamburger-menu")).click();
		driver.findElement(By.xpath(".//*[@id=\"hmenu-content\"]/ul[18]/li[8]")).click();
		
		driver.findElement(By.xpath(".//*[@id=\"hmenu-content\"]/ul[6]/li[17]")).click();
		
		driver.findElement(By.xpath("//div[contains(@class,'acsUxWidget')]//div[3]//div[1]//div[1]//div[1]//a[1]//img[1]")).click();
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
	//	js.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.xpath("//*[@id=\"result_2\"]/div/div[3]/div[1]/a/h2")).click();
		
		driver.findElement(By.id("add-to-cart-button")).click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		Actions act = new Actions(driver);
	
		act.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.id("hlb-view-cart-announce")).click();
		
		driver.findElement(By.name("proceedToCheckout")).click();
		driver.findElement(By.id("ap_email")).sendKeys("iamshahsagar@gmail.com");;
		act.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.id("ap_password")).sendKeys("sagar1997");;
		act.sendKeys(Keys.ENTER).build().perform();
		 
}
}
