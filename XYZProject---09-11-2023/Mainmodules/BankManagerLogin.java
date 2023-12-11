package Mainmodules;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankManagerLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.in", "C:\\Automation Folder\\Browser extension\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		//URL
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		Thread.sleep(2000);
		
		//Enter BankManagerSection
		driver.findElement(By.xpath("//button[normalize-space()='Bank Manager Login']")).click();
		Thread.sleep(2000);
		
		//Add Customer Details first name last name and pin code and click on add customer section 
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/button[1]")).click();
		Thread.sleep(2000);
		//First name
		
		//Login
		
		//Enter OpenAccount section (By selecting customer name and currency then will process it)
		driver.findElement(By.xpath("//button[normalize-space()='Open Account']")).click();
		Thread.sleep(2000);
		
		//
		
		//Enter Customers Section(display customers section)
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/button[3]")).click();
		Thread.sleep(2000);
		
       //Enter HomePage
		driver.findElement(By.xpath("//button[@class='btn home']")).click();
		Thread.sleep(2000);
		
	}

}
