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
public class P1E2 {
    public static void main(String[] args) {
        //Leer 5 numeros y mostrarlos en el orden inverso al introducido
        System.out.println("Escribe5 numeros: ");
        int[] resultado= new int[5];
        Scanner lector=new Scanner(System.in);
        for (int i=0;i<5;i++) {
            resultado[i]=lector.nextInt();
        }
        for (int i=4;i>=0;i--) {
            System.out.println(resultado[i]);
        }
    }
}
