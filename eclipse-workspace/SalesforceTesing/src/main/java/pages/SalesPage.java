package pages;

import base.ProjectSpecificMethodSF;

public class SalesPage extends ProjectSpecificMethodSF {
	
	public OpportunitiesPage clickOpportunity() {
		
		
		//driver.findElementByXPath("/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[2]/one-app-nav-bar-item-dropdown/div/one-app-nav-bar-menu-button/a/lightning-icon/lightning-primitive-icon/svg")
		//driver.findElementByXPath("///span[text()='New Opportunity']").click();
		
		return new OpportunitiesPage();
		
		
	}

}