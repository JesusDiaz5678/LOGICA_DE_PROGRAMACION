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
import java.text.DecimalFormat;
public class PUNTO_4 {

    /**
     * @param args the command line arguments
     */
    static Scanner on = new Scanner(System.in);
    static DecimalFormat formato = new DecimalFormat("#,###.00");
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            // VARIABLES
            long num_empleados;
            
            System.out.println("Ingrese el numero de empleados de la compañia. Debe ser superior a 10");
            num_empleados = on.nextInt();
            
            while(num_empleados <= 10){
                System.out.println("\nNumero de empleados insuficiente. La cantidad de empleados debe ser superior a 10");
                num_empleados = on.nextInt();
            }
            
            System.out.println("\n====================NOMINA FIN DE AÑO===================\n"+Liquidar_nomina(num_empleados));
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
    public static String Liquidar_nomina(long num_empleados){
        try {
            // VARIABLES
            long aleatorio;
            long salarios = 0;
            float ahorros = 0;
            float seguridad_social = 0;
            float pago_T = 0;
            
            // VARIABLES CON FORMATO DECIMAL
            String salario_txt = "";
            String ahorros_txt;
            String seguridad_social_txt;
            String pago_txt;
            String texto_ret = "";
            
            for (int i = 1; i <= num_empleados; i++) {
                aleatorio = (int)(Math.random()*(9000001-1500000)+1500000);
                salarios = salarios + aleatorio;
            }
            salario_txt = formato.format(salarios);
            // proceso de reduccion de sueldo
            // -Fondo de ahorros
            ahorros = (float)(salarios * 0.01);
            // -Seguridad Social
            seguridad_social = (float)(salarios * 0.145);
            
            pago_T = salarios - ahorros - seguridad_social;
            
            //Le damos formato
            ahorros_txt = formato.format(ahorros);
            seguridad_social_txt = formato.format(seguridad_social);
            pago_txt = formato.format(pago_T);
            
            texto_ret = "Valor total de los salarios de todos los empleados: $"+salario_txt+ " pesos"
                    +"\nValor total del ahorro de todos los empleados: $"+ahorros_txt+ " pesos"
                    +"\nValor total de la seguridad social para todos los empleados: $"+seguridad_social_txt+ " pesos"
                    +"\nValor total a pagar a todos los empleados: $"+pago_txt+ " pesos";
            
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
