package additional;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class table2 {
	public static void main(String[] args) {
		double a = 0;
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> currentprice=driver.findElements(By.xpath("//table[1]//tbody[1]//tr//td[4]"));
		double max=1000000;
		for(int i=1;i<currentprice.size(); i++) {
			WebElement column=	currentprice.get(i);
			String price=column.getText();
			double value=Double.parseDouble(price);
			if(value==Math.min(value, max)) {
			
			 max=value;
			}
		
		}
	
System.out.println("max current price:"+max);	
}
}
