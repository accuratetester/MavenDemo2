package tests;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.BaseTest;

import generic.ExcelData;
import pages.LoginPage;

public class VerifyVersionTest extends BaseTest
{
	@Test(priority=3)
    public void testVerifyVersion()
    {
		String loginTitle = ExcelData.getData(file_path, "TC01",1,2);
		String expectedVersion = ExcelData.getData(file_path, "TC03",1,0);
		
		LoginPage lp = new LoginPage(driver);
		
		//Verify login page
		lp.verifyTitle(loginTitle);
		
		//Verify Version
		String actualVersion = lp.verifyVersion();
		
		Reporter.log("Actual Version"+actualVersion,true);
		Reporter.log("Expected Version"+expectedVersion,true);
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualVersion,expectedVersion);
		
		sa.assertAll();
		Reporter.log("Version is matching........",true);
		
    }
}
