package Implementations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonlyUsedCommands {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALTAFH\\eclipse-workspace\\SeleniumFirstProject1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.navigate().to("http://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		//driver.getPageSource();
		//System.out.println(driver.getPageSource());
	}

}
