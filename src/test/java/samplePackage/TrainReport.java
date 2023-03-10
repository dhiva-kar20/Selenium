package samplePackage;

import java.io.ObjectInputFilter.Status;

import javax.print.attribute.standard.Media;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TrainReport extends BrowserLaunch {
	
public void WebTablesWorking() throws InterruptedException {
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter(
				"./reports/TestReport" + System.currentTimeMillis() + ".html");

		extent.attachReporter(spark);

		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Automation report");

		ExtentTest test = extent.createTest("Rail search");
		test.assignAuthor("Anand");
		test.assignCategory("RegrssionTesting");
		test.assignCategory("SmokeTesting");

		boolean testResult = true;
				
		navigateToUrl("https://erail.in/");
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("SCT",Keys.TAB);
		
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("MS",Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		Thread.sleep(5000);
		List<WebElement> trainList = driver.findElements(By.xpath("//table[contains(@class,'DataTable TrainList')]//tr"));
		int rowCount = trainList.size();
		System.out.println(rowCount);
		System.out.println("``````");
		for(int i=2;i<=rowCount;i++) {
			String trainName = driver.findElement(By.xpath("//table[contains(@class,'DataTable TrainList')]//tr["+i+"]/td[1]/a")).getText();
			System.out.println(trainName);
		}	
		
		if (rowCount != 4) {
			testResult = false;
		}
		
		Media snap = MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot()).build();

		if (testResult == true) {
			test.log(Status.PASS, "train count displayed correctly", snap);
		} else {
			test.log(Status.FAIL, "train count displayed correctly", snap);

		}
		extent.flush();
		
	}

}
		}

}
