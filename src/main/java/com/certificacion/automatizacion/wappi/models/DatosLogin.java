package com.certificacion.automatizacion.wappi.models;

public class DatosLogin {
    private String usuario;
    private String contrasena;


    public DatosLogin(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }


    public String getUsuario() {

        return usuario;
    }

    public String getContrasena()
    {

        return contrasena;
    }
}
