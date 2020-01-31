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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Exceldata {
	
	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver= new ChromeDriver();
		Driver.get("http://www.newtours.demoaut.com/");
		Driver.manage().window().maximize();
		FileInputStream file = new FileInputStream("D:\\sagar work\\testingdata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		int noofrows = sheet.getLastRowNum();
		System.out.println("no of record in excel sheet:" +noofrows);
		for(int row = 1; row<=noofrows; row++)
		{
			XSSFRow currentrow=sheet.getRow(row);
			String firstname = currentrow.getCell(0).getStringCellValue();
			String lastname = currentrow.getCell(1).getStringCellValue();
			int phone =  (int) currentrow.getCell(2).getNumericCellValue();
			String email = currentrow.getCell(3).getStringCellValue();
			String address = currentrow.getCell(4).getStringCellValue();
			String city = currentrow.getCell(5).getStringCellValue();
			String state = currentrow.getCell(6).getStringCellValue();
		int pincode =   (int) currentrow.getCell(7).getNumericCellValue();
			String country = currentrow.getCell(8).getStringCellValue();
			String username = currentrow.getCell(9).getStringCellValue();
			String password = currentrow.getCell(10).getStringCellValue();
			Driver.findElement(By.linkText("REGISTER")).click();
			Driver.findElement(By.name("firstName")).sendKeys(firstname);
			Driver.findElement(By.name("lastName")).sendKeys(lastname);
			Driver.findElement(By.name("phone")).sendKeys(String.valueOf(phone));
			Driver.findElement(By.id("username")).sendKeys(email);
			Driver.findElement(By.name("address1")).sendKeys(address);
			Driver.findElement(By.name("city")).sendKeys(city);
			Driver.findElement(By.name("state")).sendKeys(state);
			Driver.findElement(By.cssSelector("table:nth-child(2) tbody:nth-child(1) tr:nth-child(11) td:nth-child(2) > input:nth-child(1)")).sendKeys(String.valueOf(pincode));
			Select dropdown = new Select(Driver.findElement(By.name("country")));
			dropdown.selectByVisibleText(country);
			Driver.findElement(By.name("email")).sendKeys(username);
			Driver.findElement(By.name("password")).sendKeys(password);
			Driver.findElement(By.cssSelector("table:nth-child(2) tbody:nth-child(1) tr:nth-child(16) td:nth-child(2) > input:nth-child(1)")).sendKeys(password);
			Driver.findElement(By.name("register")).click();
			Thread.sleep(3000);
			if(Driver.getPageSource().contains("Thank you for registering."))
			{
				System.out.println("registration completed for " +row + " record" );
			}
			else
			{
				System.out.println("registration fail for " +row + " record" );
			}
		}
	System.out.println("data driven test completed");	
	}
}