package co.com.choucair.startsharp.dataexcel.tasks;


import co.com.choucair.startsharp.dataexcel.model.StartSharpData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.startsharp.dataexcel.userinterface.LoginPage.*;

public class Login implements Task {

    private List<StartSharpData> data;

    public Login(List<StartSharpData> data) {
        this.data = data;
    }

    public static Login thePage(List<StartSharpData> data) {
        return Tasks.instrumented(Login.class, data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrUser()).into(INPUT_USERNAME),
                Enter.theValue(data.get(0).getStrPassword()).into(INPUT_PASSWORD),
                Click.on(BUTTON_SING_IN));
    }
}
