package testing;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.Test;


public class Test1 {
	@Test
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url = "https://www.techlistic.com/p/selenium-practice-form.html";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
	driver.findElement(By.name("firstname")).sendKeys("sagar416@yahoo.in");
	driver.findElement(By.name("lastname")).sendKeys("sagar416@yahoo.in");
	
	driver.findElement(By.id("sex-0")).click();
	driver.findElement(By.id("exp-2")).click();
		
	driver.findElement(By.id("datepicker")).sendKeys("07-Nov-2019");
	driver.findElement(By.id("profession-0")).click();
	driver.findElement(By.id("tool-2")).click();
	
	
	Select i= new Select(driver.findElement(By.name("continents")));
	i.selectByVisibleText("Antartica");
	
	Select j= new Select(driver.findElement(By.id("selenium_commands")));
	j.selectByIndex(3);
	j.selectByIndex(4);
	
	driver.findElement(By.name("photo")).sendKeys("G:\\My Drive\\wallpaper\\webpages\\comingsoon_01\\images\\bg01.jpg");
	
	//driver.findElement(By.linkText("Click here to Download File")).click();
	    
	
	//i.selectByIndex(4);
		//driver.close();
	}
	
	
}
