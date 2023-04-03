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
    By btnNorthAmerica = By.xpath("//span[contains(text(),'North America')]");
    By btnCentralAmerica = By.xpath("//span[contains(text(),'Central America')]");
    By optionElSalvador = By.xpath("//b[contains(text(),'San Salvador, El Salvador')]");
    By optionNicaragua = By.xpath("//b[contains(text(),'Managua, Nicaragua')]");
    By btnAsia = By.xpath("//span[contains(text(),'Asia')]");
    By txtPhilippines = By.xpath("//b[contains(text(),'Bacolod City, Philippines')]");

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

        if(isVisible(btnNorthAmerica)){
            System.out.println("North america is visible");
        }else {
            System.out.println("They're not visible");
        }

        //Click on the Central America Option
        clickElement(btnCentralAmerica);

        if (isVisible(optionElSalvador) && isVisible(optionNicaragua)){
            System.out.println("El Salvador & Nicaragua are displayed");
        }

        //Click on the Asia option
        clickElement(btnAsia);

        if (isVisible(txtPhilippines)) {
            System.out.println("It is visible");
        }else {
            System.out.println("It is not visible");
        }
    }
}