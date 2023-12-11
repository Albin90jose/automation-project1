package Mainmodules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NamewiseTransactionsinformation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.in", "C:\\Automation Folder\\Browser extension\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		//Enter URL
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		Thread.sleep(2000);
		
		//Enter customer login
		driver.findElement(By.xpath("//button[normalize-space()='Customer Login']")).click();
		Thread.sleep(2000);
		
		//Enter Your name section
         WebElement Yourname=driver.findElement(By.id("userSelect"));
		
		 Select s=new Select(Yourname);
		
		 s.selectByIndex(1);
		 Thread.sleep(5000);
		 //Enter login
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(2000);
		 //Account select
		 WebElement accountselect=driver.findElement(By.id("accountSelect"));
		 
		 Select s1=new Select(accountselect);
		 s1.selectByIndex(2);
		 Thread.sleep(5000);
		 
		 //Enter Transaction details
		 driver.findElement(By.xpath("//button[normalize-space()='Transactions']")).click();
		 Thread.sleep(2000);
		 
		//Enter HomePage
		driver.findElement(By.xpath("//button[@class='btn home']")).click();
		Thread.sleep(2000);
		 
		 
	}
}
