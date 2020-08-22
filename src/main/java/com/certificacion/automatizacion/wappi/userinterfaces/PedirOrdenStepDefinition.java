package com.certificacion.automatizacion.wappi.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PedirOrdenStepDefinition {

    public static final Target SELECCIONA_PRODUCTO = Target.
            the("Seelecciona producto")
            .locatedBy("(//button[@class='button success offers-table-block-button'])[3]");

    public static final Target CONFIRMAR_PRODUCTO = Target.
            the("Confirma el producto")
            .located(By.id("order-confirm"));
    public static final Target MENSAJE_RESPUESTA_ORDEN = Target.
            the("Muestra el mensaje de confirmaciòn de producto")
            .locatedBy("//*[text() = 'Tu pedido ha sido confirmado, te mantendremos informado ante nuevas novedades']");

}
