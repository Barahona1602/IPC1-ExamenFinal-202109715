/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenfinal;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pbara
 */
public class ExamenFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        while (true){
        
 Scanner in = new Scanner(System.in); 


        System.out.println("    BIENVENIDO AL EXAMEN FINAL   ");
        System.out.println("o o o o o o o o o o o o o o o o o");
        System.out.println("o 1. Ejercicio 1                o");
        System.out.println("o 2. Ejercicio 2                o");
        System.out.println("o 3. Ejercicio 3                o");
        System.out.println("o o o o o o o o o o o o o o o o o");
        System.out.println(" ");
        System.out.println("------Selecciona una opción------");

        Scanner opciones = new Scanner(System.in);
         int opcion = opciones.nextInt();
         
            while (opcion>3 || opcion<1){
                System.out.println("Datos incorrectos, ingrese nuevamente el número");
                Scanner opcion2 = new Scanner(System.in);
                opcion = opcion2.nextInt();
                } 
          
          switch (opcion){

            case 1:
                
                Scanner n1 = new Scanner(System.in); 
                Scanner n2 = new Scanner(System.in); 
                System.out.println("Ingresar número");
                int n01 = n1.nextInt();
                System.out.println("Ingresar otro número");
                int n02 = n2.nextInt();


                if (n01>n02) {
                    
                    System.out.println("El número mayor es: "+n01);
                    System.out.println("El número menor es: "+n02);
                    
                }
                
                else {
                    
                    System.out.println("El número mayor es: "+n02);
                    System.out.println("El número menor es: "+n01);
                }


                break;

            case 2:
                
        System.out.print("Ingrese número base ");
        
        int base = in.nextInt();
        in.nextLine();
 
        System.out.println();
        for(int i = 1; i<=(base/2); i++){

            for(int j = 1; j<=base-i; j++){
                System.out.print(" ");
            }
 
            for(int k=1; k<=(i*2)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        break;

            case 3:
                System.out.println("8 vacas disponibles");
                int vacas [] = {223,243,100,200,200,155,300,150};
                int leche [] = {30,34,28,45,31,50,29,1};
                System.out.println("10 vacas disponibles");
                int vacas2 [] = {340,355,223,243,130,240,260,155,302,130};
                int leche2 [] = {45,50,34,39,29,40,30,52,31,1};
                break;

        }
    }
    }
    }

