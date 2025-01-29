package com.spring_app.apirestful.Entidad;

public class Alumno {
    private int id;
    private String nombre;
    private String ciudad;
    private int edad;

    // Constructor
    public Alumno(int id, String nombre, String ciudad, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.edad = edad;
    }

    //Se crean getters and setter manualmente ya que el lombok no funciona
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}



