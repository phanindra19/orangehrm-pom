package OrangeHRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage 
{

	//Define Elements
	@FindBy(id="txtUsername")WebElement uidelement;
	@FindBy(name="txtPassword")WebElement pwdelement;
	@FindBy(className="button")WebElement loginelement;
	
	//Define methods
	public void adminLogin(String uname,String pword)
	{
		uidelement.sendKeys(uname);
		pwdelement.sendKeys(pword);
		loginelement.click();
	}
	
}
