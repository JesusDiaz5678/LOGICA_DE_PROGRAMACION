/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial_1;

/**
 *
 * @author JESUS ALBERTO
 */
import java.util.Scanner;
public class PUNTO_1 {

    /**
     * @param args the command line arguments
     */
    static Scanner on = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            // PRIMER PUNTO DEL PARCIAL
            // VARIABLES
            byte nro_jugadores;
            
            System.out.println("Ingrese el numero de jugadores. Debe estar entre 2-6 jugadores");
            nro_jugadores = on.nextByte();
            
            while(nro_jugadores < 2 || nro_jugadores >6){
                System.out.println("\nCantidad fuera de rango. Debe estar entre 2-6 jugadores");
                nro_jugadores = on.nextByte();
            }
            
            System.out.println(simular_juego(nro_jugadores));
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
    public static String simular_juego(byte nro_jugadores){
        try {
            // variables
            byte aleatorio;
            byte carta_mayor = 0;
            int jugador_mayor = 0;
            String text_ret;
            
            for (int i = 1; i <=nro_jugadores ; i++) {
                aleatorio = (byte)(Math.random()*(11-1)+1);
                if(aleatorio > carta_mayor){
                    carta_mayor = aleatorio;
                    jugador_mayor = i;
                }
            }
            
            text_ret = "\nEl jugador mayor fue el #"+jugador_mayor+" con la carta "+carta_mayor;
            return text_ret;
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
