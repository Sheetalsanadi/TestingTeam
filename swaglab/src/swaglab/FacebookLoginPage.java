package swaglab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class FacebookLoginPage {
	static String url = "https://www.facebook.com/";
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	WebElement usernametextfield = driver.findElement(By.id("email"));
	WebElement password = driver.findElement(By.id("passContainer"));
	int usernamegettext = usernametextfield.getLocation().getX();
	int passwordtext = password.getLocation().getX();
	System.out.println(usernamegettext);
	System.out.println(passwordtext);
	if (usernamegettext==passwordtext) {
		System.out.println("Both textfield size same");
	} else {
		System.out.println("Both textfield size not same");
	}
	WebElement loginButton = driver.findElement(By.name("login"));
	String loginButtonColor = loginButton.getCssValue("background-color");
	Color color = Color.fromString(loginButtonColor);
	System.out.println(color.asHex());

}
}
