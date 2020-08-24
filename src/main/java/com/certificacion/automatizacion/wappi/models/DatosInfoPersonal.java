package com.certificacion.automatizacion.wappi.models;

import java.nio.file.Paths;

public class DatosInfoPersonal {


    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String pais;
    private String sexo;
    private String imagen;

    public DatosInfoPersonal(String nombre, String apellido, String fechaNacimiento, String pais, String sexo, String imagen) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.pais = pais;
        this.sexo = sexo;
        this.imagen = imagen;
    }

    public String getNombre() {

        return nombre;
    }

    public String getApellido() {

        return apellido;
    }

    public String getFechaNacimiento() {

        return fechaNacimiento;
    }

    public String getPais() {

        return pais;
    }

    public String getSexo() {
        return sexo;
    }

    public String getUrlImagen() {
        String absolutePath = Paths.get(System.getProperty("user.dir")).normalize().toString();
        String urlImagen = Paths.get(absolutePath, "assets", this.imagen).toString();
        return urlImagen;
    }
}
