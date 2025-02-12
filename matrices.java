import java.util.Scanner;

public class matrices {
    // Realizar la suma de todos los elementos de un vector
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int tamaño;
        System.out.println("Ingrese el tamaño del vector");
        tamaño = sc.nextInt();
        int vec[] = new int[tamaño];
        System.out.println("Ingresar los elementos del vector");
        llenar_vector(vec);
        System.out.println(("suma de elementos"));
        sumar_vector(vec);

    }

    // void significa que NO RETORNO
    public static void llenar_vector(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingrese un elemento en la posicion " + i);
            a[i] = sc.nextInt();
            // tamaño de a lenght indica el tamaño de a
        }
    }
    public static void sumar_vector(int a[]) {
        int sum=0;
        for(int i=0;i<a.length;i++)
        sum=sum+a[i];
        System.out.println(sum);
        
    }
    public static void mostrar_vector(int a[]){
        for (int i=0;i<a.length;i++)
        System.out.println(a[i]);
        System.out.println();
    }

}
