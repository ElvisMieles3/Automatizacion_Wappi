package com.certificacion.automatizacion.wappi.tasks;

import com.certificacion.automatizacion.wappi.models.DatosLogin;
import com.certificacion.automatizacion.wappi.userinterfaces.LoginUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarDatosLogin implements Task {

    private DatosLogin datosLogin;

    public IngresarDatosLogin(DatosLogin datosLogin) {

        this.datosLogin = datosLogin;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(datosLogin.getUsuario()).into(LoginUserInterface.DIGITA_EL_USUARIO));
        actor.attemptsTo(Enter.theValue(datosLogin.getContrasena()).into(LoginUserInterface.DIGITA_CONTRASENA));
        actor.attemptsTo(Click.on(LoginUserInterface.SELECCIONA_BOTON_INGRESAR));

    }

    public static IngresarDatosLogin conDatos( DatosLogin datosLogin){

        return new IngresarDatosLogin(datosLogin);
    }
}
