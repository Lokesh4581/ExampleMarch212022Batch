package com.sgtesting.pom.copy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogOutDemo {
	
      public static WebDriver oBrowser=null;
      public static ActiTimePage opage=null;
	public static void main(String[] args) {
		launchbrowser1();
		navigate();
		login();
		minimizeflyoutwindow();
		 logout();
		 closeapplication();
		
		
		

	}

	
	
	private static void launchbrowser1()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\Manual Software Testing\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			opage=new  ActiTimePage(oBrowser);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(1000);
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			opage. getUserName().sendKeys("admin");
			Thread.sleep(1000);
			opage.getPassword().sendKeys("manager");
			Thread.sleep(1000);
			opage.getLogin().click();
			Thread.sleep(1000);
			
			
		}
		 catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeflyoutwindow()
	{
		try
		{
			 opage.getId().click();
			Thread.sleep(1000);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}


	
	private static void logout()
	{
		try
		{
			opage. Logout().click();
			Thread.sleep(1000);
			
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	  
	private static void closeapplication()
	{
		try
		{
			oBrowser.quit();
			Thread.sleep(1000);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
