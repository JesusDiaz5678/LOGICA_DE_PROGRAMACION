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
import java.text.DecimalFormat;
public class clase_3_julio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            //VARIABLES Y CONSTANTES
            long dinero;
            int sobrante;
            String patron_num = "###, ###. ##";
            DecimalFormat formato = new DecimalFormat(patron_num);
            
            Scanner teclado = new Scanner(System.in);
            
            //ENTRADA
            System.out.println("Digite su cantidad de Dinero: ");
            dinero = teclado.nextLong();
            
            //PROCESO
            sobrante = Comprar(dinero);
            
            //SALIDA
            if (sobrante > 0)System.out.println("Sobro Dinero: $" + formato.format(sobrante));
            else if(sobrante < 0) System.out.println("Debes Dinero: $" + formato.format(Math.abs(sobrante)));
            else System.out.println("Tu dinero fue preciso");
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
        }
        
        finally {
            System.out.println("fin de la ejecución");    
        }
    }
    
    //ZONA DE FUNCIONES
    
    static int Comprar (long dinero){
        //VARIABLES GLOBALES PARA EL TRY CATCH
        long devuelta =0;
        try {
            //VARIABLES Y CONSTANTES 
            final long precio = 50000000;
            
            //PROCESO
            devuelta = dinero - precio;
            
            //RETORNO SI NO ES VOID
            return (int)devuelta;
        } 
        catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
            return (int)devuelta;
        } 
    }
    
    static int Comprar (long dinero, long precio){
        //VARIABLES GLOBALES PARA EL TRY CATCH
        long devuelta =0;
        try {
            //VARIABLES Y CONSTANTES 
        
            //PROCESO
            devuelta = dinero - precio;
            
            //RETORNO SI NO ES VOID
            return (int)devuelta;
        } 
        catch (Exception error) {
            
            System.out.print("\n Se presento un error. \n" + error);
            return (int)devuelta;
        } 
    }
    /*
    static String Comprar (long dinero, long precio){
        //VARIABLES GLOBALES PARA EL TRY CATCH
        long devuelta =0;
        try {
            //VARIABLES Y CONSTANTES 
            //PROCESO
            devuelta = dinero - precio;
            
            //RETORNO SI NO ES VOID
            return String.valueOf(devuelta);
        } 
        catch (Exception error) {
            
            System.out.print("\n Se presento un error. \n" + error);
            return String.valueOf(devuelta);
        } 
    }
    */
    
}
