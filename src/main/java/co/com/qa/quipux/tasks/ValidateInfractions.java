package co.com.qa.quipux.tasks;

import co.com.qa.quipux.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.qa.quipux.userinterfaces.ValidateInfractionsUserInterfaces.*;
import static co.com.qa.quipux.utils.Constants.TESTING_USER_ID;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class ValidateInfractions implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Wait.seconds(3000),
                Click.on(CLOSE_AD_BUTTON),
                Enter.theValue(TESTING_USER_ID).into(SEARCH_INPUT),
                Click.on(SEARCH_BUTTON),
                WaitUntil.the(PHOTO_DETECTION_DETAILS_BUTTON, isEnabled()).forNoMoreThan(2).seconds(),
                Click.on(PHOTO_DETECTION_DETAILS_BUTTON)

        );
    }

    public static ValidateInfractions onQuipux() {
        return Tasks.instrumented(ValidateInfractions.class);
    }
}
