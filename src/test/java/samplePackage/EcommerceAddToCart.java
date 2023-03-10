package samplePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EcommerceAddToCart {
	
	@Test
	
	public void addToCart() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = (RemoteWebDriver) new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		 driver.manage().window().maximize();
		driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
		

		WebElement MegaMenu = driver.findElement(By.xpath("//*[@id=\"widget-navbar-217834\"]/ul/li[4]"));
		Actions actionObj = new Actions(driver);
		actionObj.moveToElement(MegaMenu).perform();
		

		WebElement Apple = driver.findElement(By.xpath("//*[@id=\"entry281_216477\"]/div/div/ul/li[1]/a"));
		actionObj.moveToElement(Apple).click().build().perform();
		
		driver.findElement(By.id("input-limit-212433")).sendKeys("100");

		 driver.findElement(By.xpath("//*[@id=\"entry_212439\"]/div/div[2]")).click();
		
		 driver.findElement(By.id("entry_216842")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//*[@id=\"notification-box-top\"]/div/div[2]/div[2]/div[1]/a")).click();
		 driver.findElement(By.xpath("(//td[@class='text-left'])/div/input")).clear();
		 driver.findElement(By.xpath("(//td[@class='text-left'])/div/input")).sendKeys("4");
		 
		 driver.findElement(By.xpath("//i[@class='fas fa-sync-alt']")).click();
		
		 String price = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[6]")).getText();
		 System.out.println(price);

	     if(price.equalsIgnoreCase("$728.00")){
	    	 System.out.println("correct price");
	     }else {
	    	 System.out.println("wrong price");
	     }
	
	     driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary']")).click();
	     driver.findElement(By.xpath("//label[@for='input-account-login']")).click();
	     driver.findElement(By.id("input-login-email")).sendKeys("dhivakar@gmail.com");
	     driver.findElement(By.id("input-login-password")).sendKeys("dhivakar");
	     driver.findElement(By.id("button-login")).click();
	     Thread.sleep(4000);
	     driver.findElement(By.id("input-payment-firstname")).sendKeys("Dhivakar");
	     driver.findElement(By.id("input-payment-lastname")).sendKeys("G");
	     driver.findElement(By.id("input-payment-address-1")).sendKeys("No.16,Church street,Ariyankuppam");
	     driver.findElement(By.id("input-payment-city")).sendKeys("Puducherry");
	     driver.findElement(By.id("input-payment-postcode")).sendKeys("605007");
	     driver.findElement(By.id("input-payment-country")).click();
	     driver.findElement(By.xpath("//option[@value='99']")).click();
	     driver.findElement(By.id("input-payment-zone")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//option[@value='1503']")).click();
	     
	     driver.findElement(By.id("input-comment")).sendKeys("send the product fastly");
	     driver.findElement(By.xpath("//label[@for='input-agree']")).click();
	     driver.findElement(By.id("button-save")).click();
	     
	}
}
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	
		
	
	
