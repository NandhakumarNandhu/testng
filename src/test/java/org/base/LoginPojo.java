package org.base;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{
	
	
	public LoginPojo() {	
		
		PageFactory.initElements( driver,this);

		}
		
		@FindBy(id="email")
		
		private WebElement txtuser;
		
		public WebElement gettxtuser() {
			
			return txtuser;
			
		}
		@FindBy(id="pass")
		
		private WebElement txtpass;
		
		public WebElement gettxtpaass() {
			
			return txtpass;
			
		}
		@FindBy(name="login")
		
		private WebElement txtlogin;
		
		public WebElement gettxtlogin() {
			
			return txtlogin;
		}

}
