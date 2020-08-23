package com.certificacion.automatizacion.wappi.questions;

import com.certificacion.automatizacion.wappi.userinterfaces.MisProductosUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ObservarMisPedidos implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((MisProductosUserInterface.BUSCAR_PRODUCTO_AGREGADO),
                WebElementStateMatchers.isVisible()));
        return Text.of(MisProductosUserInterface.BUSCAR_PRODUCTO_AGREGADO).viewedBy(actor).asString();
    }
    public static ObservarMisPedidos mensaje() {

        return new ObservarMisPedidos();
    }
}
