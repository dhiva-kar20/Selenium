package samplePackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Courses {
	@Test
	
	public void printCorseDetails() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		driver.get("https://oceanacademy.co.in/");
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//div[@id='root']/div[1]/div")).click();
		
		WebElement courses = driver.findElement(By.id("courses"));
		Actions actionObj = new Actions(driver);
		actionObj.moveToElement(courses).perform();
		
		WebElement offlineCourses = driver.findElement(By.xpath("//a[text()='Offline Courses']"));
		actionObj.moveToElement(offlineCourses).click().build().perform();
		
		String firstCourseName = driver.findElement(By.xpath("(//p[@class='title'])[1]")).getText();
		System.out.println(firstCourseName);
		
		System.out.println("~~~~~~~~~~");
		List<WebElement> courseNameList = driver.findElements(By.xpath("//p[@class='title']"));
		for (WebElement indiCourse : courseNameList) {
			System.out.println(indiCourse.getText());
		}
	
}

}






