package Implementations;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutomation {
	WebDriver driver;
	WebElement search;
	
	public GoogleAutomation()
	{
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	public void loadUrl()
	{
		//driver.get("http://www.google.com/")
		driver.navigate().to("http://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
	}
	
	public void getTitle()
	{
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
	
	public void clickImages() throws InterruptedException
	{
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(3000);
	}
	
	public void moveBack() throws InterruptedException
	{
	driver.navigate().back();
	Thread.sleep(3000);
	}
	
	public void checkImage()
	{
		System.out.println("Google Logo displayed?? "+driver.findElement(By.id("hplogo")).isDisplayed());
	}
	
	public void moveForward()
	{
		driver.navigate().forward();	
	}
	
	public void searchText() 
	{
		search=driver.findElement(By.name("q"));
		search.sendKeys("Capgemini India");
		search.submit();
	}
	
	public void findAnchors()
	{
		List<WebElement>list=driver.findElements(By.tagName("a"));
		Iterator<WebElement>it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		
		
	}

}
