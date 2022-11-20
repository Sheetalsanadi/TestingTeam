import org.openqa.selenium.firefox.FirefoxDriver;

public class tester3 {

	private static Object expectedUrl;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
    FirefoxDriver driver = new FirefoxDriver();
    driver.get("https://www.myntra.com");
    
     String expectedurl = "Online Shopping for Women, Men, Kids Fashion &amp; Lifestyle - Myntra";
      String actualurl = driver.getCurrentUrl();
      
      System.out.println("expectedurl="+expectedurl);
      System.out.println("actualurl="+actualurl);
      
	if(actualurl.equals(expectedUrl))  { 
			System.out.println("pass:: login page is displayed");  
	} else
	{
			System.out.println("fail:: login page is displayed");
	driver.close();
	}
	}
}
