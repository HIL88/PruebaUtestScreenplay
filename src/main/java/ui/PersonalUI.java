package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalUI {
    public static final Target FIRST_NAME = Target.the("Primer nombre").located(By.xpath("//*[contains(@id,'firstName')]"));
    public static final Target LAST_NAME = Target.the("Segundo nombre").located(By.xpath("//*[contains(@id,'lastName')]"));
    public static final Target EMAIL = Target.the("Primer nombre").located(By.xpath("//*[contains(@id,'email')]"));
    public static final Target MONTH = Target.the("menu").located(By.id("birthMonth"));
    //public static final Target SELECT_MONTH = Target.the("Seleccion mes").located(By.xpath("//*[contains(@id,'birthMonth')]//*[text()='March']"));
    public static final Target DAY = Target.the("Dia").located(By.xpath("//*[contains(@id,'birthDay')]"));
    public static final Target YEAR = Target.the("Year").located(By.xpath("//*[contains(@id,'birthYear')]"));
    public static final Target BUTTON_NEXT = Target.the("Boton siguiente").located(By.xpath("//*[contains(@class,'btn btn-blue')]"));

}
