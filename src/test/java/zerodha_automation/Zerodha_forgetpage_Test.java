package zerodha_automation;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.browser;
import pom.Zerodha_Forgetpassword;
import pom.zeodha_login_page;
import utility.extentReports;

public class Zerodha_forgetpage_Test {
	ExtentReports abc;
	 ExtentTest test ;
	
	@BeforeTest
	public void generatereports() {
		abc=extentReports.extentreports();
	}
	@AfterTest
	public void flushreports() {
	abc.flush();
	}
@AfterMethod
public void posttest(ITestResult result) {
	if(result.getStatus()==ITestResult.FAILURE ) {
		test.log(Status.FAIL,result.getName());
	}
	else if (result.getStatus()==ITestResult.SUCCESS ) {
		test.log(Status.PASS,result.getName());
	}
	else {
		test.log(Status.SKIP,result.getName());
	}
}
	@Test
	public void validdata() throws InterruptedException {
		test=abc.createTest("validdata");
		WebDriver driver=browser.openbrowser();
		Thread.sleep(3000);
		zeodha_login_page loginpage= new zeodha_login_page(driver);
		loginpage.clickonforget();
		Thread.sleep(5000);
		Zerodha_Forgetpassword forgettest=new Zerodha_Forgetpassword(driver);
		//forgettest.clickradioemail();
		forgettest.clickforgetid();
		forgettest.setpan("AZJQ12587");
		
		forgettest.clicksms();
		//forgettest.setemail("DCHAVHAN93");
		
		forgettest.clickreload();
	}

}
