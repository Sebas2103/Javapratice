import java.util.Scanner;

public class EjercicioInde {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorCasa;
        double cuotaInicial;
        double valorRestante;
        /* double valorMensual; */

        System.out.println("Ingrese  el valor de la casa: ");
        valorCasa = sc.nextInt();
        cuotaInicial = valorCasa * 0.20;
        valorRestante = valorCasa - cuotaInicial;

        System.out.println("El valor  restante de la casa que le debe al banco es ");
        System.out.println("El valor  en cuota inicial es " + valorRestante);

    }
}
