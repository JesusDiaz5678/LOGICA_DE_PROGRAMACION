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
public class PUNTO_2 {

    /**
     * @param args the command line arguments
     */
    static Scanner on = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            //VARIABLES
            int rango_ini;
            int rango_fin;
            
            System.out.println("Ingrese el rango inicial");
            rango_ini = on.nextInt();
            
            System.out.println("\nIngrese el rango final. Debe ser mayor al rango inicial ingresado anteriormente");
            rango_fin = on.nextInt();
            
            while(rango_fin <= rango_ini){
                System.out.println("\nDigito incorrecto. Por favor ingrese un digito mayor al rango inicial ingresado anteriormente");
                rango_fin = on.nextInt();
            }
            
            System.out.println(contar_pares(rango_ini, rango_fin));
        }
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
    public static String contar_pares(int rango_ini, int rango_fin){
        try {
            // VARIABLES
            int num_pares = 0;
            int num_impares = 0;
            int aleatorio;
            String text;
            
            for (int i = 1; i <= 900; i++) {
                aleatorio = (int)(Math.random()*((rango_fin+1)-rango_ini)+rango_ini);
                
                if(aleatorio%2 == 0){
                    num_pares ++;
                }
                else{
                    num_impares ++;
                }
            }
            
            text = "\nTotal de numeros pares :"+num_pares+"\nTotal de numeros impares"+num_impares;
            
            return text;
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
