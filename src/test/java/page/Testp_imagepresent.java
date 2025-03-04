package page;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Testp_imagepresent {

	@FindBy(xpath="//img")
	public List<WebElement>ktigImages;
}
