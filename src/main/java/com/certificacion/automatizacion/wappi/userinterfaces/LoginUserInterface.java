package com.certificacion.automatizacion.wappi.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUserInterface {




    public static final Target DIGITA_EL_USUARIO = Target.
            the("Digita el usuario")
            .located(By.id("username"));


    public static final Target DIGITA_CONTRASENA = Target.
            the("Digita la contraseña")
            .located(By.id("password"));

    public static final Target SELECCIONA_BOTON_INGRESAR = Target.
            the("Selecciona el boton Ingresar")
            .located(By.id("button-login"));

    public static  final Target MENSAJE_RESPUESTA = Target.
            the("Muestra el mensaje de las ofertas seleccionadas")
            .locatedBy("//*[text() = 'Ofertas']");

    public static  final Target MENSAJE_USUARIO_INCORRECTO = Target.
            the("Muestra el mensaje de las ofertas seleccionadas")
            .located(By.id("e-username"));
}
