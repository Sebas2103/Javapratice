import javax.swing.JOptionPane;

public class Ejercicio5 {
    public static void main(String[] args) {
        int energia = 30000;
        int gas = 20000;
        int acueducto = 20000;
        int alcantarilla = 90000;
        int tel = 700000;
        int salario;
        int total;
        salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sueldo"));
        total = energia + gas + acueducto + alcantarilla + tel;
        total = salario - total;
        if (total > 0) {
            JOptionPane.showMessageDialog(null, "Su salario alcanza a pagar sus deudad");
        }
        if (total < 0) {
            JOptionPane.showMessageDialog(null, "Queda debiendo");
        } else {
            JOptionPane.showMessageDialog(null, "Su salario es suficiente para pagar la deuda");
        }
    }
}
