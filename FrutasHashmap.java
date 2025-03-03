import java.text.CollationElementIterator;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class FrutasHashmap {

    public static void main(String[] args) {
        HashMap<String, Integer> frutas = new HashMap<>();
        HashMap<String, Integer> frutasYverduras = new HashMap<>();
        HashMap<String, Integer> clonDeFrutas = new HashMap<>();

        // AGREGANDO ELEMENTOS
        frutas.put("Manzana", 3);
        frutas.put("Pera", 4);
        frutas.put("Banano", 5);
        frutas.put("Coco", 6);
        frutas.put("Naranja", 2);
        frutas.put("Pera", 8);
        // Agregando Elementos
        frutasYverduras.put("Lechuga", 7);
        // Mostrando los elementos
        System.out.println(frutas.toString());

        // Mostrando la cantidad de elementos
        System.out.println("Hay" + frutas.size() + "tipos de frutas");

        // Recuperando un valor
        int cantidadManzanas = frutas.get("Manzana");

        System.out.println("Cantidad de manzanas:" + cantidadManzanas);
        // Recuperando un valor dada la clave y un valor por defecto
        int cantidadDuraznos = frutas.getOrDefault("Durazno", 0);
        System.out.println("cantidad de duraznos" + cantidadDuraznos);
        // Eliminando un elemento
        frutas.remove("Banano");

        // Mostrando los elementos
        System.out.println(frutas.toString());

        // Mostrando la cantidad de elementos
        System.out.println("Hay" + frutas.size() + "tipos de frutas");

        // Verificando si una clave existe
        boolean hayNaranjas = frutas.containsKey("Naranja");
        System.out.println("Venden Naranjas " + hayNaranjas);
        // Verificando si existe un valor
        Boolean hayExistencias = frutas.containsValue(0);
        System.out.println("Alguna fruta se agoto " + hayExistencias);
        // Mostrando las claves
        Set claves = frutas.keySet();
        System.out.println("las frutas que ofrecemos " + claves);

        // Mostrando los valores
        Collection valores = frutas.values();
        System.out.println("Y el numero de unidades que hay de cada frutas : " + valores);
        // Mostrando toda la coleccion
        Set todoDeLasFrutas = frutas.entrySet();
        System.out.println("informa+++n completa del conjunto de frutas :" + todoDeLasFrutas);

        frutasYverduras.putAll(frutas);
        /* clonDeFrutas.clone(); */
        
        clonDeFrutas = (HashMap<String, Integer>) frutas.clone();

        // Eliminado todos los elementos
        frutas.clear();


        // Verificando si hay elementos
        System.out.println("Conjunto  de frutas " + frutas.toString());
        System.out.println("Conjunto de frutas y verduras " + frutasYverduras.toString());

        System.out.println("Conjunto de frutas clonadas " + clonDeFrutas.toString());
        //Actualizacion del conjunto mediante una combinacion de valor 
        frutasYverduras.merge("Manzana",15,(valorAntiguo,valorNuevo)->valorAntiguo+valorNuevo);
        System.out.println("Conjunto de frutas y verduras actualizando"+frutasYverduras.toString());
        


    }
}
