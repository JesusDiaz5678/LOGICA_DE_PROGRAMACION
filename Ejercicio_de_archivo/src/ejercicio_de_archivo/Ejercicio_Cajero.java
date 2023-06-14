/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_de_archivo;

/**
 *
 * @author JESUS ALBERTO
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ejercicio_Cajero {

    /**
     * @param args the command line arguments
     */
    
    //VARIABLES globales (cantidad de billetes)
    static Scanner on = new Scanner(System.in);
    static DecimalFormat formato = new DecimalFormat("#,###.00");
    static int bille_100 = 500;
    static int bille_50 = 600;
    static int bille_20 = 600;
    static int bille_10 = 700;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Ejercicio de cajero automatico con un solo retiro
        
        try {
            //VARIABLES
            int cant_retiro = 0;
            String texto = "";
            
            
            System.out.println("Ingrese la cantidad que desea retirar:");
            cant_retiro = on.nextInt();
            
            texto = Realizar_retiro(cant_retiro);
            
            while(texto.equals("-1")){
                System.out.println("\nCantidad Invalida. Por favor, ingrese de nuevo la cantidad");
                cant_retiro = on.nextInt();
                texto = Realizar_retiro(cant_retiro);
            }
            
            if(texto != "-1"){
                System.out.println(texto);
            }
          
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("\nfin de la ejecución");    
        }
    }
    
    //FUNCION
    public static String Realizar_retiro (int cant_retiro) throws Exception{
        try {
            //VARIABLES
            int cantidad;
            short cant_bi_100 = 0;
            short cant_bi_50 = 0;
            short cant_bi_20 = 0;
            short cant_bi_10 = 0;
            String text_ret = "";
            String valor;
            
            //Verifico que la cantidad sea entre 20.000-2.000.000 y multiplo de 10000 
            if((cant_retiro >= 20000 && cant_retiro <= 2000000) && (cant_retiro%10000 == 0)){
                cantidad = cant_retiro;
                
                
                //Realizo el retiro. Restos los billetes del cajero
                while(cantidad > 0){
                    if(cantidad >= 100000){
                        cant_bi_100 ++;
                        bille_100 = bille_100 - 1;
                        cantidad = cantidad - 100000;
                    }
                    if(cantidad >= 50000 && cantidad < 100000){
                        cant_bi_50 ++;
                        bille_50 --;
                        cantidad = cantidad - 50000;
                    }
                    if(cantidad >= 20000 && cantidad < 50000){
                        cant_bi_20 ++;
                        bille_20 --;
                        cantidad = cantidad - 20000;
                    }
                    if(cantidad == 10000){
                        cant_bi_10 ++;
                        bille_10 --;
                        cantidad = cantidad - 10000;
                    }
                }
                valor = formato.format(cant_retiro);
                text_ret = "\n======================================="+
                        "\nRetiro #1 por $"+valor+
                        "\nBilletes de 100 entregados: "+cant_bi_100+
                        "\nBilletes de 50 entregados: "+cant_bi_50+
                        "\nBilletes de 20 entregados: "+cant_bi_20+
                        "\nBilletes de 10 entregados: "+cant_bi_10+
                        "\n======================================="+
                        "\n\nQuedan en el cajero: "+
                        "\nBilletes de 100: "+bille_100+
                        "\nBilletes de 50: "+bille_50+
                        "\nBilletes de 20: "+bille_20+
                        "\nBilletes de 10: "+bille_10;
                
            }
            else{
                text_ret = "-1";
            }
            
            return text_ret;
            
        }
        
        catch (Exception error) {
            throw new Exception("Se presento un error:  " + error);    
        }
        finally {
            //System.out.println("fin de la ejecución");
        }
    }
    
}
