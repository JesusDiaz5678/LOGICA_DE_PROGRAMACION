/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;

/**
 *
 * @author JESUS ALBERTO
 */
import java.io.*;
import java.text.DecimalFormat;
public class clase_14_2_septiembre {

    /**
     * @param args the command line arguments
     */
        public static String mascara = "$#,###.0";
        public static DecimalFormat formato = new DecimalFormat(mascara);
        
        static String verde ="\u001B[32m";
        static String rojo ="\u001B[31m";
        static String reset ="\u001B[0m";
        
        
    public static void main(String[] args) {
        // TODO code application logic here
        // ejercicio de excel
        try {
            int[]v_vtas = Cargar_ventas();
           
            if(v_vtas.length==0){
                    System.out.println("Error, el archivo esta vacio");
            }
            
            else if(v_vtas.length==1){
                System.out.println("Hay un error en la función");
            }
            
            else
            for(int i = 0; i<v_vtas.length; i++){
                
                if(v_vtas[i] >= 400000)
                System.out.println("ventas "+ (i+1)+ " " + verde + formato.format(v_vtas[i])+reset);
                
                else
                 System.out.println("ventas "+ (i+1)+ " " + rojo + formato.format(v_vtas[i])+ reset);   
            
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
    public static int[] Cargar_ventas(){
        
        try {
            FileReader archivo = new FileReader("C:\\Users\\JESUS ALBERTO\\Documents\\UNIVERSIDAD\\02° SEGUNDO SEMESTRE\\LOGICA DE PROGRAMACION\\ARCHIVOS\\vtas_mes.csv");
            BufferedReader datos_ventas = new BufferedReader(archivo);
            
            int[]vector_a_retornar;
            
            int posicion = 0;
            int cant_lineas_arch = 0;
            
            String v_split[];
            
            String linea;
            
            
            //1. contar cuantas lineas tiene el archivo
            linea = datos_ventas.readLine();
            
            while(linea != null){
                cant_lineas_arch ++;
                linea = datos_ventas.readLine();
            }
            datos_ventas.close();
            
            
            //2. verifico que el archivo tenga lineas
            if(cant_lineas_arch == 0){
                return new int[0];
            }
                
            
            else{
                //volvemos abrir el archivo para procesarlo
                 vector_a_retornar = new int[cant_lineas_arch];
                
                 archivo = new FileReader("C:\\Users\\JESUS ALBERTO\\Documents\\UNIVERSIDAD\\02° SEGUNDO SEMESTRE\\LOGICA DE PROGRAMACION\\ARCHIVOS\\vtas_mes.csv");
                 datos_ventas = new BufferedReader(archivo);
                 linea = datos_ventas.readLine();
                 
                 while(linea != null){
                     v_split = linea.split(";");
                     vector_a_retornar[posicion] =  Integer.parseInt(v_split[1]);
                     linea = datos_ventas.readLine();
                     posicion ++;
                 }
                 
                 datos_ventas.close();
            }
            
            return vector_a_retornar;
            
        }
        
        catch (Exception error) {
            return new int[1];
           
        }
        
        finally {
            //System.out.println("fin de la ejecución");
            
        }
        
    }
}
