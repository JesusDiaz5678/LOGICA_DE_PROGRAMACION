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
import java.text.DecimalFormat;
public class flujo_agua {

    /**
     * @param args the command line arguments
     */
    static DecimalFormat formato = new DecimalFormat ("#,###.00");
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            System.out.println(calcular_embalce());
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
    public static String calcular_embalce (){
        try {
            // VARIABLES
            String linea;
            String año_actual;
            String mes_actual;
            String mes = "";
            String [] caja_flu;
            String texto_ret = "";
            long cant_total = 0;
            long cant_entra_mes = 0;
            long cant_saliente_mes = 0;
            long cant_rest_mes = 56123133;
            
            
            FileReader arc_flujo = new FileReader ("C:\\Users\\JESUS ALBERTO\\Documents\\UNIVERSIDAD\\02° SEGUNDO SEMESTRE\\LOGICA DE PROGRAMACION\\ARCHIVOS\\flujo.csv");
            BufferedReader dat_flujo = new BufferedReader (arc_flujo);
            
            linea = dat_flujo.readLine();
            
            if(linea == null){
                texto_ret = "Archivo vacio";
            }
            
            else
            while(linea != null){
                caja_flu = linea.split(";");
                año_actual = caja_flu[1];
                
                while(año_actual.equals(caja_flu[1]) & linea != null){
                    mes_actual = caja_flu[2];
                    
                    while(mes_actual.equals(caja_flu[2]) & año_actual.equals(caja_flu[1]) & linea != null){
                        cant_entra_mes = cant_entra_mes + Long.parseLong(caja_flu[4]);
                        cant_saliente_mes = cant_saliente_mes + Long.parseLong(caja_flu[5]);
                        
                        linea = dat_flujo.readLine();
                        if(linea != null){
                            caja_flu = linea.split(";");
                        }
                    }
                    switch(Byte.parseByte(mes_actual)){
                        case 1: mes = "Enero";
                        break;
                        case 2: mes = "Febrero";
                        break;
                        case 3: mes = "Marzo";
                        break;
                        case 4: mes = "Abril";
                        break;
                        case 5: mes = "Mayo";
                        break;
                        case 6: mes = "Junio";
                        break;
                        case 7: mes = "Julio";
                        break;
                        case 8: mes = "Agosto";
                        break;
                        case 9: mes = "Septiembre";
                        break;
                        case 10: mes = "Octubre";
                        break;
                        case 11: mes = "Noviembre";
                        break;
                        case 12: mes = "Diciembre";
                        break;
                    }
                    cant_rest_mes = cant_rest_mes +(cant_entra_mes - cant_saliente_mes);
                    
                    texto_ret = texto_ret + (año_actual+", mes "+mes+", cantidad de agua ingresante : "+formato.format(cant_entra_mes)
                            + " --> Cantidad de agua saliente: "+ formato.format(cant_saliente_mes)+" ---> Cantidad restante : "
                            + formato.format(cant_rest_mes)+"\n");
                    
                    cant_entra_mes = 0;
                    cant_saliente_mes = 0;
                    
                }
                if (año_actual != caja_flu[1]) {
                    texto_ret = texto_ret + "\n\n";
                }
                
            }
            texto_ret = texto_ret + "Cantidad Restante en el embalse: "+formato.format(cant_rest_mes);
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
