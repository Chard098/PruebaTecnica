import dataProvider.ConfigFileReader;
import pageObjectPackage.FocusServicesPage;
import pageObjectPackage.GooglePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Properties;

public class FrontEndTests {
    public WebDriver pWebDriver = null;
    ConfigFileReader configFileReader;
    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        pWebDriver = new ChromeDriver();
        pWebDriver.manage().window().maximize();
        configFileReader = new ConfigFileReader();

    }
    @Test (priority = 1)
    public void googleTestCase(){
        pWebDriver.get(configFileReader.getGoogleUrl());
        GooglePage pGooglePage = new GooglePage(pWebDriver);
        pGooglePage.MakeGoogleSearch();

    }

    @Test (priority = 2)
    public void focusTestCase(){
        pWebDriver.get(configFileReader.getFocusServicesUrl());
        FocusServicesPage focusServicesPage = new FocusServicesPage(pWebDriver);
        focusServicesPage.InteractWithFocusServices();
    }
    @AfterTest
    public void tearDown(){
       // pWebDriver.quit();
    }
}
