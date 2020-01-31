package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class pagination {
	@Test
	public void productCount() throws InterruptedException
	{

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
				
	    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	    
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    
	    driver.manage().window().maximize();
	    
	    //Escape Pop up
	    driver.findElement(By.cssSelector("button[class='_2AkmmA _29YdH8']")).click();
	  
	    //Search Query
	    String searchString = "iphone 7";
	    
	    //Enter Search Query in Search Textbox
	    driver.findElement(By.className("LM6RPg")).sendKeys(searchString);
	    
	    //Click on Search Button
	    driver.findElement(By.className("LM6RPg")).sendKeys(Keys.ENTER);
	    
	    //start product count from 0
	    int productCount = 0;
	    
	    //list to store page numbers
	    List<WebElement> elements;
	    
	    //Count no of pagination link
	    new WebDriverWait(
	            driver, 20).until(
	                    ExpectedConditions.presenceOfElementLocated(
	                            By.xpath("//nav[@class='_1ypTlJ']/a")));
	
	    elements = driver.findElements(By.xpath("//nav[@class='_1ypTlJ']/a"));
	
	//Iterate through list
	for (int i = 0; i < elements.size()-1; i++) {
	 
	        elements.get(i).sendKeys(Keys.ENTER);
	        Thread.sleep(3000);
	        
	        //Store product element
	        List<WebElement> productElement = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
	    	
	        //Add List size to existing pages product count
	        productCount = productCount + productElement.size();
	      
	    }
	
	   String actualResult = driver.findElement(By.cssSelector("span[class='_2yAnYN']")).getText();
	   int currentCount = 24 * (elements.size()-2) + 1;
	   String expectedResult = "Showing "  + currentCount + " – " + productCount + " of " + productCount + " results for \"" + searchString +"\"";  
	   
	    Assert.assertTrue(actualResult.equals(expectedResult));
	
	}
}