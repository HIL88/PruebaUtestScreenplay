package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompletoUI {

    public static final Target PASSWORD = Target.the("Password").located(By.xpath("//*[contains(@id,'password')]"));
    public static final Target CONFIRM_PASSWORD = Target.the("Confirmar password").located(By.xpath("//*[contains(@id,'confirmPassword')]"));

    public static final Target CHECKMARK = Target.the("Confirmar checkmark").located(By.xpath("//*[contains(@class,'checkmark signup-consent__checkbox error')]"));
    public static final Target CHECKMARK2 = Target.the("Confirmar checkmark2").located(By.xpath("//*[contains(@ng-class,'{error: userForm.privacySetting.$error.required}')]"));
    public static final Target BUTTON_COMPLETE = Target.the("Boton para completar").located(By.xpath("//*[contains(@class,'btn btn-blue')]"));

}
