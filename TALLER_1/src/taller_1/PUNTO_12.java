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
public class PUNTO_12 {

    /**
     * @param args the command line arguments
     */
    static Scanner on = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            //VARIABLES
            byte num;
            
            System.out.println("Ingrese un numero entre 1-12");
            num = on.nextByte();
            
            while(num < 1 || num > 12){
                System.out.println("Ingrese un numero entre 1-12");
                num = on.nextByte();
            }
            
            System.out.println(controlar_mes(num));
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");    
        }
    }
    
    public static String controlar_mes(byte num){
        try {
            //variables
            String mes = "";
            
            switch(num){
                case 1: mes = "ENERO, tiene 31 dias";
                break;
                case 2: mes = "FEBRERO, tiene 29 dias";
                break;
                case 3: mes = "MARZO, tiene 31 dias";
                break;
                case 4: mes = "ABRIL, tiene 30 dias";
                break;
                case 5: mes = "MAYO, tiene 31 dias";
                break;
                case 6: mes = "JUNIO, tiene 30 dias";
                break;
                case 7: mes = "JULIO, tiene 31 dias";
                break;
                case 8: mes = "AGOSTO, tiene 31 dias";
                break;
                case 9: mes = "SEPTIEMBRE, tiene 30 dias";
                break;
                case 10: mes = "OCTUBRE, tiene 31 dias";
                break;
                case 11: mes = "NOVIEMBRE, tiene 30 dias";
                break;
                case 12: mes = "DICIEMBRE, tiene 31 dias";
                break;  
            }
            
            return mes;
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
