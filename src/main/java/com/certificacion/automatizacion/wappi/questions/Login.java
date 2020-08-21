package com.certificacion.automatizacion.wappi.questions;

import com.certificacion.automatizacion.wappi.userinterfaces.LoginUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Login implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((LoginUserInterface.MENSAJE_RESPUESTA), WebElementStateMatchers.isVisible()));
        return Text.of(LoginUserInterface.MENSAJE_RESPUESTA).viewedBy(actor).asString();
    }

    public static Login mensaje(){

        return new Login();
    }
}
