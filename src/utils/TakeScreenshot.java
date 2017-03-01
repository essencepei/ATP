package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot {

	public WebDriver driver;

	private void takeScreenshot(String screenPath) {
		try {
			File scrFile = ((TakesScreenshot) driver)
					.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(screenPath));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void takeScreenshot() {
		String screenName = new TimeString().getTimeString() + ".jpg";
		File dir = new File("test-output/snapshot");
		if (!dir.exists())
			dir.mkdirs();
		String screenPath = dir.getAbsolutePath() + "/" + screenName;
		this.takeScreenshot(screenPath);
//		Log.comment(screenName, true, true);
	}

}
