/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;

/**
 *
 * @author JESUS ALBERTO
 */
public class clase_12_septiembre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            /*
            String texto1 = "murcielago";
            byte a=0;
            byte e=0;
            byte i=0;
            byte o=0;
            byte u=0;
            
         
            for(byte pos = 0; pos <=(texto1.length()-1); pos++){
                
                switch(texto1.charAt(pos)){ //tiene que tomar el caracter, no el numero
                    case 'a':
                    a++; 
                    break;
                    
                     case 'e':
                    e++; 
                    break;
                    
                     case 'i':
                    i++; 
                    break;
                    
                    
                     case 'o':
                    o++; 
                    break;
                    
                     case 'u':
                    u++; 
                    break;
                }   
                
            }    
            
            if(a == e & a == i & a == o & a == u){
                System.out.println("Tiene todas las vocales");
            }
            else{
                System.out.println("No tiene todas las vocales");
            }
        */
            
            
            String linea_txt = "Japon|Asia|100000000";
            
            String [] caja_pais; // se define una caja global
            
            caja_pais = linea_txt.split("\\|");
            
            System.out.println(caja_pais[0]);
            System.out.println(caja_pais[1]);
            System.out.println(caja_pais[2]);
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
}
