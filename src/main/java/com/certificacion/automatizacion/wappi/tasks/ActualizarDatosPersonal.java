package com.certificacion.automatizacion.wappi.tasks;

import com.certificacion.automatizacion.wappi.models.DatosInfoPersonal;
import com.certificacion.automatizacion.wappi.userinterfaces.ActualizarInfoPersonalUserInterfaces;
import com.certificacion.automatizacion.wappi.userinterfaces.LoginUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ActualizarDatosPersonal implements Task {

    private DatosInfoPersonal datosInfoPersonal;

    public ActualizarDatosPersonal(DatosInfoPersonal datosInfoPersonal) {

        this.datosInfoPersonal = datosInfoPersonal;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(ActualizarInfoPersonalUserInterfaces.INGRESA_INFORMACION_PERSONAL));
        actor.attemptsTo(Enter.theValue(datosInfoPersonal.getNombre()).into(ActualizarInfoPersonalUserInterfaces.DIGITA_NOMBRE));
        actor.attemptsTo(Enter.theValue(datosInfoPersonal.getApellido()).into(ActualizarInfoPersonalUserInterfaces.DIGITA_APELLIDO));
        actor.attemptsTo(Enter.theValue(datosInfoPersonal.getFechaNacimiento()).into(ActualizarInfoPersonalUserInterfaces.DIGITA_FECHA_NACIMIENTO));

    }

    public static ActualizarDatosPersonal conDatos(DatosInfoPersonal datosInfoPersonal){

        return new ActualizarDatosPersonal(datosInfoPersonal);
    }
}
