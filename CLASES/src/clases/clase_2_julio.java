/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;

/**
 *
 * @author JESUS ALBERTO
 */
import java.util.Scanner; // SOLICITAR INFO AL USUSARIO
public class clase_2_julio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            /*
            //VARIABLES...
            Scanner teclado = new Scanner(System.in);// LEE TECLADO
            byte edad = 0;
            
            //PROCESO...
            System.out.println("Ingresa tu Edad: \n");
            edad = teclado.nextByte();
            
            //SALIDA...
            System.out.println("TU EDAD ES: " + edad);
            System.out.println("NACISTE EN EL: " + Math.abs(edad - 2022));
            */
            
            /*
            //VARIABLES...
            String edad_txt;
            byte edad;
            
            //PROCESO...
            edad_txt = JOptionPane.showInputDialog("Digite su Edad: ");
            edad = Byte.parseByte(edad_txt);
            
            //SALIDA...
            JOptionPane.showMessageDialog(null, "Usted nacio en el: " + Math.abs(edad - 2022));
            */
            
            /*
            System.out.println("Result Divicion: " + (13/3));
            System.out.println("Result Sobrante: " + (13%3));
            */
            
            //VARIABLES
            long partida =0;
            
            //ENTRADA
            Scanner teclado = new Scanner(System.in);
            System.out.println("POR FAVOR DAME # de Habitantes: ");
            int hab = teclado.nextInt();
            System.out.println("DAME EL AREA TOTAL");
            int area = teclado.nextInt();
            
            //PROCESO Y SALIDA
            if (hab > 100000 && area > 20000){
                partida = 500000000;
            }
            else if(hab > 100000 && area <= 20000){
                partida = 450000000;
            }
            else if(hab <= 100000 && hab >= 80000 && area > 20000){
                partida = 600000000;
            }
            else{
                partida = 300000000;
            }
            
            //SALIDA 
            System.out.println("TU PARTIDA ES: " + partida);
            
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");    
        }
    }
    
}
