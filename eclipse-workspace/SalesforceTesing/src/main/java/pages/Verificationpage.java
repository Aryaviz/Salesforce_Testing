package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethodSF;

public class Verificationpage extends ProjectSpecificMethodSF {
	
	public Verificationpage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public HomePage enterverification() throws InterruptedException {
		Thread.sleep(5000);
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("****");
		driver.findElement(By.xpath("//input[@class=\"button primary wide mt8 mb16\"]")).click();
		return new HomePage(null);
		
	}

}
