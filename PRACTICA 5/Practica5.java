
package practica5;
import java.util.Scanner;
import java.util.ArrayList;

public class Practica5 {

    public static void main(String[] args) {
        //si instanciamos fuera del case solo instanciamos una vez, por lo que
        //siempre modificaremos el mismo objeto.
        ArrayList<Empleado> listaTrabajadores=new ArrayList<Empleado>();
        Scanner lector=new Scanner(System.in);
        int opcion;
        boolean salir=false;
        while(!salir){
            System.out.println("-----Bienvenido-----");
            System.out.println("1. Pedir alta empleado");
            System.out.println("2. Pedir alta repartidor");
            System.out.println("3. Pedir alta comercial");
            System.out.println("4. Mostrar Atributos");
            opcion=lector.nextInt();
            switch(opcion){
                case 1:
                    Empleado e1=new Empleado();
                    e1.pedirAlta();
                    listaTrabajadores.add(e1);
                    break;
                case 2:
                    Repartidor r1=new Repartidor();
                    r1.pedirAlta();
                    listaTrabajadores.add(r1);
                    break;
                case 3:
                    Comercial c1=new Comercial();
                    c1.pedirAlta();
                    listaTrabajadores.add(c1);
                    break;
                case 4:
                    System.out.println("-----LISTA TRABAJADORES-----");
                    for (int i=0;i<listaTrabajadores.size();i++){
                        System.out.println(i+ " " + listaTrabajadores.get(i).getNombre()+ " " +listaTrabajadores.get(i).getApellido1());
                    }
                    System.out.println("escoja al trabajador: ");
                    int trabajador=lector.nextInt();
                    listaTrabajadores.get(trabajador).mostrarAtributos();
                    break;
            }
        }
    }
    
}
