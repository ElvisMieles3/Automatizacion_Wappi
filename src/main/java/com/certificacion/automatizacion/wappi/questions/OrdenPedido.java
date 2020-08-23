package com.certificacion.automatizacion.wappi.questions;

import com.certificacion.automatizacion.wappi.userinterfaces.PedirOrdenUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class OrdenPedido implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((PedirOrdenUserInterface.MENSAJE_RESPUESTA_ORDEN),
                WebElementStateMatchers.isVisible()));
        return Text.of(PedirOrdenUserInterface.MENSAJE_RESPUESTA_ORDEN).viewedBy(actor).asString();
    }

    public static OrdenPedido mensaje() {

        return new OrdenPedido();
    }
}
