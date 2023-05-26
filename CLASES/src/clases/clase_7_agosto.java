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
public class clase_7_agosto {

    /**
     * @param args the command line arguments
     */
    
    
    //Comparar las lineas de dos archivos y verificar si tienen la misma cantidad
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            //File arc_est = new File("C:\\Users\\JESUS ALBERTO\\Documents\\estudiantes.txt");
            //se puede usar de la siguiente manera
            
            FileReader estudiantes = new FileReader("C:\\Users\\JESUS ALBERTO\\Documents\\UNIVERSIDAD\\02° SEGUNDO SEMESTRE\\LOGICA DE PROGRAMACION\\ARCHIVOS\\estudiantes_2.txt");
            BufferedReader datos_est = new BufferedReader (estudiantes);
            
            //File arc_not = new File("C:\\Users\\JESUS ALBERTO\\Documents\\notas.txt");
            FileReader notas = new FileReader("C:\\Users\\JESUS ALBERTO\\Documents\\UNIVERSIDAD\\02° SEGUNDO SEMESTRE\\LOGICA DE PROGRAMACION\\ARCHIVOS\\notas.txt");
            BufferedReader datos_not = new BufferedReader (notas);
            
            int nro_linea_e=0;
            int nro_linea_n=0;
            String linea_n; 
            String linea_e;
            
            linea_n = datos_not.readLine();
            linea_e = datos_est.readLine();
            
            if(linea_n==null || linea_e == null)
                System.out.println("Uno de sus archivos esta vacio");
            
            else{
                while(linea_n !=null & linea_e != null){
                    nro_linea_e++;
                    nro_linea_n++;
                    linea_n = datos_not.readLine();
                    linea_e = datos_est.readLine();
                }
                
                if(linea_n == null & linea_e != null)
                    System.out.println("Revise el archivo de estudiantes, no tiene las mismas lineas");
                else if(linea_n !=null & linea_e ==null)
                    System.out.println("Revise el archivo de notas, no tiene las mismas lineas");
                else{
                    if(nro_linea_e == nro_linea_n)
                    System.out.println("Los archivos tienen la misma linea");
                }
                    
                
            }
            datos_not.close();
            datos_est.close();
            
            
            
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
}
