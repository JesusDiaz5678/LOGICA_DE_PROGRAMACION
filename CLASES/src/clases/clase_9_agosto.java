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
public class clase_9_agosto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            FileReader arc_estudiantes = new FileReader("C:\\Users\\JESUS ALBERTO\\Documents\\UNIVERSIDAD\\02° SEGUNDO SEMESTRE\\LOGICA DE PROGRAMACION\\ARCHIVOS\\Estu.txt"); 
            
            // PRIMERA FUNCION
            //System.out.println(Revisar_notas());
            
            // SEGUNDA FUNCION
            System.out.println(Resumir_resultados_curso(arc_estudiantes));
            
            // TERCERA FUNCION
            //System.out.println(Calcular_notas_finales(arc_estudiantes));
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
        }
        
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
    // PRIMERA FUNCION
    public static String Revisar_notas (){
        try {
            // VARIABLES
            String lectura;
            String name;
            String nota_1;
            String nota_2;
            String nota_3;
            String nota_4;
            String text = "";
            
            float definitiva = 0;
            int aprobados = 0;
            int no_aprobados = 0;
            int cant_est = 0;
            float nota_mayor = 0;
            float nota_menor = 5;
            
            FileReader arc_EST = new FileReader("C:\\Users\\JESUS ALBERTO\\Documents\\UNIVERSIDAD\\02° SEGUNDO SEMESTRE\\LOGICA DE PROGRAMACION\\ARCHIVOS\\Estu.txt");
            BufferedReader dat_EST = new BufferedReader(arc_EST);
            
            lectura = dat_EST.readLine();
            
            if(lectura == null){
                text = "El archivo esta vacio";
            }
            else{
                while(lectura != null){
                    cant_est ++;
                    name = lectura;
                    nota_1 = dat_EST.readLine();
                    nota_2 = dat_EST.readLine();
                    nota_3 = dat_EST.readLine();
                    
                    definitiva = (float)((Float.parseFloat(nota_1)*0.2) + (Float.parseFloat(nota_2)*0.4) + (Float.parseFloat(nota_3)*0.4) );
                    if(definitiva >= 3){
                        aprobados ++;
                    }
                    else{
                        no_aprobados ++;
                    }
                    if(nota_mayor < definitiva){
                        nota_mayor = definitiva;
                    }
                    if(definitiva < nota_menor){
                        nota_menor = definitiva;
                    }
                    text = text + ("Nombre: "+name
                            +"\nNota 1: "+nota_1
                            +"\nNota 2: "+nota_2
                            +"\nNota 3: "+nota_3
                            +"\nDefinitiva: "+definitiva+"\n\n");
                    
                    lectura = dat_EST.readLine();
                }
            }
            text = text +"\n\nCantidad Total de Estudiantes: "+cant_est
                    +"\nEstudiantes aprobados: "+aprobados
                    +"\nEstudiantes NO aprobados: "+no_aprobados
                    +"\nNota Mayor: "+nota_mayor
                    +"\nNota Menor: "+nota_menor;
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
    
    public static String Resumir_resultados_curso(FileReader arc_estudiantes){
        try {
            // VARIABLES
            String lectura;
            String name;
            String nota_1;
            String nota_2;
            String nota_3;
            String nota_4;
            String text = "";
            
            float definitiva = 0;
            int aprobados = 0;
            int no_aprobados = 0;
            int cant_est = 0;
            float nota_mayor = 0;
            float nota_menor = 5;
            float promedio = 0;
            
            FileReader arc_EST = new FileReader("C:\\Users\\JESUS ALBERTO\\Documents\\UNIVERSIDAD\\02° SEGUNDO SEMESTRE\\LOGICA DE PROGRAMACION\\ARCHIVOS\\Estu.txt");
            BufferedReader dat_EST = new BufferedReader(arc_EST);
            
            lectura = dat_EST.readLine();
            
            if(lectura == null){
                text = "El archivo esta vacio";
            }
            else{
                while(lectura != null){
                    cant_est ++;
                    name = lectura;
                    nota_1 = dat_EST.readLine();
                    nota_2 = dat_EST.readLine();
                    nota_3 = dat_EST.readLine();
                    
                    definitiva = (float)((Float.parseFloat(nota_1)*0.2) + (Float.parseFloat(nota_2)*0.4) + (Float.parseFloat(nota_3)*0.4) );
                    if(definitiva >= 3){
                        aprobados ++;
                    }
                    else{
                        no_aprobados ++;
                    }
                    if(nota_mayor < definitiva){
                        nota_mayor = definitiva;
                    }
                    if(definitiva < nota_menor){
                        nota_menor = definitiva;
                    }
                    
                    promedio = promedio + definitiva;
                    lectura = dat_EST.readLine();
                }
            }
            promedio = promedio / cant_est;
            text = text +"Cantidad Total de Estudiantes: "+cant_est
                    +"\nEstudiantes aprobados: "+aprobados
                    +"\nEstudiantes NO aprobados: "+no_aprobados
                    +"\nNota Mayor: "+nota_mayor
                    +"\nNota Menor: "+nota_menor
                    +"\nPromedio de notas: "+promedio;
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

    public static String Calcular_notas_finales(FileReader arc_estudiantes){
        try {
            // VARIABLES
            String lectura;
            String name;
            String nota_1;
            String nota_2;
            String nota_3;
            String nota_4;
            String text = "";
            
            float definitiva = 0;
            
            
            FileReader arc_EST = new FileReader("C:\\Users\\JESUS ALBERTO\\Documents\\UNIVERSIDAD\\02° SEGUNDO SEMESTRE\\LOGICA DE PROGRAMACION\\ARCHIVOS\\Estu.txt");
            BufferedReader dat_EST = new BufferedReader(arc_EST);
            
            lectura = dat_EST.readLine();
            
            if(lectura == null){
                text = "El archivo esta vacio";
            }
            else{
                while(lectura != null){
                    name = lectura;
                    nota_1 = dat_EST.readLine();
                    nota_2 = dat_EST.readLine();
                    nota_3 = dat_EST.readLine();
                    
                    definitiva = (float)((Float.parseFloat(nota_1)*0.2) + (Float.parseFloat(nota_2)*0.4) + (Float.parseFloat(nota_3)*0.4) );
                    
                    text = text + ("Nombre: "+name
                            +"\nDefinitiva: "+definitiva+"\n\n");
                    
                    lectura = dat_EST.readLine();
                }
            }
           
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
