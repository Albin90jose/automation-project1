package Project;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateLogin_MainClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Folder\\Browser extension\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();	
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
       
		CreateLogin_POM s = new CreateLogin_POM();
		
		s.url(driver);
		Thread.sleep(2000);
		s.createlogin(driver);
		Thread.sleep(2000);
		s.draganddrop(driver);
		Thread.sleep(2000);
		s.loginbutton(driver);
		Thread.sleep(2000);
		s.transactions(driver);
		Thread.sleep(2000);
		s.back(driver);
		Thread.sleep(2000);
		s.logoutbutton(driver);
		Thread.sleep(2000);
	}

}




