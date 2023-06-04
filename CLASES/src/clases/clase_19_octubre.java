/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;

/**
 *
 * @author JESUS ALBERTO
 */
import java.util.Scanner;
public class clase_19_octubre {

    /**
     * @param args the command line arguments
     */
    static Scanner on = new Scanner(System.in);
    static char[][]matriz = new char[5][8];
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            Scanner on = new Scanner(System.in);
            byte teclado;
            
            do{
            System.out.println("=========BIENVENIDO========\nSeleccione alguna de las siguientes opciones\n1. Generar cuadro\n2.  Imprimir cuadro\n3.  Evaluar matriz \n4.  SALIR");
            teclado = on.nextByte();
            
            switch(teclado){
                case 1: Llenar_matriz();
                break;
                
                case 2: System.out.println(Imprimir_matriz());
                break;
                
                case 3: System.out.println(Evaluar_matriz());
                break;
                
                case 4: 
                break;
            }
            }while(teclado !=4);
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
    
    //FUNCIONES
    static void Llenar_matriz ()throws Exception{
        try {
            byte aleatorio;
            
            for(byte fil = 0; fil <matriz.length; fil++){
                for(byte col = 0; col <matriz[1].length; col++){
                    aleatorio = (byte)(Math.random()*(6-1)+1);
                    
                    
                    switch(aleatorio){
                        case 1: matriz[fil][col] = 'X';
                        break;
                        case 2: matriz[fil][col] = 'Y';
                        break;
                        case 3: matriz[fil][col] = 'Z';
                        break;
                        case 4: matriz[fil][col] = 'A';
                        break;
                        case 5: matriz[fil][col] = 'B';
                        break;
                        
                    }
                    
                }
            }
            
        }
        
        catch (Exception error) {
            throw new Exception("Se presento un error llenando la marriz " + error);
            
        }
        
        finally {
            //System.out.println("fin de la ejecución");
            
        }
    }
    
    static String Imprimir_matriz () throws Exception{
        String texto_retornar = "";
        try {
            for(byte fil = 0; fil <matriz.length; fil++){
                for(byte col = 0; col <matriz[1].length; col++){
                    texto_retornar = texto_retornar + matriz[fil][col]+"|";
                }
                
                texto_retornar = texto_retornar + "\n";
            }
            
            return texto_retornar;
        }
        
        catch (Exception error) {
            throw new Exception ("Se presento un error " + error);    
        }
        
        finally {
            //System.out.println("fin de la ejecución");
            
        }
    } 
    
    
    static String Evaluar_matriz() throws Exception{
        try {
            String texto_retornar = "";
            String mov_jugada = "";
            String mov_jugada_1 = "";
            
            byte jugador_x = 0;
            byte jugador_y = 0;
            byte jugador_z = 0;
            byte jugador_a = 0;
            byte jugador_b = 0;
            
            
            for(byte fil = 0; fil < matriz.length; fil ++){
                for(byte col = 0; col < matriz[1].length; col++){
                
                    mov_jugada = mov_jugada + matriz[matriz.length-2][matriz.length-1]+matriz[col];
                }
                
                if(mov_jugada.equals("YYY")){
                    jugador_y ++;
                }
            }
            texto_retornar = texto_retornar + "puntos_y "+jugador_y;
            return texto_retornar;
        }
        
        catch (Exception error) {
            throw new Exception("Se presento un error en evaluar la matriz " + error);
            
        } finally {
            //System.out.println("fin de la ejecución");
            
        }
    }
}
