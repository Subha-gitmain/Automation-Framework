package com.CRMVTiger.ObjectReposetary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

	
@FindBy(name="user_name")	
private WebElement userNameEdit;

@FindBy(name="user_password")
private WebElement passwordEdit;

@FindBy(id="submitButton")
private WebElement loginButton;

/*Gettrs are used for read access*/

public WebElement getUserNameEdit() {
	return userNameEdit;
}

public WebElement getPasswordEdit() {
	return passwordEdit;
}

public WebElement getLoginButton() {
	return loginButton;
}

/*Login method*/
public void loginToApp(String userName,String passWord)
{
userNameEdit.sendKeys(userName);
passwordEdit.sendKeys(passWord);
loginButton.click();
}



}
