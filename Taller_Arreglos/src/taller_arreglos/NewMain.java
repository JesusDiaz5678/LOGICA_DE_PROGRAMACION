/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_arreglos;

/**
 *
 * @author JESUS ALBERTO
 */
import java.util.Scanner;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    static Scanner on = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variables
        String text_1;
        String text;
        
        System.out.println("Ingrese");
        text = on.nextLine();
        text_1 = text.toUpperCase();
        
        System.out.println(text_1);
    }
    
}
