package swaglab;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class loginPagefacebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("sheetal");
		driver.findElement(By.name("lastname")).sendKeys("sanadi");
		driver.findElement(By.name("reg_email__")).sendKeys("sheetalsanadi07@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sheetalsanadi07@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("sheetal05");
		WebElement dayDropDown = driver.findElement(By.id("day"));
		Select select = new Select(dayDropDown);
		select.selectByValue("10");
		WebElement monthDropDown = driver.findElement(By.id("month"));
		Select Selectmonth= new Select(monthDropDown);
		Selectmonth.selectByValue("12");
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select Selectyear= new Select(yearDropDown);
		Selectyear.selectByValue("2016");
		WebElement selectsexRedioButton = driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/input[preceding-sibling::label[text()='Male']]"));
		selectsexRedioButton.click();
		//Actions action = new Actions(driver);
		//action.click(selectsexRedioButton);
		//Select sexRedioButton = new Select(selectsexRedioButton);
		//sexRedioButton.selectByValue("Male"); //
		//driver.findElement(By.xpath("/label[@for='u_3_4_hX']"));
		driver.findElement(By.name("websubmit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.id("email")).sendKeys("sheetalsanadi07@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sheetal05");
		driver.findElement(By.name("login")).click();

	} 
	
	
	
}

