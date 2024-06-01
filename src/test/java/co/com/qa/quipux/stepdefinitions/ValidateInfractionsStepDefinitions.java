package co.com.qa.quipux.stepdefinitions;

import co.com.qa.quipux.tasks.ValidateInfractions;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.qa.quipux.utils.Constants.QUIPUX_HOME_URL;

public class ValidateInfractionsStepDefinitions {

    @Given("I open the main page of web quipux digital")
    public void iOpenTheMainPageOfWebQuipuxDigital() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(QUIPUX_HOME_URL));

    }
    @When("I search for infractions")
    public void iSearchForInfractions() {
        OnStage.theActorInTheSpotlight().attemptsTo(ValidateInfractions.onQuipux());
    }
    @Then("I check the last infraction that shows")
    public void iCheckTheLastInfractionThatShows() {

    }


}
