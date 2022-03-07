package Base;

import Utility.PropertyFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SharedData {

    public WebDriver driver;

    public void setUp(){
        PropertyFile driverResource = new PropertyFile("/DriverData/DriverResource");
        System.setProperty(driverResource.getValue("driverBrowser"), driverResource.getValue("pathDriver"));
        driver = new ChromeDriver();
        driver.get(driverResource.getValue("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void quitBrowser() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
