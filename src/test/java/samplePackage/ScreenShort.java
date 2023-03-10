package samplePackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

public class ScreenShort {
	
	public String captureScreenshot() {
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination2 = new File("./snaps/snap" + System.currentTimeMillis() + ".jpeg");
		String dest = destination2.getAbsolutePath();
		try {
			FileUtils.copyFile(source, destination2);
		} catch (IOException e) {
			System.out.println("Exception occured :: " + e);
		}
		return dest;
	}

}
