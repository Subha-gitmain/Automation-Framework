package com.CRMVTiger.GenericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.CRMVTiger.GenericLib.BaseClass;

public class WebDriverCommonUtils {
	

	
	/*Implicitly wait*/
	public static void implicitelyWait()
	{
		BaseClass.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	/*Explicitly wait*/
	
	public static void explicitlyWait(WebElement element)
	{
		
		WebDriverWait wait=new WebDriverWait(BaseClass.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	
	/*Select Class*/
	
	public static void select(WebElement element,int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
		
	}
	
	public static void select(WebElement element,String data)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(data);
	}
	
	/*Action class*/
	
	
	public static void action(WebElement element)
	{
		Actions act=new Actions(BaseClass.driver);
		act.moveToElement(element).perform();
	}
	
	/*Alert popup*/
	
	public static String alertPopupGetText()
	{
		String data=BaseClass.driver.switchTo().alert().getText();
		
		return data;
	}
	
	public static void alertPopupAccept()
	{
		BaseClass.driver.switchTo().alert().accept();
	}

	

	

	


}
