package myPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LaunchBrowser {
    public static void main(String[] args) {
        /*System.setProperty("webdriver.chrome.driver","C:\\Users\\vinay\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();*/
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://demo.guru99.com/v3/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10000,TimeUnit.SECONDS);
        String title=driver.getTitle();

        System.out.println(title);
    }
}
