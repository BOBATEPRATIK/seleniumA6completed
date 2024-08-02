package com.crm.Pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.FileUtility.FileUtilitys;

public class VtigerLogin {
	public VtigerLogin(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}
	private @FindBy(xpath ="//input[@name='user_name']")
	WebElement username;
	
	
	private @FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	private @FindBy(xpath="//input[@type='submit']")
	WebElement login_click;
	
//	private @FindBy(xpath ="//a[text()='Organizations']" )
//	WebElement Organization;

	public void getUsername() throws IOException {
		
		String user=FileUtilitys.propertiesRead("username");
		 username.sendKeys(user);
	}

	public void getPassword() throws IOException {
		String user=FileUtilitys.propertiesRead("password");
		password.sendKeys(user);
	}

	public void getLogin() {
		login_click.click();
	}

//	public void getOrganization()
//	{
//		Organization.click();
//	}

}
