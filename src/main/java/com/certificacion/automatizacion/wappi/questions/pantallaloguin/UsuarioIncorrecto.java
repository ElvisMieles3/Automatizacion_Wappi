package com.certificacion.automatizacion.wappi.questions.pantallaloguin;

import com.certificacion.automatizacion.wappi.questions.Login;
import com.certificacion.automatizacion.wappi.userinterfaces.LoginUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class UsuarioIncorrecto implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((LoginUserInterface.MENSAJE_USUARIO_INCORRECTO),
                WebElementStateMatchers.isVisible()));
        return Text.of(LoginUserInterface.MENSAJE_USUARIO_INCORRECTO).viewedBy(actor).asString();
    }
    public static UsuarioIncorrecto mensaje(){

        return new UsuarioIncorrecto();
    }
}
