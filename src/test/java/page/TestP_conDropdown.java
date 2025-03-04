package page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class TestP_conDropdown {

	


	    @FindBy(xpath = "//input[@name='name']")
	    public WebElement nameField;

	    @FindBy(xpath = "//input[@name='phone']")
	    public WebElement phoneField;

	    @FindBy(xpath = "//input[@name='email']")
	    public WebElement emailField;

	    @FindBy(xpath = "//select[@name='service']")
	    public WebElement serviceDropdown;

	    @FindBy(xpath = "//input[@name='subject']")
	    public WebElement subjectField;

	    @FindBy(xpath = "//select[@name='business']")
	    public WebElement businessDropdown;

	    @FindBy(xpath = "//button[contains(text(),'Submit')]")
	    public WebElement submitButton;
	}

