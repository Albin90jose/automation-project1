package basicfunctionalities;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Project.CreateLogin_POM;

public class CrossBrowserTesting {

		public static void main(String[] args) throws InterruptedException {
			  Scanner s = new Scanner(System.in);
			  System.out.println("Enter 1 for GoogleChrome.\nEnter 2 for MSEdge.\nEnter 3 for MozillaFirefox.");
			  int input=s.nextInt();
			  
			  WebDriver driver = null;
			  
			  switch(input)
			  {
			  case 1:
				  System.out.println("***GoogleChrome***");
				  System.setProperty("webdriver.chrome.driver", "C:\\Automation Folder\\Browser extension\\chromedriver.exe");
				  driver=new ChromeDriver();
				  break;
				
			  case 2:
				  System.out.println("***MSEdge***");
				  System.setProperty("webdriver.edge.driver", "C:\\Automation Folder\\Browser extension\\msedgedriver.exe");
				  driver=new EdgeDriver();
				  break;
			  case 3:  
				  System.out.println("***MozillaFirefox***");
				  System.setProperty("webdriver.gecko.driver", "C:\\Automation Folder\\Browser extension\\geckodriver.exe");
				  driver=new FirefoxDriver();
				  break;
			   
				 default: System.out.println("Invalid input");
			  }
			  //Create Object of CreateLogin POM
			  
			    CreateLogin_POM s1 = new CreateLogin_POM();
				
				s1.url(driver);
				Thread.sleep(2000);
				s1.createlogin(driver);
				Thread.sleep(2000);
				s1.draganddrop(driver);
				Thread.sleep(2000);
				s1.loginbutton(driver);
				Thread.sleep(2000);
				s1.transactions(driver);
				Thread.sleep(2000);
				s1.back(driver);
				Thread.sleep(2000);
				s1.logoutbutton(driver);
				Thread.sleep(2000);
			  
			  

	}

}
