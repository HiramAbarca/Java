package com.mycompany.colecciones.logica;

public class Unidimensional {

    //Atributos
    
    
    
    //Metodos
    //Constructores
    //Constructor Vacio porque no tiene datos
    public Unidimensional() {
    }
    
    public void crearunidimensional(){
        //Asi se instancia una clase
        int[] numeros = {12,10,4,24,5,9}; 
        for(int i=0; i<6; i++){
            System.out.println("El arreglo en la posicio " + i + " tiene el valor" + numeros[i]);
        }
    }
    //Get y Set
}
