import java.util.Scanner;

public class funcionmatriz {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int matriz[];
        int cantidad;

        System.out.println("Ingrese la cantidad de datos para la matriz");
        cantidad = sc.nextInt();
        sc.nextLine();
        matriz = new int[cantidad];
        int suma;

        llenar_matriz(matriz);
        verMatriz(matriz);
        suma = sumaMatriz(matriz);
        promedioMatriz(matriz, suma);

    }

    public static void llenar_matriz(int matriz[]) {
        int dato;
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Ingrese un datos de tipo texto");
            dato = sc.nextInt();
            matriz[i] = dato;

        }

    }

    public static void verMatriz(int matriz[]) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i]);

        }

    }

    public static int sumaMatriz(int matriz[]) {
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i];

        }
        System.out.println("la suma  es " + suma);
        return suma;

    }

    public static void promedioMatriz(int matriz[],int suma) {
        double promedio=0;
        promedio= (double)suma /matriz.length;
        System.out.println("El promedio de la matriz es "+promedio);
    }
}
