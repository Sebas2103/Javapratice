import java.util.Scanner;

public class tallerp2 {
    public static void main(String[] args) {
        /*2.	Diseñe un programa que calcule la nota definitiva de un estudiante a
         partir de la nota del examen parcial que corresponde a un 20%,
          la nota del examen final que también corresponde a un 20% y la nota del 
          seguimiento que corresponde a un 60% de la asignatura. */
          Scanner sc = new Scanner(System.in);
          double parcial,examenFinal,notaSeguimiento;
          System.out.println("Ingrese la nota del parcial ");
          parcial=sc.nextDouble();
          System.out.println("Ingrese la nota del examen final");
          examenFinal=sc.nextDouble();
          System.out.println("Ingrese la nota del segumiento ");
          notaSeguimiento=sc.nextDouble();

            parcial=parcial*0.20;
            examenFinal=examenFinal*0.20;
            notaSeguimiento=notaSeguimiento*0.60;
            double promedio;
            promedio=(notaSeguimiento+examenFinal+parcial);
            System.out.println("El promedio es "+promedio);
            sc.close();
          


    }
    
}
