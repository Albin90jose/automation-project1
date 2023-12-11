package basicfunctionalities;

import org.openqa.selenium.chrome.ChromeDriver;

public class URLtesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Folder\\Browser extension\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");

	}

}
