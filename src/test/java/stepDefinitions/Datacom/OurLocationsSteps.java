package stepDefinitions.Datacom;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import pageObject.Datacom.OurLocations.State;
import pages.Datacom.OurLocations;
import utils.GenerateTestData;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

public class OurLocationsSteps {
    ObjectMapper mapper = new ObjectMapper();
    List<State> states;

    OurLocations ourLocations = new OurLocations();

    @Then("User will validate location details in {string} using the following data")
    public void userWillValidateLocationDetailsUsingFollowingData(String region, DataTable dataTable) throws Exception {
        List<Map<String, String>> stateData = dataTable.asMaps();
        states = mapper.readValue(GenerateTestData.convertToInputStream(stateData), new TypeReference<List<State>>() {});
        ourLocations.validateLocations(region, states);
    }
}
