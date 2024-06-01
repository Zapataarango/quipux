package co.com.qa.quipux.stepdefinitions;

import co.com.qa.quipux.exceptions.IncorrectSignUp;
import co.com.qa.quipux.interactions.Wait;
import co.com.qa.quipux.tasks.FailedSignUp;
import co.com.qa.quipux.tasks.SignUp;
import co.com.qa.quipux.utils.DynamicData;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.Text;
import org.hamcrest.Matchers;

import java.util.Map;

import static co.com.qa.quipux.exceptions.IncorrectSignUp.FAILED_SIGN_UP;
import static co.com.qa.quipux.userinterfaces.SignUpUserInterfaces.MAIN_TITLE;
import static co.com.qa.quipux.userinterfaces.SignUpUserInterfaces.PASSWORD_ERROR;
import static co.com.qa.quipux.utils.Constants.QUIPUX_SIGN_UP_URL;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class SignUpOnQuipuxStepDefinitions {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
        theActorCalled("automation");
        WebDriverManager.chromedriver().setup();
    }

    @Given("I open the web quipux digital")
    public void iOpenTheWebQuipuxDigital() {

        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(QUIPUX_SIGN_UP_URL));
    }

    @When("I create an account on quipux")
    public void iCreateAnAccountOnQuipux() {
        Map<String, Object> data = DynamicData.generated();
        System.out.println(data.get("name").toString());

        OnStage.theActorInTheSpotlight().attemptsTo(SignUp.onQuipux(data));
    }
    @Then("I must be redirected to main page")
    public void i_must_be_redirected_to_main_page() {
       theActorInTheSpotlight().attemptsTo(Wait.seconds(5000));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Text.of(MAIN_TITLE), Matchers.equalTo("Movilidad en Línea"))
                .orComplainWith(IncorrectSignUp.class, FAILED_SIGN_UP));
    }


    @When("I enter email {string} and password {string}")
    public void i_enter_email_and_password(String email, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(FailedSignUp.onQuipux(email, password));
    }

    @Then("the user should see the message {string}")
    public void the_user_should_see_the_message(String message) {
        theActorInTheSpotlight().attemptsTo(Wait.seconds(5000));

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Text.of(PASSWORD_ERROR), Matchers.equalTo(message))
                .orComplainWith(IncorrectSignUp.class, FAILED_SIGN_UP));
    }
}
