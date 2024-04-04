class Promedio{
    public static void main(String args[]){
        String nombre;
        double cal1,cal2,cal3,cal4,promedio;
        nombre="Juan";
        cal1=5;
        cal2=7.8;
        cal3=10;
        cal4=8.5;
        

        promedio=(cal1+cal2+cal3+cal4) / 4;
        System.out.print(promedio);
        System.out.print("El promedio de \n" + nombre + "\n es de: " + promedio + "\n de sus calificaciones " +"\n"+ cal1+"\n"+cal2+"\n"+cal3+"\n"+cal4);

        boolean aprobo;
        aprobo=promedio>6;
        System.out.print("\n Aprobado: "+aprobo+"\n");

        
        nombre="Pedro";
        cal1=5;
        cal2=5;
        cal3=5;
        cal4=5;

        promedio=(cal1+cal2+cal3+cal4) / 4;
        System.out.print(promedio);
        System.out.print("El promedio de \n" + nombre + "\n es de: " + promedio + "\n de sus calificaciones " +"\n"+ cal1+"\n"+cal2+"\n"+cal3+"\n"+cal4);

      
        System.out.print("\n Aprobado: "+aprobo+"\n");

 }
}