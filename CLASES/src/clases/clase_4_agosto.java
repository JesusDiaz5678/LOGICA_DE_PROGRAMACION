/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;

/**
 *
 * @author JESUS ALBERTO
 */
public class clase_4_agosto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            //Cantidad de nums divisibles por 3 (150-425)
            //System.out.println(Analizar_nums());
            
            
            
            //Generar aleatorios
            //System.out.println(Analizar_aleatorios());
            
            
            
            //Calcular Temperaturas
            //VARIABLES
            int cant_temp = 300;
            int temp_med = 100;
            int rango_ini = 0;
            int rango_fin = 250;
            
            System.out.println(generar_temperatura(cant_temp, temp_med, rango_ini, rango_fin));
            
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);   
        }
        
        finally {
            System.out.println("fin de la ejecución");    
        }
    }
    
    //Funcion Cantidad de num
    public static String Analizar_nums(){
        try {
            //Variables
            short contador = 0;
            String text = "";
            
            for (int i = 150; i <= 425; i++) {
                
                if(i % 3 == 0){
                    contador ++;
                }
            }
            
            return text = "\n\nLa cantidad de numero divisibles por 3 entre 150-425 es: "+contador;
            
            
        }
        catch (Exception error) {
            return("Se presento un error " + error);
        } 
    }
    
    //Funcion Aleatorios
    public static String Analizar_aleatorios(){
        try {
            //Variables
            int aleatorio = 0;
            int contador = 0;
            String text = "";
            
            
            aleatorio = (int)(Math.random()*(301-200)+200);
            
            while(aleatorio != 300){
                contador ++;
                aleatorio = (int)(Math.random()*(301-200)+200);
                
            }
            
            return text = "\n\nLa cantidad de numeros generados antes de 300 fue: "+contador;

        }
        catch (Exception error) {
            return("Se presento un error " + error);
            
        }
        
    }
    
    //Funcion Generar Temperaturas
    public static String generar_temperatura(int cant_temp, int temp_med, int rango_ini, int rango_fin){
        try {
            //VARIABLES
            int mayor_media = 0;
            int menor_media = 0;
            int igual = 0;
            int aleatorio;
            String text_retu;
            
            for (int i = 1; i <= cant_temp; i++){
                aleatorio = (int)(Math.random()*((rango_fin + 1)- rango_ini)+rango_ini);
                
                if(aleatorio > temp_med){
                    mayor_media ++;
                }
                
                else if(aleatorio < temp_med){
                    menor_media ++;
                }
                
                else{
                    igual++;
                }
            }
            
            text_retu = "\nCantidad de temperatura mayor a la media: "+mayor_media
                    +"\nCantidad de temperatura menor a la media: "+menor_media
                    +"\nCantidad igual: "+igual;
            
            return text_retu;
            
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            return "";
        }
        
        finally {
            //System.out.println("fin de la ejecución");
            
        }
    }
}
