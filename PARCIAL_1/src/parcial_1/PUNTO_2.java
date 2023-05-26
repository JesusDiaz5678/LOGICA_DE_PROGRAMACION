/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial_1;

/**
 *
 * @author JESUS ALBERTO
 */
public class PUNTO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            System.out.println(cifrador_cifrado());
            
        }
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
    
    public static String cifrador_cifrado(){
        try {
            // VARIABLES
            char letra_1;
            char letra_2;
            short aleatorio;
            String text_ret = "";
            
            aleatorio = (short)(Math.random()*(123-97)+97);
            letra_1 = (char)aleatorio;
            
            letra_2 = (char)(219-aleatorio);
            
            text_ret = letra_1 + " -> " + letra_2;
            
            return text_ret;
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            return "";
        }
        
        finally {
            //System.out.println("fin de la ejecución");
        }
    }
}
