/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pares;

/**
 *
 * @author PILARES
 */
import java.util.Scanner;
public class Pares {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] pares = new int[10];
        
        for(int i = 0; i < 10; i++){
            System.out.println("Ingresa un numero del 1 al 10: " + (i+1));
            numeros[i] = entrada.nextInt();
            entrada.nextLine();
            if(numeros[i] % 2 == 0){
                pares[i] = numeros[i];
            }
        }
        System.out.println(numeros);
        
    }
    
}
