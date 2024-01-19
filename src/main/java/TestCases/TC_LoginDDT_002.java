package TestCases;

import PageObjects.LoginPage;
import Utilities.XLUtils;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_LoginDDT_002 extends BaseClass{
    @Test(dataProvider ="LoginData")
    public void loginDDT(String user, String pwd) throws InterruptedException {
        LoginPage lp =new LoginPage(driver);

        lp.setUserName(user);

        logger.info("Username is provided");
        lp.setPassword(pwd);
        logger.info("Password is provided");
        lp.clickSubmit();


        if(isAlertPresent()==true){
            Assert.assertTrue(false);
            logger.warn("Login Failed");
            driver.switchTo().alert().accept();
            driver.switchTo().defaultContent();


        }
        else
        {
            Assert.assertTrue(true);
            logger.info("Login Passed");

            lp.clickLogout();

            driver.switchTo().alert().accept();
            driver.switchTo().defaultContent();
        }
    }

    public boolean isAlertPresent(){
        try{
        driver.switchTo().alert();
        return true;
        }
        catch (NoAlertPresentException e){
            return false;
        }
    }

    @DataProvider(name="LoginData")

    String[][] getData() throws IOException {
        String path="E:\\Vinay\\Java Programs\\My_Java_Programs\\My_App\\src\\main\\java\\TestData\\LoginData.xlsx";
        int rownum= XLUtils.getRowCount(path,"Sheet1");
        int colnum=XLUtils.getCellCount(path,"Sheet1",1);
        String logindata[][]=new String[rownum][colnum];


        for (int i=1;i<=rownum;i++){
            for (int j=0;j<colnum;j++){
                logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1",i,j);
            }
        }
        return logindata;
    }
}
