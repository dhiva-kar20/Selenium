package samplePackage;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EcommerceApple {
	
	@Test
	
	public void addFunctionality() throws InterruptedException {
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
		
		

		WebElement userSelect = driver.findElement(By.id("input-limit-212433"));
	       Select SelectObj=new Select(userSelect);
	       SelectObj.selectByVisibleText("100");
	
		List<WebElement> productList = driver.findElements(By.xpath("//div[@class='caption']"));
		for (WebElement product : productList) {
			System.out.println(product.getText());
		}
		
		 WebElement selectName = driver.findElement(By.id("input-sort-212434"));
			Select selectobj = new  Select (selectName);
			selectobj.selectByVisibleText("Price (Low > High)");
			
			
			String LowPrice = driver.findElement(By.xpath("//div[@class='product-thumb']/div[2]/div/span")).getText();
			System.out.println("Lowest Price :"+LowPrice);
			
			 String HighPrice = driver.findElement(By.xpath("(//div[@class='product-thumb'])[42]/div[2]/div/span")).getText();
				System.out.println("Highest Price :"+HighPrice);
		
	}
}
	
		
		
		

	
	
	
	
	

	
	
	

