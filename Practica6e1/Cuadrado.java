/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6e1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Cuadrado implements Figure {

    Scanner lector = new Scanner(System.in);
    private int lado;

    public Cuadrado() {
    }

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public int calcularArea() {
        int area = this.getLado() * this.getLado();
        return area;
    }

    @Override
    public int calcularVolumen() throws ExcepcionVolumenCuadrado {
        //no tiene volumen, creamos una excepcion
        throw new ExcepcionVolumenCuadrado("No tiene volumen");
    }

    @Override
    public void imprimirCaracteristicas() {
        try {
            System.out.println("==============================");
            System.out.println("Calculadora de Francisco Llamas: ");
            System.out.println("El lado mide: " + this.getLado());
            System.out.println("El area es: " + this.calcularArea());
            System.out.println("El volumen es: " + this.calcularVolumen());
        } catch (ExcepcionVolumenCuadrado ex) {
            System.out.println(ex.getError());

        }
    }

    @Override
    public void añadirCaracteristicas() {
        System.out.println("Escriba la dimension del lado: ");
        this.setLado(lector.nextInt());
    }

}
