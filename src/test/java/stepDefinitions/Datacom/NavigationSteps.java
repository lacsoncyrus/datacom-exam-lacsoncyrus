package stepDefinitions.Datacom;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.Datacom.Navigation;

public class NavigationSteps {
    Navigation navigation = new Navigation();
    @Given("User navigated to datacom website")
    public void userNavigatedToDatacomWebsite()
    {
        navigation.navigateToSite("https://datacom.com/nz/en");
    }

    @And("User navigated to our locations page")
    public void userNavigatedToOurLocationsPage()
    {
        navigation.navigateToOurLocationsPage();
    }
}
