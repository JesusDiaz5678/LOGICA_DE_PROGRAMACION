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
public class PUNTO_14 {

    /**
     * @param args the command line arguments
     */
    
    static Scanner on = new Scanner(System.in);
    static DecimalFormat formato = new DecimalFormat("#,###.00");
    
    public static void main(String[] args) {
        // TODO code application logic here
        // DECIMOCUARTO PUNTO
        
        try {
            //VARIABLES
            int valor_hora;
            int digito;
            
            System.out.println("Ingrese el ultimo digito de su ID");
            digito = on.nextByte();
            
            System.out.println("\nIngrese el valor de su hora de trabajo");
            valor_hora = on.nextInt();
            
            while(valor_hora <1 || valor_hora >100000){
               System.out.println("\nValor fuera de rango. Por favor ingrese su valor de hora adecuado");
               valor_hora = on.nextInt();
            }
            
            System.out.println(ejecutar_bonificacion(valor_hora, digito));
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
    public static String ejecutar_bonificacion(int valor_hora, int digito){
        try {
            float valor_bono;
            String text;
            
            
            if(digito % 2 == 0){
                valor_bono = (float)((valor_hora) * (8.5) * (24) * (1.12)); 
            }
            
            else{
                valor_bono = (float)(valor_hora * 8.5 * 24* 1.165);
            }
            
            text = "\nEl valor de su bono es: $"+formato.format(valor_bono);
            return text;
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
