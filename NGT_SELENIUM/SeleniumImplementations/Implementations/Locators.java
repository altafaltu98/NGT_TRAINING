package Implementations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALTAFH\\eclipse-workspace\\SeleniumWorkout\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://stackoverflow.com/users/login");
		WebElement byid = driver.findElement(By.id("email"));
		byid.sendKeys("abcd@email.com");
		WebElement byname=driver.findElement(By.name("password"));
		byname.sendKeys("abcd123");
		driver.get("https://www.selenium.dev/");
		WebElement byclassname = driver.findElement(By.className("col-12"));
		
}

}
