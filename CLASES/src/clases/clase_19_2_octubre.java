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
public class clase_19_2_octubre {

    /**
     * @param args the command line arguments
     */
    static Scanner on = new Scanner(System.in);
    static char [][]tablero = new char[3][3];
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //TRIQUI
        try {
            Scanner on = new Scanner(System.in);
            
            byte teclado;
            
            do{
            System.out.println("Bienvenido\n1__Generar Trique\n2__Imprimir\n3__Evaluar juego\n4__salir");
            teclado = on.nextByte();
            
            switch(teclado){
                
                case 1: llenar_tablero();
                break;
                
                case 2: System.out.println(Imprimir_tablero());
                break;
                
                case 3: System.out.println(Evaluar_juego());  
                break;
                
                case 4:
                break;
                
                }
            }while(teclado!=4);   
           
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);  
        }
        
        finally {
            //System.out.println("fin de la ejecución");
            
        }
    }
    
    //FUNCIONES
    static String Imprimir_tablero()throws Exception{
        
        try {
            String texto_retornar = "";
            
            for(byte fil = 0; fil<tablero.length; fil++){
                    
                    for(byte col = 0; col<tablero[1].length; col++){
                       texto_retornar = texto_retornar + tablero[fil][col];
                        
                    }
                    texto_retornar+="\n";
                } 
            return texto_retornar;
        } 
        
        catch (Exception error) {
            return "Se presento un error " + error;
            
        }
        
        finally {
            //System.out.println("fin de la ejecución");
            
        }
    }
    
    static void llenar_tablero()throws Exception{
        try {
            //1. controlar el tamaño de la matriz
            byte alea = 0;
            
            if(tablero.length==3 & tablero[1].length==3){
                
                for(byte fil = 0; fil<tablero.length; fil++){
                    
                    for(byte col = 0; col<tablero[1].length; col++){
                        
                        if((byte)(Math.random()*(1-0+1)+0) == 0){
                           tablero[fil][col] = 'X'; 
                        }
                        else
                            tablero[fil][col]= 'O';
                    }
                } 
            }
            
            else
                throw new Exception("El tamaño del tablero no es correspondiente");
        }
        
        catch (Exception error) {
            throw new Exception("Se presento un error llenando matriz " + error);
            
        }
        
        finally {
            //System.out.println("fin de la ejecución");
        }
    }

    static String Evaluar_juego()throws Exception{
        try {
            String texto_retornar = "";
            String jugada = "";
            byte jugador_x = 0;
            byte jugador_o = 0;
            
            //recorrido por filas
            for(byte fil=0; fil <tablero.length; fil++){
                for(byte col = 0; col <tablero[1].length; col++){
                    jugada = jugada + tablero[fil][col];
                }
                if(jugada.equals("XXX")){
                    jugador_x ++;
                }
                else if(jugada.equals("OOO")){
                    jugador_o ++;
                }
                
                jugada = "";
            }
            
            //recorrido por columnas
            for(byte col=0; col <tablero[1].length; col++){
                for(byte fil = 0; fil <tablero.length; fil++){
                    jugada = jugada + tablero[fil][col];
                }
                if(jugada.equals("XXX")){
                    jugador_x ++;
                }
                else if(jugada.equals("OOO")){
                    jugador_o ++;
                }
                
                jugada = "";
            }
            
            
            //recorrido la diagonal principal
            jugada = "";
            for(byte ind = 0; ind<tablero.length; ind++){
                jugada = jugada + tablero[ind][ind];
            }
            if(jugada.equals("XXX")){
                    jugador_x ++;
                }
                else if(jugada.equals("OOO")){
                    jugador_o ++;
                }
            
            
            //recorrido la diagonal segundaria
            for(byte fil = 0; fil<tablero.length; fil++){
                jugada = jugada + tablero[fil][tablero.length-1-fil];
            }
            if(jugada.equals("XXX")){
                    jugador_x ++;
                }
                else if(jugada.equals("OOO")){
                    jugador_o ++;
                }
            
            //calcular resultado
            texto_retornar = texto_retornar + "puntos Jugador X : "+jugador_x +"\n";
            texto_retornar = texto_retornar + "puntos Jugador O : "+jugador_o +"\n";
            
            if(jugador_x>jugador_o ){
                texto_retornar = texto_retornar + "Ganador X"; 
            }
            else if(jugador_x<jugador_o ){
                texto_retornar = texto_retornar + "Ganador O"; 
            }
            else
                 texto_retornar = texto_retornar + "EMPATE";
            
            
            return texto_retornar;
        }
        
        catch (Exception error) {
            throw new Exception ("Se presento un error evaluando el juego" + error);
        }
        
        finally {
            //System.out.println("fin de la ejecución");
        }
    }
    
}
