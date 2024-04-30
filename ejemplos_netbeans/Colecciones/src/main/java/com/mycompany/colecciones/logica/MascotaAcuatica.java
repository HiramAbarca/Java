package com.mycompany.colecciones.logica;

public class MascotaAcuatica extends Mascota{
    //Atributos
    private String especie;
    
    //Metodos

    public MascotaAcuatica() {
    }

    public MascotaAcuatica(String especie, String nombreMascota, String raza, String nombreDueno, int edadMascota, double tamanoMascota) {
        super(nombreMascota, raza, nombreDueno, edadMascota, tamanoMascota);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    //Metodo para ver todos los datos
    public void verDatos(){
        System.out.println("Especie: " + this.especie);
    }
}
