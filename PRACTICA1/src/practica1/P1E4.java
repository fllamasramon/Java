/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;
import java.util.Scanner;
/**
 *
 * @author Alumnat
 */
public class P1E4 {
    public static void main(String[] args) {
       //Leer 10 numeros enteros y leerlos asi: (primero, ultimo, segundo, penultimo...)
        System.out.println("Escribe 10 numeros: ");
        int[] resultado=new int[10];
        Scanner lector=new Scanner(System.in);
        for (int i=0;i<10;i++) {
            resultado[i]=lector.nextInt(); //esto es lo que guarda el numero en la lista
        }
        for (int i=0;i<=4;i++) {
            System.out.println(resultado[i]);
            System.out.println(resultado[9-i]);
        }
    }
    public static void nombreMetodo(int var1){
        
    }
}
