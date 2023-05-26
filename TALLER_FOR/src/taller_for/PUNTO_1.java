/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_for;

/**
 *
 * @author JESUS ALBERTO
 */
import java.util.Scanner;
public class PUNTO_1 {

    /**
     * @param args the command line arguments
     */
    static Scanner on = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            // VARIABLES
            int cantidad_num = 0;
            
            System.out.println("Ingrese la cantidad de numeros que desea");
            cantidad_num = on.nextInt();
            
            System.out.println(generar_raiz(cantidad_num));
            
        }
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
    public static String generar_raiz(int cantidad_num){
        try {
            //VARIABLES
            int aleatorio;
            int num;
            float raiz;
            String text = "";
            
            for (int i = 1; i <= cantidad_num; i++) {
                aleatorio = (int)(Math.random()*(356-2)+2);
                num = aleatorio;
                raiz = (float)Math.sqrt(num);
                
                text = text + (i+"__# "+num+" raiz: "+raiz+"\n");
            }
            
            return text;
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            return"-1";
        }
        
        finally {
            //System.out.println("fin de la ejecución");
            
        }
    }
    
}
