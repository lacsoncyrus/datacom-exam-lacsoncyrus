package utils;

import config.Constant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    public static WebDriver setupDriver(String browserName)
    {
        WebDriver driver;
        switch (browserName.toUpperCase())
        {
            case "CHROME":
                System.setProperty("webdriver.chrome.driver", Constant.ProjectPath+"/src/main/java/drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            default:
                driver = null;
                break;
        }
        return driver;
    }
}
