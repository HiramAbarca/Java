class Promedio2{
    public static void main (String args[]){
	String nombre;
  	double cal1,cal2,cal3,cal4,promedio;
    	char grupo;
    	int edad;
    	boolean aprobo;

  	//ASIGNO VALOR A LA VARIBLE
  	nombre="Juan";
  	cal1=7.5;
  	cal2=5.6;
  	cal3=8.9;
  	cal4=7.4;
    	promedio=(cal1+cal2+cal3+cal4)/ 4;
	grupo='a';
        	edad=9;
    	aprobo=promedio>6;

  	//System.out.println("Datos del alumno: \n---------------------------------------------------------------------------------------------\nNombre    Edad     grupo    Promedio    Aprobado    Beca100%    Beca50%\n---------------------------------------------------------------------------------------------\n" + nombre + "        " + edad + "        "+ grupo+ "        " +promedio+ "        "+aprobo+ "        "+beca100+ "        "+beca50);
    
	//Si el alumno tiene una edad menor a 10 y su promedio es mayor a 9 tiene beca del 100
	boolean beca100 = edad <= 10 && promedio >= 9;
	System.out.println("Beca al 100%: "+ beca100);
	
	//Si el alumno tiene una edad menor a 10 o su promedio es mayor a 9 tiene beca del 50
	boolean beca50 = edad < 10 || promedio > 9;
	System.out.println("Beca al 50%: "+ beca50);
	System.out.println("Datos del alumno: \n---------------------------------------------------------------------------------------------\nNombre    Edad     grupo    Promedio    Aprobado    Beca100%    Beca50%\n---------------------------------------------------------------------------------------------\n" + nombre + "        " + edad + "        "+ grupo+ "        " +promedio+ "        "+aprobo+ "        "+beca100+ "        "+beca50);

  
 	//Operadores de asignacion con 20 horas de asistencia suman 1 punto, 15 hrs 0.5 punto, 10hrs 0.3 punto
	int asistencia;
	asistencia = 15;
	promedio += 0.5;
	//System.out.println("Promedio con puntos extras por asistencias: " + promedio);
	//Tabla con datos anteriores
	System.out.println("---------------------------------------------------------------------------------------------\nPromedio con puntos extras por asistencias: " + promedio);

	//Si el alumno tiene un reporte se le quita un punto
	boolean reporte = true;
	--promedio;
	//System.out.println("Promedio en caso de tener reportes: " + promedio);
	System.out.println("---------------------------------------------------------------------------------------------\nPromedio en caso de tener reportes: " + promedio);

	//Clase Math redondear el valor de las calificaciones
	//metodo round de0.5 sube
	//System.out.println("Promedio con round: " + Math.round(promedio));
	System.out.println("---------------------------------------------------------------------------------------------\nPromedio con round: "  + Math.round(promedio));

	//metodo floor de 0.5 baja
	//System.out.println("Promedio con floor: " + Math.floor(promedio));
	System.out.println("---------------------------------------------------------------------------------------------\nPromedio con round: "   + Math.floor(promedio));

	//metodo ceil sin importar sube al numero siguiente
	//System.out.println("Promedio con ceil: " + Math.ceil(promedio));
	System.out.println("---------------------------------------------------------------------------------------------\nPromedio con round: "    + Math.ceil(promedio));

 }
}