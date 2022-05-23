package Implementations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium444 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALTAFH\\eclipse-workspace\\SeleniumWorkout\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		String title = driver.getTitle();
		if("Selenium".equals(title)) {
			System.out.println("test matched");
		}
		else {
			System.out.println("test not matched");
		}
		driver.quit();
	}
	
	
	
}
