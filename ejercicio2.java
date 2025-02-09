import java.util.Scanner;
// Consola 

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        System.out.println("Ingrese el primer numero ");// instruccion de salida
        x = sc.nextInt();// lectura de la variable
        System.out.println("Ingrese el segundo  numero ");// instruccion de salida
        y = sc.nextInt();// lectura de la variable
        z = x + y;
        System.out.println("El resultado es " + z);
        sc.close();

    }
}
