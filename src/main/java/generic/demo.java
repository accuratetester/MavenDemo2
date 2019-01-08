package generic;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class demo {
    public static void main(String[] args) throws InterruptedException
    {
    	
    	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
    	FirefoxDriver f = new FirefoxDriver();        
    	Thread.sleep(2000);
    	f.close();
    	
    }
	
	/*public static void main(String[] args) throws InterruptedException
    {
    	
    	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    	ChromeDriver c = new ChromeDriver();
    	Thread.sleep(2000);
    	c.close();
    	
    }*/
	
	/*
	 * public static void main(String[] args) throws InterruptedException {
	 * 
	 * System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
	 * InternetExplorerDriver ie = new InternetExplorerDriver(); Thread.sleep(2000);
	 * ie.close();
	 * 
	 * }
	 */
	
}
