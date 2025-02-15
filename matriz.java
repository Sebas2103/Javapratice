import java.util.Scanner;
public class matriz {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
         
        //Crear matriz vacia
        int matriz[];
        

        matriz=new int [2];
        System.out.println(matriz.length);
        int numero;
        for(int i=0;i<matriz.length;i++){
            System.out.println("Ingrese el dato de la matriz");
            numero=sc.nextInt();
            matriz[i]=numero;


            

        }
        System.out.println("--------------------------------------------");
        for (int i =0 ;i<matriz.length;i++){
            System.out.println(matriz[i]);
        }



    }


}
