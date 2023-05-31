/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;

/**
 *
 * @author JESUS ALBERTO
 */
import java.io.*;
import java.text.DecimalFormat;
public class clase_18_septiembre {

    /**
     * @param args the command line arguments
     */
    
    static String verde ="\u001B[32m";
    static String rojo ="\u001B[31m";
    static String reset ="\u001B[0m";
    static DecimalFormat formato = new DecimalFormat("#,###.00");
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // ejercicio de tabla con matriz
        try {
            
            long [][] matriz_ventas;
            
            matriz_ventas = cargar_archivo("C:\\Users\\JESUS ALBERTO\\Documents\\UNIVERSIDAD\\02° SEGUNDO SEMESTRE\\LOGICA DE PROGRAMACION\\ARCHIVOS\\vtas_anuales_suc.csv");
            
          
            System.out.println(imprimir_matriz(matriz_ventas));
            
            System.out.println(llamar_mayor_menor(matriz_ventas));
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
        }
        
        finally {
            System.out.println("fin de la ejecución");
        }
    }
    
    static long [][] cargar_archivo(String ruta)throws Exception{
        
        try {
            
            FileReader archivo = new FileReader(ruta);
            BufferedReader datos_vtas = new BufferedReader(archivo);
            
            String lineas = datos_vtas.readLine();
            
            
            //vector a retornar
            long [][] matriz_retornar = new long [5][12];
            String [] v_split;
            
            if(lineas == null){
                throw new Exception ("el archivo esta vacio\n");
            }
            
            else
                while(lineas !=null){
                   v_split = lineas.split(";");
                   
                   //subindices son byte practicamente
                   matriz_retornar[Integer.parseInt(v_split[0])-1][Integer.parseInt(v_split[1])-1] = Long.parseLong(v_split[2]); 
                   lineas = datos_vtas.readLine();
                }
            
            datos_vtas.close();
            
            
            return matriz_retornar;    
            
        }
        
        
        
        catch (Exception error) {
            throw new Exception ("Se presento un error cargando el archivo \n" + error);
            
        } finally {
            //System.out.println("fin de la ejecución");
            
        }
        
    }
    
    
    //funcion para imprimir matriz
    static String imprimir_matriz(long [][] matriz) throws Exception{
        
        try {
            String texto_retornar = "";
            
            for(int fil = 0; fil<matriz.length; fil++){
                for(int col = 0; col<matriz[1].length; col++){
                    
                    if(matriz[fil][col] > 1500000){
                    texto_retornar =  texto_retornar + verde + matriz[fil][col]+ reset + "||";}
                    
                    else
                        texto_retornar =  texto_retornar +  matriz[fil][col]+"||";
                }
                
                texto_retornar += "\n";
            }
            
            return texto_retornar;
            
        }
        
        catch (Exception error) {
            throw new Exception("Se presento un error " + error);
            
        }
        
        finally {
            //System.out.println("fin de la ejecución");
            
        }
        
    }
    
    
    static String llamar_mayor_menor(long [][] matriz)throws Exception{
        try {
            String texto_retornar = "";
            
            long venta_mayor = 0;
            byte mes_mayor = 0;
            byte suc_mayor = 0;
            
            long venta_menor = 0;
            byte mes_menor = 0;
            byte suc_menor = 0;
            
            //CICLO para llamar mayor
            for(int fil = 0; fil<matriz.length; fil++){
                for(int col = 0; col<matriz[1].length; col++){
                    
                    if(matriz[fil][col] > venta_mayor){
                    venta_mayor =  matriz[fil][col];
                    mes_mayor = (byte)(col+1);
                    suc_mayor = (byte)(fil+1);
                    
                    }
                }  
            }
            
            //CICLO para llamar menor
            venta_menor = venta_mayor;
            for(int fil = 0; fil<matriz.length; fil++){
                for(int col = 0; col<matriz[1].length; col++){
                    
                    if(matriz[fil][col] < venta_menor){
                    venta_menor =  matriz[fil][col];
                    mes_menor = (byte)(col+1);
                    suc_menor = (byte)(fil+1);
                    
                    }
                }  
            }
            
            texto_retornar = "\nLa venta mayor fue de $"+formato.format(venta_mayor)
                    + "\nMes de la venta mayor fue: "+(mes_mayor)
                    + "\nLa sucursal fue :"+suc_mayor
                    
                    + "\n\nLa venta menor fue de $"+formato.format(venta_menor)
                    + "\nMes de la venta mayor fue: "+(mes_menor)
                    + "\nLa sucursal fue :"+suc_menor;
                    
            
            return texto_retornar;
        }
        
        catch (Exception error) {
            throw new Exception ("Se presento un error " + error);
            
        }
        
        finally {
            //System.out.println("fin de la ejecución");
        }
    }
    
}
