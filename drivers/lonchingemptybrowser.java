import org.openqa.selenium.chrome.ChromeDriver;

public class lonchingemptybrowser {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.quit();

}
}
