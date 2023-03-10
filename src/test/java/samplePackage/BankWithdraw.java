package samplePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BankWithdraw {
	
	@Test
	public void selectValue() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer");
		
	    WebElement selectName = driver.findElement(By.id("userSelect"));
		Select selectobj = new  Select (selectName);
		selectobj.selectByVisibleText("Harry Potter");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//button[@ng-click='deposit()']")).click();
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("10000");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		driver.findElement(By.xpath("//button[@ng-click='withdrawl()']")).click();
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1200");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String message= driver.findElement(By.xpath("//span[@ng-show='message']")).getText();
		System.out.println(message);
		
		
		if (message.equalsIgnoreCase("Transaction Successful")) {
			System.out.println("Balance amount is decreases after withdraw");
		} else {
			System.out.println("Balance amount is not decreases after withdraw");
		}
		
		
		}
}
		
		 





