import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getposition {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
 driver.get("https://www.myntra.com");
 Point point = driver.manage().window().getPosition();
 int x = point.getX();
 int y = point.getY();
System.out.println("x="+x);
System.out.println("y="+y);
	}

}
