/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_for_anidados;

/**
 *
 * @author JESUS ALBERTO
 */
import java.text.DecimalFormat;
public class punto_1 {

    /**
     * @param args the command line arguments
     */
    static DecimalFormat formato = new DecimalFormat("#,###.00");
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            System.out.println(Simular_ventas());
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);    
        }
        
        finally {
            System.out.println("fin de la ejecución");    
        }
    }
    
    
    
    public static String Simular_ventas(){
        try {
            // VARIABLES
            long vent_mes = 0;
            int aleatorio;
            String texto = "";
            String decimales = "";
            
            for (int i = 1; i <= 3; i++) {
                for (int mes = 1; mes <= 12; mes++) {
                    aleatorio = (int)(Math.random()*(200000001 - 100000000)+100000000);
                    vent_mes = vent_mes + aleatorio;
                }
                decimales = formato.format(vent_mes);
                texto = texto + "Total Ventas Año "+i+": $"+decimales+"\n";
                vent_mes = 0;
                decimales = "";
            }
            
            return texto;
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            return "-1";
        }
        finally {
            //System.out.println("fin de la ejecución");
            
        }
    }
    
}
