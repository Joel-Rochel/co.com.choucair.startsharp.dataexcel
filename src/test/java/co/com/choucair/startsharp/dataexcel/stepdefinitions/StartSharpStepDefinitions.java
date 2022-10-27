package co.com.choucair.startsharp.dataexcel.stepdefinitions;

import co.com.choucair.startsharp.dataexcel.model.StartSharpData;
import co.com.choucair.startsharp.dataexcel.questions.Answer;
import co.com.choucair.startsharp.dataexcel.questions.AnswerRequiredFields;
import co.com.choucair.startsharp.dataexcel.tasks.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class StartSharpStepDefinitions {
    @Given("^Joel wants to login to StartSharp$")
    public void joelWantsToLoginToStartSharp(List<StartSharpData> data) {
        theActorCalled("Joel").wasAbleTo(OpenUp.thePage(), Login.thePage(data));
    }

    @When("^Enter the information for the creation of a business unit$")
    public void enterTheInformationForTheCreationOfABusinessUnit(List<StartSharpData> data) {
        theActorInTheSpotlight().attemptsTo(GoToBusinessUnitCreate.onThePage(), CreateBusinessUnit.onThePage(data));
    }

    @When("^enter the information to create a meeting$")
    public void enterTheInformationToCreateAMeeting(List<StartSharpData> data) {
        theActorInTheSpotlight().attemptsTo(GoToCreateMeeting.onThePage(), CreateMeeting.onThePage(data));
    }

    @Then("^Verify that the process is complete$")
    public void verifyThatTheProcessIsComplete(List<StartSharpData> data) {
        theActorInTheSpotlight().should(seeThat(Answer.toThe(data)));
    }

    @Given("^Joel wants to verify the creation of business unitsp$")
    public void joelWantsToVerifyTheCreationOfBusinessUnitsp(List<StartSharpData> data) {
        theActorCalled("Joel").wasAbleTo(OpenUp.thePage(), Login.thePage(data));
    }

    @When("^complete only the required fields$")
    public void completeOnlyTheRequiredFields(List<StartSharpData> data) {
        theActorInTheSpotlight().attemptsTo(GoToBusinessUnitCreate.onThePage(), RequiredFields.enterData(data));
    }

    @Then("^verify the creation of the business unit$")
    public void verifyTheCreationOfTheBusinessUnit(List<StartSharpData> data) {
        theActorInTheSpotlight().should(seeThat(AnswerRequiredFields.toThe(data)));
    }

}
