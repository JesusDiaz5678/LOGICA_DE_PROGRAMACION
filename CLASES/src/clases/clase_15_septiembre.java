/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;

/**
 *
 * @author JESUS ALBERTO
 */
public class clase_15_septiembre {

    /**
     * @param args the command line arguments
     */
    
    static String rojo ="\u001B[31m";
    static String reset ="\u001B[30m";
    
    //declarar vector global
    static byte []v_edad = new byte[50]; //50 edades
    
    public static void main(String[] args) {
        // TODO code application logic here

        // OPERACIONES
        // OPERAR en vectores
        try {
            //Llenar el vector con datos aleatorios
            // mostar vector
            poblar_vector();
            System.out.println("VECTOR");
            for(byte i = 0; i<v_edad.length; i++){
                System.out.print(v_edad[i] + "|"); //print
            }
            
            
            //Ordenar el vector
            ordenar_vector_asc();
            System.out.println("\n\nVector ordenado");
            for(byte i = 0; i<v_edad.length; i++){
                System.out.print(v_edad[i] + "|"); //print
            }
            
            
            //Ordenar descendientemente
            ordenar_vector_dec();
            System.out.println("\n\nVector ordenado descendiente");
            for(byte i = 0; i<v_edad.length; i++){
                System.out.print(v_edad[i] + "|"); //print
            }
            
            
            //Eliminar un elemento del vector
            Eliminar_elemento((byte)5);
            System.out.println("\nVector eliminado ELEMENTO");
            for(byte i = 0; i<v_edad.length; i++){
                
                //rojo
                if(v_edad[i] == 0)
                    System.out.print(rojo + v_edad[i] + reset+ "|" ); //print
                
                else
                    System.out.print(v_edad[i] + "|"); //print
            }
            
            
        }
        
        
        //RROJAR EL ERROR
        catch (Exception error) {
            System.out.println("" + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");
            
        }
          
    }
    
    //FUNCIONES
    static void poblar_vector()  throws Exception{ //VOY A TRABAJAR SOBRE EL VECTOR
        try {
            
            for(byte i = 0; i<= v_edad.length-1; i++){//hasta el vector posicion menos 1
                v_edad[i] = (byte)(Math.random()*100);
                
            }
            
        }
        
        catch (Exception error) {
            throw new Exception  ("ERROR PROBANDO EL VECTOR " + error);
            
        }
        
        finally {
            //System.out.println("fin de la ejecución");
            
        }
    }
    
    static void ordenar_vector_asc() throws Exception {//Trabajar sobre el vector,  ARROJAR ERROR
        
        
        try {
          byte aux = 0;
            
           for(byte i = 0; i <v_edad.length; i++){
              
               for(byte j = (byte)(i+1); j<v_edad.length; j++){
                   
                    if(v_edad[j]<v_edad[i]){
                        aux =v_edad[i];
                        v_edad[i] = v_edad[j];
                        v_edad[j] = aux;
                    } 
               }
           }
        }
        
        catch (Exception error) {
        throw new Exception  ("Se presento un error ordenando el vector \n" + error);  
        }
        
        finally {
            //System.out.println("fin de la ejecución");
        }
        
    }
    
    static void ordenar_vector_dec () throws Exception{
        try {
            byte aux = 0;
            
            for (int i = 0; i < v_edad.length; i++) {
                for(byte j = (byte)(i+1); j<v_edad.length; j++){
                   
                    if(v_edad[j]>v_edad[i]){
                        aux =v_edad[i];
                        v_edad[i] = v_edad[j];
                        v_edad[j] = aux;
                    } 
               }
            }
        }
        
        catch (Exception error) {
           throw new Exception ("Se presento un error en el vector" + error);
            
        }
        finally {
            //System.out.println("fin de la ejecución"); 
        }
    }
    
    
    static void Eliminar_elemento(byte elemento) throws Exception{
        
        try {
            //COMPROBAR QUE EL ELEMENTO ESTE EN EL RANGO //eliminar por elemento
            if(elemento>=1 & elemento < v_edad.length){
                v_edad[elemento-1]=0;
            }
            else
               throw new Exception ("El elemento no es valido"); 
            
            
            
            //Eliminar por posicion
            
        }
        
        catch (Exception error) {
            throw new Exception  ("ERROR ELMINANDO EL VECTOR " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");
            
        } 
    }
}
