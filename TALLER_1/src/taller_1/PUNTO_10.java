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
public class PUNTO_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // DECIMO PUNTO
        
        try {
            // VARIABLES
            Scanner on = new Scanner(System.in);
            byte num;
            
            System.out.println("Ingrese un numero entre 1-7");
            num = on.nextByte();
            
            while(num<1 || num >7){
               System.out.println("Ingrese un numero entre 1-7");
               num = on.nextByte(); 
            }
            
            System.out.println(calcular_semana(num));
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
    public static String calcular_semana(byte num){
        try {
            String dia = "";
            String tipo_dia;
            String text_return;
            
            switch(num){
                case 1: dia = "Lunes";
                break;
                case 2: dia = "Martes";
                break;
                case 3: dia = "Miercoles";
                break;
                case 4: dia = "Jueves";
                break;
                case 5: dia = "Viernes";
                break;
                case 6: dia = "Sabado";
                break;
                case 7: dia = "Domingo";
                break;
            }
            
            if(num == 6 || num == 7){
                tipo_dia = "No laboral";
            }
            
            else{
                tipo_dia = "Laboral";
            }
            
            text_return = "\n"+dia+"\n"+tipo_dia;
            
            return text_return;
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
