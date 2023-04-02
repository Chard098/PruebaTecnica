import PageObjectsPackage.GooglePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class uiTests {
    public WebDriver pWebDriver = null;
    @BeforeTest
    public void SetUp(){
        WebDriverManager.chromedriver().setup();
        pWebDriver = new ChromeDriver();
        pWebDriver.manage().window().maximize();
    }
    @Test
    public void PositiveScenario(){
        pWebDriver.get("https://www.google.com/");
        GooglePage pGooglePage = new GooglePage(pWebDriver);
        pGooglePage.TestCase_1();
    }
    @AfterTest
    public void TearDown(){
        //pDriver.quit();
    }
}
