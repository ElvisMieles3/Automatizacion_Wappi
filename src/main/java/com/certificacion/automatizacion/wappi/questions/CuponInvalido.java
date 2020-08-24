package com.certificacion.automatizacion.wappi.questions;

import com.certificacion.automatizacion.wappi.userinterfaces.PaginaCupones;
import com.certificacion.automatizacion.wappi.userinterfaces.PedirOrdenUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class CuponInvalido implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((PedirOrdenUserInterface.MENSAJE_ERROR_CUPON),
                WebElementStateMatchers.isVisible()));
        return Text.of(PedirOrdenUserInterface.MENSAJE_ERROR_CUPON).viewedBy(actor).asString();
    }

    public static CuponInvalido mensaje(){

        return new CuponInvalido();
    }
}
