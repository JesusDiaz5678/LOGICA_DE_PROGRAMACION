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
import java.text.DecimalFormat;
public class PUNTO_3 {

    /**
     * @param args the command line arguments
     */
        //VARIABLE GLOBAL
        static float porcentaje = 0;
        static DecimalFormat formato = new DecimalFormat("#,###.00");
        
    public static void main(String[] args) {
        // TODO code application logic here
        // TERCER PUNTOS
        
        try {
            //Variables
            Scanner on = new Scanner(System.in);
            
            byte satisfaccion;
            int valor;
            String propina_txt;
            String valor_txt;
            
            
            System.out.println("Ingrese el valor de su cuenta por favor:");
            valor = on.nextInt();
            
            System.out.println("\nIngrese el numero de su satisfaccion de la siguiente manera:\n1_BAJA\n2_MEDIA\n3_ALTA");
            satisfaccion = on.nextByte();
            
            
            propina_txt = formato.format(Calcular_propina(satisfaccion, valor));
            
            System.out.println("\nEl valor de la propina es $"+propina_txt);
            
            valor_txt = formato.format(calcular_valor(valor));
            
            System.out.println("\nLa cuenta total es $"+valor_txt);
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
    //funcion de propina
    public static float Calcular_propina(byte satisfaccion, int valor){
        try {
            //variables
            float propina;
            
           
            switch(satisfaccion){
                case 1: porcentaje = (float)0.03;
                break;
                case 2: porcentaje = (float)0.07;
                break;
                case 3: porcentaje = (float)0.10;
                break;
                
                }
           
            propina = valor * porcentaje;
            
            return propina;
            
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            return -1;
        }
        
        finally {
            //System.out.println("fin de la ejecución");
            
        }
    }
    
    //funcion valor total a pagar
    
    public static float calcular_valor(int valor){
        try {
            //variables
            float cuenta = 0;
            
            cuenta = (float)((valor * porcentaje)+ (valor * 0.08) + valor); 
            
            return cuenta;
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            return -1;
        }
        
        finally {
            //System.out.println("fin de la ejecución");
            
        }
    }
    
}
