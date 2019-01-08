package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class HelpPage extends BasePage
{
	//Declaration
	@FindBy(xpath="(//div[@class='popup_menu_label'])[3]")
	private WebElement helpDDMenu;
	
	@FindBy(xpath="//a[.='About your actiTIME']")
	private WebElement aboutActiTimeMenu;
	
	@FindBy(xpath="//span[contains(.,'build')]")
	private WebElement buildnumber;
	
	//public WebDriver driver;
	
	//Initialzation
	public HelpPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public String helpMenu()
	{
		verifyElement(helpDDMenu);
		String help = helpDDMenu.getText();
		return help;
	}
	
	public void clickOnHelp(WebDriver driver)
	{
		Actions a = new Actions(driver);
		a.moveToElement(helpDDMenu).build().perform();
		a.moveToElement(aboutActiTimeMenu).build().perform();				
	}
	
	public String verifyBuildNumber()
	{
		verifyElement(buildnumber);
		String abuildnumber = buildnumber.getText();
		return abuildnumber;
	}

}
