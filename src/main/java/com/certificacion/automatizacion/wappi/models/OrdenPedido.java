package com.certificacion.automatizacion.wappi.models;

public class OrdenPedido {
    private String nombreProducto;

    public OrdenPedido(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }
}
