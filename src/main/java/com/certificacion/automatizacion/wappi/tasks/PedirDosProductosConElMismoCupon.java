package com.certificacion.automatizacion.wappi.tasks;

import com.certificacion.automatizacion.wappi.models.OrdenPedido;
import com.certificacion.automatizacion.wappi.userinterfaces.MisProductosUserInterface;
import com.certificacion.automatizacion.wappi.userinterfaces.PaginaCupones;
import com.certificacion.automatizacion.wappi.userinterfaces.PedirOrdenUserInterface;
import com.certificacion.automatizacion.wappi.userinterfaces.SolicitarCuponUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class PedirDosProductosConElMismoCupon implements Task {
    private OrdenPedido ordenPedido;

    public PedirDosProductosConElMismoCupon(OrdenPedido ordenPedido) {

        this.ordenPedido = ordenPedido;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(SolicitarCuponUserInterface.SELECCIONA_BOTON_OBTENER_CUPON));
        String codigoCupon = BrowseTheWeb.as(actor).findBy(SolicitarCuponUserInterface.
                SELECCIONA_CODIGO_CUPON.getCssOrXPathSelector()).getText();
        actor.attemptsTo(Click.on(SolicitarCuponUserInterface.CIERRA_POPUP));
        actor.attemptsTo(Click.on(SolicitarCuponUserInterface.HOME));
        actor.attemptsTo(Click.on(PedirOrdenUserInterface.SELECCIONA_PRODUCTO));
        actor.attemptsTo(Enter.theValue(codigoCupon).into(SolicitarCuponUserInterface.ESCRIBIR_CUPON));
        actor.attemptsTo(Click.on(PedirOrdenUserInterface.CONFIRMAR_PRODUCTO));
        actor.attemptsTo(Click.on(MisProductosUserInterface.CERRAR_POPUP));
        actor.attemptsTo(Click.on(PaginaCupones.INGRESA_MISCUPONES));

        String codigoCuponPaginaMisCupones = BrowseTheWeb.as(actor).findBy(PaginaCupones.
                OBTENER_CUPON_PAGINA_CUPONES.getCssOrXPathSelector()).getText();
        actor.attemptsTo(Click.on(SolicitarCuponUserInterface.HOME));
        actor.attemptsTo(Click.on(PedirOrdenUserInterface.SELECCIONA_PRODUCTO));
        actor.attemptsTo(Enter.theValue(codigoCuponPaginaMisCupones).into(SolicitarCuponUserInterface.ESCRIBIR_CUPON));
        actor.attemptsTo(Click.on(PedirOrdenUserInterface.CONFIRMAR_PRODUCTO));
        actor.attemptsTo(Click.on(MisProductosUserInterface.CERRAR_POPUP));

        actor.attemptsTo(Click.on(PaginaCupones.INGRESA_MISCUPONES));


    }
    public static PedirDosProductosConElMismoCupon conDatos(OrdenPedido ordenPedido) {

        return new PedirDosProductosConElMismoCupon(ordenPedido);
    }
}
