package TestCases;
import Utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    ReadConfig readConfig=new ReadConfig();

    public String url=readConfig.getApplicationURL();

    public String uname= readConfig.getUsername();
    public String pwd= readConfig.getPassword();
    public String pageTitle= readConfig.getPageTitle();

    public String url2=readConfig.getApplicationURL2();

    public static WebDriver driver;
    public static Logger logger;

   /* public static void main(String[] args) {
        System.out.println(uname);
    }*/
    @Parameters("browser")
    @BeforeClass
    public void setup(String br){

        logger=Logger.getLogger("ebanking");
        PropertyConfigurator.configure("log4j.properties");

        if(br.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(1000,TimeUnit.SECONDS);
            driver.get(url);
        } else if (br.equals("ie")) {
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(1000,TimeUnit.SECONDS);
            driver.get(url2);
        } else if (br.equals("chrome2")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(1000,TimeUnit.SECONDS);
            driver.get(url2);

        } else {
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }

    }
    @AfterClass
    public void teardown(){

        driver.quit();
    }
    public void captureScreen(WebDriver driver, String tname) throws IOException {
        TakesScreenshot ts= (TakesScreenshot) driver;
        File source=ts.getScreenshotAs(OutputType.FILE);
        File target=new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
        FileUtils.copyFile(source,target);
        System.out.println("Screenshot Taken");
    }

    public void switchToFrame(WebDriver driver){
        driver.switchTo().frame(1);
        driver.switchTo().defaultContent();
    }
    public String getText(WebDriver driver, String locator){
        WebElement element=driver.findElement(By.xpath(locator));
        String elementText=element.getText();
        System.out.println(elementText);
        return elementText;
    }

}
