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
public class PUNTO_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            
            System.out.println(Ejecutar_numero());
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
    public static String Ejecutar_numero(){
        Scanner on = new Scanner(System.in);
        try {
            int num;
            int mayor = 0;
            int num_cua;
            int num_cub;
            String text_ret;
            
            System.out.println("Ingrese dos numeros");
            for(byte i = 1; i <=2; i++){
                num = on.nextInt();
                
                if(num > mayor){
                    mayor = num;
                }
            }
            
            num_cua = (int)Math.pow(mayor, 2);
            num_cub = (int)Math.pow(mayor, 3);
            
            text_ret = "\nCUADRADO DE "+mayor+" es: "+num_cua
                    +"\nCUBO DE "+mayor+" es: "+num_cub;
            
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
