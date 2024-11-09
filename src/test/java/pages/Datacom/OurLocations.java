package pages.Datacom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import pageObject.Datacom.OurLocations.State;
import utils.PageBase;

import java.util.Arrays;
import java.util.List;

public class OurLocations extends PageBase {

    private String [] regions= {"New Zealand", "Australia", "Asia"};

    By byLocationsContainer = By.className("cmp-location__locations");

    public void validateLocations(String region, List<State> states)
    {

        int regionCtr = Arrays.asList(regions).indexOf(region);
        int stateCtr = 0;

        By byRegion = By.xpath("//li[@data-tab-section-id='.item"+regionCtr+"']");

        scrollDownIntoElement(region + " Region Element", byRegion, 5, 3);
        click(region + " Region Element", byRegion, 5, 3);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollTop = 0;", driver.findElement(byLocationsContainer));

        By byState;
        By byAddress;
        By byContactNumber;
        By byEmail;

        String containerState = "";

        for (State state : states)
        {

            byState = By.xpath("//div[@data-map-container-id='map"+regionCtr+""+stateCtr+"']");
            byAddress = By.xpath("//div[@data-map-container-id='map"+regionCtr+""+stateCtr+"']/following-sibling::div/div/p[@class='cmp-location__location__address']");
            byContactNumber = By.xpath("//div[@data-map-container-id='map"+regionCtr+""+stateCtr+"']/following-sibling::div/p[@class='cmp-location__location__phone ']");
            byEmail = By.xpath("//div[@data-map-container-id='map"+regionCtr+""+stateCtr+"']/following-sibling::div/p[@class='cmp-location__location__email']");

            scrollDownIntoElement(state + " State Element", byState, 5, 3);

           containerState = driver.findElement(byState).getAttribute("tabindex").toString();

            if(containerState.equals("0"))
            {
                click(state + " State Element", byState, 5, 3);
            }

            waitFor(2);

            Assert.assertEquals(driver.findElement(byState).getText(), state.getState());
            Assert.assertEquals(driver.findElement(byAddress).getText(), state.getAddress());
            Assert.assertEquals(driver.findElement(byContactNumber).getText(), state.getContactNumber());
            Assert.assertEquals(driver.findElement(byEmail).getText(), state.getEmail());

            System.out.println("#PRINT DATA CHECK VALIDATION START#");
            System.out.println("[State] Data from Website: " + driver.findElement(byState).getText() + " | Mock Data: " + state.getState());
            System.out.println("[Address] Data from Website: " +driver.findElement(byAddress).getText() + " | Mock Data: " + state.getAddress());
            System.out.println("[Contact Number] Data from Website: " +driver.findElement(byContactNumber).getText() + " | Mock Data: " + state.getContactNumber());
            System.out.println("[Email] Data from Website: " +driver.findElement(byEmail).getText() + " | Mock Data: " + state.getEmail());
            System.out.println("#PRINT DATA CHECK VALIDATION END#");

            click(state + " State Element", byState, 5, 3);

            stateCtr++;
        }
    }
}
