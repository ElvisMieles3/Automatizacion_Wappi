package com.certificacion.automatizacion.wappi.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ActualizarInfoPersonalUserInterfaces {





    public static final Target INGRESA_INFORMACION_PERSONAL= Target.
            the(" Ingresa a la ventana de información Personal")
            .locatedBy("//*[text() = 'Información personal']");

    public static final Target DIGITA_NOMBRE= Target.
            the("Digita el nombre del usuario")
            .located(By.id("name"));

    public static final Target DIGITA_APELLIDO= Target.
            the("Digita el apellido del usuario")
            .located(By.id("lastName"));

    public static final Target DIGITA_FECHA_NACIMIENTO= Target.
            the("Digita la fecha de nacimiento del usuario")
            .located(By.id("bornDate"));

    public static final Target SELECCIONA_PAIS= Target.
            the("Selecciona el paìs")
            .locatedBy("//select[@id='country']//option[.='{0}']");

    public static final Target SELECCIONA_SEXO= Target.
            the("Selecciona el Sexo")
            .locatedBy("//span[@class='radio-label']//option[.='{0}']");

    public static final Target SELECCIONA_BOTON_GUARDAR= Target.
            the("Digita la fecha de nacimiento del usuario")
            .located(By.id("save-profile"));

}
