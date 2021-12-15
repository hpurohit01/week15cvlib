package co.uk.cv_library.cucumber.steps;

import co.uk.cv_library.pages.ResultPage;
import cucumber.api.java.en.Then;

public class ResultSteps {


    @Then("^I can see the result \"([^\"]*)\"$")
    public void iCanSeeTheResult(String arg0) {
        new ResultPage().verifyTheResults(arg0);
    }
}