package zerodha_automation;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.ReportStats;

import pojo.browser;
import pom.Zerodha_Dashboard;
import pom.zeodha_login_page;
import utility.basetest;
import utility.extentReports;
import utility.parametrization;

@Listeners(utility.listener.class)



public class Zerodha_Dashboard_test_buyandsell extends basetest {
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
	
	@BeforeMethod
	public void  loginwithvaliddata() throws EncryptedDocumentException, IOException, InterruptedException {
		driver=browser.openbrowser();
	test=abc.createTest("loginwithvaliddata");
		zeodha_login_page pageobjectloginpage=new zeodha_login_page(driver);
		pageobjectloginpage.setid(parametrization.getdata("Sheet2", 0, 1));
		pageobjectloginpage.setpass(parametrization.getdata("Sheet2", 1, 1));
		pageobjectloginpage.clicklogin();
		Thread.sleep(3000);
		pageobjectloginpage.setpin(parametrization.getdata("Sheet2", 2, 1));
		pageobjectloginpage.clickonsubmit();
		
	}
	@Test
	public void searchstockname () throws InterruptedException{
		Zerodha_Dashboard zerodhadashboard= new Zerodha_Dashboard(driver);
		
		zerodhadashboard.clickonsearch("TATA", driver);
		
		zerodhadashboard.searchandselectdesiredstock(driver,"TATAPOWER");
		zerodhadashboard.clickonsell();

		zerodhadashboard.clickonmarket();
		zerodhadashboard.setqty("10000");
		//Assert.assertTrue(false);
		//zerodhadashboard.clickonchart();
		//zerodhadashboard.clickonmarketdepth();
		//zerodhadashboard.clickonbuy();
	}
	
	

}
