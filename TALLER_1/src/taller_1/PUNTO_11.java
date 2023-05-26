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
public class PUNTO_11 {

    /**
     * @param args the command line arguments
     */
    //=============COLORES================================
    static String verde ="\u001B[32m";
    static String rojo ="\u001B[31m";
    static String reset ="\u001B[0m";
    
    static String azul ="\u001B[34m";
    static String negro ="\u001B[30m";
    static String amarillo ="\u001B[33m";
    static String cyan ="\u001B[36m";
    static String purpura ="\u001B[35m";
    static String blanco ="\u001B[37m";
    
    Scanner on = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            System.out.println(Definir_invitacion());
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
       finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
    public static String Definir_invitacion(){
        try {
            //variables
            byte aleatorio;
            String invita="";
            String text_rest;
            
            aleatorio = (byte)(Math.random()*(7-1)+1);
            
            switch(aleatorio){
                case 1: invita = verde + "Invita a las cervezas" + reset;
                break;
                case 2: invita = azul + "Invita a la pizza" + reset;
                break;
                case 3: invita = rojo + "Invita al postre" + reset;
                break;
                case 4: invita = amarillo + "Paga el parqueadero de todos" + reset;
                break;
                case 5: invita = "Solo ve y disfruta";
                break;
                case 6: invita = "Solo ve y disfruta";
                break;
            }
            
            text_rest = "# "+aleatorio
                    +"\n"+invita;
            
            return text_rest;
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
