import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class tester17 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		
		Set<Cookie> allcokies = driver.manage().getCookies();
         for (Cookie Cookie :allcokies) {
        	 System.out.println(Cookie.getDomain()+"::"+Cookie.getName()+"::"+Cookie.getExpiry());
         }
	}

}
