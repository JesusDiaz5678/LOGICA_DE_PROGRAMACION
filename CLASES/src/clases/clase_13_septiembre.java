/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;

/**
 *
 * @author JESUS ALBERTO
 */
import java.text.DecimalFormat;
import java.io.*;
public class clase_13_septiembre {

    /**
     * @param args the command line arguments
     */
    
    //VARIABLES GLOBALES EN TODO
    //Declaracion de colores
    
    static String verde ="\u001B[32m";
    static String rojo ="\u001B[31m";
    static String azul ="\u001B[34m";
    static String negro ="\u001B[30m";
    static String amarillo ="\u001B[33m";
    static String cyan ="\u001B[36m";
    static String purpura ="\u001B[35m";
    static String blanco ="\u001B[37m";
    static String reset ="\u001B[0m";
    
    static String patron = "#,###.#";
    
    static DecimalFormat formato = new DecimalFormat(patron);
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            
            Calcular_ventas_an();
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");    
        }
    }
    
    
    //FUNCION
    static void Calcular_ventas_an(){
        
        try {
            
            //Escribir archivo
            FileWriter arch_totales = new FileWriter("C:/Users/JESUS ALBERTO/Documents/UNIVERSIDAD/02° SEGUNDO SEMESTRE/LOGICA DE PROGRAMACION/ARCHIVOS/vtas_totales.txt");
            PrintWriter linea_imp = new PrintWriter(arch_totales);
            
            //Leer archivo
            FileReader arc_ventas = new FileReader("C:\\Users\\JESUS ALBERTO\\Documents\\UNIVERSIDAD\\02° SEGUNDO SEMESTRE\\LOGICA DE PROGRAMACION\\ARCHIVOS\\ventas.txt");
            BufferedReader datos_vtas = new BufferedReader(arc_ventas);
            
            String mensaje_ventas = "", linea="", ano_act=""; //concatenas el String
            
            long vtas_ano = 0;
            
            String [] caja_vtas;
            
            
            linea = datos_vtas.readLine();
            
            while(linea!= null){
                
                caja_vtas = linea.split("@");
                
                ano_act = caja_vtas[0];
                
                //siempre debe heredar la condicion de afuera
                while(ano_act.equals(caja_vtas[0]) & linea != null){
                    
                    vtas_ano += Long.parseLong(caja_vtas[1]);
                    
                    linea = datos_vtas.readLine();
                    
                    if(linea != null)
                    caja_vtas = linea.split("@");
                
                }
                
               linea_imp.println("Las ventas para el año "+ano_act + " fueron $"+ formato.format(vtas_ano));
                vtas_ano = 0;
                
                
            }
            datos_vtas.close();
            linea_imp.close();
            
            
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            //System.out.println("fin de la ejecución");
            
        }
    }
}
