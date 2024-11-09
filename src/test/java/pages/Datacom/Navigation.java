package pages.Datacom;

import org.openqa.selenium.By;
import utils.DriverFactory;
import utils.PageBase;

public class Navigation extends PageBase {

    //Elements
    By byAboutUs = By.id("about-us-content");
    By byOurLocations = By.xpath("(//div[@class='cmp-mega-navigation-v2__group--cards' and contains(string(),'Our locations')]/a)[1]");
    By byAcceptCoockies = By.id("onetrust-accept-btn-handler");
    //Elements

    public void navigateToSite(String site){
        driver.get(site);
    }

    public void navigateToOurLocationsPage()
    {
        click("Accept Cookies Button Element",byAcceptCoockies,5,3);
        click("ABOUT US MENU OPTION",byAboutUs,5,3);
        click("OUR LOCATIONS MENU OPTION",byOurLocations,5,3);
    }

}
