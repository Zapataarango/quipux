package co.com.qa.quipux.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.qa.quipux.userinterfaces.SignUpUserInterfaces.*;
import static co.com.qa.quipux.userinterfaces.SignUpUserInterfaces.CONFIRM_REGISTER_BUTTON;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class FailedSignUp implements Task {
private String email;
private String password;

    public FailedSignUp(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public static FailedSignUp onQuipux(String email, String password) {
        return Tasks.instrumented(FailedSignUp.class, email, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CREATE_ACCOUNT_BTN),
                WaitUntil.the(TYPE_ID_DROP_DOWN_LIST, isEnabled()).forNoMoreThan(2).seconds(),
                Click.on(TYPE_ID_DROP_DOWN_LIST),
                Click.on(CC_TYPE_ID),
                Enter.theValue("16151326").into(ID_NUMBER_INPUT),
                Enter.theValue("testing").into(NAME_INPUT),
                Enter.theValue("user").into(LAST_NAME_INPUT),
                Enter.theValue("3163000505").into(CELLPHONE_INPUT),
                Enter.theValue(email).into(EMAIL_INPUT),
                Enter.theValue(email).into(CONFIRM_EMAIL_INPUT),
                Enter.theValue(password).into(PASSWORD_INPUT),
                Enter.theValue(password).into(CONFIRM_PASSWORD_INPUT),
                Click.on(CONFIRM_REGISTER_BUTTON)
        );


    }
}
