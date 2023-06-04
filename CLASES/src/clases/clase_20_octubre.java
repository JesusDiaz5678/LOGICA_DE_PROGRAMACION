/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author JESUS ALBERTO
 */
public class clase_20_octubre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        try {
            //Declaracion de variables
            Scanner on = new Scanner(System.in);
            byte teclado;
            char caracter;
            String cadena_a_buscar ="";
            char []vector;
            
            do{
            System.out.println("Ingrese el tamaño de la cadena a buscar : entre 3-6");
            teclado = on.nextByte();
            
            }while(teclado<3||teclado>6);
            
            System.out.println("\nIngrese el caracter que quiere buscar:");
            caracter = on.next().charAt(0);
            
            for(byte i = 1; i <= teclado; i++){
                cadena_a_buscar = cadena_a_buscar + caracter;
            }
            
            //Multiplico 3 veces el vector por la cadena
            vector = new char[3 * cadena_a_buscar.length()];
            
            
            //Llenar el vector aleatoriamente
            for(byte ind = 0; ind <vector.length; ind++){
                if(Math.random()*10>2){
                    vector[ind]=caracter;
                }
                else{
                    vector[ind]='O';
                }
            }
            
            //Evaluar el vector
            for(byte ind = 0; ind <vector.length; ind++){
                if((vector.length-ind)>=cadena_a_buscar.length()){
                    
                    //ciclo no circular
                    
                }
            }
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        
        finally {
            System.out.println("\n\nfin de la ejecución");
            
        }
    }
    
}
