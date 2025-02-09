import javax.swing.*;
// Panel
public class ejercicio {

    public static void main(String[] args) {
        int x,y,z;

        x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        z=x+y;
        JOptionPane.showMessageDialog(null,"El resultado es "+z);
    }   
}