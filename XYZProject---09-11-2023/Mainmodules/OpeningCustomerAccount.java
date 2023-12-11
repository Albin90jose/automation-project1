package Mainmodules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpeningCustomerAccount {

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
		
		//first name 
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("virat");
		Thread.sleep(2000);
		
		//last name 
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("kohli");
		Thread.sleep(2000);
		
		//pin code
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys("500095");
		Thread.sleep(2000);
		
		//add customer
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div/form/button")).click();
		Thread.sleep(5000);
				
		
		//Open account
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/button[2]")).click();
		Thread.sleep(5000);
		
		//Customer name 
		WebElement Yourname=driver.findElement(By.id("userSelect"));
		
		Select s=new Select(Yourname);
		
		 s.selectByIndex(5);
   		Thread.sleep(5000);
   		
   		//Currency
   		WebElement currency=driver.findElement(By.xpath("//*[@id=\"currency\"]"));
   		
   		Select s1=new Select(currency);
   		s1.selectByIndex(2);
   		Thread.sleep(2000); 
   		
   		//Process
   		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div/form/button")).click();
		Thread.sleep(5000);
	}

}
