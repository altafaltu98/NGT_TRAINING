package Implementations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AmazonFeatureTests {

	ChromeDriver driver;
	
	@BeforeClass
	public void invokebrowser() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALTAFH\\eclipse-workspace\\SeleniumFirstProject1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://amazon.com");
		
	}
	@Test(priority=500)
	public void verifyTitleOfThePage() {
		
		String expectedTitle="Amazon.com. Spend less. Smile more.";
		String actualTitle;
		
		actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority=100)
	public void searchProduct() {
		String productItem="Apple watch";
		String category = "Electronics";
		
		WebElement selDropDown = driver.findElement(By.id("searchDropdownBox"));
		Select selCategory = new Select(selDropDown);
		selCategory.selectByVisibleText(category);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productItem);
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		
		
	}
	@Test(priority=200)
	public void getNthproduct() {
		int productItemNumber = 4;
		String xpathExpression= String.format("//div[@data-component-type='s-search-result'][%d]", productItemNumber);
		WebElement nthproduct = driver.findElement(By.xpath(xpathExpression));
		String nthproductResult = nthproduct.getText();
		System.out.println(nthproductResult);
	}
	@Test(priority=300, enabled = false)
	public void getAllProducts() {
		
		List<WebElement> allProducts = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
		String productResult;
		for(WebElement product : allProducts) {
			
			productResult = product.getText();
			System.out.println(productResult);
			System.out.println("----------------------------------------");
		}
	}
	@Test(priority=400)
	public void searchAllProductsViaScrollDown() {

		List<WebElement> allProducts = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
		String productResult;
		Actions action = new Actions(driver);
		for(WebElement product : allProducts) {
			action.moveToElement(product).build().perform();
		
			
			productResult = product.getText();
			System.out.println(productResult);
			System.out.println("----------------------------------------");
		}
		
	}
	
	@AfterClass
	public void closebrowser() {
		
		driver.quit();
		
		
	}
}
