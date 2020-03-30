
package practica5;
import java.util.Scanner;

public class Repartidor extends Empleado {
    private int horasTrabajadas;
    private String zona;

    public Repartidor() {
    }

    public Repartidor(int horasTrabajadas, String zona) {
        this.horasTrabajadas = horasTrabajadas;
        this.zona = zona;
    }
    
    public Repartidor(Repartidor r1){
        this.horasTrabajadas=r1.horasTrabajadas;
        this.zona=r1.zona;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    @Override
    public void pedirAlta(){
        super.pedirAlta();
        Scanner lector=new Scanner(System.in);
        System.out.println("introduzca horas trabajas: ");
        setHorasTrabajadas(lector.nextInt());
        System.out.println("introduzca zona de trabajo: ");
        setZona(lector.next());
    }
    
    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("horas trabajadas: "+this.getHorasTrabajadas());
        System.out.println("zona de trabajo: "+this.getZona());
    }
}
