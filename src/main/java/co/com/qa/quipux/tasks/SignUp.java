package co.com.qa.quipux.tasks;

import co.com.qa.quipux.interactions.Wait;
import lombok.Setter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;


import java.util.Map;

import static co.com.qa.quipux.userinterfaces.SignUpUserInterfaces.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
@Setter
public class SignUp implements Task {

    private Map<String, Object> data;

    public SignUp(Map<String, Object> data) {
        this.data = data;
    }

    public static SignUp onQuipux(Map<String, Object> data) {
        return Tasks.instrumented(SignUp.class, data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CREATE_ACCOUNT_BTN),
                WaitUntil.the(TYPE_ID_DROP_DOWN_LIST, isEnabled()).forNoMoreThan(2).seconds(),
                Click.on(TYPE_ID_DROP_DOWN_LIST),
                Click.on(CC_TYPE_ID),
               Enter.theValue(data.get("ID").toString()).into(ID_NUMBER_INPUT),
               Enter.theValue(data.get("name").toString()).into(NAME_INPUT),
               Enter.theValue(data.get("lastName").toString()).into(LAST_NAME_INPUT),
               Enter.theValue(data.get("phoneNumber").toString()).into(CELLPHONE_INPUT),
               Enter.theValue(data.get("email").toString()).into(EMAIL_INPUT),
               Enter.theValue(data.get("email").toString()).into(CONFIRM_EMAIL_INPUT),
               Enter.theValue(data.get("password").toString()).into(PASSWORD_INPUT),
               Enter.theValue(data.get("password").toString()).into(CONFIRM_PASSWORD_INPUT),
                Click.on(CONFIRM_REGISTER_BUTTON)
        );
    }
}
