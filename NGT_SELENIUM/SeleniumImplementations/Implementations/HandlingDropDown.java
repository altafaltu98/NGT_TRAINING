package Implementations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALTAFH\\eclipse-workspace\\SeleniumFirstProject1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);



		driver.get("https://trytestingthis.netlify.app/");
		Select dropOptions1 = new Select(driver.findElement(By.id("option"))) ;
		List<WebElement> allOptions = dropOptions1.getOptions();
		driver.findElement(By.id("option"));
		
		for(WebElement option : allOptions) {
			System.out.println(option.getText());
			if(option.getText().equalsIgnoreCase("option 2"))
				option.click();
	}

}
}
