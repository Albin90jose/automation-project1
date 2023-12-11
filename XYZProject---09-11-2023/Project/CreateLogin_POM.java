package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLogin_POM {
	
	  public void maximizeBrowser(WebDriver driver) 
	   {
		driver.manage().window().maximize();
	    }
	   public void deleteAllCookies(WebDriver driver) 
	   {
		driver.manage().deleteAllCookies();
	   }
		// OPEN URL
		public void url(WebDriver driver)
		{
			driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		}
		// Click on Create button
		public void createlogin(WebDriver driver)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Customer Login']")).click();
		}
		// dropdowm 1: tagname must select
		// Step 1 : Create object of select class 
		public void draganddrop(WebDriver driver) throws InterruptedException
		{
			WebElement Yourname=driver.findElement(By.id("userSelect"));
			
			 Select s=new Select(Yourname);
			
			 s.selectByIndex(5);
			 Thread.sleep(5000);
		}
		//Click on login button
		public void loginbutton(WebDriver driver) throws InterruptedException
		{
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
		}
		// click on transactions 
		public void transactions(WebDriver driver)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Transactions']")).click();
		}
		// click on back button
		public void back(WebDriver driver)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();
		}
		// click on logout button 
		public void logoutbutton(WebDriver driver)
		{
			driver.findElement(By.xpath("//button[@class='btn logout']")).click();
		}
		
		
}
