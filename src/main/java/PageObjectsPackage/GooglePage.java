package PageObjectsPackage;

import BasePackage.BaseMethods;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// page_url = https://www.google.com/
public class GooglePage extends BaseMethods {
    public GooglePage(WebDriver driver) {
        super(driver);
    }
   // By btnSearch = By.cssSelector("input[type=submit]");
    By searchBar  = By.name("q");
    By focusServices = By.xpath("//h3[contains(text(),'Focus Services – Beyond Expectations')]");
    public void MakeGoogleSearch(){
        WriteText("Focus Services", searchBar);
        SubmitForm(searchBar);

        if (IsVisible(focusServices)){
            System.out.println("Web page is visible");
            ClickElement(focusServices);
        }else{
            System.out.println("The web element does not exists");
        }
    }
}