package com.certificacion.automatizacion.wappi.stepdefinitions;

import com.certificacion.automatizacion.wappi.tasks.AbrirNavegador;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class LoginStepDefinition {

    @Managed
    private WebDriver miNavegador;

    @Before
    public void setUpOnStage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(miNavegador)));

        theActorCalled("the user");
    }

    @Given("^que Elvis esta en el portal$")
    public void queElvisEstaEnElPortal() {
        OnStage.theActorInTheSpotlight().wasAbleTo(AbrirNavegador.navegador());

    }


    @When("^el ingresa las credenciales para ingresar$")
    public void elIngresaLasCredencialesParaIngresar() {

    }

    @Then("^el usuario debe ver el nombre Welcome, pruebas!$")
    public void elUsuarioDebeVerElNombreWelcomePruebas() {

    }

}
