package TestCases;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import org.testng.annotations.Test;
import java.io.IOException;

public class TC_AddProductToWishList_006 extends BaseClass{
@Test
    public void addProductToWishlist() throws InterruptedException {
        logger.info("TC_AddProductToWishList_006 execution started");

        logger.info("Navigated to the requested URL");
        LoginPage lp = new LoginPage(driver);
        lp.setUserName(uname);
        logger.info("Entered the Username");
        lp.setPassword(pwd);
        logger.info("Entered the Password");
        lp.clickSubmit();
        logger.info("Clicked on Submit");
        System.out.println(driver.getTitle());
        lp.verifyAccountInfo();
    logger.info("User was successfully logged in");
        HomePage homePage = new HomePage(driver);
        homePage.clickOnImagePants();
        logger.info("CLiked on Pants");
        homePage.clickOnLegings();
        logger.info("Clicked on Legings Image");
        homePage.clickOnAddToWishList();
        logger.info("Clicked on Add to Wish List");
        homePage.verifyProductAddedToWishList();
        logger.info("Verified Product added to Wishlist");
        logger.info("TC_AddProductToWishList_006 execution completed");

    }
}
