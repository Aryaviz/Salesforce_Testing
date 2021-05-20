package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC02 {
	public static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		 driver.findElement(By.id("username")).sendKeys("arya@testleaf.com");
			driver.findElement(By.id("password")).sendKeys("march@2021");
			driver.findElement(By.id("Login")).click();
			Thread.sleep(5000);
			try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("****");
			driver.findElement(By.xpath("//input[@class=\"button primary wide mt8 mb16\"]")).click();
	}

}
