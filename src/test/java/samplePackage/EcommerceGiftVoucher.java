package samplePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EcommerceGiftVoucher  {
	
	@Test
	
	public void addFunctionality() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = (RemoteWebDriver) new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		 driver.manage().window().maximize();
		driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
		
		WebElement Myaccount = driver.findElement(By.xpath("//*[@id=\"widget-navbar-217834\"]/ul/li[6]/a/div/span"));
		Actions actionObj = new Actions(driver);
		actionObj.moveToElement(Myaccount).perform();
		
		

		WebElement login = driver.findElement(By.xpath("//*[@id=\"widget-navbar-217834\"]/ul/li[6]/ul/li[1]/a"));
		actionObj.moveToElement(login).click().build().perform();
		
		 driver.findElement(By.id("input-email")).sendKeys("dhivakar@gmail.com");
	     driver.findElement(By.id("input-password")).sendKeys("dhivakar");
	     driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/form/input")).click();
		
	     WebElement MyaccountAgain = driver.findElement(By.xpath("//*[@id=\"widget-navbar-217834\"]/ul/li[6]/a/div/span"));
		 Actions actionObj2 = new Actions(driver);
		 actionObj2.moveToElement(MyaccountAgain).perform();
			
		 WebElement MyVoucher = driver.findElement(By.xpath("//*[@id=\"widget-navbar-217834\"]/ul/li[6]/ul/li[5]/a/div/span"));
		 actionObj.moveToElement(MyVoucher).click().build().perform();
			

		 String gift1 = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[5]/div/div[1]/label")).getText();
		 System.out.println(gift1);
		 
		 String gift2 = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[5]/div/div[2]/label")).getText();
		 System.out.println(gift2);
		 
		 String gift3 = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[5]/div/div[3]/label")).getText();
		 System.out.println(gift3);
		 
		 

		
	}
}
			
			
			
			
	
	


