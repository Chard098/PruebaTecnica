package basePackage;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

public class BaseMethods {
    public WebDriver pDriver;

    public BaseMethods(WebDriver driver){
        this.pDriver = driver;
    }

    public void submitForm(By pLocator){
       pDriver.findElement(pLocator).submit();
    }


    public boolean isVisible(By pLocator) {
        return pDriver.findElement(pLocator).isDisplayed();
    }

    public void ScrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) pDriver;
        js.executeScript("window.scrollBy(0,6000)");
    }

    public void containsText(){

    }

    public void writeText(String inputText, By pLocator){
        pDriver.findElement(pLocator).sendKeys(inputText);
    }
    public void clickElement(By pLocator){
        pDriver.findElement(pLocator).click();
    }

    public String getUrl(){
        return pDriver.getCurrentUrl();
    }
}
