package PageObjectsPackage;

import BasePackage.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = https://www.focusservices.com/
public class FocusServicesPage extends BaseMethods {
    public FocusServicesPage(WebDriver driver) {
        super (driver);
    }

    public void InteractWithFocusServices(){
        ScrollDown();

    }
}