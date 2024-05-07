package logica;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cola {

    public Cola() {
    }
    
    public void crearCola(){
        Queue <String> nombres = new LinkedList<String>();
        
        Scanner sc = new Scanner(System.in);
        
//        int contador = 7;
        
//        while(contador < 0){
//            System.out.println("Cual es tu nombre?: ");
//            nombres.add(sc.nextLine());
//            contador--;
//        }
        
        for(int i = 0; i<7; i++){
            System.out.println("Cual es tu nombre?: ");
            nombres.add(sc.nextLine());
        
        }
        System.out.println("Nombres de compañeros" + nombres);
        
        for(int i = 0; i<3; i++){
            System.out.println("El  nombre a eliminar es: " + nombres.poll());
            System.out.println("El siguiente sería: " + nombres.peek());
        
        }
    }
    
}
