package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseMethods{


    public HomePage(WebDriver rdriver) {
        super(rdriver);
    }
    @FindBy(xpath="//a[@class='block-promo home-pants']//img")
    WebElement imgShopPants;

    @FindBy(xpath = "//img[@alt='Sahara Leggings']")
    WebElement imgLeggins;

    @FindBy(xpath="//span[text()='Add to Wish List']")
    WebElement lblAddToWishlist;

    @FindBy(xpath = "//div[contains(text(),'add')]")
    WebElement txtAddedToWishList;

    @FindBy(xpath="//div[@class='actions-secondary']/a")
    WebElement btnRemoveItem;

    @FindBy(xpath = "//div[contains(text(),'removed')]")
    WebElement lblRemovedFromWishlist;

    @FindBy(xpath = "/html/body/div[2]/main/div[2]/div[1]/form/div[1]/ol/li/div/a/span/span/img")
    WebElement iamgeOnWishList;

    @FindBy(xpath = "//a[contains(text(),'mai')]")
    WebElement lnkSubscribeToMailList;


    public void clickOnLegings(){
        clickOn(imgLeggins);
    }
    public void clickOnImagePants(){
        clickOn(imgShopPants);
    }
    public void clickOnAddToWishList(){
        clickOn(lblAddToWishlist);
    }
    public void verifyProductAddedToWishList(){
        isElementDisplayed(txtAddedToWishList);
    }
    public void removeItemFromWishlist(){
        clickOn(btnRemoveItem);
    }
    public void verifyProductRemovedFromWishlist(){
        isElementDisplayed(lblRemovedFromWishlist);
    }
    public void clickOnSubscribeOurMailingList(){
        clickOn(lnkSubscribeToMailList);
    }
}
