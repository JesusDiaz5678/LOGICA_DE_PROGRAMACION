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
public class PUNTO_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SEXTO PUNTO
        
        try {
            //VARIABLES
            Scanner on = new Scanner(System.in);
            int num1;
            int num2;
            
            System.out.println("Ingrese dos numeros");
            num1 = on.nextInt();
            num2 = on.nextInt();
            
            System.out.println("\nLa division es "+dividir_numeros(num1, num2));
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
    public static boolean dividir_numeros(int num1, int num2){
        try {
            boolean residuo = false;
            
            if(num1%num2 == 0){
                residuo = true;
            }
            
            return residuo;
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            return false;
        }
        
        finally {
            //System.out.println("fin de la ejecución");
            
        }
    }
    
}
