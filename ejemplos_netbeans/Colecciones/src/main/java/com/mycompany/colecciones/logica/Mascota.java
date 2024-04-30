package com.mycompany.colecciones.logica;

public class Mascota {
    //Atributos
    private String nombreMascota, raza, nombreDueno;
    private int edadMascota;
    private double tamanoMascota;
    
    //Metodos

    public Mascota() {
    }

    public Mascota(String nombreMascota, String raza, String nombreDueno, int edadMascota, double tamanoMascota) {
        this.nombreMascota = nombreMascota;
        this.raza = raza;
        this.nombreDueno = nombreDueno;
        this.edadMascota = edadMascota;
        this.tamanoMascota = tamanoMascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public int getEdadMascota() {
        return edadMascota;
    }

    public void setEdadMascota(int edadMascota) {
        this.edadMascota = edadMascota;
    }

    public double getTamanoMascota() {
        return tamanoMascota;
    }

    public void setTamanoMascota(double tamanoMascota) {
        this.tamanoMascota = tamanoMascota;
    }
    
    //Metodo para ver todos los datos
    public void verDatos(){
        System.out.println("Nombre de Mascota: " + this.nombreMascota + "\nRaza:" + this.raza);
    }
    
}
