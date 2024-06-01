package co.com.qa.quipux.interactions;

import co.com.qa.quipux.tasks.SignUp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class Wait implements Interaction {

    private Integer seconds;

    public Wait(Integer seconds) {
        this.seconds = seconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);}
    }

    public static Wait seconds(Integer seconds) {
        return Tasks.instrumented(Wait.class, seconds);
    }
}
