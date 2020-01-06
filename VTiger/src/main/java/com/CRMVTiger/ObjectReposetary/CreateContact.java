package com.CRMVTiger.ObjectReposetary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateContact {
	

	
	@FindBy(name="lastname")
	private WebElement lastname;
	
	@FindBy(xpath="//input [@type='radio' and @value='U']")
	private WebElement radioUser;
	
	@FindBy(xpath="//input [@type='radio' and @value='U']")
	private WebElement radioGroup;
	
	@FindBy(name="assigned_user_id")
	private WebElement dropDown;
	
	@FindBy(xpath="//input[@class='crmbutton small save']")
	private WebElement saveButton;
	
	@FindBy(xpath="//span[contains(text(),'Contact Information')]")
	private WebElement contactInfoText;

	/*getters methods*/
	
	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getRadioUser() {
		return radioUser;
	}

	public WebElement getRadioGroup() {
		return radioGroup;
	}

	public WebElement getDropDown() {
		return dropDown;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getContactInfoText() {
		return contactInfoText;
	}
	
	

	
	



}
