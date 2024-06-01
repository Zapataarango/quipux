package co.com.qa.quipux.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidateInfractionsUserInterfaces {

    public static final Target SEARCH_INPUT = Target.the("Serch by id number input").located(By.id("busqueda"));
    public static final Target SEARCH_BUTTON = Target.the("Serch button").located(By.id("btnBuscar"));
    public static final Target PHOTO_DETECTION_DETAILS_BUTTON = Target.the("photo detection details button").located(By.xpath("(//button[@rol='ROLE_CONSULTA_FOTO_DETECCIONES_C'])[1]"));
    public static final Target CLOSE_AD_BUTTON = Target.the("Close ad button").located(By.xpath("//div[@class='modal-header border-0']/button[@class='close']"));


}
