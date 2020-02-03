/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.Arrays;
import java.util.Scanner;
public class P2E2 {
    static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        boolean salir=false;
        int opcion;
        while (!salir){
            System.out.println("Escoja su opcion");
            System.out.println("1. hacerTabla");
            System.out.println("2. comprobarSimetria");
            System.out.println("3. sumarMatrices");
            System.out.println("4. rellenarDiagonal");
            System.out.println("5. crearMatriz");
            System.out.println("6. crearMatrizUsuario");
            System.out.println("");
            System.out.println("7. Salir");
            opcion=lector.nextInt();
            switch(opcion){
                case 1:
                    hacertabla();
                    break;
                case 2:
                    comprobarSimetria();
                    break;
                case 3:
                    sumarMatrices();
                    break;
                case 4:
                    rellenarDiagonal();
                    break;
                case 5:
                    crearMatriz();
                    break;
                case 6:
                    crearMatrizUsuario();
                    break;
                case 7:
                    salir=true;
                    break;
            }
        }
    }
    public static void hacertabla(){
         int tabla [][] = new int[5][5];
        for (int i = 0; i<tabla.length; i++){
            for (int j = 0; j<tabla.length; j++){
                tabla[i][j] = i+j;
            }
        }
        
        for (int i = 0; i<tabla.length; i++){
                System.out.println(Arrays.toString(tabla[i]));
        }
    }
    public static void comprobarSimetria(){
        int tabla [][] = new int[4][4];
        boolean prueba = true;
        
        for (int i = 0; i<4; i++){
            for (int j = 0; j<4; j++){
                tabla[i][j] = i+j;
            }
        }
        
        for (int i = 0; i<4; i++){
                System.out.println(Arrays.toString(tabla[i]));
        }
        for (int i = 0; i<4; i++){
            for (int j = 0; j<4; j++){
                if(tabla[i][j] != tabla[j][i]){
                    prueba = false;
                    i = 4;
                    break;
                }
            }
        }
        System.out.println(prueba);
    }
    public static void sumarMatrices(){
        int [][] miarray=new int [3][3];
        int [][] miarray2=new int [3][3];
        int [][] miarraysumada=new int [3][3];
        Scanner lector=new Scanner(System.in);
        System.out.println("datos primera matriz");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++)
                miarray[i][j]=lector.nextInt();
        }
        System.out.println("datos segunda matriz");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                miarray2[i][j]=lector.nextInt();
        
            }
        }    
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                miarraysumada[i][j]=miarray[i][j]+miarray2[i][j];
        
            }
        }    
        System.out.println("matriz de la suma");
         for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
               System.out.print(miarraysumada[i][j]);
        
            }
             System.out.println(" ");
         }
    }
    public static void  rellenarDiagonal(){
        int [][] miarray=new int [7][7];
        for (int i=0;i<7;i++){
            for (int j=0;j<7;j++){
                if (j==i){
                    miarray[i][j]=1;
                }
                else{
                    miarray[i][j]=0;
                }
                
            }
        }
        for (int i=0;i<7;i++){
            for (int j=0;j<7;j++){
              
                System.out.print(miarray[i][j]+" ");
                
            }
            System.out.println(" ");
        }
    }
    public static void crearMatriz(){
        int tabla [][] = new int[8][6];
        for (int i = 0; i<8; i++){
            tabla[i][0]=1;
            tabla[i][5]=1;
            if(i<6){
                tabla[0][i]=1;
                tabla[7][i]=1;
            }
        }
        for (int i = 0; i<8; i++){
            System.out.println(Arrays.toString(tabla[i]));
        }
    }
    public static void crearMatrizUsuario(){
        System.out.print("Escribe un numero y luego otro: ");
        int tabla [][] = new int[lector.nextInt()][lector.nextInt()];
        
        for (int i = 0; i<tabla.length; i++){
            tabla[i][0]=1;
            tabla[i][tabla[i].length-1]=1;
            if(i<tabla[i].length-1){
                tabla[0][i]=1;
                tabla[tabla.length-1][i]=1;
            }
        }
        
        for (int i = 0; i<tabla.length; i++){
            System.out.println(Arrays.toString(tabla[i]));
        }
    }
    
}


