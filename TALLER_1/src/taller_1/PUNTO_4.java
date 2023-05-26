/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_1;

/**
 *
 * @author JESUS ALBERTO
 */
import java.util.Scanner;
public class PUNTO_4 {

    /**
     * @param args the command line arguments
     */
    static Scanner on = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        // CUARTO PUNTO
        
        try {
            Comparar_numeros();
            
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
        }
        
        finally {
            System.out.println("fin de la ejecución"); 
        }
        
    }
    
    public static void Comparar_numeros(){
        try {
         //VARIABLES
         int num1;
         int num2;
         int num3;
         int num4;
         int num5;
         int num6;
         
            System.out.println("Ingrese 5 numeros:");
            num1 = on.nextInt();
            num2 = on.nextInt();
            num3 = on.nextInt();
            num4 = on.nextInt();
            num5 = on.nextInt();
            
            System.out.println("\nIngrese otro numero");
            num6 = on.nextInt();
            
            if((num6 == num1)||(num6 == num2)||(num6 == num3)||(num6 == num4)||(num6 == num5)){
                System.out.println("\nEl ultimo numero ingresado esta contenido en los primeros 5 numeros ingresados");   
            }
            
            else
                System.out.println("\nOK");
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
        }
        
        finally {
            //System.out.println("fin de la ejecución");
        }
    }
    
}
