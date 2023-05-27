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
public class punto_2 {

    /**
     * @param args the command line arguments
     */
    static Scanner on = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            System.out.println(empacar_bombillos());
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");    
        }
    }
    
    
    public static String empacar_bombillos(){
        try {
            // VARIABLES
            long cantidad_bombillos;
            int bombillos_fuera;
            int cant_pallet;
            int cajas = 1;
            int bombillos_cajas = 0;
            String texto_ret = "";
            String cajas_text = "";
            
            System.out.println("Ingrese la cantidad de bombillos que posee");
            cantidad_bombillos = on.nextLong();
            
            if(cantidad_bombillos % 30 == 0){
                bombillos_fuera = 0;
            }
            else{
                bombillos_fuera = (int)(cantidad_bombillos % 30);
            }
            
            cant_pallet = (int)(((cantidad_bombillos - bombillos_fuera)/30) / 16);
            
            for (int pallet = 1; pallet <= cant_pallet; pallet++) {
                for (int i = 1; i <= 16; i++) {
                    for (int bombillos = 1; bombillos <= 30; bombillos++) {
                        bombillos_cajas++;
                    }
                    cajas_text = cajas_text + ("caja " + cajas + ", ");
                    cajas++;
                }
                texto_ret = texto_ret + ("pallet "+pallet+" --> "+cajas_text)+"\n";
                cajas_text = "";
            }
            texto_ret = texto_ret +
                    "\n==============================================================================================="+
                    "\nPara "+cantidad_bombillos+" se necesitaron:"+
                    "\nCajas: "+cajas+
                    "\nPallets: "+cant_pallet+
                    "\nBombillos fuera de caja: "+bombillos_fuera;
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
