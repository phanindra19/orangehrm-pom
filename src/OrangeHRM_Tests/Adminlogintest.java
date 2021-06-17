package OrangeHRM_Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import OrangeHRM.Pages.AdminHomePage;
import OrangeHRM.Pages.Loginpage;
import Utils.Apputils;

public class Adminlogintest extends Apputils
{
@Test
	public void checkAdminlogin()
	{
		Loginpage lp=PageFactory.initElements(driver, Loginpage.class);
		lp.adminLogin("Admin", "Qedge123!@#");
		AdminHomePage ahome=PageFactory.initElements(driver, AdminHomePage.class);
		ahome.logout();
	}
	
}
