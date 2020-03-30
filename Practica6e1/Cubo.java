/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6e1;

import java.util.Scanner;


public class Cubo implements Figure {

    Scanner lector = new Scanner(System.in);
    private int arista;

    public Cubo() {
    }

    public Cubo(int arista) {
        this.arista = arista;
    }

    public int getArista() {
        return arista;
    }

    public void setArista(int arista) {
        this.arista = arista;
    }

    @Override
    public int calcularArea() {
        int area = this.getArista() * this.getArista() * 6;
        return area;
    }

    @Override
    public int calcularVolumen() throws ExcepcionVolumenCuadrado {
        int volumen = this.getArista() * this.getArista() * this.getArista();
        return volumen;
    }

    @Override
    public void imprimirCaracteristicas() {
        System.out.println("==============================");
        System.out.println("Calculadora de Francisco Llamas:");
        System.out.println("La arista mide: " + this.getArista());
        System.out.println("El area es: " + this.calcularArea());
        try {
            System.out.println("El volumen es: " + this.calcularVolumen());
        } catch (ExcepcionVolumenCuadrado ex) {
            System.out.println(ex.getError());
        }
    }

    @Override
    public void añadirCaracteristicas() {
        System.out.println("Tamaño de las aristas: ");
        this.setArista(lector.nextInt());
    }

}
