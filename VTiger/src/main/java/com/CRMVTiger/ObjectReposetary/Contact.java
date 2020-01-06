package com.CRMVTiger.ObjectReposetary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contact {
	

	
	@FindBy(xpath="//a[text()='Contact Id']")
	private WebElement ContactId;
	
	@FindBy(xpath="//a[text()='First Name']")
	private WebElement FirstName;
	
	@FindBy(xpath="//a[text()='Last Name']")
	private WebElement LastName;
	
	@FindBy(xpath="//a[text()='Title']")
	private WebElement Title;
	
	@FindBy(xpath="//td[text()='Organization Name']")
	private WebElement OrganizationName;
	
	@FindBy(xpath="//a[text()='Email']")
	private WebElement Email;
	
	@FindBy(xpath="//a[text()='Office Phone']")
	private WebElement OfficePhone;
	
	@FindBy(xpath="//a[text()='Assigned To']")
	private WebElement AssignedTo;
	
	@FindBy(xpath="//td[text()='Action']")
	private WebElement Action;
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement addButton;
	
	@FindBy(xpath="//span[text()='Creating New Contact']")
	private WebElement createContactText;
	
	/*Getters Method*/
	
	public WebElement getContactId() {
		return ContactId;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getTitle() {
		return Title;
	}

	public WebElement getOrganizationName() {
		return OrganizationName;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getOfficePhone() {
		return OfficePhone;
	}

	public WebElement getAssignedTo() {
		return AssignedTo;
	}

	public WebElement getAction() {
		return Action;
	}
	
	
	
	/**/
	
	public WebElement getAddButton() {
		return addButton;
	}

	public WebElement getcreateContactText() {
		return createContactText;
	}

	public void attributeValidatation()
	{
		boolean b1=ContactId.isDisplayed();
		boolean b2=FirstName.isDisplayed();
		boolean b3=LastName.isDisplayed();
		boolean b4=Title.isDisplayed();
		boolean b5=OrganizationName.isDisplayed();
		boolean b6=Email.isDisplayed();
		boolean b7=OfficePhone.isDisplayed();
		boolean b8=AssignedTo.isDisplayed();
		boolean b9=Action.isDisplayed();
		if(b1==true&&b2==true&&b3==true&&b4==true&&b6==true&&b7==true&&b8==true&&b5==true&&b9==true)
		{
			System.out.println("All datas of conatct are present");
		}
		else
			System.out.println("All datas of contact are not present");
	}
	


}
