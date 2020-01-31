package testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.imageio.stream.FileImageInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Gglogin {
	public static void main(String[] args) throws IOException, InterruptedException
	
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.globalgarner.com/");
	driver.manage().window().maximize();
	FileInputStream file = new FileInputStream("D:\\sagar work\\logindata.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	XSSFSheet sheet = workbook.getSheet("sheet1");
	int noofrows = sheet.getLastRowNum();
	System.out.println("no of record in excel sheet:" +noofrows);
		for(int row = 1; row<=noofrows; row++)
	{
		XSSFRow currentrow=sheet.getRow(row);
				
		
		String user = currentrow.getCell(0).getStringCellValue();
		String pass = currentrow.getCell(1).getStringCellValue();
		
		//driver.findElement(By.xpath(".//a[@class='dropdown-toggle header-profile-name p-0']")).click();
		driver.findElement(By.xpath(".//*[@id=\"root\"]/div/div[1]/nav/div/div/div[4]/div/ul/li[4]/span/span/a")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/ul/li[1]/a")).click();

		driver.findElement(By.name("username")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pass);
		Thread.sleep(5000);

		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);

		
		
		driver.findElement(By.xpath("//span[@class='bp3-popover-wrapper login-menu']")).click();
		Thread.sleep(5000);

		
		driver.findElement(By.xpath("//div[contains(text(),'Logout')]")).click();
		Thread.sleep(5000);

		
		driver.findElement(By.xpath("//button[@class='bp3-button bp3-intent-danger']")).click();
		Thread.sleep(5000);

	}
}
}
