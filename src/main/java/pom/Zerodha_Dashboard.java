package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zerodha_Dashboard {
	@FindBy (xpath="//input[@type='text']")private WebElement search;
	@FindBy (xpath="//span[@class='tradingsymbol']")private List<WebElement> searchresult;
	@FindBy (xpath="//button[contains(text(),'B')]") private WebElement buy;
	@FindBy (xpath="//button[contains(text(),'S')]") private WebElement sell;
	@FindBy (xpath="//label[contains(text(),'Market')]") private WebElement market;
	@FindBy (xpath="(//input[@type='number'])[1]")private WebElement addqty;
	@FindBy (xpath="//label[contains(text(),'Limit')]") private WebElement limit;
	@FindBy (xpath="(//button[@data-balloon='Chart'])[1]") private WebElement chart;
	@FindBy (xpath="(//button[@data-balloon='Market depth widget'])[1]") private WebElement marketdepth;
	@FindBy (xpath="(//button[@class='button-outline button-grey'])[1]") private WebElement added;

			
	
	public Zerodha_Dashboard(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public void clickonbuy() {
		buy.click();
	}
	public void clickonmarketdepth() {
		marketdepth.click();
	}
	public void clickonadded() {
		added.click();
	}
	
	public void clickonsell() {
		sell.click();
	}
	public void clickonmarket() {
		market.click();
	}
	public void clickonsearch(String value,WebDriver driver) throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.visibilityOf(search));
	search.sendKeys(value);
	}
	public void clickonchart(){		
		chart.click();
	}
	public void setqty(String a) {
		addqty.sendKeys(a);
	}
	
	public void searchandselectdesiredstock(WebDriver driver,String ele) {
		for(WebElement stocks:searchresult) {
			String name=stocks.getText();
			if(name.equals(ele)) {
				Actions act= new Actions(driver);
				act.moveToElement(stocks).perform();
				break;
			}
			
		}
		
	}
	
	

}
