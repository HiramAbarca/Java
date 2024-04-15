public class EjemploListas {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};
        String[] nombres = {"Juan","Pedro","Miguel","Zoe","Ian"};
        /*String[] nombres = new nombres[5];
        nombres[0] = "Juan";
        nombres[1] = "Pedro";
        nombres[2] = "Manuel";
        nombres[3] = "Daniel";
        nombres[4] = "Guadalupe";

        System.out.println(numeros[0],nomrbres[3]);*/

        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i] + " " + nombres[i]);
        }
    }
    
}
