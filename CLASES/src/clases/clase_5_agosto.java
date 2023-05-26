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
public class clase_5_agosto {

    /**
     * @param args the command line arguments
     */
    static Scanner on = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            //variables
            byte cant_partidas;
            
            System.out.println("Ingrese la cantidad de partidas que desea realizar. Debe estar en este rango (10-20)");
            cant_partidas = on.nextByte();
            
            while(cant_partidas <10 || cant_partidas >20){
                System.out.println("\nCantidad fuera de rango. Ingrese de nuevo la cantidad, debe estar en este rango (10-20)");
                cant_partidas = on.nextByte();
            }
            
            System.out.println(generar_partida(cant_partidas));
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
    public static String generar_partida(byte cant_partidas){
        try {
            int puntos_j1 = 0;
            int puntos_j2 = 0;
            int puntos_j3 = 0;
            int puntos_j4 = 0;
            int total_puntos = 0;
            int aleatorio;
            String jugador_ganador = "";
            String Texto = "";
            
            for (int i = 1; i <= cant_partidas ; i++) {
                aleatorio = (byte)(Math.random()*(5-1)+1);
                //System.out.println(aleatorio);
                
                switch(aleatorio){
                    case 1: puntos_j1 = puntos_j1 + 3;
                    break;
                    case 2: puntos_j2 = puntos_j2 + 3;
                    break;
                    case 3: puntos_j3 = puntos_j3 + 3;
                    break;
                    case 4: puntos_j4 = puntos_j4 + 3;
                    break;
                }
            }
            
            if(puntos_j1 > puntos_j2 & puntos_j1 > puntos_j3 & puntos_j1 > puntos_j4 ){
                total_puntos = puntos_j1;
                jugador_ganador = "Jugador #1";
            }
            else if(puntos_j2 > puntos_j1 & puntos_j2 > puntos_j3 & puntos_j2 > puntos_j4 ){
                total_puntos = puntos_j2;
                jugador_ganador = "Jugador #2";
            }
            else if(puntos_j3 > puntos_j1 & puntos_j3 > puntos_j2 & puntos_j3 > puntos_j4 ){
                total_puntos = puntos_j3;
                jugador_ganador = "Jugador #3";
            }
            else if(puntos_j4 > puntos_j1 & puntos_j4 > puntos_j2 & puntos_j4 > puntos_j3 ){
                total_puntos = puntos_j4;
                jugador_ganador = "Jugador #4";
            }
            
            Texto = "\nEl ganador fue : "+jugador_ganador+" con un total de "+total_puntos+" puntos";
            
            return Texto;
        }
            
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            return "";
        }
        
        finally {
            //System.out.println("fin de la ejecución");
            
        }
    }
    
}
