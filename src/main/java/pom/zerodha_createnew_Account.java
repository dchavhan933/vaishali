package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class zerodha_createnew_Account {
	@FindBy (xpath="//input[@id='user_mobile']") private WebElement mobile;
	@FindBy (xpath="//button[@id='open_account_proceed_form']") private WebElement conti;
	@FindBy (xpath="//a[text()='Want to open an NRI account?']") private WebElement nriaccount;
	@FindBy (xpath="//div[@id='menu_btn']") private WebElement menu;
	@FindBy (xpath="//a[text()='Support']") private WebElement support;
	@FindBy (xpath="//a[text()='Pricing']") private WebElement pricing;
	@FindBy (xpath="//a[text()='Products']") private WebElement products;
	@FindBy (xpath="//a[text()='About']") private WebElement about;
	@FindBy (xpath="//a[text()='Signup']") private WebElement signup;
	



	
	
}
