package com.mycompany.colecciones;


import com.mycompany.colecciones.logica.Bidimensional;
import com.mycompany.colecciones.logica.Mascota;
import com.mycompany.colecciones.logica.MascotaAcuatica;
import com.mycompany.colecciones.logica.Unidimensional;
import java.util.ArrayList;

public class Colecciones {

    public static void main(String[] args) {
//        Unidimensional unidimensional = new Unidimensional();
//        unidimensional.crearunidimensional();
//        
//        Ahora objetos de Bidimensional
//        Bidimensional bidimensional = new Bidimensional();
//        bidimensional.crearMatriz();
        
        //Metodo de constructor con Datos
        Mascota mascota1 = new Mascota("Manchas","Dalmata","Roberto",3,62.5);
        
        //Metodo de constructor Vacio
        Mascota mascota2 = new Mascota();
        mascota2.setNombreMascota("Lucho");
        mascota2.setRaza("Doberman");
        mascota2.setNombreDueno("Luis");
        mascota2.setEdadMascota(1);
        mascota2.setTamanoMascota(58.3);
        
        //System.out.println(mascota2.getNombreMascota() + "\n" + mascota2.getRaza() + "\n" + mascota2.getNombreDueno() + "\n" + mascota2.getEdadMascota() + "\n" + mascota2.getTamanoMascota());      
        
        //Array list
        ArrayList<Mascota> mascotasActuales = new ArrayList();
        mascotasActuales.add(mascota1);
        mascotasActuales.add(mascota2);
        
        //System.out.println("Total de mascotas: " + mascotasActuales.size());
        
        //mascota1.verDatos();
        mascota2.verDatos();
        
        MascotaAcuatica mascotaAcuatica1 = new MascotaAcuatica();
        mascotaAcuatica1.setNombreMascota("Doby");
        mascotaAcuatica1.setRaza("Pez Globo");
        mascotaAcuatica1.setNombreDueno("Julio");
        mascotaAcuatica1.setEdadMascota(1);
        mascotaAcuatica1.setTamanoMascota(10.2);
        mascotaAcuatica1.setEspecie("Pez Globo");
        
        mascotaAcuatica1.verDatos();
        System.out.println(mascotaAcuatica1.getNombreMascota() + "\n" + mascotaAcuatica1.getRaza() + "\n" + mascotaAcuatica1.getNombreDueno() + "\n" + mascotaAcuatica1.getEdadMascota() + "\n" + mascotaAcuatica1.getTamanoMascota());      
       
    }
}
