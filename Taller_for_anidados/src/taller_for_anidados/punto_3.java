/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_for_anidados;

/**
 *
 * @author JESUS ALBERTO
 */
import java.util.Scanner;
public class punto_3 {

    /**
     * @param args the command line arguments
     */
    static Scanner on = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            byte jugadores;
            
            System.out.println("Ingrese la cantidad de jugadores. Debe ser entre el rango (1-6)");
            jugadores = on.nextByte();
            
            while(jugadores <1 || jugadores >6){
                System.out.println("\nFuera de rango. Debe ser entre el rango (1-6)");
                jugadores = on.nextByte();
            }
            System.out.println(Jugar_21(jugadores));
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);    
        }
        
        finally {
            System.out.println("fin de la ejecución");    
        }
    }
    
    
    public static String Jugar_21(byte jugadores){
        try {
            // VARIABLES
            int puntos  = 0;
            byte carta;
            String texto = "";
            String tipo_juego = "";
            
            for (int jugador = 1; jugador <= jugadores; jugador++) {
                for (int intentos = 1; intentos <= 3; intentos++) {
                    carta = (byte)(Math.random()*(11-1)+1);
                    puntos = puntos + carta;
                }
                if(puntos == 21){
                    tipo_juego = "Juego Perfecto";
                }
                else if(puntos > 21){
                    tipo_juego = "Se paso";
                }
                else{
                    tipo_juego = "Faltaron Puntos";
                }
                texto = texto + ("\nJugador "+jugador+", puntos #"+puntos+" --> "+tipo_juego);
                puntos = 0;
            }
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
