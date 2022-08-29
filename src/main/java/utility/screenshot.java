package utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	public static void takesscreenshot(WebDriver driver, String name) throws IOException {
		String date=screenshot.getdate();
		TakesScreenshot tc=((TakesScreenshot)driver);
		File source=tc.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Devang\\eclipse-workspace\\zerodha_automation\\Screenshot\\"+name+""+date+".png");
		FileHandler.copy(source, destination);
		
		
		
	}
	public static String getdate() {
		DateTimeFormatter dev=DateTimeFormatter.ofPattern("yyyy-MMM-dd HH-mm-ss");
		LocalDateTime currenttime=LocalDateTime.now();
		String a=dev.format(currenttime);
		return a;
	}

}
