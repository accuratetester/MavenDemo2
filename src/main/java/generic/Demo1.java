package generic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 
{
	public static void main(String[] args) throws InterruptedException
    {
    	
    	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
    	FirefoxDriver f = new FirefoxDriver();        
    	Thread.sleep(2000);
    	f.close();
    	
    }
	
}
