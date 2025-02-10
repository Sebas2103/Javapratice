import java.util.Scanner;

//Diseñar un algoritmo que calcule la  sumade n numeros ingresados por teclado. El usuario debespecificar elvalor de n 
public class ciclofor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        float num, sum = 0;
        System.out.println("Ingrese la cantidad");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("ingrese un numero");
            num = sc.nextFloat();
            sum = sum + num;

        }
        System.out.println("la suma de los numeros ingresados es " + sum);
        sc.close();

    }

}
