package com.certificacion.automatizacion.wappi.tasks;

import com.certificacion.automatizacion.wappi.models.OrdenPedido;
import com.certificacion.automatizacion.wappi.userinterfaces.PedirOrdenStepDefinition;
import com.certificacion.automatizacion.wappi.userinterfaces.SolicitarCuponStepDefinition;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class PedirOrdenUtilizandoCupon implements Task {
    private OrdenPedido ordenPedido;

    public PedirOrdenUtilizandoCupon(OrdenPedido ordenPedido) {

        this.ordenPedido = ordenPedido;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SolicitarCuponStepDefinition.SELECCIONA_BOTON_OBTENER_CUPON));
        actor.attemptsTo(Click.on(SolicitarCuponStepDefinition.CIERRA_POPUP));
        actor.attemptsTo(Click.on(SolicitarCuponStepDefinition.HOME));
        actor.attemptsTo(Click.on(PedirOrdenStepDefinition.SELECCIONA_PRODUCTO));
      /// aqui se debe digitar el cupon
        actor.attemptsTo(Click.on(PedirOrdenStepDefinition.CONFIRMAR_PRODUCTO));
    }

    public static PedirOrdenUtilizandoCupon conDatos(OrdenPedido ordenPedido) {

        return new PedirOrdenUtilizandoCupon(ordenPedido);
    }
}