package com.certificacion.automatizacion.wappi.questions;

import com.certificacion.automatizacion.wappi.userinterfaces.ActualizarInfoPersonalUserInterfaces;
import com.certificacion.automatizacion.wappi.userinterfaces.PaginaCupones;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Cupones implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((PaginaCupones.MENSAJE_CUPON_NO_DISPONIBLE),
                WebElementStateMatchers.isVisible()));
        return Text.of(PaginaCupones.MENSAJE_CUPON_NO_DISPONIBLE).viewedBy(actor).asString();
    }
    public static Cupones mensaje(){

        return new Cupones();
    }
}
