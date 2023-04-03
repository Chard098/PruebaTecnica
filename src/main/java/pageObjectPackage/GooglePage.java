package pageObjectPackage;

import basePackage.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

// page_url = https://www.google.com/
public class GooglePage extends BaseMethods {
    Properties prop = new Properties();
    public GooglePage(WebDriver driver) {
        super(driver);
    }
    By searchBar  = By.name("q");
    By focusServices = By.partialLinkText("Focus Services – Beyond Expectations");

    public void MakeGoogleSearch(){
        writeText("Focus Services", searchBar);
        submitForm(searchBar);

        if (isVisible(focusServices)){
            System.out.println("Web page is visible");
            clickElement(focusServices);
        }else{
            System.out.println("The web element does not exists");
        }

    }
}