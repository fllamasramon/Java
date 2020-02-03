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
public class P1E7 {
    public static void main(String[] args) {
    Scanner lector=new Scanner(System.in);
    boolean salir= false;
    int opcion;
    while (!salir){
        System.out.println("1. Opcion 1");
        System.out.println("2. Opcion 2");
        System.out.println("3. Opcion 3");
        System.out.println("4. Opcion 4");
        System.out.println("5. Opcion 5");
        System.out.println("6. Opcion 6");
        System.out.println("7. Salir");
        opcion=lector.nextInt();
            switch(opcion){
                case 1:
                    ejercicio1(args);
                    break;
                case 2:
                    ejercicio2(args);
                    break;
                case 3:
                    ejercicio3(args);
                    break;
                case 4:
                    ejercicio4(args);
                    break;
                case 5:
                    ejercicio5(args);
                    break;
                case 6:
                    ejercicio6(args);
                    break;
                case 7:
            }   
        }
    }
     public static void ejercicio1(String[] args) {
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
      public static void ejercicio2(String[] args) {
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
      public static void ejercicio3(String[] args) {
        System.out.println("INTRODUCE LO NUMEROS: ");
        Scanner lector=new Scanner(System.in);
        int numeros[]= new int [5];
        int suma_pos,cont_pos,suma_neg,cont_neg,cont_cero;
        suma_pos=0;
        cont_pos=0;
        suma_neg=0;
        cont_neg=0;
        cont_cero=0;
        
        for (int i=0;i<5;i++){
            numeros[i]=lector.nextInt();
            if (numeros[i]>0){
                suma_pos=suma_pos+numeros[i];
                cont_pos++;
            }
            if (numeros[i]<0){
                suma_neg=suma_neg+numeros[i];
                cont_neg++;
            }
            if (numeros[i]==0){
                cont_cero++;
            }
        }
        System.out.println("La media de tus numeros positivos es "+suma_pos/cont_pos);
        System.out.println("La medi de tus numeros negativos es "+suma_neg/cont_neg);
        System.out.println("El numero de 0 es "+cont_cero);
    }
      public static void ejercicio4(String[] args) {
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
      public static void ejercicio5(String[] args) {
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
      public static void ejercicio6(String[] args) {
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
