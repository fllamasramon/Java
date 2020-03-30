
package practica5;
import java.util.Scanner;

public class Empleado {
    Scanner lector=new Scanner(System.in);
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String nif;
    private int edad;
    private int salario;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido1, String apellido2, String nif, int edad, int salario) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nif = nif;
        this.edad = edad;
        this.salario = salario;
    }
    
    public Empleado(Empleado e1){
        this.nombre=e1.nombre;
        this.apellido1=e1.apellido1;
        this.apellido2=e1.apellido2;
        this.nif=e1.nif;
        this.edad=e1.edad;
        this.salario=e1.salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        while(!Character.isUpperCase(nombre.charAt(0))){
            System.out.println("La primera letra no es mayuscula. Intentelo de nuevo");
            System.out.println("escribe otra vez el nombre: ");
            nombre=lector.nextLine();
        }
        this.nombre=nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        while(edad<16){
            System.out.println("No puede trabajar con su edad: ");
            System.out.println("Escriba otra vez su edad: ");
            edad=lector.nextInt(); //edad es el parametro que le pasas al metodo.
        }
        this.edad=edad;
        
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    public void pedirAlta(){
        Scanner lector=new Scanner(System.in);
        System.out.println("introduzca su nombre");
        setNombre(lector.next());
        System.out.println("introduzca su primer apellido");
        setApellido1(lector.next());
        System.out.println("introduzca su segundo apellido");
        setApellido2(lector.next());
        System.out.println("introduzca su nif");
        setNif(lector.next());
        System.out.println("introduzca su salario");
        setSalario(lector.nextInt());
        System.out.println("introduzca su edad");
        setEdad(lector.nextInt());
        
    }
    public void mostrarAtributos(){
        System.out.println("nombre: "+this.getNombre());
        System.out.println("primer apellido: "+this.getApellido1());
        System.out.println("segundo apellido: "+this.getApellido2());
        System.out.println("nif: "+this.getNif());
        System.out.println("salario: "+this.getSalario());
        System.out.println("edad: "+this.getEdad());
    }
}
