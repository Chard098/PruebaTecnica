package PageObjectsPackage;

import BasePackage.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// page_url = https://www.google.com/
public class GooglePage extends BaseMethods {
    public GooglePage(WebDriver driver) {
        super(driver);
    }
   // By btnSearch = By.cssSelector("input[type=submit]");
    By searchBar  = By.name("q");
    public void TestCase_1(){
        WriteText("Focus Services", searchBar);
        SubmitForm(searchBar);

    }
}