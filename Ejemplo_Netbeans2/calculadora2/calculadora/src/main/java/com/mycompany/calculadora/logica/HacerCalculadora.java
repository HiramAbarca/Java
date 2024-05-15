package com.mycompany.calculadora.logica;

import com.mycompany.calculadora.igu.Inicio;

public class HacerCalculadora {

    public HacerCalculadora() {
    }
    
    public void ventana(){
        Inicio ventana1 = new Inicio();
        //1.-Visualizar
        ventana1.setVisible(true);
        //2.-Ponerle titulo a la ventana
        ventana1.setTitle("Inicio");
        //3.-Bloquear el modificacion de tamaño de la ventana
        ventana1.setResizable(false);
        //4.-Para poner por default la localizacion de la ventana
        ventana1.setLocationRelativeTo(null);
        
    }
}
