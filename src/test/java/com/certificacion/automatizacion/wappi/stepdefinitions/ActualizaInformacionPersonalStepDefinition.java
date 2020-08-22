package com.certificacion.automatizacion.wappi.stepdefinitions;

import com.certificacion.automatizacion.wappi.models.DatosInfoPersonal;
import com.certificacion.automatizacion.wappi.questions.Login;
import com.certificacion.automatizacion.wappi.tasks.ActualizarDatosPersonal;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ActualizaInformacionPersonalStepDefinition {


    @Dado("^que el usuario se encuentra en la pantalla de Información Personal y digita los datos$")
    public void queElUsuarioSeEncuentraEnLaPantallaDeInformaciónPersonalYDigitaLosDatos(List<DatosInfoPersonal> actualizarInformacionPersonal) {


        OnStage.theActorInTheSpotlight().attemptsTo(ActualizarDatosPersonal.
                conDatos(actualizarInformacionPersonal.get(0)));
    }

    @Entonces("^el deberia ver el mensaje (.*)$")
    public void elDeberiaVerElMensajeTuInformaciónSeGuardóCorrectamente(String mensajeAlerta) {
        theActorInTheSpotlight().should(seeThat(Login.mensaje(),
                org.hamcrest.Matchers.is(mensajeAlerta)));

    }
}
