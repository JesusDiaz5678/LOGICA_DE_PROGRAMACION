/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial_1;

/**
 *
 * @author JESUS ALBERTO
 */
public class PUNTO_5 {

    /**
     * @param args the command line arguments
     */
    
    static String verde ="\u001B[32m";
    static String rojo ="\u001B[31m";
    static String reset ="\u001B[0m";
    
    static String azul ="\u001B[34m";
    static String negro ="\u001B[30m";
    static String amarillo ="\u001B[33m";
    static String cyan ="\u001B[36m";
    static String purpura ="\u001B[35m";
    static String blanco ="\u001B[37m";
    
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            System.out.println(Comparar_cadena());
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
    public static String Comparar_cadena(){
        try {
            // VARIABLES
            String cadena_1 = "";
            String cadena_2 = "";
            String texto_ret = "";
            char caracter;
            char caracter_2;
            boolean Comparar = true;
            
            for (int i = 1; i <= 6; i++) {
                caracter = (char)(Math.random()*(123-97)+97);
                cadena_1 += caracter;
                caracter_2 = (char)(Math.random()*(123-97)+97);
                cadena_2 += caracter_2;
            }
            
            if(cadena_1.equals(cadena_2)){
                texto_ret = "Cadena #1: "+cadena_1+
                        "\nCadena #2: "+cadena_2+
                        "\n"+verde+Comparar+reset;
            }
            else{
                texto_ret = "Cadena #1: "+cadena_1+
                        "\nCadena #2: "+cadena_2+
                        "\n"+rojo+(Comparar = false)+reset;
            }
            
            return texto_ret;
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
