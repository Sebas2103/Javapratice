import javax.swing.JOptionPane;

/*transporte*/
public class tallerp4 {
   
   public static void main(String[] args) {

      int mañana = 40000, Tarde = 50000, noche = 60000;
      int pasaje = 0;

      int opcion;
      int cantidad;
      opcion = Integer.parseInt(JOptionPane.showInputDialog("""
            Precios           | Opcion
            Mañana	$40000   | 1
            Tarde	$50000      | 2
            Noche	$60000      | 3




            """));
      cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la  cantidad a comprar"));
      switch (opcion) {
         case 1:
            pasaje = mañana;

            break;
         case 2:
            pasaje = Tarde;

            break;
         case 3:
            pasaje = noche;

            break;

         default:
            JOptionPane.showMessageDialog(null, "DATO INCORRECTO");
            break;
      }

      if (cantidad > 5) {
         double descuento = 0.1;
         descuento = pasaje - descuento;

      }
      pasaje = pasaje * cantidad;
      JOptionPane.showMessageDialog(null, "El valor de su compra es " + pasaje);
   }
}