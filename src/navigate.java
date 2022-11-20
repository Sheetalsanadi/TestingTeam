import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();	
          driver.get("https://www.google.com");
          driver.get("https://www.myntra.com");
         
       Navigation Navigation = driver.navigate();
       
       Navigation.back();
       Navigation.forward();
       Navigation.refresh();
       driver.quit();
       
       
	}

}

