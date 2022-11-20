package pom;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage {
	@FindBy(id="username")
	private WebElement usernametextfield;
	
	@FindBy(name="pwd")
	private WebElement passwordfield;
	
	@FindBy(id="loginbutton")
	private WebElement loginButton;
	
	@FindBy(id="remebercheckbox")
	private WebElement remembercheckbox;

	public WebElement getUsernametextfield() {
		return usernametextfield;
	}

	public WebElement getPasswordfield() {
		return passwordfield;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getRemembercheckbox() {
		return remembercheckbox;
	}
	
	

}
