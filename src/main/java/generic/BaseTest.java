package generic;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest implements AutoConstant
{
     static
     {
    	 System.setProperty(chrome_key, chrome_value);
    	 System.setProperty(gecko_key, gecko_value);
     }
     
     public WebDriver driver;
     //@Parameters({"nodeurl","appurl","browser"})
     @BeforeMethod
     //uncomment this whenexecuting scripts from testng in eclipse
     public void preCondition() throws MalformedURLException
     //public void preCondition(String nodeurl,String appurl,String browser) throws MalformedURLException
     {
    	 
    	 //To specify the URL of the node
    	 //URL url = new URL("http://localhost:4444/wd/hub");
    	  //URL url = new URL(nodeurl);
    	 
    	 
    	 //To specify the browser configurations
    	 DesiredCapabilities dc = new DesiredCapabilities();
    	 //dc.setBrowserName("chrome");
    	 //dc.setBrowserName(browser);
         
    	 //To execute the framework in remote/node system
    	 //driver = new RemoteWebDriver(url,dc);
    	 
    	 //Uncomment the below when running automation locally and not on node/hub
    	 driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	 
    	 driver.manage().deleteAllCookies();
    	 
    	 driver.get("https://demo.actitime.com/login.do");   //uncomment when running from testng in eclipse
    	 //driver.get(appurl);
     }
     
     @AfterMethod
     public void postCondition(ITestResult res)
     {
    	 int status = res.getStatus();
    	 
    	 if(status==2)
    	 {
    		 String name = res.getName();    		 
    		 //GenericUtils.getScreenShot(driver,name);
    		 GenericUtils.getScreenShot(driver,name);
    	 }
    	 driver.quit();
     }
}
