package Implementations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckboxesRadioButtonsDropdownsTablesCalendars {



	public static void main(String[] args)  {



		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALTAFH\\eclipse-workspace\\SeleniumFirstProject1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);



		driver.get("https://trytestingthis.netlify.app/");
		driver.findElement(By.id("fname")).sendKeys("Altaf");
		driver.findElement(By.id("lname")).sendKeys("Hussen");

		//selecting the radio button

		driver.findElement(By.id("male")).click();

		//selecting option from the dropdown

		WebElement element1 = driver.findElement(By.id("option"));
		Select dropdown = new Select(element1);
		dropdown.selectByValue("option 3");

		//selecting multiple options from the drop down

		WebElement element2 = driver.findElement(By.name("Optionwithcheck[]"));
		Select multipleOptions = new Select(element2);
		multipleOptions.selectByValue("option 1");
		multipleOptions.selectByValue("option 2");


		//SELECTING THE OPTION USING CHECKBOX
		WebElement checkbox1 = driver.findElement(By.name("option1"));
		checkbox1.click();

		//datalist
		
		driver.findElement(By.xpath("//body/div[3]/div[2]/form[1]/fieldset[1]/input[9]")).sendKeys("Banana");

		//calendar

		driver.findElement(By.id("day")).sendKeys("20052022");
		
		Select dropOptions1 = new Select(driver.findElement(By.id("option"))) ;
		List<WebElement> allOptions = dropOptions1.getOptions();
		driver.findElement(By.id("option"));
		
		for(WebElement option : allOptions) {
			System.out.println(option.getText());
			if(option.getText().equalsIgnoreCase("option 2"))
				option.click();
		

			//Thread.sleep(2000);

		}
	}
}
