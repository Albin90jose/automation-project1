package Mainmodules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectorsinitialiasation {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.in", "C:\\Automation Folder\\Browser extension\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer");
		Thread.sleep(2000);
		
		WebElement Yourname=driver.findElement(By.id("userSelect"));
		
		Select s=new Select(Yourname);
		
		s.selectByIndex(3);
	
	}

}
