/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.promedio4;

import com.mycompany.promedio4.logica.Alumno;

/**
 *
 * @author PILARES
 */
public class Promedio4 {
    public static void main(String[] args) {
        //Instanciamos un objeto
        Alumno alumno1 = new Alumno();
        //Como fue del cosntructor vacio NO trae datos, le doy datos via el set
        alumno1.setNombre("Juan");
        alumno1.setPromedio(5.5);
        alumno1.setCal1(7);
        alumno1.setCal2(8.7);
        alumno1.setCal3(6.8);
        alumno1.setCal4(9.5);
        alumno1.setEdad(15);
        //Visualizo via get
        //System.out.println("Nombre: "+ alumno1.getNombre()+"\nPromedio: "+alumno1.getPromedio());
        
        //Objeto 2
        Alumno alumno2 = new Alumno();
        alumno2.setNombre("Laura");
        alumno2.setPromedio(8.2);
        alumno2.setCal1(5.5);
        alumno2.setCal2(7.5);
        alumno2.setCal3(9.8);
        alumno2.setCal4(7.6);
        alumno2.setEdad(14);
        //System.out.println("Nombre: "+ alumno2.getNombre()+"\nPromedio: " +alumno2.getPromedio());
        
        //Usando el constructor con Datos
        Alumno alumno3 = new Alumno("Juan",6.3,8.5,9.2,5.5,6.3,15);
        //System.out.println("Nombre: "+ alumno3.getNombre()+"\nPromedio: " +alumno3.getPromedio());
        
        Alumno alumno4 = new Alumno("Gilberto",7.6,7.9,6.8,9.5,7.8,16);
        //System.out.println("Nombre: "+ alumno4.getNombre()+"\nPromedio: " +alumno4.getPromedio());
        
        //Metodo para visualizar los datos
        alumno1.mostrarDatos();
        alumno2.mostrarDatos();
        alumno3.mostrarDatos();
        alumno4.mostrarDatos();
    }
}
