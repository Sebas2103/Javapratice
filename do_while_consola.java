import javax.swing.JOptionPane;

public class do_while_consola {
    public static void main(String[] args) {
        int n, fact = 1, cont = 1;
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrse el numero al que calculara el fatorial"));

        do {
            fact = fact * cont;
            cont++;

        } while (cont <= n);
        JOptionPane.showMessageDialog(null, "el factorial de " + n + " es "+fact);  

    }

}
