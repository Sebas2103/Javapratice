import java.util.ArrayList;
import java.util.Iterator;

public class iterator {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        // Metodo add Añade elementos de la lista

        lista.add(1);
        lista.add(2);
        lista.add(3);
        System.out.println("Ultima posicion  donde aparece el elemento 2");
        System.out.println(lista.lastIndexOf(2));
        // metodo Set para reemplazar el objeto en la posicion
        System.out.println("Reemplazar el objeto de la posicionb 2 por el elemento 4");
        lista.set(2,4);
        System.out.println(lista.toString());

        // Metodo clear ,elimnar elementos
        lista.clear();
        System.out.println("LISTA VACIA ");
        System.out.println(lista.toString());

        //Metodo isEmpty indica un array es vacio o no
        System.out.println("Indica si la lista esta vacia");
        System.out.println("Retorna un boleano  si la lista esta vacia"+lista.isEmpty());

        


        


    }
}
