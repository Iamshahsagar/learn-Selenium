package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class practics {

	public static void main(String[] args) 
	{
		ChromeOptions option=new ChromeOptions();
		System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		driver.get("www.globalgarner.com");
		driver.manage().window().maximize();
	}
}
