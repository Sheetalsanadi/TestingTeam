package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testingqa {
	static String mainurl = "https://demoqa.com/";
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","./src/test/resource/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(mainurl);
	Thread.sleep(2000);
	boolean lineqa = driver.findElement(By.xpath("//a[@target='_blank']")).isDisplayed();
	if (lineqa==true) {
		System.out.println("pass-line is present in the page");
	} else {
		System.out.println("fail-line is present in the page");
	}
	if(driver.findElement(By.xpath("//h5[text()='Widgets']")).isDisplayed()) {
		System.out.println("yes-is displayed");
	}else {
	System.out.println("no-is not displayed");                                                           
			
	}
	
	
	
}
}
