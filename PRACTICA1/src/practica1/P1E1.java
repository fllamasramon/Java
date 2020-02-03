package practica1;
import java.util.Scanner;
public class P1E1 {
    public static void main(String[] args) {
        //Leer 5 numeros e imprimirlos
        System.out.println("Escribe5 numeros: ");
        int[] resultado= new int[5];
        Scanner lector=new Scanner(System.in);
        for (int i=0;i<5;i++) {
            resultado[i]=lector.nextInt();
        }
        for (int i=0;i<5;i++) {
            System.out.println(resultado[i]);
        }
    }
}
  
