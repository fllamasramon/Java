/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6e1;


public interface Figure {
    public int calcularArea();
    public int calcularVolumen() throws ExcepcionVolumenCuadrado;
    public void imprimirCaracteristicas();
    public void añadirCaracteristicas();
}
