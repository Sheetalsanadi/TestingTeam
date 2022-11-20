import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class getwindows {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.nakuri.com/");
	Set<String> allwindowsid = driver.getWindowHandles();
	System.out.println(allwindowsid);
	Thread.sleep(1000);
	for( String windowsid:allwindowsid) {
	System.out.println(windowsid);

	}
	}
}
