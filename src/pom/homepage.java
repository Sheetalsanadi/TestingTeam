package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage {
     @FindBy(id="logoutlink")
     private WebElement logoutlink;
     
     @FindBy(linkText="users")
     private WebElement userslink;
     
     @FindBy(linkText="reports")
     private WebElement reportsink;

	public WebElement getLogoutlink() {
		return logoutlink;
	}

	public WebElement getUserslink() {
		return userslink;
	}

	public WebElement getReportsink() {
		return reportsink;
	}
     
     
}
