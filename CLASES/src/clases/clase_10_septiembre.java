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
public class clase_10_septiembre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            // CAJAS DE SALSA BBQ
            // Funcion Organizar_cajas
            //System.out.println(Organizar_Cajar());
            
            
            
            //Funcion de movimientos del archivo
            System.out.println(movimientos_arc());
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);    
        }

        finally {
            System.out.println("fin de la ejecución");    
        }
    }
    
    
    //Funcion de ORGANIZAR_cajas
    public static String Organizar_Cajar(){
        try {
            // VARIABLES
            int aleatorio;
            int consecutivo = 555;
            int contador = 0;
            int cajas = 1;
            String cant_salsas = "";
            String texto_ret = "";
            
            aleatorio = (int)(Math.random()*(200001-100000)+100000);
            while(aleatorio % 6 != 0){
                 aleatorio = (int)(Math.random()*(200001-100000)+100000);
            }
            //aleatorio = 300000;
            for (int i = 1; i <= aleatorio; i++) {
                contador++;
                cant_salsas = cant_salsas + ((consecutivo)+"|");
                consecutivo = consecutivo + 1;
                
                if(i % 12 == 0){
                    texto_ret = texto_ret +"C-"+cajas+" == "+cant_salsas+"\n";
                    contador = 0;
                    cant_salsas = "";
                    cajas++;
                }
            }
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
    
    
    static String movimientos_arc(){
        try {
            // VARIABLES
            String letra;
            String numero;
            int total_puntos = 0;
            String texto = "";
            
            FileReader arc_movimientos = new FileReader ("C:\\Users\\JESUS ALBERTO\\Documents\\UNIVERSIDAD\\02° SEGUNDO SEMESTRE\\LOGICA DE PROGRAMACION\\ARCHIVOS\\movimientos.txt");
            BufferedReader dat_arc = new BufferedReader (arc_movimientos);
            
            letra = dat_arc.readLine();
            
            if(letra == null){
                texto = "Su archivo esta vacio";
            }
            
            else{
                while(letra != null){
                    switch(letra){
                        case "D" :
                            numero = dat_arc.readLine();
                            total_puntos = total_puntos + Integer.parseInt(numero);
                        break;
                        case "I" :
                            numero = dat_arc.readLine();
                            total_puntos = total_puntos - Integer.parseInt(numero);
                        break;
                        case "A" :
                            numero = dat_arc.readLine();
                            total_puntos = total_puntos + Integer.parseInt(numero);
                            total_puntos = (int)(Math.pow(total_puntos, 3));
                        break;
                    }
                    letra = dat_arc.readLine();
                }
            }
            texto = "Total de puntos: "+total_puntos;
            return texto;
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
