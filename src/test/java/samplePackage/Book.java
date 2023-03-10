package samplePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Book {
	@Test
	
	
	public void selectsTag() {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		driver.get("https://testsheepnz.github.io/testing-ideas.html");
		driver.findElement(By.partialLinkText("Brian Eno's Oblique")).click();
		String titleName = driver.getTitle();
		System.out.println(titleName);
	}

}
