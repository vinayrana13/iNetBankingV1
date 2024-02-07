package TestCases;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccount;
import org.testng.annotations.Test;

public class TC_RemoveProductFromWishlist_007 extends BaseClass {
    @Test
    public void removeItemFromWishlist() throws InterruptedException {
        logger.info("TC_RemoveProductFromWishlist_007 execution started");

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
        logger.info("User Successfully Logged in");
        HomePage homePage = new HomePage(driver);
        lp.clickOnDropdown();
        logger.info("Clicked on dropdown button");
        lp.clickOnMyAccount();
        logger.info("Clicked on On My Account");
        MyAccount myAccount = new MyAccount(driver);
        myAccount.clickOnMyWishList();
        logger.info("Clicked on My Wish List");
        homePage.removeItemFromWishlist();
        logger.info("Removed item from Wish List");
        homePage.verifyProductRemovedFromWishlist();
        logger.info("Verified product was successfully removed from wish list");
        logger.info("TC_RemoveProductFromWishlist_007 execution Completed");
    }
}
