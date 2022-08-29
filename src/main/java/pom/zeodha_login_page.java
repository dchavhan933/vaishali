package pom;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class zeodha_login_page {
	@FindBy (xpath="//input[@id='userid']") private WebElement userid;
	@FindBy (xpath="//input[@id='password']") private WebElement password;
	@FindBy (xpath="//button[@type='submit']") private WebElement login;
	@FindBy (xpath="//a[@href='/forgot']") private WebElement forgot;
	@FindBy (xpath="//p[@class='text-xsmall open-account']") private WebElement newacc;
	@FindBy (xpath="//input[@id='pin']") private WebElement pin;
	@FindBy (xpath="//button[@type='submit']") private WebElement submit;
		
	public  zeodha_login_page(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
public void setid(String value) {
	userid.sendKeys(value);
}
public void setpass(String value) {
	password.sendKeys(value);
}
public void clicklogin() {
	login.click();
	
}
public void clickoncreatenew_acc() {
	newacc.click();
	
}
public void setpin(String value) {
	pin.sendKeys(value);
}
public void clickonsubmit() {
	submit.click();
}
public void clickonforget() {
	forgot.click();
}
public void switchtomethod(WebDriver driver) {
	Set<String> window=driver.getWindowHandles();
	//Iterator<String> it=window.iterator();
	//while(it.hasNext()) {
		//String a=it.next();
	for(String str:window) {
		
		driver.switchTo().window(str).getTitle();
		if(str.equals("Forgot password / Kite")) 
		{
			break;
		}
	}
}
}
