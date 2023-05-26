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
public class PUNTO_9 {

    /**
     * @param args the command line arguments
     */
    static Scanner on = new Scanner(System.in);
    static DecimalFormat formato = new DecimalFormat("#,###.00");
    public static void main(String[] args) {
        // TODO code application logic here
        // NOVENO PUNTO
        try {
            //VARIABLES
            String nombre;
            int cant_horas;
            int val_hora;
            
            System.out.println("Ingrese su nombre");
            nombre = on.nextLine();
            
            System.out.println("\nIngrese el valor de hora");
            val_hora = on.nextInt();
            
            System.out.println("\nIngrese la cantidad de horas trabajadas durante el mes");
            cant_horas = on.nextInt();
            
            if(cant_horas <172 || cant_horas>200){
                System.out.println("\nLa cantidad de sus horas trabajadas estan fuera de rango");
            }
            
            else{
                System.out.println(Calcular_salario(nombre, cant_horas, val_hora));
            }
            
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
    
    //FUNCION
    public static String Calcular_salario(String nombre, int cant_horas, int val_hora){
        try {
            //variables
            int valor_bruto = 0;
            String valor_txt;
            int valor_neto;
            int descuento = 0;
            String text_ret = "";
            
            valor_bruto = val_hora * cant_horas;
            
            if(valor_bruto >2100000){
                descuento = (int)(valor_bruto * 0.06);
            }
            valor_neto = valor_bruto - descuento;
            valor_txt = formato.format(valor_neto);
            
            text_ret = "\nNOMBRE : "+nombre
                    +"\nVALOR HORA : $"+val_hora
                    +"\nCANTIDAD DE HORAS : "+cant_horas
                    +"\nVALOR BRUTO : $"+valor_bruto
                    +"\nDESCUENTO : $"+descuento
                    +"\nVALOR NETO A RECIBIR : $"+valor_txt;
            
            return text_ret;
            
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            return"";
        }
        
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
}
