package com.certificacion.automatizacion.wappi.stepdefinitions;

import com.certificacion.automatizacion.wappi.models.DatosLogin;
import com.certificacion.automatizacion.wappi.questions.Login;
import com.certificacion.automatizacion.wappi.questions.pantallaloguin.ContrasenaIncorrecta;
import com.certificacion.automatizacion.wappi.questions.pantallaloguin.UsuarioIncorrecto;
import com.certificacion.automatizacion.wappi.tasks.AbrirNavegador;
import com.certificacion.automatizacion.wappi.tasks.IngresarDatosLogin;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

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
    public void elIngresaLasCredencialesParaIngresar(List<DatosLogin> datosLogin) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarDatosLogin.conDatos(datosLogin.get(0)));
    }

    @Then("^el usuario debe ver el mensaje (.*)$")
    public void elUsuarioDebeVerElNombreWelcomePruebas(String login) {
        theActorInTheSpotlight().should(seeThat(Login.mensaje(),
                org.hamcrest.Matchers.is(login)));
    }

    @Then("^el usuario debe ver en el campo usuario el  mensaje (.*)$")
    public void elUsuarioDebeVerElmensaje(String usuarioIncorrecto) {
        theActorInTheSpotlight().should(seeThat(UsuarioIncorrecto.mensaje(),
                org.hamcrest.Matchers.is(usuarioIncorrecto)));

    }

    @Then("^el usuario debe ver en el campo contraseña el  mensaje (.*)$")
    public void elUsuarioDebeVerElmensajeContrasena(String contrasenaIncorrecto) {
        theActorInTheSpotlight().should(seeThat(ContrasenaIncorrecta.mensaje(),
                org.hamcrest.Matchers.is(contrasenaIncorrecto)));

    }

    @After
    public void cerrarEscenario() {
      OnStage.drawTheCurtain();
    }
}
