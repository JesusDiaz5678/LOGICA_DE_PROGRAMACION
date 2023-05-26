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
public class PUNTO_6 {

    /**
     * @param args the command line arguments
     */
    static Scanner on = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            // VARIABLES
            int numero_personas;
            
            
            System.out.println("Ingrese la cantidad de personas a las cuales se les realizara la encuesta. Debe ser superior a 50 y menor a 300");
            numero_personas = on.nextInt();
            
            while(numero_personas <51 || numero_personas >= 300){
                System.out.println("\nCantidad Incorrecta. La cantidad debe ser superior a 50 y menor a 300");
                numero_personas = on.nextInt();
            }
            
            System.out.println(Programas_encuesta(numero_personas));
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
    public static String Programas_encuesta(int numero_personas){
        try {
            // VARIABLES
            int grupo_1 = 0;
            int grupo_2 = 0;
            int grupo_3 = 0;
            int grupo_4 = 0;
            int grupo_5 = 0;
            int aleatorio;
            String texto_ret = "";
            
            for (int i = 1; i <= numero_personas; i++) {
                aleatorio = (int)(Math.random()*(7-1)+1);
                
                while (aleatorio == 6) {
                aleatorio = (int) (Math.random() * (7 - 1) + 1);
                } 
                
                if(aleatorio == 1){
                    grupo_1 = grupo_1 + 1;
                }
                else if(aleatorio == 2){
                    grupo_2 = grupo_2 + 1;
                }
                else if(aleatorio == 3){
                    grupo_3 = grupo_3 + 1;
                }
                else if(aleatorio ==4){
                    grupo_4 = grupo_4 + 1;
                }
                else if(aleatorio == 5){
                    grupo_5 = grupo_5 + 1;
                }
                
            }
            texto_ret = "\nGrupo 1: "+grupo_1+" PERSONAS"+
                    "\nGrupo 2: "+grupo_2+" PERSONAS"+
                    "\nGrupo 3: "+grupo_3+" PERSONAS"+
                    "\nGrupo 4: "+grupo_4+" PERSONAS"+
                    "\nGrupo 5: "+grupo_5+" PERSONAS";
            
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
