package page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Testp_Adminlogin {

	
	@FindBy(linkText = "Admin Login")
    public WebElement adminLoginLink;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameField;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordField;

    @FindBy(xpath = "//*[@id='root']/div/div/div/form/button")
    public WebElement loginButton;
}


