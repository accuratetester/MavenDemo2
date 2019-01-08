package tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;

import generic.ExcelData;

import pages.EnterTimeTrackPage;
import pages.LoginPage;

public class ValidLoginLogoutTest extends BaseTest
{
      @Test(priority=1)
      public void testValidLoginLogout()
      {
    	  String user = ExcelData.getData(file_path, "TC01",1,0);
    	  String pass = ExcelData.getData(file_path, "TC01",1,1);
    	  String loginTitle = ExcelData.getData(file_path, "TC01",1,2);
    	  
    	  String enterTimeTrackTitle = ExcelData.getData(file_path, "TC01",1,3);
    	  
    	  LoginPage lp = new LoginPage(driver);
    	  EnterTimeTrackPage ep = new EnterTimeTrackPage(driver);
    	  
    	  //Verify login page
    	  lp.verifyPage(loginTitle);
    	  
    	  //Enter valid username
    	  Reporter.log("Valid Username"+user,true);
    	  lp.enterUserName(user);
    	  
    	  //Enter valid password
    	  Reporter.log("Valid password"+pass,true);
    	  lp.enterPassword(pass);
    	  
    	  //Click on login
    	  lp.clickOnLogin();
    	  
    	  //Verify actiTime - Enter Time-Track page
    	  lp.verifyPage(enterTimeTrackTitle);
    	  
    	  //click on logout
    	  ep.clickOnLogout();
    	  
    	  //Verify login page
    	  lp.verifyTitle(loginTitle);
    	  
      }
}
