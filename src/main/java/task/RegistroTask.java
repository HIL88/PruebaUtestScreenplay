package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.support.ui.Select;
import ui.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegistroTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomeUI.REGISTER),
                SendKeys.of("Juan").into(PersonalUI.FIRST_NAME),
                SendKeys.of("Tuquer").into(PersonalUI.LAST_NAME),
                SendKeys.of("Juancho@gmail.com").into(PersonalUI.EMAIL),
                SendKeys.of("16").into(PersonalUI.DAY),
                SendKeys.of("2000").into(PersonalUI.YEAR),
                Click.on(PersonalUI.MONTH),
                Click.on("//*[contains(@id,'birthMonth')]//*[text()='March']"),
                Click.on(PersonalUI.BUTTON_NEXT),
                SendKeys.of("01001").into(LocalizacionUI.COD_POSTAL),
                Click.on(LocalizacionUI.BUTTON_LOCATION),
                Click.on(DeviceUI.SISTEMA),
                Click.on(DeviceUI.WINDOWS),
                Click.on(DeviceUI.VERSION),
                Click.on(DeviceUI.XP),
                Click.on(DeviceUI.LANGUAJE),
                Click.on(DeviceUI.ENGLISH),
                Click.on(DeviceUI.BUTTON_LAST_FINAL),
                SendKeys.of("Casa551212").into(CompletoUI.PASSWORD),
                SendKeys.of("Casa551212").into(CompletoUI.CONFIRM_PASSWORD),
                Click.on(CompletoUI.CHECKMARK),
                Click.on(CompletoUI.CHECKMARK2),
                Click.on(CompletoUI.BUTTON_COMPLETE)
        );
    }

    public static RegistroTask make(){
        return instrumented(RegistroTask.class);
    }
}
