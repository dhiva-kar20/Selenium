package samplePackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class naukri  {
	
	@Test
	
	public void workingOnWindows() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
				
		String baseWindow = driver.getWindowHandle();
		System.out.println(baseWindow);	
		System.out.println("~~~~~~~");		
		driver.findElement(By.xpath("//span[@title='Remote']")).click();
		Set<String> windowNameList = driver.getWindowHandles();
		for (String winName : windowNameList) {
			Thread.sleep(5000);
			if(!winName.equalsIgnoreCase(baseWindow)) {
				System.out.println(winName);
				driver.switchTo().window(winName);			
			}
		}
		String value1 = driver.findElement(By.xpath("//div[@class='sortAndH1Cont']/div[1]/span")).getText();
		System.out.println(value1);
		
		String value2 = driver.findElement(By.xpath("//div[3]/label/p/span[2]")).getText();
		System.out.println(value2);
		
		String result1 =value1.substring(10);
		System.out.println(result1);
		
		String result2 =value2.substring(1,5);
		System.out.println(result2);
		
		
		
  
		
		if(result1.equals(result2)) {
		System.out.println("Both the values are equals");
	}else {
		System.out.println("Both the values are not equals");
	}
	
}

	
}

	
	
	
	
	
	