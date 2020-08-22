package com.certificacion.automatizacion.wappi.tasks;

import com.certificacion.automatizacion.wappi.models.DatosLogin;
import com.certificacion.automatizacion.wappi.models.OrdenPedido;
import com.certificacion.automatizacion.wappi.userinterfaces.LoginUserInterface;
import com.certificacion.automatizacion.wappi.userinterfaces.PedirOrdenStepDefinition;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class PedirOrden implements Task {

    private OrdenPedido ordenPedido;

    public PedirOrden(OrdenPedido ordenPedido) {

        this.ordenPedido = ordenPedido;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PedirOrdenStepDefinition.SELECCIONA_PRODUCTO));
        actor.attemptsTo(Click.on(PedirOrdenStepDefinition.CONFIRMAR_PRODUCTO));

    }

    public static PedirOrden conDatos(OrdenPedido ordenPedido) {

        return new PedirOrden(ordenPedido);
    }
}
