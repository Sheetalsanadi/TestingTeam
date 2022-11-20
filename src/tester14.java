import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class tester14 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		Set<String> allwindowids = driver.getWindowHandles();
		for(String windowid :allwindowids) {
       driver.switchTo().window(windowid);
       System.out.println(driver.getTitle());
       System.out.println(driver.getCurrentUrl());
	}
}
}
