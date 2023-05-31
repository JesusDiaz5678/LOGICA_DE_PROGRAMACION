/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_tec_romp;

/**
 *
 * @author JESUS ALBERTO
 */
import java.io.*;
public class despacho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            System.out.println(Calcular_despacho());
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
    public static String Calcular_despacho(){
        try {
            // VARIABLES
            String linea;
            String [] caja_despacho;
            String ano_actual;
            String mes_actual;
            String sucursal;
            String texto_ret = "";
            int sucursal_1001_mes = 0;
            int sucursal_1002_mes = 0;
            int sucursal_1003_mes = 0;
            int sucursal_1004_mes = 0;
            int sucursal_1005_mes = 0;
            long sucursal_1001_año = 0;
            long sucursal_1002_año = 0;
            long sucursal_1003_año = 0;
            long sucursal_1004_año = 0;
            long sucursal_1005_año = 0;
            
            
            FileReader arc_despacho = new FileReader ("C:\\Users\\JESUS ALBERTO\\Documents\\UNIVERSIDAD\\02° SEGUNDO SEMESTRE\\LOGICA DE PROGRAMACION\\ARCHIVOS\\Despachos.csv");
            BufferedReader dat_despacho = new BufferedReader (arc_despacho);
            
            linea = dat_despacho.readLine();
            
            while(linea != null){
                caja_despacho = linea.split(";");
                ano_actual = caja_despacho[1];
                
                while(ano_actual.equals(caja_despacho[1]) & linea != null){
                    mes_actual = caja_despacho[2];
                    
                    while(mes_actual.equals(caja_despacho[2]) & ano_actual.equals(caja_despacho[1]) & linea != null){
                        sucursal = caja_despacho[4];
                        
                        switch(Short.parseShort(sucursal)){
                            case 1001 : sucursal_1001_mes = sucursal_1001_mes + Integer.parseInt(caja_despacho[5]);
                            break;
                            
                            case 1002 : sucursal_1002_mes = sucursal_1002_mes + Integer.parseInt(caja_despacho[5]);
                            break;
                            
                            case 1003 : sucursal_1003_mes = sucursal_1003_mes + Integer.parseInt(caja_despacho[5]);
                            break;
                            
                            case 1004 : sucursal_1004_mes = sucursal_1004_mes + Integer.parseInt(caja_despacho[5]);
                            break;
                            
                            case 1005 : sucursal_1005_mes = sucursal_1005_mes + Integer.parseInt(caja_despacho[5]);
                            break;
                        }
                        
                        linea = dat_despacho.readLine();
                        if(linea != null){
                            caja_despacho = linea.split(";");
                        }
                    }
                    sucursal_1001_año = sucursal_1001_año + sucursal_1001_mes;
                    sucursal_1002_año = sucursal_1002_año + sucursal_1002_mes;
                    sucursal_1003_año = sucursal_1003_año + sucursal_1003_mes;
                    sucursal_1004_año = sucursal_1004_año + sucursal_1004_mes;
                    sucursal_1005_año = sucursal_1005_año + sucursal_1005_mes;
                    
                    texto_ret = texto_ret + ("Año "+ano_actual+", mes "+ mes_actual + "\nsucursal 1001 :"+sucursal_1001_mes+
                            "\nsucursal 1002 :"+sucursal_1002_mes+
                            "\nsucursal 1003 :"+sucursal_1003_mes+
                            "\nsucursal 1004 :"+sucursal_1004_mes+
                            "\nsucursal 1005 :"+sucursal_1005_mes+"\n\n");
                    sucursal_1001_mes = 0;
                    sucursal_1002_mes = 0;
                    sucursal_1003_mes = 0;
                    sucursal_1004_mes = 0;
                    sucursal_1005_mes = 0;
                }
                
                if(ano_actual != caja_despacho[1]){
                    texto_ret = texto_ret + ("Cantidad total del año: "+"\nSucursal 1001 :"+sucursal_1001_año+
                            "\nSucursal 1002 :"+sucursal_1002_año+
                            "\nSucursal 1003 :"+sucursal_1003_año+
                            "\nSucursal 1004 :"+sucursal_1004_año+
                            "\nSucursal 1005 :"+sucursal_1005_año+
                            "\n======================================================================\n");
                }
                sucursal_1001_año = 0;
                sucursal_1002_año = 0;
                sucursal_1003_año = 0;
                sucursal_1004_año = 0;
                sucursal_1005_año = 0;
            }
            
            return texto_ret;
        }
        
        catch (Exception error) {
            return "Se presento un error " + error;
            
        }
        
        finally {
            //System.out.println("fin de la ejecución");
            
        }
    }
}
