package com.certificacion.automatizacion.wappi.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SolicitarCuponUserInterface {
    public static final Target SELECCIONA_BOTON_OBTENER_CUPON = Target.
            the("Selecciona producto")
            .located(By.id("welcome-coupon"));

    //ubicaciòn del cupon
    public static final Target SELECCIONA_CODIGO_CUPON = Target.
            the("Selecciona el codigo del cupòn")
            .locatedBy("//span[@id='coupon-code']");

    public static final Target CIERRA_POPUP = Target.
            the("Cierra el Popup")
            .locatedBy("(//*[text() = '×'])[1]");

    public static final Target HOME = Target.
            the("Ingresa a la pagina del inicio")
            .locatedBy("//*[text() = 'Inicio']");

    public static final Target ESCRIBIR_CUPON = Target.
            the("Selecciona producto")
            .located(By.id("coupon"));




}
