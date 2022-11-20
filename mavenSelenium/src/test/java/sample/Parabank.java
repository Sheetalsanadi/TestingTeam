package sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parabank {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./src/test/resource/chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://parabank.parasoft.com/");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.findElement(By.linkText("Register")).click();
    	driver.findElement(By.id("customer.firstName")).sendKeys("sheetal");
    	driver.findElement(By.id("customer.lastName")).sendKeys("sanadis");
    	driver.findElement(By.id("customer.address.street")).sendKeys("Gotur");
    	driver.findElement(By.id("customer.address.city")).sendKeys("snk");
    	driver.findElement(By.id("customer.address.state")).sendKeys("karnataka");
    	driver.findElement(By.id("customer.address.zipCode")).sendKeys("591221");
    	driver.findElement(By.id("customer.phoneNumber")).sendKeys("9108814342");
    	driver.findElement(By.id("customer.ssn")).sendKeys("ddd");
    	driver.findElement(By.id("customer.username")).sendKeys("sheetalssanadi12");
    	driver.findElement(By.id("customer.password")).sendKeys("Sheetal@14341");
    	driver.findElement(By.id("repeatedPassword")).sendKeys("Sheetal@143412");
    	driver.findElement(By.className("button")).click();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.findElement(By.name("username")).sendKeys("sheetalssanadi12");
    	driver.findElement(By.name("password")).sendKeys("Sheetal@143412");
    	driver.findElement(By.xpath("//input[@type='submit']")).click();
    	driver.close();
}
}
