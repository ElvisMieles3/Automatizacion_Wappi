package com.certificacion.automatizacion.wappi.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaCupones {

    public static final Target INGRESA_MISCUPONES = Target.
            the("Ingresa a la opciòn de mis cupones")
            .locatedBy("//*[text() = 'Cupones']");

    public static final Target OBTENER_CUPON_PAGINA_CUPONES = Target.
            the("Seleccina el cupon que tengo Disponible")
            .locatedBy("//*[@id='coupon-0']/td[1]");

    public static final Target MENSAJE_CUPON_NO_DISPONIBLE = Target.
            the("Muestra el mensaje de cupon no disponible")
            .locatedBy("//*[text() = 'No se encontraron registros']");

}
