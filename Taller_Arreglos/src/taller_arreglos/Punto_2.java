/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_arreglos;

/**
 *
 * @author JESUS ALBERTO
 */
public class Punto_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            //Variables
            byte []v_temperaturas = new byte[50];
            
            v_temperaturas = LLenar_vector(v_temperaturas);
            
            System.out.println(Calcular_temperaturas(v_temperaturas));
            
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");    
        }
    }
    
    //Funciones
    public static byte [] LLenar_vector(byte []v_temperaturas)throws Exception {
        try {
            //Variables
            byte []v_alternativo = v_temperaturas;
            byte aleatorio;
            
            //Recorro en un ciclo para llenar el vector alternativo
            for (int i = 0; i < v_alternativo.length; i++) {
                aleatorio = (byte)(Math.random()*(301-0)+0);
                v_alternativo[i] = aleatorio;
            }
            
            return v_alternativo;
            
        }
        
        catch (Exception error) {
            throw new Exception("Se presento un error en la funcion Llenar_vector " + error);    
        }
        
        finally {
            //System.out.println("fin de la ejecución");    
        }
    }

    public static String Calcular_temperaturas(byte []v_temperaturas)throws Exception{
        try {
            //Variables
            int media;
            byte cant_medidas=0;
            int suma_medidas = 0;
            byte temp_mayor = 0;
            byte temp_menor = 0;
            byte temp_igual = 0;
            String text_ret = "";
            
            for (byte i = 0; i < v_temperaturas.length; i++) {
                suma_medidas = suma_medidas + v_temperaturas[i];
                cant_medidas ++;
            }
            
            media = suma_medidas / cant_medidas;
            
            for (int i = 0; i < v_temperaturas.length; i++) {
                if(v_temperaturas[i] > media){
                    temp_mayor++;
                }
                else if(v_temperaturas[i] < media){
                    temp_menor++;
                }
                else{
                    temp_igual++;
                }
            }
            text_ret = "Temperatura media:                   "+media+"."+
                    "\n# de temperaturas mayor a la media:   "+temp_mayor+
                    "\n# de temperaturas menor a la media:   "+temp_menor+
                    "\n# de temperaturas iguales a la media: "+temp_igual;
            
            return text_ret;
        }
        catch (Exception error) {
            throw new Exception("Se presento un error en la funcion Calcular_temperatura " + error);
            
        }
        finally {
            //System.out.println("fin de la ejecución");    
        }
    }
}
