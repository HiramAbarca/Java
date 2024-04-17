/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.promedio2;

/**
 *
 * @author PILARES
 */
import java.util.Scanner;
public class Promedio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Declaro listas
        String[] nombres = new String[4];
        double[] promedios = new double[4];
        double calificacion;
        double promedio=0;
        
        for(int i = 0; i < 4; i++){
            System.out.println("Ingresa el nombre del alumno: " + (i + 1));
            nombres[i] = entrada.nextLine();
            
            for(int j = 0; j < 2; j++){
                System.out.println("Ingresa la calificacion " + (j+1) + " de " + nombres[i]);
                calificacion = entrada.nextDouble();
                entrada.nextLine();                
                promedio = promedio + calificacion;
                
            }
            promedio = promedio / 2;
            promedios[i] = promedio;
            promedio = 0;
        }
        
        //System.out.println("===============Nombres==================");
        
        /*for(int i = 0; i < 4; i++){
            System.out.println((i+1) + "-" + nombres[i]);
        }*/
        
        //***************************************************************
        
        //for each
        /*for(String i : nombres){
            System.out.println("-" + i);
        }
        
        System.out.println("===============Promedio==================");
        
        for(double i : promedios){
            System.out.println(i);
        }*/
        
        //***************************************************************
        
        //for para imprimir las listas
        System.out.println("Nombres    ||         Pomedio");
        for(int i = 0; i < 4; i++){
            System.out.println(nombres[i] + "              " + promedios[i]);
        }
    }
}
