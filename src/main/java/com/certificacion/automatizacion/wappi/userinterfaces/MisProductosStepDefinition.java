package com.certificacion.automatizacion.wappi.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MisProductosStepDefinition {

    public static final Target CERRAR_POPUP = Target.
            the("Cierra el popup")
            .locatedBy("(//*[text() = '×'])[3]");

    public static final Target INGRESA_MISPEDIDOS = Target.
            the("Ingresa a la opciòn de mis pedidos")
            .locatedBy("//*[text() = 'Mis pedidos']");


    public static final Target BUSCAR_PRODUCTO_AGREGADO = Target.
            the("Busca que si exista el producto agregado")
            .locatedBy("//*[text() = 'Jamón Premium']");
}
