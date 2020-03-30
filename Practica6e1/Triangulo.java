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
public class Triangulo implements Figure {
    
    Scanner lector = new Scanner(System.in);
    private int altura;
    private int base;
    
    public Triangulo() {
    }
    
    public Triangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }
    
    public int getAltura() {
        return altura;
    }
    
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int getBase() {
        return base;
    }
    
    public void setBase(int base) {
        this.base = base;
    }
    
    @Override
    public int calcularArea() {
        int area = (this.getAltura() * this.getBase()) / 2;
        return area;
    }
    
    @Override
    public int calcularVolumen() throws ExcepcionVolumenCuadrado {
        throw new ExcepcionVolumenCuadrado("El triangulo no tiene volumen");
    }
    
    @Override
    public void imprimirCaracteristicas() {
        System.out.println("Calculadora de Francisco Llamas:");
        System.out.println("La base es: " + this.getBase());
        System.out.println("La altura mide: " + this.getAltura());
        System.out.println("El area es: " + this.calcularArea());
        try {
            System.out.println("El volumen es: " + this.calcularVolumen());
        } catch (ExcepcionVolumenCuadrado ex) {
            System.out.println(ex.getError());
        }
    }
    
    @Override
    public void añadirCaracteristicas() {
        System.out.println("Escriba el tamaño de la altura");
        this.setAltura(lector.nextInt());
        System.out.println("Escriba el tamaño de la base");
        this.setBase(lector.nextInt());
    }
    
}
