package Implementations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoAlertPresentException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;

import org.openqa.selenium.WebDriver;

public class HandlingAlertsPopUps {
	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALTAFH\\eclipse-workspace\\SeleniumFirstProject1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	        
	        // Alert Message handling
	                    		
	        driver.get("http://demo.guru99.com/test/delete_customer.php");			
	                            		
	     	      	
	        driver.findElement(By.name("cusid")).sendKeys("53920");					
	        driver.findElement(By.name("submit")).submit();			
	        		
	        // Switching to Alert        
	        Alert alert = driver.switchTo().alert();		
	        		
	        // Capturing alert message.    
	        String alertMessage= driver.switchTo().alert().getText();		
	        		
	        // Displaying alert message		
	        System.out.println(alertMessage);	
	        Thread.sleep(5000);
	        		
	        // Accepting alert		
	        alert.accept();		
	    }	
	}


