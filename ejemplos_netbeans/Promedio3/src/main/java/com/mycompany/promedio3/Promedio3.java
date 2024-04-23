/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.promedio3;

/**
 *
 * @author PILARES
 */
import java.util.Scanner;
public class Promedio3 {

    public static void main(String[] args) {
        int[][] numeros = new int[4][2];
        Scanner sc = new Scanner(System.in);
        //numeros[2][0] = 5;
        //numeros[0][1] = 4;
        //System.out.print(numeros[2][0]);
        
        /*for(int i = 0; i < 4; i++){//filas
            for(int j = 0; j < 2; j++){//columnas
                numeros[i][j] = 7;
            }
        }*/
        
        for(int i = 0; i < 4; i++){//filas
            for(int j = 0; j < 2; j++){//columnas
                System.out.println("Ingresa valor para la matriz en " + i + " " + j);
                numeros[i][j] = sc.nextInt();
            }
        }
        System.out.println(" ");
        
        for(int i = 0; i < 4; i++){//filas
            for(int j = 0; j < 2; j++){//columnas
                System.out.println(numeros[i][j]);
            }
        }
        
        
    }
}
        