import javax.swing.*;

public class ejercicio3panel {
    public static void main(String[] args) {
        int n, m;
        n = Integer.parseInt(
                (JOptionPane.showInputDialog(null, "ingrese el numero de las filas o de columnas  de la matriz")));
        int mat[][] = new int[n][n];

        llenar_matriz(mat);
        mostrar_matriz(mat);
        m = multiplicar(mat);

        JOptionPane.showMessageDialog(null, "la multiplicacion de la diagonal es" + m);

    }

    public static void llenar_matriz(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = Integer.parseInt((JOptionPane.showInputDialog(null, "ingrese un numero en la fila")));
            }
        }

    }

    public static void mostrar_matriz(int a[][]) {
        String cad = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                cad += Integer.toString(a[i][j]) + " ";

            }

            cad += "\n";
        }
        JOptionPane.showMessageDialog(null, cad);
    }

    public static int multiplicar(int a[][]) {
        int multi = 1;
        for (int i = 0; i < a.length; i++) {
            multi = multi * a[i][i];

        }
        return multi;
    }
}
