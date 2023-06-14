/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_de_archivo;

/**
 *
 * @author JESUS ALBERTO
 */
import java.io.*;
public class Ejercicio_de_archivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            
            Contar_Votos();
            
            if(Contar_Votos().equals("-1")){
                System.out.println("Su archivo esta vacio. Verifiquelo");
            }
            else{
                System.out.println(Contar_Votos());
            }
            
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("\nfin de la ejecución");    
        }
    }
    
    
    //Funcion
    public static String Contar_Votos (){
        try {
            
            //VARIABLES
            String text_ret = "";
            short Can_A = 0;
            short Can_B = 0;
            short Can_C = 0;
            short Vot_N = 0;
            short Vot_B = 0;
            
            //CARGAR Y LEER ARCHIVO
            FileReader arc_votos = new FileReader("C:\\Users\\JESUS ALBERTO\\Documents\\UNIVERSIDAD\\02° SEGUNDO SEMESTRE\\LOGICA DE PROGRAMACION\\ARCHIVOS\\votos.txt");
            BufferedReader dat_votos = new BufferedReader(arc_votos);
            
            //Leer archivo
            String linea;
            linea = dat_votos.readLine();
            
            //Verificar que el archivo no este vacio
            if(linea == null){
                text_ret = "-1";
            }
            else{
                while(linea != null){
                    //Verificamos los votos
                    switch(linea){
                        case "A" :
                            Can_A ++;
                        break;
                        case "B" :
                            Can_B ++;
                        break;
                        case "C" :
                            Can_C ++;
                        break;
                        case "#" :
                            Vot_N ++;
                        break;
                        case "?" :
                            Vot_B ++;
                        break;
                    }
                    
                    //Leo la siguiente linea
                    linea = dat_votos.readLine();
                }
                
                //Concatenamos la variable string de retorno
                text_ret = "Votos del candidato A: "+Can_A
                        +"\nVotos del candidato B: "+Can_B
                        +"\nVotos del candidato C: "+Can_C
                        +"\nVotos Nulos: "+Vot_N
                        +"\nVotos en Blanco: "+Vot_B;
            }
            
            return text_ret;
        }
        
        catch (Exception error) {
            return ("Se presento un error " + error);
            
        }
        
        finally {
            //System.out.println("fin de la ejecución");    
        }
    }
    
}
