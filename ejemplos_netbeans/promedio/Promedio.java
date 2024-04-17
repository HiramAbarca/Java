/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.promedio;

import java.util.Scanner;
class Promedio{
  public static void main (String args[]){
  String nombre, estatus, repetir = "si";
  double cal, promedio=0;
  char grupo;
  int edad;
  boolean aprobo;

  //aqui deben de ir para evitar se reinicien en el while
  double alta = 0,baja = 10;
  String nombreAlto= "" ,nombreBajo = "";


  //variable de clase
  Scanner entrada =  new Scanner(System.in);


  while(!repetir.equalsIgnoreCase("no")){   
   
    //ASIGNO VALOR A LA VARIBLE
    System.out.println("Ingresa el nombre del alumno");
    nombre=entrada.nextLine();
    nombre = nombre.toUpperCase();

    //dependiendo el grupo es el número de calificaciones grupo A - 2, grupo B - 4 y grupo C - 6
    System.out.println("Ingresa el grupo de " + nombre + " A , B o C ");
    grupo = entrada.next().charAt(0);

    switch (grupo){
      case 'A':
        for(int i = 1; i <= 2; i++){
          System.out.println("Ingresa la calificación " + i + "  de " + nombre);
          cal = entrada.nextDouble();
          entrada.nextLine();
          
          if (cal >10 || promedio < 0) {
            System.out.println("Calificación invalida ");
            i--;
          }else{
            promedio = promedio + cal;
          }
        }
          promedio = promedio / 2;

        break;

      case 'B':
        for(int i = 1; i <= 6; i++){
          System.out.println("Ingresa la calificación " + i + "  de " + nombre);
          cal = entrada.nextDouble();
          entrada.nextLine();
          
          if (cal >10 || promedio < 0) {
            System.out.println("Calificación invalida ");
            i--;
          }else{
            promedio = promedio + cal;
          }
        }
          promedio = promedio / 6;
        break;

      case 'C':
        for(int i = 1; i <= 4; i++){
          System.out.println("Ingresa la calificación " + i + "  de " + nombre);
          cal = entrada.nextDouble();
          entrada.nextLine();
          
          if (cal >10 || promedio < 0) {
            System.out.println("Calificación invalida ");
            i--;
          }else{
            promedio = promedio + cal;
          }
        }
          promedio = promedio / 4;

        break;

      default:
        System.out.println("Opcion no valida");

    }

    
    
    System.out.println("Ingresa la edad de " + nombre);
    edad=entrada.nextInt();
    entrada.nextLine();

    aprobo=promedio>6;

    //si tiene una edad menor a 10 y su promedio es mayor a 9 tiene beca al 100
    boolean beca100 = edad <= 10 && promedio >= 9;
  
    //si tiene una edad menor a 10 o su promedio es mayor a 9 tiene beca al 50
    boolean beca50 = edad < 10 || promedio >= 9;	
  

  
  //de asignacion 20 horas de asistemcia suman 1 punto 15 .5 punto y 10 .3 
  int asistencia;
  System.out.println("Ingresa las horas de asistencia de " + nombre);
  asistencia = entrada.nextInt();
  entrada.nextLine();


  //si tiene reporte se le quita un punto
  int rep;
  boolean reporte = false;
  System.out.println(nombre + " tiene reportes de conducta \n1.- SI\n2.- NO");
  rep = entrada.nextInt();
  entrada.nextLine();

  
    
    if(asistencia <= 20 && asistencia > 15){
      promedio += 1;
    }else if(asistencia <=15 && asistencia > 10){
      promedio += .5;
    }else if(asistencia == 10 ){
      promedio += .3;
    }

  

  
    if(rep == 1){
      reporte = true;
      --promedio;
    }
    


    if(promedio >= 9){
      estatus = "EXCELENTE";
    }else if(promedio > 7 && promedio < 9){
      estatus = "MUY BIEN";
    }else if(promedio >= 6 && promedio < 7){
      estatus = "BIEN";
    }else{
      estatus = "MAL";
    }
    
    if(promedio > 10){
    promedio = 10;
    }
    

    System.out.println("\n\n=====================================================Datos del alumno:==========================================================\n-----------------------------------------------------------------------------------------------------\nNombre    Edad     grupo    Promedio    Aprobado       beca al 100%        beca al 50%            horas asistidas      reportes          status \n    -------------------------------------------------------------------------------------------------------------\n" + nombre + "        " + edad + "        "+ grupo+ "        " +Math.round(promedio)+ "        "+aprobo+ "            " + beca100+ "            " + beca50+ "            " + asistencia + "            "+ reporte  + "            "+estatus);


    //calificacion alta y baja
    

    if (promedio > alta) {
      alta =promedio;
      nombreAlto=nombre;
    }

    if (promedio < baja) {
      baja = promedio;
      nombreBajo=nombre;
    }

    System.out.println("El mayor promedio es de: " + alta + " de: " + nombreAlto);
    System.out.println("El menor promedio es de: " + baja + " de " + nombreBajo);
 
    System.out.println("Deseas calcular el promedio de otro alumno SI/NO");
    repetir = entrada.nextLine();
    System.out.println(repetir);

        //reestablecer promedio
    promedio=0;
 
  }
  System.out.println("==========================================\nHasta luego\n===================================");
}
}