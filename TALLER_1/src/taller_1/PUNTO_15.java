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
public class PUNTO_15 {

    /**
     * @param args the command line arguments
     */
     
    static String verde ="\u001B[32m";
    static String rojo ="\u001B[31m";
    static String reset ="\u001B[0m";
    
    static String azul ="\u001B[34m";
    static String negro ="\u001B[30m";
    static String amarillo ="\u001B[33m";
    static String cyan ="\u001B[36m";
    static String purpura ="\u001B[35m";
    static String blanco ="\u001B[37m";
    
    public static void main(String[] args) {
        // TODO code application logic here
        // DECIMOQUINTO Y DECIMOSEXTO PUNTO
        
        try {
            //VARIABLES
            Scanner on = new Scanner(System.in);
            int ID;
            byte num_habitacion;
            String name;
            
            System.out.println("Ingrese su nombre");
            name = on.nextLine();
            
            System.out.println("\nIngrese su ID");
            ID = on.nextInt();
            
            num_habitacion = (byte)(Math.random()*(6-1)+1);
            
            System.out.println("=========INFORMACION DE HOSPEDAJE==========="+"\nNOMBRE: "+name);
            System.out.println(Hallar_habitacion(ID, num_habitacion, name));
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");    
        }
    }
    
    public static String Hallar_habitacion(int ID, byte num_habitacion, String name){
        try {
            //VARIABLES
            String text_retur = "";
            
            switch(num_habitacion){
                case 1: text_retur = azul+"N°de habitacion: 1 "+azul+"\nCamas: 2 "+azul+"\nPlanta: Primera"+reset;
                break;
                case 2: text_retur = rojo+"N°de habitacion: 2 "+rojo+"\nCamas: 1 "+rojo+"\nPlanta: Primera"+reset;
                break;
                case 3: text_retur = verde+"N°de habitacion: 3 "+verde+"\nCamas: 3 "+verde+"\nPlanta: Segunda"+reset;
                break;
                case 4: text_retur = cyan+"N°de habitacion: 4 "+cyan+"\nCamas: 2 "+cyan+"\nPlanta: Segunda"+reset;
                break;
                case 5: text_retur = amarillo+"N°de habitacion: 5 "+amarillo+"\nCamas: 1 \n"+amarillo+"Planta: Tercera"+reset;
                break;
            }
            
            return text_retur;
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            return"";
        }
        
        finally {
            //System.out.println("fin de la ejecución");
            
        }
        
    }
    
    
}
