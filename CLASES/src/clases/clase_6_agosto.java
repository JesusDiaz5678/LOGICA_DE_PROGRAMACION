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
public class clase_6_agosto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            //Archivo de medidas
            //leer_archivo();
            
            //Archivo de palabra "ganar-GANAR"
            //Contar_palabras();
            
            
            //Archivo del salon
            control_salones();
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
    //Funcion de leer archivo de medidas
    public static void leer_archivo(){
        try {
            //variables
            int contador = 1;
            float suma_medidas = 0;
            double promedio;
            String lectura;
            
            FileReader archivo = new FileReader("C:\\Users\\JESUS ALBERTO\\Documents\\UNIVERSIDAD\\02° SEGUNDO SEMESTRE\\LOGICA DE PROGRAMACION\\ARCHIVOS\\medidas.txt");
            BufferedReader dat_arc = new BufferedReader(archivo);
            
            lectura = dat_arc.readLine();
            
            if(lectura == null){
                System.out.println("Su archivo esta vacio");
            }
            else
                while(lectura != null){
                    System.out.println("medida #"+contador+" :"+lectura+ " cm");
                    contador ++;
                    suma_medidas = suma_medidas + Float.parseFloat(lectura);
                    lectura = dat_arc.readLine();
                }
            
            dat_arc.close();
            
            promedio = (suma_medidas / contador - 1);
            System.out.println("\nEl promedio de las medidas es :"+promedio+" cm");
           
        }
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
        }
        
        finally {
            //System.out.println("fin de la ejecución");
            
        }
    }
    
    
    //Funcion de leer archivo de palabra ganar
    public static void Contar_palabras(){
        try {
            //variables
            String palabra_1 = "GANAR";
            String palabra_2 = "ganar";
            String lectura;
            int contador = 0;
            
            FileReader archivo = new FileReader("C:\\Users\\JESUS ALBERTO\\Documents\\UNIVERSIDAD\\02° SEGUNDO SEMESTRE\\LOGICA DE PROGRAMACION\\ARCHIVOS\\palabra.txt");
            BufferedReader dat_arc = new BufferedReader(archivo);
            
            lectura = dat_arc.readLine();
            
            if(lectura == null){
                System.out.println("Su archivo esta vacio");
            }
            else{
                while(lectura != null){
                    if(lectura.equals(palabra_1)){
                        contador ++;
                    }
                    else if(lectura.equals(palabra_2)){
                        contador ++;
                    }
                    lectura = dat_arc.readLine();
                }
            }
            dat_arc.close();
            
            System.out.println("La cantidad que esta la palabra GANAR en el archivo es: "+contador);
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            //System.out.println("fin de la ejecución");
            
        }
    }

    
    //Funcion de leer archivo de control del salon
    public static void control_salones(){
        try {
            // VARIABLES
            String curso;
            String cantidad_curso;
            String aprobado;
            String lectura;
            
            FileReader archivo = new FileReader("C:\\Users\\JESUS ALBERTO\\Documents\\UNIVERSIDAD\\02° SEGUNDO SEMESTRE\\LOGICA DE PROGRAMACION\\ARCHIVOS\\ESTUDIANTES.txt");
            BufferedReader dat_arc = new BufferedReader(archivo);
            
            lectura = dat_arc.readLine();
            
            if(lectura == null){
                System.out.println("ARCHIVO VACIO");
            }
            
            else
                while(lectura != null){
                    curso = lectura;
                    cantidad_curso = dat_arc.readLine();
                    aprobado = dat_arc.readLine();
                    System.out.println("Curso # "+curso+"\nCantidad de estudiantes: "+cantidad_curso+"\nCantidad estudiantes aprobados: "+aprobado+"\n");
                    lectura = dat_arc.readLine();
                }
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            //System.out.println("fin de la ejecución");
            
        }
    }
}
