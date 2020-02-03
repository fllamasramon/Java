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
public class P1E3 {
    //Leer 5 numeros y contar y hacer la media de los positivos, negativos y 0.
    public static void main(String[] args) {
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
}
