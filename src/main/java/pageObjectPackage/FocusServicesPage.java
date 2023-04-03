package pageObjectPackage;

import basePackage.BaseMethods;
import dataProvider.ConfigFileReader;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

// page_url = https://www.focusservices.com/
public class FocusServicesPage extends BaseMethods {
    public FocusServicesPage(WebDriver driver) {
        super (driver);
    }
    ConfigFileReader configFileReader = new ConfigFileReader();
    By btnNowHiring = By.xpath("//span[contains(text(),'Now Hiring!')]");
    By btnLocationsTab = By.xpath("//span[contains(text(),'Locations')]");
    public void InteractWithFocusServices(){
        //Scrolling down to reach page footer
        ScrollDown();

        //Click on the Now Hiring button located in the page footer
        clickElement(btnNowHiring);

        //We do an assert to verify if we are in the Now Hiring page
        Assert.assertEquals(configFileReader.getHiringUrl(), getUrl());

        //Click on the Locations tab option
        clickElement(btnLocationsTab);

        Assert.assertEquals(configFileReader.getLocationUrl(), getUrl());

    }
}