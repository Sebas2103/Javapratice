
import javax.swing.JOptionPane;;
//12.	Diseñe un algoritmo que determine si una letra ingresada por el usuario es vocal o consonante.
public class panel1 {
    public static void main(String[] args) {
        String letra;
        String mensaje="su letra es una consonante";
        letra= JOptionPane.showInputDialog("Ingrese una letra");
         String [] vocales={"a","e","i","o","u"};
        for (int i=0; i<vocales.length;i++){
            if (vocales[i].equals(letra))    {
                mensaje="Su letra es una vocal";
                break;

            }        
            
         }
        JOptionPane.showMessageDialog(null,mensaje);

        
    }
    
}
