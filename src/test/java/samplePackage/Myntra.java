package samplePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {
	@Test
	
	public void shoesDetails() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		

		WebElement men = driver.findElement(By.xpath("//a[@data-group='men']"));
		Actions actionObj = new Actions(driver);
		actionObj.moveToElement(men).perform();
		
		WebElement casualShoes = driver.findElement(By.xpath("//a[@data-reactid='94']"));
		actionObj.moveToElement(casualShoes).click().build().perform();
		
		driver.findElement(By.xpath("(//label[@class='vertical-filters-label common-customCheckbox'])[2]")).click();;
		driver.findElement(By.xpath("(//label[@class='common-customCheckbox vertical-filters-label'])[4]")).click();;
		Thread.sleep(2000);

		String value = driver.findElement(By.xpath("(//div[@class='filter-summary-filter'])[2]")).getText();
		System.out.println(value);

		
		
		
		
		
		
		
		
		
	}
}
	
