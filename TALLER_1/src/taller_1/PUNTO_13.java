/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_1;

/**
 *
 * @author JESUS ALBERTO
 */
import java.util.Scanner;
public class PUNTO_13 {

    /**
     * @param args the command line arguments
     */
    static Scanner on = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        // DECIMOTERCER PUNTO
        try {
            //VARIABLES
            byte mes;
            byte day;
            short año;
            
            System.out.println("Ingrese su dia de nacimiento (1-31)");
            day = on.nextByte();
            
            while(day < 1 || day > 31){
                System.out.println("\nIngrese su dia de nacimiento (1-31)");
                day = on.nextByte();
            }
            
            System.out.println("\nIngrese su mes de nacimiento. Entre (1-12) dependiendo del dia al que corresponde su mes");
            mes = on.nextByte();
            
            while(mes < 1 || mes > 12){
                System.out.println("\nIngrese su mes de nacimiento. Entre (1-12) dependiendo del dia al que corresponde su mes");
                mes = on.nextByte();
            }
            
            System.out.println("\nIngrese su año de nacimiento. Entre (1950-2020)");
            año = on.nextShort();
            
            while(año < 1950 || año > 2020){
                System.out.println("\nIngrese su año de nacimiento. Entre (1950-2020)");
                año = on.nextShort();
            }
            
            System.out.println(Enviar_fecha(mes, day, año));
        }
        
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        } finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
    
    public static String Enviar_fecha(byte mes, byte day, short año){
        try {
            //variables
            String text_return = "";
            String mes_text = "";
            
            switch(mes){
                case 1: mes_text = "Enero";
                break;
                case 2: mes_text = "Febrero";
                break;
                case 3: mes_text = "Marzo";
                break;
                case 4: mes_text = "Abril";
                break;
                case 5: mes_text = "Mayo";
                break;
                case 6: mes_text = "Junio";
                break;
                case 7: mes_text = "Julio";
                break;
                case 8: mes_text = "Agosto";
                break;
                case 9: mes_text = "Septiembre";
                break;
                case 10: mes_text = "Octubre";
                break;
                case 11: mes_text = "Noviembre";
                break;
                case 12: mes_text = "Diciembre";
                break;
            }
            
            if((mes == 4 || mes == 6 || mes == 9 || mes == 11) & day == 31){
                text_return = "\nEl mes "+ mes_text +" NO tiene dia 31";
            }
            
            else if((mes == 2) && (day == 31 || day == 30)){
                text_return = "\nEl mes "+ mes_text +" NO tiene dia 31, ni dia 30";
            }
            
            else{
                text_return = "\n"+day+" "+mes_text+" "+año;
            }
            
            return text_return;
            
        } catch (Exception error) {
            System.out.println("Se presento un error " + error);
            return "";
            
        } finally {
            //System.out.println("fin de la ejecución");
            
        }
    }
    
}
