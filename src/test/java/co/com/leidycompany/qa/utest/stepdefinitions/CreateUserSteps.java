package co.com.leidycompany.qa.utest.stepdefinitions;

import co.com.leidycompany.qa.utest.tasks.CreateUsers;
import co.com.leidycompany.qa.utest.utils.MyDriversWeb;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import static co.com.leidycompany.qa.utest.utils.Constants.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;

public class CreateUserSteps {

    @Managed(driver = "chrome")
    protected WebDriver hisBrowser;
    @Given("^I want to go Utest page$")
    public void iWantToGoUtestPage() {
        //WebDriverManager.firefoxdriver().setup();
        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled(ACTOR_PAGE);
        //OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(MyDriversWeb.web().inThePage(URL)));
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(URL));
        hisBrowser.manage().window().maximize();
    }


    @When("^I enter the information to create user$")
    public void iEnterTheInformationToCreateUser() {
        OnStage.theActorInTheSpotlight().attemptsTo(CreateUsers.createUsers());
    }

    @Then("^I validate the successfully create user$")
    public void iValidateTheSuccessfullyCreateUser() {
    //OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat());
    }
}
