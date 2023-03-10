package samplePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ecommerce {
	@Test
	
	public void addFunctionality() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = (RemoteWebDriver) new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		 driver.manage().window().maximize();
		driver.get(" https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
		driver.findElement(By.id("input-firstname")).sendKeys("Dhivakar");
		driver.findElement(By.id("input-lastname")).sendKeys("G");
		driver.findElement(By.id("input-email")).sendKeys("dhivakar@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("7708847295");
		
		driver.findElement(By.id("input-password")).sendKeys("dhivakar");
		driver.findElement(By.id("input-confirm")).sendKeys("dhivakar");
		
		driver.findElement(By.xpath("//label[@for='input-newsletter-no']")).click();
		driver.findElement(By.xpath("//label[@for='input-agree']")).click();
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@value='Continue']")).click();
}

	

}
