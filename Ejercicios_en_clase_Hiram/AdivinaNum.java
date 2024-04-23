import java.util.Random;
import java.util.Scanner;
public class AdivinaNum {
    public static void main(String[] args) {
        int min = 1;
        int max = 10;
        Random aleatorio = new Random();
        int value = aleatorio.nextInt(max - min + 1) + min;
        System.out.println("Numero aleatorio entre 1 y 10: " + value);

        int numero_usuario; 
        int numero_adiv;
        Scanner usuario =  new Scanner(System.in);

        System.out.println("Adivina un numero del 1 al 10");

        for(int i = 1; i <= 5; i++){
            numero_usuario = usuario.nextInt();
            if(numero_usuario != value);
                System.out.println("El numero es incorrecto");       
        }

        
    }
}
