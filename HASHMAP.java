import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class HASHMAP {
    public static void main(String[] args) {

        // Realizar un programa que permita almacenar el codigo y el precio de una serie
        // de productos ,modificar el precio de un producto determinado
        HashMap<String, Float> productos = new HashMap<String, Float>();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        float precio;

        String codigo;

        while (opcion != 5) {
            System.out.println("Introduce el numero de laopcion que quieras");
            System.out.println("1 Introducir un producto");
            System.out.println("2 Modificar el precio");
            System.out.println("3 Mostrar todos los productos");
            System.out.println("4 Eliminar productos");
            System.out.println("5 Salir");
            opcion = sc.nextInt();

        
        switch (opcion) {
            case 1:

                System.out.println("Introduce el codigo de producto");
                codigo = sc.next();
                System.out.println("introduce el precio del producto");
                precio = sc.nextFloat();
                guardarProducto(codigo, precio, productos);
                break;

            case 2:
                System.out.println("Introduce el codigo del producto del que quieres cambiar precio");
                codigo = sc.next();
                modificarPrecio(codigo, productos);
                break;

            case 3:
                mostrarProductos(productos);
                break;
            case 4:
                System.out.println("Introduce el codigo del producto que quieres elimminar");
                codigo = sc.next();
                elimminarProducto(codigo, productos);
                break;
            case 5:
                System.out.println("Ha salido del sistema ");
                break;
            default:
                System.out.println("Tienes que introducir una opcion valida");
        }
    }
        
    }

    public static void guardarProducto(String codigo, float precio, HashMap<String, Float> producto) {
        if (producto.containsKey(codigo)) {
            System.out.println("No se puede ingresa el producto.El codigo esta repetido");
        } else {
            producto.put(codigo, precio);
        }
    }

    public static void modificarPrecio(String codigo, HashMap<String, Float> productos) {
        Scanner sc = new Scanner(System.in);
        if (productos.containsKey(codigo)) {
            System.out.println("Introduce el precio de producto ");
            productos.put(codigo, sc.nextFloat());

        } else {
            System.out.println("No hay ningun producto en ese codigo");
        }
    }

    public static void mostrarProductos(HashMap<String, Float> productos) {
        String clave;
        Iterator<String> listaClavesProductos = productos.keySet().iterator();
        System.out.println("Hay los siguientes productos ");
        while (listaClavesProductos.hasNext()) {
            clave = listaClavesProductos.next();
            System.out.println(clave + "-" + productos.get(clave));
        }

    }

    public static void elimminarProducto(String codigo, HashMap<String, Float> listaProductos) {
        if (listaProductos.containsKey(codigo)) {
            listaProductos.remove((codigo));

        } else {
            System.out.println("No hay ningun producto con ese codigo");
        }

    }
}