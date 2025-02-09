import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("Ingrese un numero");
        x = sc.nextInt();

        if (x > 0) {
            y = 2 * x;

        } else {
            y=x*x;

        }
        System.out.println("El resultado es: "+y);
        sc.close();

    }
}
