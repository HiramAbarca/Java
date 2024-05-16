
package com.mycompany.empleado;

import com.mycompany.empleado.igu.Principal;


public class Empleado {

    public static void main(String[] args) {
        Principal ventanaPrincipal =new Principal();
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setTitle("Inicio");
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);
    }
}
