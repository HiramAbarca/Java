
package com.mycompany.colecciones.logica;


public class Bidimensional {


    //Atributos
    //Metodos
    //Metodos constructores
    public Bidimensional() {
    }
    
    public void crearMatriz(){
        String[][] nombreEdad = {{"Mario","22"},{"Luigi","20"},{"Pedro","25"},{"Carlos","23"}};
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 2; j++){
                System.out.println(nombreEdad[i][j]);
            }
        }
        
        
        
    }
}
