/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;

/**
 *
 * @author JESUS ALBERTO
 */
public class clase_14_septiembre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ARREGLO
        //Es un almacenamiento temporar en memoria
        try {
            float[]v_temperaturas = inicializar_temp();
            
            
            if(v_temperaturas.length == 1)
                System.out.println("Hubo un error en la funcion");
            else{
                for(byte i = 0; i <v_temperaturas.length; i++){
                    System.out.println("temp "+ (i+1)+ " "+v_temperaturas[i]);
                }
            }   
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
    
    //funcion retorna un vector float
    static float[] inicializar_temp(){
        
        try {
            
            byte tamaño = (byte)(Math.random()*100+1);
            float []vector_a_retornar = new float[tamaño];
            
            for(byte i = 0; i <vector_a_retornar.length; i++){
                vector_a_retornar[i] = 0;
            }
            
            return vector_a_retornar;
            
        }
        
        catch (Exception error) {
            return new float[1];
            
        }
        
        finally {
            //System.out.println("fin de la ejecución");
        }
    }
}
