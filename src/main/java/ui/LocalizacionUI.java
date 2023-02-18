package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocalizacionUI {

    public static final Target COD_POSTAL = Target.the("Codigo postal").located(By.xpath("//*[contains(@id,'zip')]"));

    public static final Target BUTTON_LOCATION = Target.the("Ingresa al registro").located(By.xpath("//*[contains(@aria-label,'Next step - select your devices')]"));

}
