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
import java.util.ArrayList;
import java.util.Vector;
public class Punto_1 {

    /**
     * @param args the command line arguments
     */
    
    //Declara vectores globales
    static byte tamano_1 = (byte)(Math.random()*(101-50)+50);
    static byte tamano_2 = (byte)(Math.random()*(50-32)+32);
    static byte []v_numeros = new byte[tamano_1];
    static String []v_letras = new String[tamano_2];
    
    //Colores
    static String verde ="\u001B[32m";
    static String rojo ="\u001B[31m";
    static String reset ="\u001B[0m";
    
    static Scanner on = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            //Variables
            byte seleccion;
            byte opcion_2;
            byte opcion_3;
            short posicion;
            short ult_pos;
            byte valor;
            byte aleatorio;
            boolean forma;
            String valor_t = "";
            String valor_t1 = "";
            
            
            //Ciclo para llenar el vector de numeros
            for (int i = 0; i < v_numeros.length; i++) {
                aleatorio = (byte)(Math.random()*(101-1)+1);
                v_numeros[i] = aleatorio;
            }
            
            //Ciclo para llenar el vector de letras
            for (int j = 0; j <v_letras.length; j++) {
                aleatorio = (byte)(Math.random()*(27-1)+1);
                
                switch(aleatorio){
                    case 1: v_letras[j] = "A";
                    break;
                    case 2: v_letras[j] = "B";
                    break;
                    case 3: v_letras[j] = "C";
                    break;
                    case 4: v_letras[j] = "D";
                    break;
                    case 5: v_letras[j] = "E";
                    break;
                    case 6: v_letras[j] = "F";
                    break;
                    case 7: v_letras[j] = "G";
                    break;
                    case 8: v_letras[j] = "H";
                    break;
                    case 9: v_letras[j] = "I";
                    break;
                    case 10: v_letras[j] = "J";
                    break;
                    case 11: v_letras[j] = "K";
                    break;
                    case 12: v_letras[j] = "L";
                    break;
                    case 13: v_letras[j] = "M";
                    break;
                    case 14: v_letras[j] = "N";
                    break;
                    case 15: v_letras[j] = "O";
                    break;
                    case 16: v_letras[j] = "P";
                    break;
                    case 17: v_letras[j] = "Q";
                    break;
                    case 18: v_letras[j] = "R";
                    break;
                    case 19: v_letras[j] = "S";
                    break;
                    case 20: v_letras[j] = "T";
                    break;
                    case 21: v_letras[j] = "U";
                    break;
                    case 22: v_letras[j] = "V";
                    break;
                    case 23: v_letras[j] = "W";
                    break;
                    case 24: v_letras[j] = "X";
                    break;
                    case 25: v_letras[j] = "Y";
                    break;
                    case 26: v_letras[j] = "Z";
                    break;
                }
            }
            
