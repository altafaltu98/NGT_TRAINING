package Implementations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class GoogleSearch {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement search =driver.findElement(By.name("q"));
		search.click();
		driver.manage().window().maximize();
		search.sendKeys("youtube");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		WebElement searchutube = driver.findElement(By.partialLinkText("YouTube"));
		searchutube.click();
		Thread.sleep(3000);
		WebElement searchtube = driver.findElement(By.name("search_query"));
		searchtube.click();
		Thread.sleep(3000);
	    searchtube.sendKeys("toofan kgf kannada");
	    driver.findElement(By.id("search-icon-legacy")).click();
	    searchtube.sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    
	   driver.findElement(By.partialLinkText("Toofan Lyrical(Kannada) | KGF Chapter 2 | RockingStar Yash")).click();
	    
	    //driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]")).click();/html/body
	    
		
	
		
		//*[@id="rso"]/div[1]/div/div/div/div/div/div/div[1]/a/h3
		 
	}

	
}
