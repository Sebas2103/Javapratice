import java.util.Scanner;

public class sucesionNumeros {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));
        System.out.println("Ingrese el tamaño de los vectores");
        int tamaño = sc.nextInt();
        int vec1[] = new int[tamaño];
        int vec2[] = new int[tamaño];
        int vectorR[] = new int[tamaño];
        System.out.println("Ingrese los elementos del primer vector");
        llenar_vector(vec1);
        System.out.println("Ingrese los elementos del segundo vector");
        llenar_vector(vec2);
/*         sumar_vectores(vec1, vec2, vectorR);
 */
    }

    public static void llenar_vector(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingrese  un elemento  en la posicion " + i);
            a[i] = sc.nextInt();

        }
    }


    public static void intercambio(int a[], int b[], int c[]) {
        int auxiliar;

        for (int i = 0; i < a.length; i++){
            auxiliar=a[i];
            a[i]=b[i];
            c[i]=auxiliar;
        }
        for (int i=0;i<a.length;i++){
            System.out.println (c[i]);

        }
        System.out.println();
        
    }

}