            //Menu para los vectores
            do{
                System.out.println("\n===================MENU=================="+
                        "\nSeleccione una de las opciones:"+
                        "\n1. Recorrer vector"+
                        "\n2. Actualizar vector"+
                        "\n3. Añadir elemento al vector"+
                        "\n4. Eliminar elemento al vector"+
                        "\n5. Ordenar vector"+
                        "\n6. Buscar elemento al vector"+
                        "\n9. Salir");
                seleccion = on.nextByte();
                
                //Evaluar la seleccion del usuario en el menu
                switch(seleccion){
                    //Recorrer vector
                    case 1: do{
                        System.out.println("\n=========MENU/RECORRER VECTOR========="+
                                "\nQue vector desea recorrer:"+
                                "\n1. Vector numerico"+
                                "\n2. Vector alfabetico"+
                                "\n9. Regresar al apartado MENU");
                        opcion_2 = on.nextByte();
                        
                        //Seleccion de recorrer vector
                        switch(opcion_2){
                            //Recorrer vector numerico
                            case 1: do{
                                System.out.println("\n=========MENU/RECORRER VECTOR/Vector numerico========="+
                                        "\nEn que sentido desea recorrer el vector:"+
                                        "\n1. Del primer elemento al ultimo"+
                                        "\n2. Del ultimo elemento al primero"+
                                        "\n9. Regresar al apartado MENU/RECORRER VECTOR");
                                opcion_3 = on.nextByte();
                                
                                //Seleccionar recorrer del primer elemento al ultimo
                                switch(opcion_3){
                                    //Recorrer del primer elemento al ultimo
                                    case 1:
                                        forma = true;
                                        System.out.println("\n"+Recorrer_vector_numerio (forma));
                                        opcion_3 = 9;
                                    break;
                                    
                                    //Recorrer del ultimo elemento al primero
                                    case 2:
                                        forma = false;
                                        System.out.println("\n"+Recorrer_vector_numerio (forma, opcion_3));
                                        opcion_3 = 9;
                                    break;
                                }
                                
                            }while(opcion_3 != 9);
                            break;
                            
                            //Recorrer vector alfabetico
                            case 2: do{
                                System.out.println("\n=========MENU/RECORRER VECTOR/Vector alfabetico========="+
                                        "\nEn que sentido desea recorrer el vector:"+
                                        "\n1. Del primer elemento al ultimo"+
                                        "\n2. Del ultimo elemento al primero"+
                                        "\n9. Regresar al apartado MENU/RECORRER VECTOR");
                                opcion_3 = on.nextByte();
                                
                                //Seleccionar recorrer del primer elemento al ultimo
                                switch(opcion_3){
                                    //Recorrer del primer elemento al ultimo
                                    //Muestro la funcion
                                    case 1:
                                        forma = true;
                                        System.out.println("\n"+Recorrer_vector_alfabetico (forma));
                                        opcion_3 = 9;
                                    break;
                                    
                                    //Recorrer del ultimo elemento al primero
                                    //Muestro la funcion
                                    case 2:
                                        forma = false;
                                        System.out.println("\n"+Recorrer_vector_alfabetico (forma, opcion_3));
                                        opcion_3 = 9;
                                    break;
                                }
                                
                            }while(opcion_3 != 9);
                            break;
                        }
                        
                    }while(opcion_2 != 9);
                    break;
                    
                    //Actualizar vector
                    case 2: do{
                        System.out.println("\n=========MENU/ACTUALIZAR VECTOR========="+
                                "\nQue vector desea actualizar:"+
                                "\n1. Vector numerico"+
                                "\n2. Vector alfabetico"+
                                "\n9. Regresar al apartado MENU");
                        opcion_2 = on.nextByte();
                        
                        //Seleccion de actualizar vector
                        switch(opcion_2){
                            //Actualizar Vector numerico
                            case 1 : 
                                ult_pos = (short)(v_numeros.length - 1);
                                //Solicito la posicion
                                System.out.println("\n==================MENU/ACTUALIZAR VECTOR/Vector numerico=================="+
                                        "\nIngrese la posicion en la cual desea reemplazar el valor: "+
                                        "\nRecuerde que la posicion debe estar entre el rango de la Posicion inicial y Final."+
                                        "\nPosicion inicial: 0"+
                                        "\nPosicion Final: "+ult_pos);
                                posicion = on.nextShort();
                                
                                //Valido que la posicion si este entre el rango del vector numerico
                                while(posicion<0 || posicion > ult_pos){
                                    System.out.println("\n==========================POSICION INCORRECTA=========================="+
                                            "\nLa posicion ingresada no esta dentro del rango. Por favor Ingrese denuevo:");
                                    posicion = on.nextByte();
                                }
                                
                                //Solicito el valor a reemplazar
                                System.out.println("\nIngrese el valor que desea colocar en la posicion "+ posicion +
                                        " en el vector"+
                                        "\nRecuerde que debe ser valores unicamente numericos, naturales");
                                valor = on.nextByte();
                                
                                //Valido que el valor ingresado sea numerico
                                while(valor < 0|| valor > 100){
                                    System.out.println("\n==========================VALOR INCORRECTO=========================="+
                                            "\nEl valor ingresado es incorrecto. "+
                                            "Por favor, asegurece de ingresar un valor numerico entre 1-100");
                                    valor = on.nextByte();
                                }
                                
                                //Enviamos el valor y la posicion a la Funcion
                                //Imprimios la variable retornada por la funcion
                                System.out.println("\n"+Actualizar_vector_numerico (posicion, valor));
                                opcion_2 = 9;
                            break;
                            
                            //Actualizar Vector alfabetico
                            case 2 :
                                ult_pos = (short)(v_letras.length - 1);
                                //Solicito la posicion
                                System.out.println("\n==================MENU/ACTUALIZAR VECTOR/Vector alfabetico=================="+
                                        "\nIngrese la posicion en la cual desea reemplazar el valor: "+
                                        "\nRecuerde que la posicion debe estar entre el rango de la Posicion inicial y Final."+
                                        "\nPosicion inicial: 0"+
                                        "\nPosicion Final: "+ult_pos);
                                posicion = on.nextByte();
                                
                                //Valido que la posicion si este entre el rango del vector numerico
                                while(posicion<0 || posicion > ult_pos){
                                    System.out.println("\n==========================POSICION INCORRECTA=========================="+
                                            "\nLa posicion ingresada no esta dentro del rango. Por favor Ingrese denuevo:");
                                    posicion = on.nextByte();
                                }
                                
                                //Solicito el valor a reemplazar
                                System.out.println("\nIngrese el valor que desea colocar en la posicion "+ posicion +
                                        " en el vector"+
                                        "\nRecuerde que debe ser letras unicamente");
                                valor_t = on.next();
                                //Convierto en mayuscula el valor ingresado
                                valor_t1 = valor_t.toUpperCase();
                                
                                //Valido que el valor ingresado sea letra
                                if(valor_t1.equals("A")|| valor_t1.equals("B") || valor_t1.equals("C") || valor_t1.equals("D")
                                        ||valor_t1.equals("E") || valor_t1.equals("F") || valor_t1.equals("G") || valor_t1.equals("H")
                                        || valor_t1.equals("I") || valor_t1.equals("J") || valor_t1.equals("K")
                                        || valor_t1.equals("L") || valor_t1.equals("M") || valor_t1.equals("N") || valor_t1.equals("O")
                                        || valor_t1.equals("P")|| valor_t1.equals("Q") || valor_t1.equals("R") || valor_t1.equals("S")
                                        || valor_t1.equals("T") || valor_t1.equals("U") || valor_t1.equals("V") || valor_t1.equals("W")
                                        || valor_t1.equals("X") || valor_t1.equals("Y") || valor_t1.equals("Z")){
                                    //Enviamos el valor y la posicion a la Funcion
                                    //Imprimios la variable retornada por la funcion
                                    System.out.println("\n"+Actualizar_vector_alfabetico (posicion, valor_t1));
                                    opcion_2 = 9;
                                }
                                //De lo contrario
                                else{
                                    System.out.println("==========================VALOR INCORRECTO=========================="+
                                            "\nEl valor ingresado es incorrecto. "+
                                            "Por favor, asegurece de ingresar un alfabetico");
                                    //Regresamos al menu actualizar vector alfabetico
                                    opcion_2 = 1;
                                }
                              
                            break;  
                        }
                    }while(opcion_2 != 9);    
                    
                    //Anadir elemento al vector
                    case 3: do{
                        System.out.println("\n=========MENU/AÑADIR ELEMENTO AL VECTOR========="+
                                "\nQue vector desea añadir elemento:"+
                                "\n1. Vector numerico"+
                                "\n2. Vector alfabetico"+
                                "\n9. Regresar al apartado MENU");
                        opcion_2 = on.nextByte();
                        
                        //Seleccion de añadir elemento
                        switch(opcion_2){
                            //Vector numerico
                            case 1:
                            System.out.println("\n==================MENU/AÑADIR ELEMENTO/Vector numerico=================="+
                                        "\nIngrese el valor que desea añadir al vector"+
                                        "\nRecuerde que el valor es de tipo numerico y debe estar entre el rango de 1-100");
                            valor = on.nextByte();
                            
                            //Valido que el valor ingresado este dentro del rango establecido
                            while(valor < 0 || valor > 100){
                                System.out.println("==========================VALOR INCORRECTO=========================="+
                                            "\nEl valor ingresado es incorrecto. "+
                                            "Por favor, asegurece de ingresar un valor numerico entre 1-100");
                                    valor = on.nextByte();
                            }
                            
                            //Envio el valor a la funcion
                            //Imprimios la variable retornada por la funcion
                            System.out.println("\n"+Anadir_vector_numerico (valor));
                            
                            opcion_2 = 9;
                            break;
                            
                            //Vector alfabetico
                            case 2:
                                System.out.println("\n==================MENU/AÑADIR ELEMENTO/Vector alfabetico=================="+
                                        "\nIngrese el valor que desea añadir al vector"+
                                        "\nRecuerde que el valor es de tipo alfabetico (Unicamente letras)");
                                valor_t = on.next();
                                //Convierto en mayuscula el valor ingresado
                                valor_t1 = valor_t.toUpperCase();
                                
                                //Valido que el valor ingresado sea letra
                                if(valor_t1.equals("A")|| valor_t1.equals("B") || valor_t1.equals("C") || valor_t1.equals("D")
                                        ||valor_t1.equals("E") || valor_t1.equals("F") || valor_t1.equals("G") || valor_t1.equals("H")
                                        || valor_t1.equals("I") || valor_t1.equals("J") || valor_t1.equals("K")
                                        || valor_t1.equals("L") || valor_t1.equals("M") || valor_t1.equals("N") || valor_t1.equals("O")
                                        || valor_t1.equals("P")|| valor_t1.equals("Q") || valor_t1.equals("R") || valor_t1.equals("S")
                                        || valor_t1.equals("T") || valor_t1.equals("U") || valor_t1.equals("V") || valor_t1.equals("W")
                                        || valor_t1.equals("X") || valor_t1.equals("Y") || valor_t1.equals("Z")){
                                    //Enviamos el valor y la posicion a la Funcion
                                    //Imprimios la variable retornada por la funcion
                                    System.out.println("\n" + Anadir_vector_alfabetico (valor_t1));
                                    opcion_2 = 9;
                                }
                                //De lo contrario
                                else{
                                    System.out.println("==========================VALOR INCORRECTO=========================="+
                                            "\nEl valor ingresado es incorrecto. "+
                                            "Por favor, asegurece de ingresar un valor alfabetico (Unicamente letra)");
                                    //Regresamos al menu actualizar vector alfabetico
                                    opcion_2 = 9;
                                }
                            
                                break;
                        } 
                    }while(opcion_2 != 9);
                    
                    //Eliminar elemento al vector
                    case 4:do{
                        System.out.println("\n=========MENU/ELIMINAR ELEMENTO AL VECTOR========="+
                                "\nQue vector desea eliminar elemento:"+
                                "\n1. Vector numerico"+
                                "\n2. Vector alfabetico"+
                                "\n9. Regresar al apartado MENU");
                        opcion_2 = on.nextByte();
                        
                        //Seleccion de eliminar elemento
                        switch(opcion_2){
                            //Eliminar elemento en el vector numerico
                            case 1:
                                ult_pos = (short)(v_numeros.length - 1);
                                //Solicito la posicion
                                System.out.println("\n==================MENU/ELIMINAR ELEMENTO AL VECTOR/Vector numerico=================="+
                                        "\nIngrese la posicion en la cual desea reemplazar el valor: "+
                                        "\nRecuerde que la posicion debe estar entre el rango de la Posicion inicial y Final."+
                                        "\nPosicion inicial: 0"+
                                        "\nPosicion Final: "+ult_pos);
                                posicion = on.nextShort();
                                
                                //Verifico que la posicion este dentro del rango
                                while(posicion<0 || posicion > ult_pos){
                                    System.out.println("\n==========================POSICION INCORRECTA=========================="+
                                            "\nLa posicion ingresada no esta dentro del rango. Por favor Ingrese denuevo:");
                                    posicion = on.nextShort();
                                }
                                
                                //Enviamos la posicion a la Funcion
                                //Imprimios la variable retornada por la funcion
                                System.out.println("\n"+Eliminar_vector_numerico(posicion)); 
                            break;
                            
                            //Eliminar elemento en el vector alfabetico
                            case 2:
                                ult_pos = (short)(v_letras.length - 1);
                                //Solicito la posicion
                                System.out.println("\n==================MENU/ELIMINAR ELEMENTO AL VECTOR/Vector alfabetico=================="+
                                        "\nIngrese la posicion en la cual desea reemplazar el valor: "+
                                        "\nRecuerde que la posicion debe estar entre el rango de la Posicion inicial y Final."+
                                        "\nPosicion inicial: 0"+
                                        "\nPosicion Final: "+ult_pos);
                                posicion = on.nextShort();
                                
                                //Verifico que la posicion este dentro del rango
                                while(posicion<0 || posicion > ult_pos){
                                    System.out.println("\n==========================POSICION INCORRECTA=========================="+
                                            "\nLa posicion ingresada no esta dentro del rango. Por favor Ingrese denuevo:");
                                    posicion = on.nextShort();
                                }
                                
                                //Enviamos la posicion a la Funcion
                                //Imprimios la variable retornada por la funcion
                                System.out.println("\n"+Eliminar_vector_alfabetico(posicion)); 
                            break;
                        }
                    }while(opcion_2 != 9);
                    
                    
                        
                }
                
            }while(seleccion != 9);
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
        }
        
        finally {
            System.out.println("fin de la ejecución");    
        }
        
    }
    
    //FUNCIONES
    //Funcion Recorrer_vector_numerico
    public static String Recorrer_vector_numerio (boolean forma) throws Exception{
        try {
            //Variables
            String text_ret = "";
            
            //Ciclo para recorrer el vector de numerico de forma ascendente
            for (int i = 0; i < v_numeros.length; i++) {
                text_ret += v_numeros[i] + "|";
            }
            
            return text_ret;
        }
        
        catch (Exception error) {
            throw new Exception("\nSe presento un error en la funcion Recorrer_vector_numerico " + error);
            
        }
        
        finally {
            //System.out.println("fin de la ejecución");    
        }
    }
    
    //Funcion Recorrer_vector_numerico
    public static String Recorrer_vector_numerio (boolean forma, byte opcion_3) throws Exception{
        try {
            //Variables
            String text_ret = "";
            
            //Ciclo para recorrer el vector de numerico de forma ascendente
            for (int i =v_numeros.length-1 ; i >=0; i--) {
                text_ret += v_numeros[i] + "|";
            }
            
            return text_ret;
        }
        
        catch (Exception error) {
            throw new  Exception("\nSe presento un error en la funcion Recorrer_vector_numerico " + error);
            
        }
        
        finally {
            //System.out.println("fin de la ejecución");    
        }
    }
    
    //Funcion Recorrer_vector_alfabetico
    public static String Recorrer_vector_alfabetico (boolean forma) throws Exception{
        try {
            //Variables
            String text_ret = "";
            
            //Ciclo para recorrer el vector de letras de forma ascendente
            for (int i = 0; i < v_letras.length; i++) {
                text_ret += v_letras[i] + "|";
            }
            
            return text_ret;
        }
        
        catch (Exception error) {
            throw new Exception("\nSe presento un error en la funcion Recorrer_vector_alfabetico " + error);
            
        }
        
        finally {
            //System.out.println("fin de la ejecución");    
        }
    }
    
    //Funcion Recorrer_vector_numerico
    public static String Recorrer_vector_alfabetico (boolean forma, byte opcion_3) throws Exception{
        try {
            //Variables
            String text_ret = "";
            
            //Ciclo para recorrer el vector de letras de forma ascendente
            for (int i =v_letras.length-1 ; i >=0; i--) {
                text_ret += v_letras[i] + "|";
            }
            
            return text_ret;
        }
        
        catch (Exception error) {
            throw new Exception("\nSe presento un error en la funcion Recorrer_vector_alfabetico " + error);
            
        }
        
        finally {
            //System.out.println("fin de la ejecución");    
        } 
    }

    
    //Funcion Actualizar_vector_numerico
    public static String Actualizar_vector_numerico (short posicion, byte valor) throws Exception{
        try {
            //Vatiables
            String text_ret = "";
            
            //Recorro el vector
            for (int i = 0; i < v_numeros.length; i++) {
                if(posicion == i){
                    v_numeros[i] =valor;
                    text_ret += (rojo + v_numeros[i] + reset + "|");
                }
                else{
                    text_ret += v_numeros[i] + "|";
                }   
            }
            
            return text_ret;
        }
        
        catch (Exception error) {
            throw new Exception ("\nSe presento un error en la funcion Actualizar_vector_numerico " + error);
            
        }
        finally {
            //System.out.println("fin de la ejecución");    
        }
    }

    //Funcion Actualizar_vector_alfabetico
    public static String Actualizar_vector_alfabetico (short posicion, String valor_t1) throws Exception{
        try {
            //Variables
            String text_ret = "";
            
            //Recorro el vector
            for (int i = 0; i < v_letras.length; i++) {
                if(posicion == i){
                    v_letras[i] =valor_t1;
                    text_ret += (rojo + v_letras[i] + reset + "|");
                }
                else{
                    text_ret += v_letras[i] + "|";
                }   
            }
            
            return text_ret;
        }
        
        catch (Exception error) {
            throw new Exception("\nSe presento un error en la funcion Actualizar_vector_alfabetico " + error);
            
        }
        finally {
            //System.out.println("fin de la ejecución");    
        }
    }
    
    
    //Funcion Anadir_vector_numerico
    public static String Anadir_vector_numerico (byte valor) throws Exception{
        try {
            //Variables
            String text_ret = "";
            
            //Anado elemento al vector
            tamano_1 ++;
            //Creo un vector segundario para almacenar los elementos del v_numeros
            byte []v_prueba = new byte[tamano_1];
           
                 
            //Recorro el vector numeros para llenar el segundario
            for (int i = 0; i < v_numeros.length; i++) {
                v_prueba[i] = v_numeros[i];   
            }
            
            //Agrego el valor a la cola del vector (Ultima posicion)
            v_prueba[v_prueba.length - 1] = valor;
            
            //Reestablezco el vector numeros con el vector prueba
            v_numeros= v_prueba;
            
            //Recorro de nuevo el vector numero para concatenar los elementos en la variable de retorno
            for (int i = 0; i < v_numeros.length; i++) {
                if(v_numeros[i] == valor){
                    text_ret += (verde + v_numeros[i] + reset + "|");
                }
                else{
                    text_ret += v_numeros[i] + "|";
                }
            }
            
            return text_ret;
        }
        
        catch (Exception error) {
            throw new Exception("Se presento un error en la funcion Anadir_vector_numerico " + error);
        }
        
        finally {
            //System.out.println("fin de la ejecución");    
        }
    }

    //Funcion Anadir_vector_alfabetico
    public static String Anadir_vector_alfabetico (String valor_t1) throws Exception{
        try {
            //Variables
            String text_ret = "";
            
            //Anado elemento al vector
            tamano_2 ++;
            //Creo un vector segundario para almacenar los elementos del v_numeros
            String []v_prueba = new String[tamano_2];
           
                 
            //Recorro el vector numeros para llenar el segundario
            for (int i = 0; i < v_letras.length; i++) {
                v_prueba[i] = v_letras[i];   
            }
            
            //Agrego el valor a la cola del vector (Ultima posicion)
            v_prueba[v_prueba.length - 1] = valor_t1;
            
            //Reestablezco el vector numeros con el vector prueba
            v_letras= v_prueba;
            
            //Recorro de nuevo el vector numero para concatenar los elementos en la variable de retorno
            for (int i = 0; i < v_letras.length; i++) {
                if(v_letras[i] == valor_t1){
                    text_ret += (verde + v_letras[i] + reset + "|");
                }
                else{
                    text_ret += v_letras[i] + "|";
                }
            }
            
            return text_ret;
        }
        
        catch (Exception error) {
            throw new Exception("\nSe presento un error en la funcion Anadir_vector_alfabetico " + error);
        }
        
        finally {
            //System.out.println("fin de la ejecución");    
        }
    }


    //Funcion Eliminar_vector_numerico
    public static String Eliminar_vector_numerico (short posicion) throws Exception{
        try {
            //Variables
            String text_ret = "";
            byte []v_alternativo = new byte [tamano_1];
            int j = 0;
            
            //Recorro el vector numerico para concatenar la variable y
            //indicar con un espacion en blanco donde se elimino la posicion
            for (int i = 0; i < v_numeros.length; i++) {
                if(i == posicion){
                    text_ret += (" "+"|");
                }
                else{
                   text_ret += v_numeros[i] + "|"; 
                }
            }
            
            //Recorro el vector numero, verifico la posicion y lleno el vector alternativo
            for (int i = 0; i < v_numeros.length; i++) {
                if(i != posicion){
                    v_alternativo[j] = v_numeros[i];
                    j ++;
                }
            }
            
            //Recorro el nuevo vector para llenar el vector numero sin la posicion
            //Reduzco una posicion el tamaño del vector numero
            tamano_1 = (byte)(tamano_1 - 1);
            v_numeros = new byte[tamano_1];
            for (int i = 0; i < v_alternativo.length-1; i++) {
                v_numeros[i] = v_alternativo[i];
            }
            
            
            
            return text_ret;
            
        }
        catch (Exception error) {
            throw new Exception ("\nSe presento un error en la funcion Eliminar_vector_numerico " + error);
            
        }
        finally {
            //System.out.println("fin de la ejecución");
        }
    }

    //Funcion Eliminar_vector_alfabetico
    public static String Eliminar_vector_alfabetico (short posicion) throws Exception{
        try {
            //Variables
            String text_ret = "";
            String []v_alternativo = new String [tamano_2];
            int j = 0;
            
            //Recorro el vector alfabetico para concatenar la variable y
            //indicar con un espacion en blanco donde se elimino la posicion
            for (int i = 0; i < v_letras.length; i++) {
                if(i == posicion){
                    text_ret += (" "+"|");
                }
                else{
                   text_ret += v_letras[i] + "|"; 
                }
            }
            
            //Recorro el vector alfabetico, verifico la posicion y lleno el vector alternativo
            for (int i = 0; i < v_letras.length; i++) {
                if(i != posicion){
                    v_alternativo[j] = v_letras[i];
                    j ++;
                }
            }
            
            //Recorro el nuevo vector para llenar el vector numero sin la posicion
            //Reduzco una posicion el tamaño del vector numero
            tamano_2 = (byte)(tamano_2 - 1);
            v_letras = new String[tamano_2];
            for (int i = 0; i < v_alternativo.length-1; i++) {
                v_letras[i] = v_alternativo[i];
            }
            
            
            return text_ret;
            
        }
        catch (Exception error) {
            throw new Exception ("\nSe presento un error en la funcion Eliminar_vector_alfabetico " + error);
            
        }
        finally {
            //System.out.println("fin de la ejecución");
        }
    }
}
