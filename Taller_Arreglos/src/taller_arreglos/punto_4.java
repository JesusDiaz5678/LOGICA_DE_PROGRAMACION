/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_arreglos;

/**
 *
 * @author JESUS ALBERTO
 */
import java.util.Scanner;
public class punto_4 {

    /**
     * @param args the command line arguments
     */
    static Scanner on = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            //VARIABLES
            short tamano;
            short []v_short;
            short aleatorio;
            short posicion;
            short opcion_2;
            String text_vet = "";
            
            System.out.println("Ingrese el tamaño que desea para el vector:");
            tamano = on.nextShort();
            
            while(tamano < 1){
                System.out.println("\nTamaño incorrecto. El tamaño del vector debe ser mayor a 0."+
                        "\nPor favor ingrese de nuevo el tamaño para el vector");
                tamano = on.nextShort();
            }
            
            v_short = new short [tamano];
            
            for (short i = 0; i < v_short.length; i++) {
                aleatorio = (short)(Math.random()*(27000-1)+1);
                v_short[i] = aleatorio;
                text_vet += v_short[i] + "|";
            }
            
            //Muestro el vector tal como esta
            System.out.println("\nVECTOR:\n"+text_vet);
            
            
            //Menu para eliminar la posicion
            do{
                System.out.println("\n=======================POSICION======================="+
                        "\nIngrese la posicion donde desea eliminar el valor del vector."+
                        "\nPosicion Inicial: 0"+
                        "\nPosicion Final: "+(v_short.length - 1)+
                        "\nRecuerde que debe estar en el rango de la anterior informacion"+
                        "\nPARA SALIR DEL SISTEMA PULSE: 30000");
                posicion = on.nextShort();
                
                //Valido que este entre el rango de posicion del vector
                while(posicion < 0 || (posicion > (v_short.length - 1)) && posicion < 30000){
                    System.out.println("\n================POSICION INCORRECTA================"+
                            "\nPor favor ingrese la posicion dentro del rango del vector");
                    posicion = on.nextShort();
                }
                
                //Recorro el vector y elimino el valor de la posicion
                for (short i = 0; i < v_short.length; i++) {
                    if(i == posicion){
                        v_short[i] = 0;
                    }
                }
                
                System.out.println("\n=======================DESPLAZAMIENTO======================="+
                        "\nSeleccion la manera en como desea apreciar el vector:"+
                        "\n1. Desplazar posicion 0 al final del vector: |*|*|*|*|*|*|0"+
                        "\n2. Dejar posicion 0 en la ubicacion actual:  |*|0|*|*|*|*|*");
                opcion_2 = on.nextShort();
                
                while(opcion_2<1 || opcion_2>2){
                    System.out.println("\n=======================DESPLAZAMIENTO======================="+
                        "\nSeleccion la manera en como desea apreciar el vector:"+
                        "\n1. Desplazar posicion 0 al final del vector: |*|*|*|*|*|*|0"+
                        "\n2. Dejar posicion 0 en la ubicacion actual:  |*|0|*|*|*|*|*");
                    opcion_2 = on.nextShort();
                }
                
                switch(opcion_2){
                    case 1 :
                        //Desplazo la posicion 0 al final
                        short valor_1;
                        text_vet = "";
                        for (short i = 0; i < v_short.length; i++) {

                            for (int j = (i + 1); j < v_short.length; j++) {

                                if(v_short[i] == 0){
                                    valor_1 = v_short[i];
                                    v_short[i] =  v_short[j];
                                    v_short[j] = valor_1;
                                }
                            }
                        }
                        
                        for (int i = 0; i < v_short.length; i++) {
                            text_vet += v_short[i] + "|";
                        }
                        System.out.println("\nVECTOR MODIFICADO\n"+text_vet);
                        
                    break;
                    
                    
                    case 2 :
                        text_vet = "";
                        for (int i = 0; i < v_short.length; i++) {
                            text_vet = text_vet + v_short[i] + "|";
                        }
                        System.out.println("\nVECTOR MODIFICADO\n"+text_vet);
                    break;
                }
                
            }while(posicion != 30000);
            
            
            
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
}
