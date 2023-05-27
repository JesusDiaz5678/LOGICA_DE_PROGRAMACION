/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial_2;

/**
 *
 * @author JESUS ALBERTO
 */
import java.util.Scanner;
public class PARCIAL_2 {

    /**
     * @param args the command line arguments
     */
    static Scanner on = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            // PARCIAL #2
            
             
            // PRIMER PUNTO
            // VARIABLES
            long cantidad;
            System.out.println("Ingrese la cantidad de * que desea en la base. Debe ser mayor a 1");
            cantidad = on.nextLong();
            
            while(cantidad <2){
                System.out.println("\nCantidad reducida. La cantidad debe ser mayor a 1");
                cantidad = on.nextLong();
            }
            
            System.out.println(Pintar_triangulo_inv(cantidad));
            
            
            // SEGUNDO PUNTO
            // VARIABLES
            /*
            byte cant_jug;
            System.out.println("Ingrese la cantidad de jugadores. Debe estar entre (1-6)");
            cant_jug = on.nextByte();
            
            while(cant_jug < 1 || cant_jug >6){
                System.out.println("\nCantidad incorrecta. Debe estar entre (1-6) la cantidad de jugadores");
                cant_jug = on.nextByte();
            }
            System.out.println(Jugar_21(cant_jug));
            */
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");    
        }
    }
    
    
    //FUNCION PRIMER PUNTO
    public static String Pintar_triangulo_inv(long cantidad){
        try {
            //VARIABLES
            long contador_ast = 0;
            int saltos = 1;
            long secuencia;
            String texto_ret = "";
            contador_ast = cantidad;
            
            while(contador_ast > 0){
                for (long i = 0; i < contador_ast; i++) {
                    texto_ret += "*";
                }
                texto_ret = texto_ret +"\n";
                
                for (int space = 0; space < saltos; space++) {
                    texto_ret = texto_ret +" ";
                }
                saltos ++;
                contador_ast = contador_ast - 2;
            }
            
            return texto_ret;
        }
        
        catch (Exception error) {
            return ("Se presento un error " + error);
            
        }
        
        finally {
            //System.out.println("fin de la ejecución");
            
        }
    }
    
    //FUNCION SEGUNDO PUNTO
    public static String Jugar_21 (byte cant_jug){
        try {
            // VARIABLES
            byte puntos = 0;
            byte aleatorio;
            String texto_ret = "";
            
            for (byte jugadores = 1; jugadores <= cant_jug; jugadores++) {
                for (byte intentos = 1; intentos <= 3; intentos++) {
                    aleatorio = (byte)(Math.random()*(11-1)+1);
                    puntos += aleatorio;
                }
                //condiciones del juego
                if(puntos == 21){
                    texto_ret = texto_ret + ("Jugador #"+jugadores+", puntos "+puntos+" --> " + "juego perfecto" + "\n");
                }
                else if(puntos >21){
                    texto_ret = texto_ret + ("Jugador #"+jugadores+", puntos "+puntos+" --> " + "se paso" + "\n");
                }
                else if(puntos <21){
                    texto_ret = texto_ret + ("Jugador #"+jugadores+", puntos "+puntos+" --> " + "faltaron puntos" + "\n");
                }
                puntos = 0;
            }
            
            return texto_ret;
        } 
        catch (Exception error) {
            return("Se presento un error " + error);
            
        }
        finally {
            //System.out.println("fin de la ejecución");
            
        }
    }
}
