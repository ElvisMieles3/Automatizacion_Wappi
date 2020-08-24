package com.certificacion.automatizacion.wappi.questions.pantallainformacioncliente;

import com.certificacion.automatizacion.wappi.userinterfaces.ActualizarInfoPersonalUserInterfaces;
import com.certificacion.automatizacion.wappi.userinterfaces.LoginUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Imagen implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((ActualizarInfoPersonalUserInterfaces.MENSAJE_FALTANTE_IMAGEN),
                WebElementStateMatchers.isVisible()));
        return Text.of(ActualizarInfoPersonalUserInterfaces.MENSAJE_FALTANTE_IMAGEN).viewedBy(actor).asString();
    }

    public static Imagen mensaje(){

        return new Imagen();
    }
}
