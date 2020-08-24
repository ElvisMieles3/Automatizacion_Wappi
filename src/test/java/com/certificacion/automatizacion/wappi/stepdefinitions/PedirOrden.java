package com.certificacion.automatizacion.wappi.stepdefinitions;

import com.certificacion.automatizacion.wappi.models.OrdenPedido;
import com.certificacion.automatizacion.wappi.models.Paginas;
import com.certificacion.automatizacion.wappi.questions.CuponInvalido;
import com.certificacion.automatizacion.wappi.questions.Cupones;
import com.certificacion.automatizacion.wappi.questions.ObservarMisPedidos;
import com.certificacion.automatizacion.wappi.tasks.PedirDosProductosConElMismoCupon;
import com.certificacion.automatizacion.wappi.tasks.PedirTresProductosConElMismoCupon;
import com.certificacion.automatizacion.wappi.tasks.PedirUnaOrdenUtilizandoCupon;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.ast.Y;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PedirOrden {


    @Cuando("^selecciona el producto sin cupon$")
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

    @Cuando("^selecciona el producto con cupon$")
    public void seleccionaelproductoconcupon(List<OrdenPedido> ordenPedidos) {
        OnStage.theActorInTheSpotlight().attemptsTo(PedirUnaOrdenUtilizandoCupon.
                conDatos(ordenPedidos.get(0)));

    }

    @Cuando("^selecciona dos producto con el mismo cupon y consulta nuevamente el codigo$")
    public void seleccionaelproductoconelmismocupon(List<OrdenPedido> ordenPedidos) {
        OnStage.theActorInTheSpotlight().attemptsTo(PedirDosProductosConElMismoCupon.
                conDatos(ordenPedidos.get(0)));

    }

    @Entonces("^en la página de cupones debe mostrar el siguiente mensaje (.*)$")
    public void debeVerElmensajemiscupones(String mensajeCuponNoDisponible) {
        theActorInTheSpotlight().should(seeThat(Cupones.mensaje(),
                org.hamcrest.Matchers.is(mensajeCuponNoDisponible)));
    }

    @Cuando("^hace tres compras con el mismo cupòn$")
    public void seleccionatresproductoconelmismocupon(List<OrdenPedido> ordenPedidos) {
        OnStage.theActorInTheSpotlight().attemptsTo(PedirTresProductosConElMismoCupon.
                conDatos(ordenPedidos.get(0)));
    }

    @Entonces("^en la campo cupòn debe mostrar el mensaje (.*)$")
    public void debeVerElmensajeenelcampocupon(String mensajeCuponinvalido) {
        theActorInTheSpotlight().should(seeThat(CuponInvalido.mensaje(),
                org.hamcrest.Matchers.is(mensajeCuponinvalido)));
    }





}
