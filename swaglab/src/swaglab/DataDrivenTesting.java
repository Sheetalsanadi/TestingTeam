package swaglab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataDrivenTesting {
	static String browser = "Firefox";
	static WebDriver driver;
	public static void main(String[] args) throws Throwable {

		switch (browser) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		default:
			break;
		}
		FileInputStream fin = new FileInputStream("./testData/Selenium.properties");
		Properties pobj = new Properties();
		pobj.load(fin);
		driver.get(pobj.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("user-name")).sendKeys(pobj.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(pobj.getProperty("password"));
		driver.findElement(By.id("login-button")).click();

	}
}
