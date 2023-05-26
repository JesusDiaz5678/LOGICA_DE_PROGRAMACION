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
public class PUNTO_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // PRIMER PUNTO DEL TALLER 1
        
        try {
            //variables
            Scanner on = new Scanner(System.in);
            int num1, num2;
            
            System.out.println("INGRESE UN NUMERO");
            num1 = on.nextInt();
            
            System.out.println("\nINGRESE UN SEGUNDO NUMERO");
            num2 = on.nextInt();
            
            System.out.println(Verificar_Ordent(num1, num2));
            
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        finally {
            System.out.println("\nfin de la ejecución");    
        }
        
    }
    
    public static String Verificar_Ordent(int num1, int num2){
            String text_r = "";
         try {
             
             if(num1 < num2){
                 text_r = "\nOrden creciente";
             }
             
             else if(num1 > num2){
                 text_r = "\nOrden decreciente";
             }
             
             else
                 text_r = "\nNumeros iguales";
             
             return text_r;
             
         }
         
         catch (Exception error) {
             System.out.println("Se presento un error " + error);
             return text_r = "\n"+error;
             
         }
         
         finally {
             //System.out.println("fin de la ejecución");    
         }
         
     }
    
}
