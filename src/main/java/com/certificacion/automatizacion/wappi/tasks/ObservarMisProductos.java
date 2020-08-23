package com.certificacion.automatizacion.wappi.tasks;

import com.certificacion.automatizacion.wappi.models.Paginas;
import com.certificacion.automatizacion.wappi.userinterfaces.MisProductosUserInterface;
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
        actor.attemptsTo(Click.on(MisProductosUserInterface.CERRAR_POPUP));
        actor.attemptsTo(Click.on(MisProductosUserInterface.INGRESA_MISPEDIDOS));

    }

    public static ObservarMisProductos conDatos(Paginas paginas) {

        return new ObservarMisProductos(paginas);
    }
}
