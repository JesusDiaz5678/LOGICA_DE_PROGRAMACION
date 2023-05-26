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
public class PUNTO_7 {

    /**
     * @param args the command line arguments
     */
    static Scanner on = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            // VARIABLES
            int cant_productos;
            
            System.out.println("Ingrese la cantidad de productos. Debe ser multiplo de 10");
            cant_productos = on.nextInt();
            
            while(cant_productos % 10 != 0){
                System.out.println("\nIngreso una cantidad que no es multiplo de 10. Intente de nuevo");
                cant_productos = on.nextInt();
            }
            System.out.println(Ejecutar_produccion(cant_productos));
        }
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
    public static String Ejecutar_produccion(int cant_productos){
        try {
            //VARIABLES
            int contador = 1;
            String texto = "";
            
            for (int i = 1; i <=cant_productos; i++) {
                
                texto = texto + ("/"+i);
                
                if(i % 10 == 0){
                    texto = texto + ("/===>caja "+contador+"\n");
                    contador ++;
                }
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
