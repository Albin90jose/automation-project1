package Mainmodules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CustomerLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		
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
		
		 s.selectByIndex(5);
		 Thread.sleep(5000);
		 //Enter login
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(2000);
 
		 //Enter Transaction details
		 driver.findElement(By.xpath("//button[normalize-space()='Transactions']")).click();
		 Thread.sleep(2000);
		 
		 //Enter Back Button
		 driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();
		 Thread.sleep(2000);
		 
		 //Enter Deposit section
		 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[3]/button[2]")).click();
		 Thread.sleep(2000);
		 
		 //Enter Withdrawal section
		 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[3]/button[3]")).click();
		 Thread.sleep(2000);
		
		// Enter logout button
		 driver.findElement(By.xpath("//button[@class='btn logout']")).click();
		 Thread.sleep(2000);
	}

}
