package com.cg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Automate_End_to_End_Buy_Order_functionality {

	ChromeDriver driver;

@Test	
public void invokebrowser() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALTAFH\\eclipse-workspace\\SeleniumFirstProject1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//1.Open the site
		driver.get("http://automationpractice.com/index.php");
		System.out.println("title is: "+driver.getTitle());
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//2.Login to the site
		driver.findElement(By.xpath("//*[@class='login']")).click();  
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//"//*[@class='login']"
		
		//3.
		WebElement ele =  driver.findElement(By.xpath("//*[@title='Women']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("//*[@title='T-shirts']")).click();
		
		
		
		
		
		
		//5. Mouse hover on the second product displayed.
		WebElement product = driver.findElement(By.xpath("//*[@title='Faded Short Sleeve T-shirts']"));
		act.moveToElement(product).perform();
		 driver.findElement(By.linkText("More")).click();
		 driver.findElement(By.xpath("//*[@class='btn btn-default button-plus product_quantity_up']")).click();
		 driver.findElementByXPath("//*[@class='selector']").click();
		 
		 WebElement element = driver.findElementByXPath("//select[@id='group_1']");
		 Select sel = new Select(element);
		 sel.selectByValue("3");
		 
		 driver.findElementByXPath("//a[@id='color_13']");
		 driver.findElementByXPath("//button[@name='Submit']").click();
		 driver.findElementByLinkText("Proceed to checkout").click();
		 driver.quit();
		 
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}





	
}
