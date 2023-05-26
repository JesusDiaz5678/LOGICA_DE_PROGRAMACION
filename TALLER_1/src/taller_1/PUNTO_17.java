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
public class PUNTO_17 {

    /**
     * @param args the command line arguments
     */
    static Scanner on = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        // DECIMOSEPTIMO PUNTO
        try {
            // VARIABLES
            byte num;
            
            System.out.println("===========BIENVENIDO===========\nEl menu esta conformado de la siguiente manera:\n1_Carne asada\n2_Pollo gratinado\n3_Pasta con salsa showplay\nseleccione su menu con el numero que lo acompaña");
            num = on.nextByte();
            
            while(num<1 || num >3){
                System.out.println("\nNumero invalido. Por favor ingrese el numero correcto de su eleccion");
                num = on.nextByte();
            }
            
            System.out.println(Elegir_menu(num));
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
    public static String Elegir_menu(byte num){
        try {
            //VARIABLES
            String text_retur = "";
            
            switch(num){
                case 1: text_retur ="\nUsted eligio el menu 1. De obsequio reciba un postre gratis como agradecimiento";
                break;
                case 2: text_retur ="\nUsted eligio el menu 2. De obsequio reciba una bebida gratis como agradecimiento";
                break;
                case 3: text_retur ="\nUsted eligio el menu 3. De obsequio reciba un postre y una bebida gratis como agradecimiento";
                break;
            }
            
            return text_retur;
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
