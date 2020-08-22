package com.certificacion.automatizacion.wappi.tasks;

import com.certificacion.automatizacion.wappi.models.OrdenPedido;
import com.certificacion.automatizacion.wappi.models.Paginas;
import com.certificacion.automatizacion.wappi.userinterfaces.MisProductosStepDefinition;
import com.certificacion.automatizacion.wappi.userinterfaces.PedirOrdenStepDefinition;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ObservarMisProductos implements Task {

    private Paginas paginas;

    public ObservarMisProductos(Paginas paginas) {

        this.paginas = paginas;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MisProductosStepDefinition.CERRAR_POPUP));
        actor.attemptsTo(Click.on(MisProductosStepDefinition.INGRESA_MISPEDIDOS));

    }

    public static ObservarMisProductos conDatos(Paginas paginas) {

        return new ObservarMisProductos(paginas);
    }
}
