package tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.ExcelData;
import pages.LoginPage;

public class InvalidLoginTest extends BaseTest
{
     @Test(priority=2)
     public void testInvalidLogin() throws InterruptedException
     {
    	 String loginTitle = ExcelData.getData(file_path,"TC01",1,2);
    	 String expectedErrorMessage = ExcelData.getData(file_path,"TC02",1,2);
    	 
    	 LoginPage lp = new LoginPage(driver);
    	 
    	 //Verify login page
    	 lp.verifyTitle(loginTitle);
    	 
    	 int rc = ExcelData.getRowCount(file_path,"TC02");
    	 for(int i=1;i<=rc;i++)
    	 {
    		 String user = ExcelData.getData(file_path, "TC02",i,0);
    		 String pass = ExcelData.getData(file_path, "TC02",i,1);
    		 
    		 //Enter invalid username
    		 Reporter.log("Invalid username"+user,true);
    		 lp.enterUserName(user);
    		 
    		 //Enter invalid password
    		 Reporter.log("Invalid password"+pass,true);
    		 lp.enterPassword(pass);
    		 
    		 //Click on login button
    		 lp.clickOnLogin();
    		 Thread.sleep(1000);
    		 
    		 //Verify error message
    		 String actualErrorMessage = lp.verifyErrorMessage();
    		 
    		 Reporter.log("Actual error message"+actualErrorMessage,true);
    		 Reporter.log("Expected Error message"+expectedErrorMessage,true);
    		 
    		 Reporter.log("Error message is matching....",true);
    		 Reporter.log("-------------------------------",true);
    	 }
     }
	
}
