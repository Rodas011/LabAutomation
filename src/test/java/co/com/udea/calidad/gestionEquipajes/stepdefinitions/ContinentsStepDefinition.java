package co.com.udea.calidad.gestionEquipajes.stepdefinitions;

import co.com.udea.calidad.gestionEquipajes.tasks.ConnectTo;
import co.com.udea.calidad.gestionEquipajes.tasks.ConsumeThe;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import org.hamcrest.Matchers;

public class ContinentsStepDefinition {

    Actor user = Actor.named("user");

    @Before
    public void config(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("user");
    }

    @Given("the user is connected to the service")
    public void theUserIsConnectedToTheService() {
        user.attemptsTo(ConnectTo.theService());
    }
    @When("the user gets the continents information")
    public void theUserGetsTheContinentsInformation() {
        user.attemptsTo(ConsumeThe.service());
    }
    @Then("the user can see the continents names")
    public void theUserCanSeeTheContinentsNames() {
        user.should(seeThatResponse(response->response.statusCode(200)
                .body("[0].name", Matchers.equalTo("Africa"))
                .body("[1].name", Matchers.equalTo("Antarctica"))
                .body("[2].name", Matchers.equalTo("Asia"))
                .body("[3].name", Matchers.equalTo("Europa"))
                .body("[4].name", Matchers.equalTo("North America"))
                .body("[5].name", Matchers.equalTo("Oceania"))
                .body("[6].name", Matchers.equalTo("South America"))
        ));
    }
}


