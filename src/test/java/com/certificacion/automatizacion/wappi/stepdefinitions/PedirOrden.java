package com.certificacion.automatizacion.wappi.stepdefinitions;

import com.certificacion.automatizacion.wappi.models.DatosInfoPersonal;
import com.certificacion.automatizacion.wappi.models.OrdenPedido;
import com.certificacion.automatizacion.wappi.models.Paginas;
import com.certificacion.automatizacion.wappi.questions.Login;
import com.certificacion.automatizacion.wappi.questions.ObservarMisPedidos;
import com.certificacion.automatizacion.wappi.tasks.ActualizarDatosPersonal;
import com.certificacion.automatizacion.wappi.tasks.ObservarMisProductos;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.en.Then;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PedirOrden {


    @Cuando("^selecciona el producto$")
    public void seleccionaElProductoJamónPremium(List<OrdenPedido> ordenPedidos) {
        OnStage.theActorInTheSpotlight().attemptsTo(com.certificacion.automatizacion.wappi.tasks.PedirOrden.
                conDatos(ordenPedidos.get(0)));

    }


     @Entonces("^el deberia ver el siguiente mensaje (.*)$")
    public void elDeberiaVerElSiguienteMensaje(String mensaje) {
      theActorInTheSpotlight().should(seeThat(com.certificacion.automatizacion.wappi.questions.OrdenPedido.mensaje(),
            org.hamcrest.Matchers.is(mensaje)));
    }


    @Cuando("^se encuentra observando$")
    public void seEncuentraObservando(List<Paginas> paginas) {
        OnStage.theActorInTheSpotlight().attemptsTo(com.certificacion.automatizacion.wappi.tasks.ObservarMisProductos.
                conDatos(paginas.get(0)));
    }


    @Entonces("^debe ver el producto (.*)$")
    public void debeVerElProductoJamónPremium(String nombreProducto) {
        theActorInTheSpotlight().should(seeThat(ObservarMisPedidos.mensaje(),
                org.hamcrest.Matchers.is(nombreProducto)));
    }
}
