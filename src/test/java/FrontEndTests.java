import dataProvider.ConfigFileReader;
import org.openqa.selenium.firefox.FirefoxDriver;
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

        String browser = System.getProperty("browser", "chrome");
        configFileReader = new ConfigFileReader();

        if (browser.contains("chrome")) {
            WebDriverManager.chromedriver().setup();
            pWebDriver = new ChromeDriver();
            pWebDriver.manage().window().maximize();
        } else{
            System.out.println("You must specify a browsers");
        }

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
       pWebDriver.quit();
    }
}
