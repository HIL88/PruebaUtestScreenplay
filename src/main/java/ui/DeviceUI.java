package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DeviceUI {

    public static final Target SISTEMA = Target.the("Sistema").located(By.xpath("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[1]"));
    public static final Target WINDOWS = Target.the("Windows").located(By.xpath("(//span[@class=\"ui-select-choices-row-inner\"])[2]"));
    public static final Target VERSION = Target.the("Version").located(By.xpath("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[2]"));
    public static final Target XP = Target.the("XP").located(By.xpath("(//span[@class=\"ui-select-choices-row-inner\"])[2]"));
    public static final Target LANGUAJE = Target.the("Lenguaje").located(By.xpath("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[3]"));
    public static final Target ENGLISH = Target.the("Ingles").located(By.xpath("(//span[@class=\"ui-select-choices-row-inner\"])[11]"));
    public static final Target BUTTON_LAST_FINAL = Target.the("Boton Last").located(By.xpath("//*[contains(@class,'btn btn-blue pull-right')]"));
    //(//span[@class="btn btn-default form-control ui-select-toggle"])[1]
    // (//span[@class="ui-select-choices-row-inner"])[2]
    ////*[contains(@class,'btn btn-blue pull-right')]
}
