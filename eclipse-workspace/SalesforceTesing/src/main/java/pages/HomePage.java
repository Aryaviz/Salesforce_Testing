package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethodSF;


	public class HomePage extends ProjectSpecificMethodSF {
		


		public HomePage(ChromeDriver driver) {
			// TODO Auto-generated constructor stub
		}
		
		public HomePage clickApplaunger() {
			driver.findElement(By.xpath("//div[@class='slds-r4']/following-sibling::div[1]")).click();
			return this;
		}
		public HomePage clickViewAll() {
			driver.findElementByXPath("//button[text()='View All']").click();
			return this;
			
		}
		public SalesPage clickSales() {
			
			driver.findElementByXPath("//p[text()='Sales']").click();
			
			return new SalesPage();
			
		}
	}


