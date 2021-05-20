package pages;

import base.ProjectSpecificMethodSF;

public class OpportunitiesPage extends ProjectSpecificMethodSF{
	
	
	public OpportunitiesPage clickNew() {
		
	driver.findElementByXPath("//div[@title='New']").click();
	return this;
	
	}
	

}
