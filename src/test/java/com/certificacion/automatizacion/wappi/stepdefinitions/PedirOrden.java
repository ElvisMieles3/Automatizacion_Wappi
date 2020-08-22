package com.certificacion.automatizacion.wappi.stepdefinitions;

import com.certificacion.automatizacion.wappi.models.DatosInfoPersonal;
import com.certificacion.automatizacion.wappi.models.OrdenPedido;
import com.certificacion.automatizacion.wappi.tasks.ActualizarDatosPersonal;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class PedirOrden {


    @Cuando("^selecciona el producto$")
    public void seleccionaElProductoJamónPremium(List<OrdenPedido> ordenPedidos) {
        OnStage.theActorInTheSpotlight().attemptsTo(com.certificacion.automatizacion.wappi.tasks.PedirOrden.
                conDatos(ordenPedidos.get(0)));

    }

    @Entonces("^en la ventana de (.*) debe estar el producto (.*)$")
    public void enLaVentanaDeMisPedidosDebeEstarElProductoJamónPremium() {

    }
}
