import org.openqa.selenium.chrome.ChromeDriver;

public class tester4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		String actultext = "Facebook helps you connect and share with the people in your life.";
		  String pagesr = driver.getPageSource();
		  
		  if(pagesr.contains(actultext))  { 
			System.out.println("pass:: text is prent");  
	} else
	{
			System.out.println("text not prent");
		
	}
	}
}
