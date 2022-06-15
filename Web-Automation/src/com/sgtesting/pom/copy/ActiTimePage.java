package com.sgtesting.pom.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {

	public   ActiTimePage(WebDriver oBrowser)
	{
	   PageFactory.initElements(oBrowser,this);	

	}
	//usernametextfield
	private WebElement username;
	public WebElement getUserName()

	{
		return username;
	}
	//getpassword
	private WebElement pwd;
	public WebElement getPassword()

	{
		return pwd;
	}
	
	
	//loginBottonField
	     @FindBy(xpath="//*[@id=\"loginButton\"]/div")
		private WebElement oLogin;
		public WebElement getLogin()
		{
			return oLogin;
		}
		
		
		private WebElement gettingStartedShortcutsPanelId;
		public WebElement getId()
		{
			return  gettingStartedShortcutsPanelId;
		}
	
		 @FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")	
		private WebElement createuser;
		public WebElement getuser()
		{
			return  createuser;
		}
	
		@FindBy(xpath="//*[@id=\"createUserDiv\"]/div/div[2]")
		private WebElement adduser1;
		public WebElement getadduser1()
		{
			return  adduser1;
		}
		private WebElement firstName;
		public WebElement getfn()
		{
			return  firstName;
		}
		
		private WebElement lastName;
		public WebElement getln()
		{
			return  lastName;
		}
		
		private WebElement email;
		public WebElement getemail()
		{
			return  email;
		}
		
		private WebElement userDataLightBox_usernameField;
		public WebElement getuserid()
		{
			return  username;
		}
		
		private WebElement password;
		public WebElement getpw()
		{
			return  password;
		}
		
		private WebElement passwordCopy;
		public WebElement getrpw()
		{
			return  passwordCopy;
		}
		
		@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
		private WebElement set;
		public WebElement getset()
		{
			return  set;
		}
		
		@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[2]")
		private WebElement select;
		public WebElement getselect()
		{
			return  select;
		}
		
		private WebElement userDataLightBox_deleteBtn;
		public WebElement getuid()
		{
			return   userDataLightBox_deleteBtn;
		
		}
		
	
		private WebElement logoutLink;
		public WebElement Logout()
		{
			return logoutLink;
		}
		
		
}
