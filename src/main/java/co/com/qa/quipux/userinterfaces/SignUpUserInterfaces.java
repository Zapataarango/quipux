package co.com.qa.quipux.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class SignUpUserInterfaces {

    public static final Target CREATE_ACCOUNT_BTN = Target.the("create account btn").located(By.xpath("//a[@ui-sref='registro.datos-persona' and contains(text(),'Crear cuenta')]"));
    public static final Target TYPE_ID_DROP_DOWN_LIST = Target.the("create account btn").located(By.xpath("//span[contains(text(),'Seleccionar')]"));
    public static final Target CC_TYPE_ID = Target.the("CC type id on drop down list").located(By.xpath("//li[contains(text(),'CC')]"));
    public static final Target ID_NUMBER_INPUT = Target.the("ID number input").located(By.id("numeroDocumento"));
    public static final Target NAME_INPUT = Target.the("name input").located(By.id("nombre"));
    public static final Target LAST_NAME_INPUT = Target.the("last name input").located(By.id("apellido"));
    public static final Target CELLPHONE_INPUT = Target.the("Cellphone input").located(By.id("phone"));
    public static final Target EMAIL_INPUT = Target.the("Email input").located(By.id("emailRegistro"));
    public static final Target CONFIRM_EMAIL_INPUT = Target.the("Confirm Email input").located(By.id("confirmEmailRegistro"));
    public static final Target PASSWORD_INPUT = Target.the("Password input").located(By.id("password"));
    public static final Target CONFIRM_PASSWORD_INPUT = Target.the("Confirm password input").located(By.id("confirmPasswordRegistro"));
    public static final Target CONFIRM_REGISTER_BUTTON = Target.the("Confirm password input").located(By.xpath("//button[contains(text(),'Registrarme')]"));
    public static final Target MAIN_TITLE = Target.the("main page label").located(By.xpath("//h1[contains(text(),'Movilidad en Línea\n')]"));
    public static final Target PASSWORD_ERROR = Target.the("password error label").located(By.id("Agrega letras minúsculas\n"));



    private SignUpUserInterfaces() {
    }


}
