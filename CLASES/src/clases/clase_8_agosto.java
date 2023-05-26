/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;

/**
 *
 * @author JESUS ALBERTO
 */
import java.util.Scanner;
import java.io.*;
public class clase_8_agosto {

    /**
     * @param args the command line arguments
     */
    static Scanner on = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            //Funcion menu
            //Consultar_menu();
            
            
            //Funcion Manejo_premios
            System.out.println(Manejo_premios());
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);    
        }
        
        finally {
            System.out.println("fin de la ejecución");    
        }
        
    }
    
    //Funcion menu
    public static void Consultar_menu(){
        try {
            // VARIABLES
            byte opcion_1 = 0;
            byte opcion_2 = 0;
            
            System.out.println("Elija la opcion:\n"+
                    "1. Comprar Tiquetes\n"+
                    "2. Cancelar Tiquetes");
            opcion_1 = on.nextByte();
            
            switch(opcion_1){
                case 1: System.out.println("\nElija la opcion:\n"+
                        "1. Vuelo Nacional\n"+
                        "2. Vuelo Internacional");
                opcion_2 = on.nextByte();
                
                switch(opcion_2){
                    case 1: System.out.println("\nSelecciono comprar Vuelo Nacional");
                    break;
                    case 2: System.out.println("\nSelecciono comprar Vuelo Internacional");
                    break;
                    default: System.out.println("Opcion Invalida");
                    break;
                }
                break;
                
                case 2: System.out.println("\nElija la opcion:\n"+
                        "1. con Reserva\n"+
                        "2. con Doc.Id");
                opcion_2 = on.nextByte();
                
                switch(opcion_2){
                    case 1: System.out.println("\nIngrese su numero de reserva del tiquete");
                    break;
                    case 2: System.out.println("\nIngrese su numero de identificacion");
                    break;
                    default: System.out.println("Opcion Invalida");
                    break;
                }
                break;
            }
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            //System.out.println("fin de la ejecución"); 
        }
    }
    
    
    //Funcion Manejo de archivo
    public static String Manejo_premios(){
        try {
            // VARIABLES
            String linea_inv;
            String linea_prem;
            String invitado = "";
            String premio = "";
            String texto_ret = "";
            int contador = 1;
            int contador_2 = 1;
            int azar = 0;
            int dado = 0;
            
            FileReader arc_inv = new FileReader("C:\\Users\\JESUS ALBERTO\\Desktop\\PRACTICAS\\archivos\\INVITADOS.txt");
            FileReader arc_pre = new FileReader("C:\\Users\\JESUS ALBERTO\\Desktop\\PRACTICAS\\archivos\\PREMIOS.txt");
            BufferedReader dat_inv = new BufferedReader(arc_inv);
            
            azar = (int)(Math.random()*(7-1)+1);
            linea_inv = dat_inv.readLine();
            
            if(linea_inv == null){
                System.out.println("El archivo INVITADOS.txt esta vacio");
            }
            else{
            while (azar > contador & linea_inv != null) {
                contador++;
                linea_inv = dat_inv.readLine();
            }
            invitado = linea_inv;
            
            // Se carga el archivo premio a la memoria
            BufferedReader dat_prem = new BufferedReader(arc_pre);
            linea_prem = dat_prem.readLine();
                
                if(linea_prem == null){
                    System.out.println("El archivo INVITADOS.txt esta vacio");
                }
                else{
                    dado = (int)(Math.random()*(7-1)+1);
                    while (dado > contador_2 & linea_prem != null) {
                        contador_2++;
                        linea_prem = dat_prem.readLine();
                    }
                    premio = linea_prem;
                }
            }
            texto_ret = "Invitado: "+invitado+", gano: ->"+premio;
            
            return texto_ret;
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
