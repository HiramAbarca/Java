import java.util.Scanner;
class Promedio4{
    public static void main (String args[]){
	String nombre,repetir="no";
  	double cal1,promedio=0;
    char grupo;
    int edad;
    boolean aprobo;

	//Crear variable de clase para poder usar scanner
    Scanner entrada = new Scanner(System.in);

    //ciclo While
    while(repetir == "si"){
    
        //ASIGNO VALOR A LA VARIBLE
        System.out.println("Ingresa el nombre del alumno: ");
        nombre=entrada.nextLine();
        nombre=nombre.toUpperCase();
        
        //ciclo for
        for(int i = 1; i <= 4; i++){
            System.out.println("Ingresa la calificacion " + i + "de" + nombre);
            cal1 = entrada.nextInt();
            entrada.nextLine();
            promedio=(promedio + cal1) / i;
        }

        System.out.println("Ingresa el grupo del alumno: ");
        grupo=entrada.next().charAt(0);
        System.out.println("Ingresa la edad del alumno: ");
        edad=entrada.nextInt();
        entrada.nextLine();
        aprobo=promedio>6;
        
        //System.out.println("Datos del alumno: \n---------------------------------------------------------------------------------------------\nNombre    Edad     grupo    Promedio    Aprobado    Beca100%    Beca50%\n---------------------------------------------------------------------------------------------\n" + nombre + "        " + edad + "        "+ grupo+ "        " +promedio+ "        "+aprobo+ "        "+beca100+ "        "+beca50);
        
        //Si el alumno tiene una edad menor a 10 y su promedio es mayor a 9 tiene beca del 100
        boolean beca100 = edad <= 10 && promedio >= 9;
        System.out.println("Beca al 100%: "+ beca100);
        
        //Si el alumno tiene una edad menor a 10 o su promedio es mayor a 9 tiene beca del 50
        boolean beca50 = edad < 10 || promedio > 9;
        System.out.println("Beca al 50%: "+ beca50);
        System.out.println("Datos del alumno: \n---------------------------------------------------------------------------------------------\nNombre    Edad     grupo    Promedio    Aprobado    Beca100%    Beca50%\n---------------------------------------------------------------------------------------------\n" + nombre + "        " + edad + "        "+ grupo+ "        " +promedio+ "        "+aprobo+ "        "+beca100+ "        "+beca50);

    
        //Operadores de asignacion con 20 horas de asistencia suman 1 punto, 19-15 hrs 0.5 punto, 14-10hrs 0.3 punto 9-0 0 puntos
        int asistencia;
        System.out.println("Ingresa las horas de asistencia de " + nombre);
        asistencia=entrada.nextInt();
        entrada.nextLine();

        if(asistencia == 20){
            promedio += 1;
        }else if(promedio < 20 && promedio >= 15){
            promedio += 0.5;        
        }else if (promedio == 10 && promedio < 15){
            promedio += 0.3;
        }
        System.out.println("Promedio con puntos extras por asistencias: " + promedio);

        //Si el alumno tiene un reporte se le quita un punto
        boolean reporte = true;
        System.out.println(nombre + "Tiene un reporte de coducta?\n1. Si\n2. No");
        int reportado = entrada.nextInt();
        entrada.nextLine();

        if(reportado == 1){
            reporte = true;
            --promedio;
        }
        System.out.println("Promedio en caso de reporte: " + promedio);

        //Clase Math redondear el valor de las calificaciones
        //metodo round de 0.5 sube
        //System.out.println("Promedio con round: " + Math.round(promedio));
        System.out.println("---------------------------------------------------------------------------------------------\nPromedio con round: "  + Math.round(promedio));
        System.out.println("Ingresa el nombre del Profesor: ");
        String profesor = entrada.nextLine();

        System.out.println(profesor);
    
    System.out.println("Deseas capturar el promedio de otro alumno?: si/no");
    repetir = entrada.nextLine();
    repetir = repetir.toLowerCase();
  }  
 } 
}