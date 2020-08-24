package com.certificacion.automatizacion.wappi.stepdefinitions;

import com.certificacion.automatizacion.wappi.models.DatosInfoPersonal;
import com.certificacion.automatizacion.wappi.questions.ActualizarInformacion;
import com.certificacion.automatizacion.wappi.questions.Login;
import com.certificacion.automatizacion.wappi.questions.pantallainformacioncliente.Apellido;
import com.certificacion.automatizacion.wappi.questions.pantallainformacioncliente.FechaNacimiento;
import com.certificacion.automatizacion.wappi.questions.pantallainformacioncliente.Imagen;
import com.certificacion.automatizacion.wappi.questions.pantallainformacioncliente.Nombre;
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
        theActorInTheSpotlight().should(seeThat(ActualizarInformacion.mensaje(),
                org.hamcrest.Matchers.is(mensajeAlerta)));

    }

    @Entonces("^el deberia ver en el campo de la imagen un mensaje (.*)$")
    public void elDeberiaVerElMensajeTuInformaciónSeGuardóCorrectamentecampo(String mensajeAlerta) {
        theActorInTheSpotlight().should(seeThat(Imagen.mensaje(),
                org.hamcrest.Matchers.is(mensajeAlerta)));

    }

    @Entonces("^el deberia ver en el campo de la nombre un mensaje (.*)$")
    public void elDeberiaVerElMensajeTuInformaciónSeGuardóCorrectamentecampoNOMBRE(String mensajeAlerta) {
        theActorInTheSpotlight().should(seeThat(Nombre.mensaje(),
                org.hamcrest.Matchers.is(mensajeAlerta)));

    }

    @Entonces("^el deberia ver en el campo de apellido un mensaje (.*)$")
    public void elDeberiaVerElMensajeTuInformaciónSeGuardóCorrectamentecampoAPELLIDO(String mensajeAlerta) {
        theActorInTheSpotlight().should(seeThat(Apellido.mensaje(),
                org.hamcrest.Matchers.is(mensajeAlerta)));

    }

    @Entonces("^el deberia ver en el campo de fecha de nacimiento un mensaje (.*)$")
    public void elDeberiaVerElMensajeTuInformaciónSeGuardóCorrectamentecampoFECHANACIMIENTO(String mensajeAlerta) {
        theActorInTheSpotlight().should(seeThat(FechaNacimiento.mensaje(),
                org.hamcrest.Matchers.is(mensajeAlerta)));

    }
}
