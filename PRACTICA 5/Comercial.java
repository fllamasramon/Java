
package practica5;
import java.util.Scanner;

public class Comercial extends Empleado {
    private int ventasRealizadas;
    private int comisiones;

    public Comercial() {
    }

    public Comercial(int ventasRealizadas, int comisiones) {
        this.ventasRealizadas = ventasRealizadas;
        this.comisiones = comisiones;
    }
    
    public Comercial(Comercial c1){
        this.ventasRealizadas=c1.ventasRealizadas;
        this.comisiones=c1.comisiones;
    }

    public int getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(int ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

    public float getComisiones() {
        return comisiones;
    }

    public void setComisiones(int comisiones) {
        this.comisiones = comisiones;
    }
    
    @Override
    public void pedirAlta(){
        super.pedirAlta();
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduzca ventas realizadas: ");
        setVentasRealizadas(lector.nextInt());
        System.out.println("Introduzca comisiones: ");
        setComisiones(lector.nextInt());
    }
    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("ventas realizadas: "+this.getVentasRealizadas()); 
        System.out.println("comisiones: "+this.getComisiones());
    }
}
