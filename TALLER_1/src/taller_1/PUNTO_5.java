/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author JESUS ALBERTO
 */
public class PUNTO_5 {

    /**
     * @param args the command line arguments
     */
     //VARIABLES GLOBALES
     static float dolar_americano = 4445;
     static float euro = 4560;
     static float dolar_canadiense = 4365;
     static float yen_japones = (float)34.7;
    
    public static void main(String[] args) {
        // TODO code application logic here
        // QUINTO PUNTO
        
        try {
            Scanner on = new Scanner(System.in);
            //variables
            float dinero;
            
            System.out.println("Ingrese su cantidad de dinero");
            dinero = on.nextFloat();
            
            while(dinero <=0){
                System.out.println("\nPor favor, ingrese un valor positivo");
                dinero = on.nextFloat();
            }
            
            System.out.println(Estimar_cambio(dinero));
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");
            
        }
        
    }
    
    public static String Estimar_cambio(float dinero){
        DecimalFormat formato = new DecimalFormat("#,###.00");
        
        try {
            //Declaracion de variables
            String dinero_dolar;
            String dinero_euro;
            String dinero_dolarcan;
            String dinero_yen;
            String texto_retu;
            
            dinero_dolar = formato.format(dinero / dolar_americano);
            dinero_euro = formato.format(dinero / euro);
            dinero_dolarcan = formato.format(dinero / dolar_canadiense);
            dinero_yen = formato.format(dinero / yen_japones);
            
            texto_retu = "\nDOLAR AMERICANO = $"+dinero_dolar
                    +"\nEURO = $"+dinero_euro
                    +"\nDOLAR CANADIENSE = $"+dinero_dolarcan
                    +"\nYEN JAPONES = $"+dinero_yen;
            
            return texto_retu;
            
        }
        
        catch (Exception error){
            System.out.println("Se presento un error " + error);
            return "";
            
        }
        
        finally {
            //System.out.println("fin de la ejecución");
            
        }
    }
    
}
