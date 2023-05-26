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
public class PUNTO_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // DECIMOOCTAVO PUNTO
        try {
            //variables
            Scanner on = new Scanner(System.in);
            byte day;
            byte placa;
            
            System.out.println("Seleccione el dia de la semana actualmente\n1-Lunes\n2-Martes\n3-Miercoles\n4-Jueves\n5-Viernes");
            day = on.nextByte();
            
            while(day<0 || day >5){
                System.out.println("\nIngreso un numero fuera de rango. Por favor revise la lista e ingrese el numero correspondiente a su dia actual");
                day = on.nextByte();
            }
            
            System.out.println("\nIngrese el ultimo digito de su placa vehicular");
            placa = on.nextByte();
            
            while(placa < 0 || placa >9){
                System.out.println("\nError, numero fuera de rango. Intente de nuevo");
                placa = on.nextByte();
            }
            
            System.out.println("\n"+Consultar_placa(day, placa));
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
    
    public static String Consultar_placa(byte day, byte placa){
        try {
            //variables
            String text_ret = "";
            
            switch(day){
                case 1: if(placa == 6 || placa == 9){
                    text_ret = "Tienes pico y placa";
                }
                else{
                    text_ret = "NO Tienes pico y placa";
                }
                break;
                case 2: if(placa == 2 || placa == 3){
                    text_ret = "Tienes pico y placa";
                }
                else{
                    text_ret = "NO Tienes pico y placa";
                }
                break;
                case 3: if(placa == 4 || placa == 8){
                    text_ret = "Tienes pico y placa";
                }
                else{
                    text_ret = "NO Tienes pico y placa";
                }
                break;
                case 4: if(placa == 0 || placa == 7){
                    text_ret = "Tienes pico y placa";
                }
                else{
                    text_ret = "NO Tienes pico y placa";
                }
                break;
                case 5: if(placa == 5 || placa == 1){
                    text_ret = "Tienes pico y placa";
                }
                else{
                    text_ret = "NO Tienes pico y placa";
                }
                break;
            }
            
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
