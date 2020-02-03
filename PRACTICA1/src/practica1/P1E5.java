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
public class P1E5 {
    public static void main(String[] args) {
        //Crear 2 listas de 10 valores numéricos y que vaya apareciendo el primero
        //de la primera lista, el primero de la segunda...etc
        System.out.println("escriba 10 numeros");
        int[] lista1=new int [10];
        int[] lista2=new int [10];
        int[] lista3=new int [20];
        Scanner lector =new Scanner(System.in);
        for (int i=0;i<10;i++){
            lista1[i]=lector.nextInt();
        }
        System.out.println("escriba otros 10 numeros");
        for (int i=0;i<10;i++){
            lista2[i]=lector.nextInt();
        }
        for (int i=0;i<10;i++){
            lista3[i+i]=lista1[i];
            lista3[i+i+1]=lista2[i];
        }
        System.out.println("resutlado de la tabla: ");
        for (int i=0;i<20;i++){
        System.out.println(lista3[i]);
        }
    }
}
