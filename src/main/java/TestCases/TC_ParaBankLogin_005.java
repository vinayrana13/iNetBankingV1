package TestCases;

import PageObjects.paraBankLogin;
import org.testng.annotations.Test;

public class TC_ParaBankLogin_005 extends BaseClass{
    @Test
    public void paraBankLogin() throws InterruptedException {
        paraBankLogin pbl=new paraBankLogin(driver);
        pbl.enterUsername();
        Thread.sleep(3000);
    }

}
