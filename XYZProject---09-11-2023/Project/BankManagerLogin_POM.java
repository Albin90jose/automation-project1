package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BankManagerLogin_POM {

	public static void main(String[] args)
	{

	}
				
	// Open url
	public void url(ChromeDriver driver) {
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	}
	// Click on BankManagerloginbutton
	public void BankManagerlogin(ChromeDriver driver) 
	{
		driver.findElement(By.xpath("//button[normalize-space()='Bank Manager Login']")).click();
	}
	// Click on addCustomers button 
	public void addcustomers(ChromeDriver driver) 
	{
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/button[1]")).click();
	}
	// Click on open accounts section
	public void openaccountsection(ChromeDriver driver) 
	{
		driver.findElement(By.xpath("//button[normalize-space()='Open Account']")).click();
	}
	// Enter customers section
	public void customers(ChromeDriver driver) 
	{
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/button[3]")).click();
	}
	// Click on home button 
	public void home(ChromeDriver driver) 
	{
		driver.findElement(By.xpath("//button[@class='btn home']")).click();
	}
}   


