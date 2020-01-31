package testing;

import java.text.ParseException;
import org.openqa.selenium.JavascriptExecutor;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class datadriven {

	public static void main(String[] args) throws ParseException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url = "https://www.toolsqa.com/automation-practice-table";
		driver.get(url);
		driver.manage().window().maximize();
	
		//JavascriptExecutor js = (JavascriptExecutor) driver;
	//	js.executeScript("window.scrollBy(0,1000)");
		
		//No.of Columns
        List  col = driver.findElements(By.xpath(".//*[@id=\"content\"]/table/thead/tr/th"));
        System.out.println("No of cols are : " +col.size()); 
        //No.of rows 
        List  rows = driver.findElements(By.xpath(".//*[@id=\"content\"]/table/tbody/tr/td")); 
        System.out.println("No of rows are : " + rows.size());
        
	}
}
//*[@id="content"]/table/tfoot/tr/th
//*[@id="content"]/table/tbody/tr[1]/td[3] 