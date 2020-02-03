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
public class P1E6 {
    public static void main(String[] args) {
        //Leer los datos de 12 elementos numéricos y mezclarlos en una tercera
        //tal que 3 de la tabla A, 3de la B, otros 3 de la A etc.
        System.out.println("escriba 12 numeros");
        int[] lista1=new int [12];
        int[] lista2=new int [12];
        int[] lista3=new int [24];
        int i1=0;
        int i2=0;
        Scanner lector =new Scanner(System.in);
        for (int i=0;i<12;i++){
            lista1[i]=lector.nextInt();
        }
        System.out.println("escriba otros 12 numeros");
        for (int i=0;i<12;i++){
            lista2[i]=lector.nextInt();
        }
        System.out.println("");
        for (int i=0;i<24;i++){
            if (i==3||i==4||i==5||i==9||i==10||i==11||i==15||i==16||i==17||i==21||i==22){
                lista3[i]=lista2[i1];
                i1++;
            }
            else{
                lista3[i]=lista1[i2];
                i2++;
            }
        }
        for (int i=0;i<24;i++){
            System.out.println(lista3[i]);
        }
    }
    
}
