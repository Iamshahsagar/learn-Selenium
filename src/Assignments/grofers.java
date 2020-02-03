package Assignments;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class grofers {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://grofers.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/header/div[2]/div[2]/div/div/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/header/div[2]/div[2]/div/div/div/div[2]/div/div[3]/div[2]")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("[aria-autocomplete='list']")).click();
		
		Actions act = new Actions(driver);		
		act.sendKeys("cho").build().perform();
		Thread.sleep(4000);
		driver.findElement(By.id("react-autowhatever-search-section-0-item-0")).click();
		

		Thread.sleep(5000);
		List<WebElement>list=driver.findElements(By.xpath("//div[@class='products products--grid']//a"));
		List<WebElement>pn=driver.findElements(By.xpath("//div[@class='plp-product__name--box']"));
		List<WebElement>pw=driver.findElements(By.xpath("//div[@class='plp-product__quantity']"));
		List<WebElement>pnp=driver.findElements(By.xpath("//span[@class='plp-product__price--new']"));
		
	
		Thread.sleep(5000);
		System.out.println("List Size = " + list.size());
		Thread.sleep(5000);
		
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\dhaval\\eclipse-workspace\\Test\\src\\Work\\Testing.xlsx");
		reader.addSheet("Grof");
		reader.addcolumn("Grof", "Product Name");
		reader.addcolumn("Grof", "Product Quantity");
		reader.addcolumn("Grof", "Product Price");
		
		
		for(int i=0;i<=list.size();i++)
		{
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
			String proname = pn.get(i).getText();
			reader.setCellData("Grof", "Product Name", i , "proname");
			String proQ = pw.get(i).getText();
			reader.setCellData("Grof", "Product Quantity", i , "proQ");
			String propri = pnp.get(i).getText();
			reader.setCellData("Grof", "Product Price", i , " ");
			
			
			
			System.out.println("Product name :" + proname);
			System.out.println("Product Quantity :" + proQ);
			System.out.println("Product price :" + propri);
			
			//System.out.println(list.get(i).getText());
			//	list.get(5).click();
	}
		}
}
