package com.crm.BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.crm.FileUtility.FileUtilitys;
import com.crm.Pom.VtigerLogin;

public class BaseClass1 {

	public  WebDriver driver;
	
	
	@BeforeClass
	
	public void precondiion() throws IOException
	{
		String url=FileUtilitys.propertiesRead("url");
		String browser=FileUtilitys.propertiesRead("browser");
		if(browser.equals("chrome")) {
		 driver=new ChromeDriver();
		}
		else if(browser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	}
		
	@BeforeMethod
	
	public void login() throws IOException
	{
		
		VtigerLogin logins=new VtigerLogin(driver);
		logins.getUsername();
		logins.getPassword();
		logins.getLogin();
	}
	
	@AfterMethod
	
	public void logout()
	{
		System.out.println("execute");
	}
	@AfterClass
	
	public void postcondition()
	{
		//driver.();
	}
	
	
}
