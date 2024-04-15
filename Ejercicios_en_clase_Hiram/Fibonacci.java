public class Fibonacci {
    public static void main(String[] args) {
        int primer_numero = 0;
        int segundo_numero = 1;
        
        
        for(int i = 1; i <= 15; i++){
            System.out.println(primer_numero + "\n");
            int sig_numero = primer_numero + segundo_numero;
            primer_numero = segundo_numero;
            segundo_numero = sig_numero;
        }
    }
    
}
