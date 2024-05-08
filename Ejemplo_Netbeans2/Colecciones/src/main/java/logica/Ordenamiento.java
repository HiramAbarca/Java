package logica;

import java.util.Scanner;

public class Ordenamiento {

    public Ordenamiento() {
    }
    
    //Metodo de ordenamiento por Burbuja
    public void burbuja(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingresa el tamaño del arreglo: " );
        int nElementos = sc.nextInt();
        //arreglo unidimensional sintaxis
        int [] numeros = new int[nElementos];
//        int [] numeros = new int{5,8,9,1,2};

        for(int i = 0; i<nElementos; i++){
            System.out.println("Ingresa el numero para el indice " + i);
            numeros[i] = sc.nextInt();
            sc.nextLine();
        
        }
        System.out.println("Arreglo sin ordenar:");
        for(int i = 0; i<nElementos; i++){
            System.out.println(numeros[i]);
        }
        
        //Ordenamiento por Burbuja
        int auxiliar;
        for(int i=0;i<(nElementos-1);i++){
            for(int j = 0;j<(nElementos-1);j++){
                if(numeros[j]>numeros[j+1]){
                    auxiliar=numeros[j];
                    numeros[j]=numeros[j+1];
                    numeros[j+1]=auxiliar;
                }   

            }
        }
        System.out.println("Arreglo ordenado");
        for(int i = 0; i<nElementos; i++){
        System.out.println(numeros[i]);
        }
    }
    
    //Metodo de ordenamiento por Insercion
    public void insercion(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingresa el tamaño del arreglo: " );
        int nElementos = sc.nextInt();
        //arreglo unidimensional sintaxis
        int [] numeros = new int[nElementos];

        for(int i = 0; i<nElementos; i++){
            System.out.println("Ingresa el numero para el indice " + i);
            numeros[i] = sc.nextInt();
            sc.nextLine();
        
        }
        System.out.println("Arreglo sin ordenar:");
        
        for(int i = 0; i<nElementos; i++){
            System.out.println(numeros[i]);
        }
        
        int auxiliar,posicion;
        for(int i =0;i<nElementos;i++){
            posicion = i;
            auxiliar=numeros[i];   
            while ((posicion>0)&&(numeros[posicion-1]>auxiliar)){
                numeros[posicion] =numeros[posicion-1];
                posicion--;
            }
            numeros[posicion] = auxiliar;
        }
        
        System.out.println("Arreglo ordenado");
        for(int i = 0; i<nElementos; i++){
        System.out.println(numeros[i]);
        }
    }
    
}
