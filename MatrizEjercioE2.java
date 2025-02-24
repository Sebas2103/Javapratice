import java.util.Scanner;

public class MatrizEjercioE2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Escribir un programa que sume todos los elementos de una matriz n filas y m
        // columnas
        int filas;
        int columnas;

        System.out.println("ingrese la cantidad filas");
        filas = sc.nextInt();
        System.out.println("Ingrese la cantidad  columnas");
        columnas = sc.nextInt();

        int matriz[][] = new int[filas][columnas];

        llenarMatriz(matriz, filas, columnas);
         suma(matriz);
         multiplicarDiagonal(matriz);
        /*  guardarDiagonal(matriz); */

    }

    public static void llenarMatriz(int matriz[][], int filas, int columnas) {

        int elemento;
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                System.out.println("Ingrese el elemento de la fila " + f + " columna " + c);
                elemento = sc.nextInt();
                matriz[f][c] = elemento;

            }

        }
    }

    public static void suma(int matriz[][]) {
        // a.lenght =numero de filas
        //a [0].lenght =para el numero decolumnas
        int contenedor =0;
        for (int fila= 0 ;fila< matriz.length;fila++){
            for (int columna=0; columna< matriz[0].length;columna++){
                contenedor=contenedor+matriz[fila][columna];



            }


        }
        System.out.println("La sumatoria es "+ contenedor);




    }
    public static void mostrar( int matriz [][]){
        System.out.println("la matriz es ");

        
        for (int fila= 0 ;fila< matriz.length;fila++){
            for (int columna=0; columna< matriz[0].length;columna++){
                System.out.print("[ "+matriz[fila][columna]+ "]");



            }
             System.out.println(" ");


        }
        

    }
    public static void  multiplicarDiagonal ( int matriz [][]){
        int multiplicar=0;
        int vector [] =new int[matriz.length];

        for (int fila= 0 ;fila< matriz.length;fila++){
            for (int columna=0; columna< matriz[0].length;columna++){
                if (fila==columna){
                    vector[matriz.length]=matriz[fila][columna];
                }
       



            }

        for ( int i =0; i<vector.length;i++){
            if (i!=0)
            multiplicar= vector[i];
            
        }
        System.out.println(multiplicar);
        
    }
    
        
    

}
}
