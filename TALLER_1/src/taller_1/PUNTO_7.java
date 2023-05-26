/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_1;

import java.util.Scanner;

/**
 *
 * @author JESUS ALBERTO
 */
public class PUNTO_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // SEPTIMO PUNTO
        
        try {
            System.out.println("\nEl numero mayor de los ingresados es : "+hallar_mayor());
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
    public static int hallar_mayor(){
        try {
           //variables 
           Scanner on = new Scanner(System.in);
           int num = 0;
           int mayor = 0;
           
            System.out.println("Ingrese 3 numeros:");
           for(int i = 1; i <=3; i++){
               num = on.nextInt();
               
               if(num > mayor){
                   mayor = num;
               }
           }
           
           return num;
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            return -1;
        }
        
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
}
