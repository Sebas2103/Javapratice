
import javax.swing.JOptionPane;

public class Switch {
 public static void main(String[] args) {
    int num,v;
    double val;
    num= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor de la variable num"));
    v=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la  variable v"));

    switch (num) {  
        case 1 -> val=100*v;
        case 2 -> val= Math.pow(100, v);// Funcion va exponencial
        case 3 -> val= (double)100/v; // Double obliga a que el resultado sea double
        default  -> val=0;
    }
    JOptionPane.showMessageDialog(null, "El resultado  de la funcion es : "+ val);

    
 }
}
