package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUI {
    public static final Target REGISTER = Target.the("Ingresa al registro").located(By.xpath("//*[contains(@class,'unauthenticated-nav-bar__sign-up')]"));

}
