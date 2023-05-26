/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_for;

/**
 *
 * @author JESUS ALBERTO
 */
public class PUNTO_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Obtener_premio();
        }
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
    public static void Obtener_premio(){
        try {
            //variables
            byte num_1;
            byte num_2;
            byte num_3;
            byte num_4;
            int serie;
            String numero_premiado;
            
            for (int i = 20; i >= 1; i--) {
                num_1 = (byte)(Math.random()*(10-0)+0);
                num_2 = (byte)(Math.random()*(10-0)+0);
                num_3 = (byte)(Math.random()*(10-0)+0);
                num_4 = (byte)(Math.random()*(10-0)+0);
                serie = (int)(Math.random()*(151-100)+100);
                
                numero_premiado = String.valueOf(num_1)+String.valueOf(num_2)+String.valueOf(num_3)+String.valueOf(num_4);
                
                if(i == 20){
                    System.out.println("=============PREMIOS MENORES=========");
                }
                else if(i == 5){
                    System.out.println("=============PREMIOS SECOS=========");
                }
                else if(i == 1){
                    System.out.println("=============PREMIO MAYOR=========");
                }
                
                if(i<=20 && i>6 ){
                    System.out.println("sorteo #"+i+" - Numero Premiado "+numero_premiado+" - serie "+serie);
                }
                
                else if(i<=5 && i>1 ){
                    System.out.println("sorteo #"+i+" - Numero Premiado "+numero_premiado+" - serie "+serie);
                }
                else
                    System.out.println("sorteo #"+i+" - Numero Premiado "+numero_premiado+" - serie "+serie);
            }
            
            
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        finally {
            //System.out.println("fin de la ejecución");
            
        }
    }
    
}
