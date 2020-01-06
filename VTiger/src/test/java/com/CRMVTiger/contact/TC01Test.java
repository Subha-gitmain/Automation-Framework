package com.CRMVTiger.contact;



import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.CRMVTiger.GenericLib.BaseClass;
import com.CRMVTiger.GenericLib.FileLib;
import com.CRMVTiger.GenericLib.WebDriverCommonUtils;
import com.CRMVTiger.ObjectReposetary.Contact;
import com.CRMVTiger.ObjectReposetary.CreateContact;
import com.CRMVTiger.ObjectReposetary.Home;
@Listeners(com.CRMVTiger.GenericLib.ListImpClass.class)
public class TC01Test extends BaseClass{
	
	
	@Test
	public void create_Contact_ValidData() throws Throwable
	{
 
		
System.out.println("hiushdhuksdchhh");
		System.out.println("ghh");
		System.out.println("ghh");
		/*Home page displayed validation*/
		String expt=("Home");
		
		/*Creation of ObjectReposetary Home class */
		Home home=PageFactory.initElements(driver, Home.class);
		String act=home.getHomeLogo().getText();
		
		/*Validation using assert*/
		Assert.assertEquals(expt, act);
		Reporter.log("Home Validation succesfully", true);
		
		/*Implicitlywait is used*/
		WebDriverCommonUtils.implicitelyWait();
		
		/*Click on Contact Button*/
		home.clickContact();
		Reporter.log("click Button", true);
		
	/*Validation of attributes present or not*/
		
		Contact contact=PageFactory.initElements(driver, Contact.class);
		contact.attributeValidatation();
		
		/*click on "+" image Button to create new contact*/
		
		contact.getAddButton().click();
		
		/*validation of Creating New Contact page Must Be Displayed*/
		
		String actTextcontact=contact.getcreateContactText().getText();
		String exptText="Creating New Contact";
		Assert.assertEquals(actTextcontact, exptText);
		Reporter.log("Creating contact successfully", true);
		
		/*Create object of FileLib*/
		
		WebDriverCommonUtils.implicitelyWait();
		
		String data =	flb.getExcelData("Sheet1",1,3);
		Reporter.log("Inpudata driven from excell", true);
			
		/*Create CreatecOntact pagefactorycalss and put lastname*/
		
			CreateContact createCon=PageFactory.initElements(driver, CreateContact.class);
			
			/*Input lastname in editbox*/
			createCon.getLastname().sendKeys(data);
			Reporter.log("Input Lastname successfully", true);
			
			WebDriverCommonUtils.implicitelyWait();
			
			createCon.getRadioUser().click();
			Reporter.log("Click on radiobutton successfully ", true);
			WebDriverCommonUtils.implicitelyWait();
			boolean radiouser=createCon.getRadioUser().isSelected();
			
			if(radiouser==true)
			{
				WebDriverCommonUtils.select(createCon.getDropDown(), " Administrator");
				Reporter.log("Putting data in dropdown successfully", true);
			}
			else
			{
				WebDriverCommonUtils.select(createCon.getDropDown(),"Marketing Group" );
			}
			
			/*Click save Button*/
			createCon.getSaveButton();
			Reporter.log("Save successfully",true);
			System.out.println("asdadasdadggfhasd");
			
			/*Validation of new contact is dispalyed*/
			/*String exptNewContact="Contact Information";
			String actNewContactinfo=createCon.getContactInfoText().getText();
			String actnewContact=exptNewContact.concat(actNewContactinfo);
			assertEquals(exptNewContact, actnewContact);
			Reporter.log("Newcontact validation successfully", true);*/
		
		
	
	
		
	}

}
