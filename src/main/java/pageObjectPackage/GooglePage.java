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
   // By btnSearch = By.cssSelector("input[type=submit]");
    By searchBar  = By.name("q");
    By focusServices = By.xpath("//h3[contains(text(),'Focus Services – Beyond Expectations')]");
    public void MakeGoogleSearch(){
        writeText("Focus Services", searchBar);
        submitForm(searchBar);

        if (isVisible(focusServices)){
            System.out.println("Web page is visible");
            clickElement(focusServices);
        }else{
            System.out.println("The web element does not exists");
        }

        prop.setProperty("urlFocusServices", getUrl());

        System.out.println(prop.getProperty("urlFocusServices"));
    }
}