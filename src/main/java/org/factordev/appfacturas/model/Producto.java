package org.factordev.appfacturas.model;

public class Producto {
    private  int codigo;
    private String nombre;
    private float precio;
    private static int ultimoCodigo;

    public Producto() {
        this.codigo = ++ ultimoCodigo;
    }

    public int getCodigo() {
        return codigo;
    }


    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }






}
