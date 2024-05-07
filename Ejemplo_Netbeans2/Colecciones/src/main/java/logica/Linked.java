package logica;

import java.util.LinkedList;

public class Linked {

    public Linked() {
    }
    public void crearLinked(){
        LinkedList <String> lista = new LinkedList <>();
        
        lista.add("Miguel");
        lista.add("Jose");
        lista.add("Pedro");
        lista.add("Angel");
        
        System.out.println("Lista: " + lista);
        System.out.println("Elemento en la posicion 2 " + lista.get(1));
        
        lista.set(3, "Julio");
        System.out.println("Lista: " + lista);
                
    
    }
}
