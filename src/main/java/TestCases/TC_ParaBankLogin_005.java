package TestCases;

import PageObjects.ParaBankLogin;
import org.testng.annotations.Test;

public class TC_ParaBankLogin_005 extends BaseClass{


    @Test
    public void login() {
        ParaBankLogin pbl = new ParaBankLogin(driver);
        pbl.enterUsername(paraUsername);
        pbl.enterPassword(paraPassword);
        pbl.clickLogin();
        pbl.verifyLogin();
    }

}
