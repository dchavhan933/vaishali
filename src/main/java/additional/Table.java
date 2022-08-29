package additional;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pojo.browser;

public class Table {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://demo.guru99.com/test/web-table-element.php");
	List<WebElement> headings=driver.findElements(By.xpath("//table//thead//th"));
	for(WebElement head:headings) {
		System.out.println(head.getText());
	}
	}

}
