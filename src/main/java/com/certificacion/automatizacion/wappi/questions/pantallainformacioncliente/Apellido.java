package com.certificacion.automatizacion.wappi.questions.pantallainformacioncliente;

import com.certificacion.automatizacion.wappi.userinterfaces.ActualizarInfoPersonalUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Apellido implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((ActualizarInfoPersonalUserInterfaces.MENSAJE_FALTANTE_APELLIDO),
                WebElementStateMatchers.isVisible()));
        return Text.of(ActualizarInfoPersonalUserInterfaces.MENSAJE_FALTANTE_APELLIDO).viewedBy(actor).asString();
    }

    public static Apellido mensaje(){

        return new Apellido();
    }
}
