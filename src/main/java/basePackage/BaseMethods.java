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
    public String getAttribute(By pLocator, String pAttribute){
        return pDriver.findElement(pLocator).getAttribute(pAttribute);
    }

    public String getTextByAttribute(By pLocator, String pAttribute){
        return pDriver.findElement(pLocator).getAttribute(pAttribute);
    }

    public String GetText(By pLocator){
        return pDriver.findElement(pLocator).getText();
    }





    public void SwitchToTab(int pTab){
        ArrayList<String> pTabs = new ArrayList<>(pDriver.getWindowHandles());
        pDriver.switchTo().window(pTabs.get(pTab));
    }


    public void MoveToElement(By pLocator){
        Actions pActions = new Actions(pDriver);
        WebElement vLocator = pDriver.findElement(pLocator);
        pActions.moveToElement(vLocator).perform();
    }


    public void SendActionsKeysEnter(By pLocator){
        pDriver.findElement(pLocator).sendKeys(Keys.ENTER);
    }

    public void OpenTabJS() {
        JavascriptExecutor js = (JavascriptExecutor)pDriver;
        for (int i = 0; i <4 ; i++) {
            js.executeScript("window.open()");
        }
    }

    public void ClickByJavaScript(By pLocator){
        WebElement vLocator = pDriver.findElement(pLocator);
        JavascriptExecutor pExecutor = (JavascriptExecutor) pDriver;
        pExecutor.executeScript("arguments[0].click();", vLocator);
    }

    //Verify if an element is selected or not
    public boolean IsSelected(By pLocator){
        return pDriver.findElement(pLocator).isSelected();
    }

    public void GoBack(){
        pDriver.navigate().back();
    }

    public void GoToUrl(String pUrl){
        pDriver.get(pUrl);
    }

    public void CloseTab(){
        pDriver.close();
    }


}
