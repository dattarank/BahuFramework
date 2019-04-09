package page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage {
	@FindBy(id="username")
	private WebElement unBox;
	@FindBy(name="pwd")
	private WebElement pwBox;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement btn;
	
	public void login(String un, String pw) {
		unBox.sendKeys(un);
		pwBox.sendKeys(pw);
		btn.click();
	}

}
