import java.util.Scanner;

//del número, si este termina en 4, 7 o 9 multiplicar 
//el número ingresado por 5. En otro caso, mostrar el número ingresado.
public class condicionNumeros {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numero;

        System.out.println("Ingrese un numero");
        numero = sc.nextInt();

        if (numero == 4 || numero == 7 || numero == 9) {
            numero = numero * 5;

        }
        System.out.println(numero);

    }
}
