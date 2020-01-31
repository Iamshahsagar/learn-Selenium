
package Assignments;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class MakeMyTripProject {
	WebDriver driver ; 
    private String today;
	
    @BeforeClass
		  public void beforeTest() throws IOException, InterruptedException{
			  ChromeOptions options = new ChromeOptions();
				options.addArguments("disable-notifications");
				System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver(options);
							
					//redirect to gmail
				driver.get("https://www.makemytrip.com/");
				driver.manage().window().maximize();
				
				System.out.println("redirect proper");
		  }
    @Test
    public void datePickerTest() throws IOException, InterruptedException {
		
		 driver.findElement(By.xpath("./html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]")).click();
		
	/*	driver.findElement(By.id("fromCity")).sendKeys("Ahmedabad" +Keys.ENTER);
		Thread.sleep(5000);
		Actions td= new Actions(driver);
		td.sendKeys(Keys.ARROW_DOWN);
		td.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(5000);

		Actions ec= new Actions(driver);
		ec.sendKeys("Mumbai, India");
		Thread.sleep(5000);
		ec.sendKeys(Keys.ARROW_DOWN);
		ec.sendKeys(Keys.ENTER).perform();*/
		today = getCurrentDay();
	        System.out.println("Today's number: " + today + "\n");
		
	        
	        
	        WebElement dateWidgetFrom = driver.findElement(By.id("departure"));
		
	      //This are the columns of the from date picker table
	        List<WebElement> columns = dateWidgetFrom.findElements(By.tagName("td"));
	 
	        //DatePicker is a table. Thus we can navigate to each cell
	        //and if a cell matches with the current date then we will click it.
	        for (WebElement cell: columns) {
	            /*
	            //If you want to click 18th Date
	            if (cell.getText().equals("18")) {
	            */
	            //Select Today's Date
	            if (cell.getText().equals(today)) {
	                cell.click();
	                break;
	            }
	        }
	 
	        //Wait for 4 Seconds to see Today's date selected.
	        try {
	            Thread.sleep(4000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        
	        
	        
		/*// Create object of SimpleDateFormat class and decide the format
		 DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		 
		 //get current date time with Date()
		 Date date = new Date();
		 
		 // Now format the date
		 String date1= dateFormat.format(date);
		 System.out.println(date1);
		 Actions ws= new Actions(driver);
		 driver.findElement(By.cssSelector("[aria-label='Mon Jan 20 2020']")).click();
		// ws.sendKeys(Keys.ENTER).perform();*/
}
    
    @AfterClass
    public static void quitDriver() {
    	
    }
	
	private String getCurrentDay (){
        //Create a Calendar Object
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
 
        //Get Current Day as a number
        int dd = calendar.get(Calendar.DAY_OF_MONTH);
       
        int mm = calendar.get(Calendar.MONTH + 1);
        int yy = calendar.get(Calendar.YEAR);
        System.out.println("Today Int: " + dd +-+ mm+-+ yy + "\n");
 
        //Integer to String Conversion
       
        String todayStr1 = Integer.toString(dd);
        String todayStr2 = Integer.toString(mm);
        String todayStr3 = Integer.toString(yy);
        
       String main = todayStr1 + todayStr2 + todayStr3;
        System.out.println("Today Str: " + main +"\n");
 
        return main;
    }
}
