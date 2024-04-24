/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.promedio4.logica;

/**
 *
 * @author PILARES
 */

public class Alumno {
    //Atributos 
    private String nombre;
    private double promedio;
    private double cal1, cal2, cal3, cal4;
    private int edad;
    
    
    //Metodos
    
    //Cosntructor Vacio
    public Alumno() {
    }
    
    //Constructor con Datos

    public Alumno(String nombre, double promedio, double cal1, double cal2, double cal3, double cal4, int edad) {
        this.nombre = nombre;
        this.promedio = promedio;
        this.cal1 = cal1;
        this.cal2 = cal2;
        this.cal3 = cal3;
        this.cal4 = cal4;
        this.edad = edad;
    }
    
    
    //Get and set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double getCal1() {
        return cal1;
    }

    public void setCal1(double cal1) {
        this.cal1 = cal1;
    }

    public double getCal2() {
        return cal2;
    }

    public void setCal2(double cal2) {
        this.cal2 = cal2;
    }

    public double getCal3() {
        return cal3;
    }

    public void setCal3(double cal3) {
        this.cal3 = cal3;
    }

    public double getCal4() {
        return cal4;
    }

    public void setCal4(double cal4) {
        this.cal4 = cal4;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    
    //Metodo para visualizar los datos
    public void mostrarDatos(){
        System.out.println("----Alumno---- \nNombre: " + this.nombre + "\nPromedio: " + this.promedio + "\nCalificacion 1: " + this.cal1 + "\nCalificacion 2: " + this.cal2 + "\nCalificacion 3: " + this.cal3 + "\nCalificacion 4: " + this.cal4 + "\nEdad: " + this.edad);
    }
    
}
