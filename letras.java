import java.util.Scanner;

public interface letras {
    static Scanner sc = new Scanner(System.in);

    /*
     * 4.Diseñar un algoritmo que pida una letra de la A a la E y muestre un mensaje
     * según la letra ingresada:
     */
    public static void main(String[] args) {
        String dato;
        System.out.println("Ingrese una letra de la A ala E");
        dato=sc.next();
        String datoMinuscula=dato.toLowerCase();
        
        switch (datoMinuscula) {
            case "a" -> System.out.println("Excelente");
            case "b"-> System.out.println("Bueno");
            case "c"-> System.out.println("regular");
            case "d"-> System.out.println("pesimo");
            case "e"-> System.out.println("malo");
        }


    }
}
