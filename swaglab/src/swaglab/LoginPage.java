package swaglab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		System.out.println("step1= application launched successfully");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		System.out.println("step2= application lagged successfully");
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		String loginPageSource = driver.getPageSource();
		String expeted = "Checkout: Your Information";
		if (loginPageSource.contains(expeted)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		WebElement firstNameTextField = driver.findElement(By.id("first-name"));
		String firstNameTextFieldPlaceHolder = firstNameTextField.getAttribute("placeholder");
		if (firstNameTextFieldPlaceHolder.isEmpty()) {
			System.out.println("no");
		} else {
			System.out.println("yes");
			

		}
		String exptedPlaceHolder = "First Name";
if (firstNameTextFieldPlaceHolder.equals(exptedPlaceHolder)) {
System.out.println("yes1");	 
} else {
System.out.println("no1");
}

firstNameTextField.sendKeys("sheetal");
		driver.findElement(By.id("last-name")).sendKeys("sanadi"); 
		driver.findElement(By.id("postal-code")).sendKeys("591221");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.id("finish")).click();

	}
}
