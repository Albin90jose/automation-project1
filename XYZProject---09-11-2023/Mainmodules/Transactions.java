package Mainmodules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Transactions {

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
				
				 s.selectByIndex(2);
				 Thread.sleep(5000);
				 //Enter login
				 driver.findElement(By.xpath("//button[@type='submit']")).click();
				 Thread.sleep(2000);
				 
				//Enter Deposit section
				 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[3]/button[2]")).click();
				 Thread.sleep(2000);
				//Enter Deposit amount section 
				 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("200");
				 Thread.sleep(2000);
				 
				 //select deposit 
				 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/form/button")).click();
				 Thread.sleep(2000);
				 
				 //Enter withdrawal section 
				 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[3]/button[3]")).sendKeys("100");
				 Thread.sleep(2000);
				 
				 //select withdrawal
				 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/form/button")).click();
				 Thread.sleep(5000);
				 
				 //select transactions 
				 driver.findElement(By.xpath("//button[normalize-space()='Transactions']")).click();
				 Thread.sleep(5000);
				 
				//Enter HomePage
				 driver.findElement(By.xpath("//button[@class='btn home']")).click();
				 Thread.sleep(2000);
	}

}
