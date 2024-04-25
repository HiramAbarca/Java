/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.colecciones;

import com.mycompany.colecciones.logica.Bidimensional;
import com.mycompany.colecciones.logica.Unidimensional;

public class Colecciones {

    public static void main(String[] args) {
        Unidimensional unidimensional = new Unidimensional();
        unidimensional.crearunidimensional();
        
        //Ahora objetos de Bidimensional
        Bidimensional bidimensional = new Bidimensional();
        bidimensional.crearMatriz();
    }
}
