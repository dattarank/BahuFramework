package script;


import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;
import generic.BaseTest;
import page.LoginPage;

public class LoginTest extends BaseTest{
	
		@Test
		public void login1() {
			LoginPage lp=new LoginPage();
			PageFactory.initElements(driver, lp);
			lp.login("admin", "manager");
		
			
		}
		
		@Test
		public void login2() {
			LoginPage lp=new LoginPage();
			PageFactory.initElements(driver, lp);
			lp.login("admin", "danager");
	        
			
			
		}
		
}
