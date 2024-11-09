package Cucumber.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import utils.DriverFactory;
import utils.PageBase;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        dryRun = false,
        tags = ("@testValidateLocationsPage"),
        stepNotifications = true,
        plugin = { "pretty", "html:target/cucumber-reports.html" },
        monochrome = true
)

public class PortfolioTestRunner extends PageBase {


    @BeforeClass
    public static void setup() throws Throwable {
        driver = DriverFactory.setupDriver("CHROME");
        driver.manage().window().maximize();
        waitFor(1);
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
        driver=null;
    }
}
