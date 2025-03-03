import java.util.Scanner;

//1.	Escribir un programa en java que sume todos los elementos de una matriz de n
//ilas y m columnas. Mostrar el resultado
public class actividad4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int filas;
        int columnas;

        System.out.println("Ingrese una mtriz cuadrada");
        System.out.println("Ingrese la cantidad de filas");
        filas = sc.nextInt();
        System.out.println("Ingrese la cantidad de columnas");
        columnas = sc.nextInt();

        int matriz[][] = new int[filas][columnas];
        if (columnas == filas) {
            llenarMatriz(matriz);

            llenar_vector(matriz);
            mostrar_Matriz(matriz);
        } else {
            System.out.println("Su matriz no es cuadrada");
        }

    }

    public static void llenar_vector(int matriz[][]) {
        int vector[] = new int[matriz.length];
        int contador = 0;

        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                if (c == f) {
                    System.out.println(matriz[f][c]);
                    vector[contador] = matriz[f][c];
                    contador += 1;

                }
            }
           

        }
        for (int v = 0; v < vector.length; v++) {
            System.out.println("la diagonal del vector es " + vector[v]);
        }
    }

    public static void llenarMatriz(int matriz[][]) {

        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.println("Ingrese el dato");
                matriz[f][c] = sc.nextInt();

            }

        }

    }

    public static void mostrar_Matriz(int matriz[][]) {

        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[f][c]);

            }

        }

    }
}
