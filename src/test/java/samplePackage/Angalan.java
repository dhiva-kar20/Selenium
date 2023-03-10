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

public class Angalan {
	@Test
	

	public void AddFunctionality() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = (RemoteWebDriver) new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		 driver.manage().window().maximize();
		driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
		
		WebElement  MyAccount = driver.findElement(By.xpath("(//li[@class='nav-item dropdown dropdown-hoverable'])[2]/a/div/span"));
		Actions actionObj = new Actions(driver);
		actionObj.moveToElement(MyAccount).perform();
		 WebElement  Login = driver.findElement(By.xpath("//div[@id='entry_217834']/nav/div/ul/li[6]/ul/li[1]/a/div/span"));
		Actions actionObj1 = new Actions(driver);
		actionObj1.moveToElement(Login).click().build().perform();
		driver.findElement(By.id("input-email")).sendKeys("angalan001@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Angalan03");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		WebElement  MegaManu = driver.findElement(By.xpath("//div[@id='entry_217834']/nav/div/ul/li[4]/a/div/span"));
		Actions actionObj2 = new Actions(driver);
		actionObj2.moveToElement(MegaManu).perform();
		WebElement  Apple = driver.findElement(By.xpath("//ul[@class='nav flex-column vertical']/li[1]/a"));
		Actions actionObj3 = new Actions(driver);
		actionObj3.moveToElement(Apple).click().build().perform();
		
		WebElement userSelect = driver.findElement(By.id("input-limit-212433"));
	       Select SelectObj=new Select(userSelect);
	       SelectObj.selectByVisibleText("100");
	       
	       List<WebElement> courseNameList = driver.findElements(By.xpath("//a[@class='text-ellipsis-2']"));
			for (WebElement indiCourse : courseNameList) {
				System.out.println(indiCourse.getText());
			}
			
			WebElement Select = driver.findElement(By.id("input-sort-212434"));
		       Select SelectObj1=new Select(Select);
		       SelectObj1.selectByVisibleText("Price (Low > High)");
		       
		       String LowPrice = driver.findElement(By.xpath("//div[@class='product-thumb']/div[2]/div/span")).getText();
				System.out.println("Lowest Price :"+LowPrice);
				
				 String HighPrice = driver.findElement(By.xpath("(//div[@class='product-thumb'])[42]/div[2]/div/span")).getText();
					System.out.println("Highest Price :"+HighPrice);
}
	
	
}