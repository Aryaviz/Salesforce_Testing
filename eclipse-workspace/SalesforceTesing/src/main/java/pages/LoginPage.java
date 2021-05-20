package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethodSF;

public class LoginPage extends ProjectSpecificMethodSF {

    
	
	
		
		public LoginPage enterUsername() {
			driver.findElement(By.id("username")).sendKeys("arya13@testleaf.com");
			return this;
		}
		public LoginPage enterPassword() {
			driver.findElement(By.id("password")).sendKeys("march@2021");
			return this;
		}
		public Verificationpage clickLoginButton() {
			driver.findElement(By.id("Login")).click();
			return new Verificationpage(driver);
	}
		
			
			
	}




