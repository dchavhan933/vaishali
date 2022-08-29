package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodha_Forgetpassword {
	@FindBy(xpath="(//label[contains(text(),'I remember my user ID')]") private WebElement usid;
	@FindBy(xpath="//label[contains(text(),'I forgot my user ID')]") private WebElement forgetid;
	@FindBy(xpath="(//input[@required='required'])[1]") private WebElement email;
	@FindBy(xpath="(//input[@required='required'])[2]") private WebElement pan;
	@FindBy(xpath="(//label[contains(text(),'E-mail')])[1]]") private WebElement radioemail;
	@FindBy(xpath="//label[contains(text(),'SMS')]") private WebElement sms;
	@FindBy(xpath="//*[@id=\"container\"]/div/div/form/div[5]/div/img") private WebElement captcha;
	@FindBy(xpath="//span[@class='icon icon-reload']") private WebElement reload;
	@FindBy(xpath="(// input[@type='text'])[3]") private WebElement capatchinput;
	@FindBy(xpath="//a[text='Back to login']") private WebElement backtologin;
	
	public Zerodha_Forgetpassword(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
		
	}
	public void clickusid() {
		usid.click();
	}
	public void clickforgetid() {
		forgetid.click();
	}
	public void setpan(String value) {
		pan.sendKeys(value);
	}
	public void setemail(String value) {
		email.sendKeys(value);
	}
	public void clickradioemail() {
		radioemail.click();
	}
	public void clicksms() {
		sms.click();
		
	}
	public void clickreload() {
		reload.click();
		
	}
	public void clickonbacktologib() {
		backtologin.click();
	
	}
	
}
