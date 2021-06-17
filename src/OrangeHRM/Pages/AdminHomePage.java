package OrangeHRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminHomePage 
{

	@FindBy(id="welcome")WebElement Welcomeelement;
	@FindBy(linkText="Logout")WebElement logout;
	
	public void logout()
	{
		Welcomeelement.click();
		logout.click();
	}
}
