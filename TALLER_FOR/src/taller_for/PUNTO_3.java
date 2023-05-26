/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_for;

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
    static Scanner on = new Scanner(System.in);
    static DecimalFormat formato = new DecimalFormat("#,###.00");
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            // VARIABLES
            int cantidad_num = 0;
            
            System.out.println("Ingrese la cantidad de numeros que desea");
            cantidad_num = on.nextInt();
            
            System.out.println(calcular_suma(cantidad_num));
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
    public static String calcular_suma(int cantidad_num){
        try {
            // VARIABLES
            int aleatorio;
            int suma = 0;
            String cambio;
            String texto;
            
            for (int i = 1; i <= cantidad_num; i++) {
                aleatorio = (int)(Math.random()*(100000-2)+2);
                System.out.println(i+"__ # "+aleatorio);
                suma = suma + aleatorio;
            }
            cambio = formato.format(suma);
            
            texto = "\nLa suma de todos los numeros es :"+cambio;
            
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
