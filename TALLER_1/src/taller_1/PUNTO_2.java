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
public class PUNTO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // segundo punto
        
        try {
            //variables
            Scanner on = new Scanner(System.in);
            int minutos;
            System.out.println("Ingrese la duracion de minutos de su llamada");
            minutos = on.nextInt();
            
            System.out.println("\nSu costo de llamada es:  $"+ Calcular_costo(minutos));
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
    public static float Calcular_costo(int minutos){
        try {
            //variables
            float costo = (float)0.50;
            int contador=3;
            
            if(minutos >0 & minutos <=3){
                costo = costo;
            }
            
            while(minutos > 3 && minutos > contador){
                costo = (float)(costo + 0.1);
                contador ++;
            }
            
            return costo;
            
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
