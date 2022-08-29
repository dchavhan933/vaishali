package zerodha_automation;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pojo.browser;
import pom.zeodha_login_page;
import utility.parametrization;
import utility.screenshot;

public class loginpagetest {
	@Test
	
	public void validdata() throws InterruptedException, EncryptedDocumentException, IOException {
		WebDriver driver=browser.openbrowser();
		Thread.sleep(3000);
		zeodha_login_page pageobjectloginpage= new zeodha_login_page(driver);
	pageobjectloginpage.setid(parametrization.getdata("Sheet2", 0, 1));
	pageobjectloginpage.setpass(parametrization.getdata("Sheet2", 1, 1));
	pageobjectloginpage.clicklogin();
	Thread.sleep(3000);
	pageobjectloginpage.setpin(parametrization.getdata("Sheet2", 2, 1));
	pageobjectloginpage.clickonsubmit();
	
	}
}

