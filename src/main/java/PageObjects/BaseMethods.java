package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BaseMethods {

    WebDriver ldriver;

    public BaseMethods(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    public void clickOn(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) ldriver;
        jse.executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }
    public void typeInto(WebElement element, String value) {
        JavascriptExecutor jse = (JavascriptExecutor) ldriver;
        jse.executeScript("arguments[0].scrollIntoView(true);", element);
        element.sendKeys(value);
    }
    public void isElementDisplayed(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) ldriver;
        jse.executeScript("arguments[0].scrollIntoView(true);", element);
        element.isDisplayed();
    }

    public void mouseHoverTo(WebElement element){
        Actions actions = new Actions(ldriver);
        actions.moveToElement(element).build().perform();
    }

}
