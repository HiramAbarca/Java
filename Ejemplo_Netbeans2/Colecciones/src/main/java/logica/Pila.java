package logica;
import java.util.Stack;
public class Pila {

    public Pila() {
    }
  
    public void hacerPila(){
      Stack <String> camisas = new Stack<>();
      //Pila || tipo de variable || nombre de la pila || = new Pila;
      camisas.push("roja");
      camisas.push("azul");
      camisas.push("negra");    
      
//        System.out.println("Pila camisas" + camisas);
     
//        //Para visualizar el elemtno superior de la pila 
      System.out.println("El elemento en la parte superior de la pila es: " + camisas.peek());
//        
//        //Para eliminar un elemento de la pila
//        String eliminado = camisas.pop();
//        System.out.println("Elemento eliminado: " + eliminado);
//        
//        //Para buscar un elemento de la pila
//        int indice = camisas.search("azul");
//        System.out.println("Camisa azul esta en el indice: " + indice);
        while(camisas.empty() ==  false){
            System.out.println("Camisa eliminada: " + camisas.pop());
        }
    }    
}
