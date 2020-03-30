/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6e1;

import java.util.Scanner;

public class Practica6e1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir){
            System.out.println("1. Calcular area y volumen de un cuadrado");
            System.out.println("2. Calcular area y volumen de un cubo");
            System.out.println("3. Calcular area y volumen de un triangulo");
            System.out.println("4. Salir");
            opcion = lector.nextInt();
            switch (opcion){
                case 1:
                    Cuadrado c1 = new Cuadrado();
                    c1.añadirCaracteristicas();
                    c1.imprimirCaracteristicas();
                    break;
                case 2:
                    Cubo cubo1 = new Cubo();
                    cubo1.añadirCaracteristicas();
                    cubo1.imprimirCaracteristicas();
                    break;
                case 3:
                    Triangulo tri = new Triangulo();
                    tri.añadirCaracteristicas();
                    tri.imprimirCaracteristicas();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Pon un numero correcto. ");
            }
        }
        
                        
    }

}
