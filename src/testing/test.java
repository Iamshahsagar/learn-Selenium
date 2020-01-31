package testing;


import java.io.IOException;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class test {
	public static void main(String[] args) throws IOException, InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
					
			
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
			
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("pragna.diwan@globalgarner.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("pragna@123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
		driver.findElement(By.xpath("//*[@id=\"gbwa\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"gb23\"]")).click();
		}

}
