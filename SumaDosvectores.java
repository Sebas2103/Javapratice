import java.util.Scanner;

public class SumaDosvectores {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int tamaño;
        System.out.println("Ingrese el tamaño del vector");
        tamaño = sc.nextInt();
        int vec1[] = new int[tamaño];
        int vec2[] = new int[tamaño];
        int vec3[] = new int[tamaño];
        System.out.println("Ingrese los elementos del primer bvector");
        llenar_vector(vec1);
        System.out.println("Ingrese los elementos del segundo vector");
        llenar_vector(vec2);
        System.out.println("vector 1");
        mostrar_vector(vec1);
        System.out.println("vector 2");
        mostrar_vector(vec2);
        sumar_vectores(vec1, vec2, vec3);
        System.out.println("vectores 3");
        mostrar_vector(vec3);

    }

    public static void llenar_vector(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingrese  un elemento  en la posicion " + i);
            a[i] = sc.nextInt();

        }
    }

    public static void sumar_vectores(int a[], int b[], int c[]) {
        for (int i = 0; i < a.length; i++)
            c[i] = a[i] + b[i];
    }

    public static void mostrar_vector(int a[]){
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);

        }
        System.out.println();
        
    }

}
