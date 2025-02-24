import java.util.Scanner;
import java.util.ArrayList;

//CAPICUA SIGNIFICA QUE TIENE EL ORDEN DE IZQUIERDA A DERECHA
public class Arraylista {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList lista = new ArrayList<>();
        int n;
        System.out.println(("ingrese la cantidad de elementos"));
        n = sc.nextInt();
        llenar_lista(lista, n);// Ingresar la cantidad de elementos
        System.out.println("lista");
        System.out.println(lista.toString());
        capicua(lista, n);

    }

    public static void llenar_lista(ArrayList a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un elemento  de la posicion " + i);
            a.add(sc.nextInt());
        }

    }

    public static void capicua(ArrayList a, int n) {
        boolean bandera = true;
        for (int i = 0; i < (n / 2); i++) { // va comparar dos elementos
            if (a.get(i) != (a.get(n - 1 - i)))
                bandera = false;

        }
        if (bandera) {
            System.out.println("Es capicua");

        } else {
            System.out.println("No es Capicua");
        }

    }

}
