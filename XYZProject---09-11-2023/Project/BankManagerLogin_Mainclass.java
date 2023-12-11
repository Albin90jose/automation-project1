package Project;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BankManagerLogin_Mainclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Folder\\Browser extension\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
       
		BankManagerLogin_POM s = new BankManagerLogin_POM();
		
		s.url(driver);
		Thread.sleep(2000);
		s.BankManagerlogin(driver);
		Thread.sleep(2000);
		s.addcustomers(driver);
		Thread.sleep(2000);
		s.openaccountsection(driver);
		Thread.sleep(2000);
	    s.customers(driver);
	    Thread.sleep(2000);
        s.home(driver);
        Thread.sleep(2000);
	}

}


