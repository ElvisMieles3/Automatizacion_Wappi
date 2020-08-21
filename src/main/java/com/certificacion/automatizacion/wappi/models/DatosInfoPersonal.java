package com.certificacion.automatizacion.wappi.models;

public class DatosInfoPersonal {


    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String pais;
    private String sexo;
    private String urlImagen;

    public DatosInfoPersonal(String nombre, String apellido, String fechaNacimiento, String pais, String sexo, String urlImagen) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.pais = pais;
        this.sexo = sexo;
        this.urlImagen = urlImagen;
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

        return urlImagen;
    }
}
