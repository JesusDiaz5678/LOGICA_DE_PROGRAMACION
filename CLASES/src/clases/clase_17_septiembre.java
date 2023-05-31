/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;

/**
 *
 * @author JESUS ALBERTO
 */
public class clase_17_septiembre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // MATRICES
        
        try {
            /*
            // 1. primera forma de crear matrices
            // 1. primero declarar despues inicializar: es un arreglo
            // le damos dos cajitas
            long [][] m_vtas;
            m_vtas = new long[5][6];  //es igual a la de la foto
            
            
            // 2. FORMA
            // declarar e inicializar al mismo tiempo
            char[][] m_caracteres = new char [35][12];
            
            
            // 3. declarar y llenar
            char[][] m_triqui = {{'x','o','x'},{'x','o','x'},{'x','o','x'}};  //primera llave, primera fila
            
            
            System.out.println("la matriz tiene "+ m_caracteres.length + " filas");
            System.out.println("la matriz tiene "+ m_caracteres[1].length + " columnas");
            */
            long [][] m_vtas;
            m_vtas = new long[5][6];
            
            
            m_vtas = inicializar_vtas(m_vtas);
            
            for(int fil = 0; fil<m_vtas.length; fil++){
                
                for(int col = 0; col<m_vtas[1].length; col++){
                    System.out.print(m_vtas[fil][col]+"||");
                }
                
                System.out.println(); // enter
                
                
            }
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");    
        }
    }
    
    
    //funcion
    // voy a recibir la matriz vacia(con culaquierrr tamaño) y voy a devolver una matriz llena de ceros
    static long [][] inicializar_vtas(long[][] matriz) throws Exception{
        
        try {
            //1. recorrerla por filas el ciclo externo va por filas y el ciclo interno va por columnas
            for(int i = 0; i<matriz.length; i++){
                
                //vamos por las columnas, recorremos por columnas dentro de cada fila
                for(int j =0; j<matriz[1].length; j++ ){
                    matriz[i][j] = 0;
                }
                
            }
            
            //al terminar los dos for anidados, la matriz esta lista llenas de ceros
            // se puede retornar
            return matriz;
        }
        
        
        
        catch (Exception error) {
            throw new Exception ("Se presento un error inicializando matriz de venta " + error);
            
        }
        
        finally {
            //System.out.println("fin de la ejecución");
            
        }
        
    }
}
