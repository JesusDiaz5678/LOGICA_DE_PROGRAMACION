/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial_1;

/**
 *
 * @author JESUS ALBERTO
 */
import java.util.Scanner;
public class PUNTO_3 {

    /**
     * @param args the command line arguments
     */
    static Scanner on = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            // variable
            byte num_caracteres;
            
            System.out.println("Ingrese el numero de caracteres que quiere generar. rango entre 1-7");
            num_caracteres = on.nextByte();
            
            while(num_caracteres <1 || num_caracteres >7){
                System.out.println("Digito fuera de rango. Por favor ingrese dentro del rango entre 1-7");
                num_caracteres = on.nextByte();
            }
            
            System.out.println("\n"+cifrador_cifrado(num_caracteres));
        }
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
    
    public static String cifrador_cifrado(byte num_caracteres){
        try {
            // VARIABLES
            char letra_1;
            char letra_2;
            short aleatorio;
            String cadena_original = "";
            String cadena_cifrada = "";
            String text_ret = "";
            
            for (int i = 1; i <= num_caracteres; i++) {
                aleatorio = (short) (Math.random() * (123 - 97) + 97);
                letra_1 = (char) aleatorio;
                cadena_original = cadena_original + letra_1 + "-";

                letra_2 = (char) (219 - aleatorio);
                cadena_cifrada = cadena_cifrada + letra_2 + "-"; 
               
            }
             text_ret = text_ret + cadena_original + "\n" + cadena_cifrada;
            
            
            
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
