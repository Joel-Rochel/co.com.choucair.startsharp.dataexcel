package co.com.choucair.startsharp.dataexcel.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.startsharp.dataexcel.userinterface.GoToCreateMeetingPage.*;

public class GoToCreateMeeting implements Task {

    public static GoToCreateMeeting onThePage() {
        return Tasks.instrumented(GoToCreateMeeting.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SELECT_MEETING),
                Click.on(SELECT_MEETINGS),
                Click.on(BUTTON_NEW_MEETING));
    }
}
