package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethodSF {
	


	public static ChromeDriver driver;
	
	@BeforeMethod
	
	public void StatApp() throws InterruptedException {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://login.salesforce.com/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	    
}
	/*
	@AfterMethod
	
	public void closeApp() {
		driver.close();
		
	}
	*/
}



