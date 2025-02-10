import javax.swing.*;

public class cicloCuadro {
    public static void main(String[] args) {
        int x = 1;

        String numeros = "";
        while (x <= 10) {
            x++;
            numeros = numeros + x + "\n";

        }
        JOptionPane.showMessageDialog(null, numeros);
    }
}
