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
                    break;
                    
                    
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
                    break;
                    
                    
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
                    break;
                    
                    
                    //Ordenar vector
                    case 5:do{
                        System.out.println("\n=========MENU/ORDENAR VECTOR========="+
                                "\nQue vector desea eliminar elemento:"+
                                "\n1. Vector numerico"+
                                "\n2. Vector alfabetico"+
                                "\n9. Regresar al apartado MENU");
                        opcion_2 = on.nextByte();
                        
                        //Seleccion de ordenar vecto
                        switch(opcion_2){
                            //Ordenar vector numerico
                            case 1 :
                                System.out.println("\n=========MENU/ORDENAR VECTOR/Vector numerico========="+
                                        "\nComo desea ordenar el vector numerico:"+
                                        "\n1. Ascendentemente"+
                                        "\n2. Descendentemente"+
                                        "\n9. Regresar al apartado MENU/ORDENAR VECTOR");
                                opcion_3 = on.nextByte();
                                
                                //Seleccion en vector numerico
                                switch(opcion_3){
                                    //Ordenar Ascendentemente
                                    case 1 :
                                        System.out.println("\n"+Ordenar_vector_numerico_Asc ());
                                    break;
                                    
                                    //Ordenar Descendentemente
                                    case 2:
                                        System.out.println("\n"+Ordenar_vector_numerico_Des ());
                                    break;
                                }
                            break;
                            
                            //Ordenar vector alfabetico
                            case 2 :
                                System.out.println("\n=========MENU/ORDENAR VECTOR/Vector alfabetico========="+
                                        "\nComo desea ordenar el vector alfabetico:"+
                                        "\n1. Ascendentemente"+
                                        "\n2. Descendentemente"+
                                        "\n9. Regresar al apartado MENU/ORDENAR VECTOR");
                                opcion_3 = on.nextByte();
                                
                                //Seleccion en vector numerico
                                switch(opcion_3){
                                    //Ordenar Ascendentemente
                                    case 1 :
                                        System.out.println("\n"+Ordenar_vector_alfabetico_Asc ());
                                    break;
                                    
                                    //Ordenar Descendentemente
                                    case 2:
                                        System.out.println("\n"+Ordenar_vector_alfabetico_Des ());
                                    break;
                                }
                            break;
                        }
                    }while(opcion_2 != 9);
                    break;
                    
                    
                    //Buscar elemento en el vector
                    case 6:do{
                        System.out.println("\n=========MENU/BUSCAR ELEMENTO VECTOR========="+
                                "\nQue vector desea buscar elemento:"+
                                "\n1. Vector numerico"+
                                "\n2. Vector alfabetico"+
                                "\n9. Regresar al apartado MENU");
                        opcion_2 = on.nextByte();
                        
                        //Seleccion de buscar elemento del vector
                        switch(opcion_2){
                            //Buscar elemento en el vector numerico
                            case 1 :
                                System.out.println("\n==================MENU/BUSCAR ELEMENTO VECTOR/Vector numerico=================="+
                                        "\nIngrese el valor numerico que desea buscar en el vector."+
                                        "\nRecuerde que solo se aceptan valores numericos entre el rango de 1-100");
                                valor = on.nextByte();
                                
                                //Valido que el valor a buscar este dentro del rango
                                while(valor < 1 || valor > 100){
                                    System.out.println("\n==========================VALOR INCORRECTO=========================="+
                                            "\nEl valor ingresado es incorrecto. "+
                                            "Por favor, asegurece de ingresar un valor numerico entre 1-100");
                                    valor = on.nextByte();
                                }
                                
                                System.out.println("\n"+Buscar_vector_numerico (valor));
                            break;
                            
                            //Buscar elemento en el vector alfabetico
                            case 2:
                                System.out.println("\n==================MENU/BUSCAR ELEMENTO VECTOR/Vector alfabetico=================="+
                                        "\nIngrese el valor que desea buscar en el vector. "+
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
                                    System.out.println("\n" + Buscar_vector_alfabetico (valor_t1));
                                }
                                
                                //De lo contrario
                                else{
                                    System.out.println("\n==========================VALOR INCORRECTO=========================="+
                                            "\nEl valor ingresado es incorrecto. "+
                                            "Por favor, asegurece de ingresar un valor alfabetico (Unicamente letra)");
                                    //Regresamos al menu actualizar vector alfabetico
                                }
                            break;
                        }
                    }while(opcion_2 != 9);
                    break;
                        
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

    
    //Funcion Ordenar_vector_numerico_Asc
    public static String Ordenar_vector_numerico_Asc () throws Exception{
        try {
            //Variables
            String text_ret = "";
            byte valor_1 = 0;
            
            
            for (int i = 0; i < v_numeros.length; i++) {
                
                for (int j = (i + 1); j < v_numeros.length; j++) {
                    
                    if(v_numeros[j] < v_numeros[i]){
                        valor_1 = v_numeros[i];
                        v_numeros[i] = v_numeros[j];
                        v_numeros[j] = valor_1;
                    }
                }
            }
            
            //Ciclo para recorrer el vector de numerico de forma ascendente
            for (int i = 0; i < v_numeros.length; i++) {
                text_ret += v_numeros[i] + "|";
            }
            
            return text_ret;
            
            
        }
        
        catch (Exception error) {
            throw new Exception("\nSe presento un error en la funcion Ordenar_vector_numerico " + error);
            
        }
        
        finally {
            //System.out.println("fin de la ejecución");
            
        }
    }
    
    //Funcion Ordenar_vector_numerico_Des
    public static String Ordenar_vector_numerico_Des () throws Exception{
        try {
            //Variables
            String text_ret = "";
            byte valor_1 = 0;
            
            
            for (int i = 0; i < v_numeros.length; i++) {
                
                for (int j = (i + 1); j < v_numeros.length; j++) {
                    
                    if(v_numeros[j] > v_numeros[i]){
                        valor_1 = v_numeros[i];
                        v_numeros[i] = v_numeros[j];
                        v_numeros[j] = valor_1;
                    }
                }
            }
            
            //Ciclo para recorrer el vector de numerico de forma ascendente
            for (int i = 0; i < v_numeros.length; i++) {
                text_ret += v_numeros[i] + "|";
            }
            
            return text_ret;
            
            
        }
        
        catch (Exception error) {
            throw new Exception("\nSe presento un error en la funcion Ordenar_vector_numerico " + error);
            
        }
        
        finally {
            //System.out.println("fin de la ejecución");
            
        }
    }
    
    //Funcion Ordenar_vector_alfabetico_As
    public static String Ordenar_vector_alfabetico_Asc () throws Exception{
        try {
            //Variables
            String text_ret = "";
            
            //Contadoras
            byte A = 0;
            byte B = 0;
            byte C = 0;
            byte D = 0;
            byte E = 0;
            byte F = 0;
            byte G = 0;
            byte H = 0;
            byte I = 0;
            byte J = 0;
            byte K = 0;
            byte L = 0;
            byte M = 0;
            byte N = 0;
            byte O = 0;
            byte P = 0;
            byte Q = 0;
            byte R = 0;
            byte S = 0;
            byte T = 0;
            byte U = 0;
            byte V = 0;
            byte W = 0;
            byte X = 0;
            byte Y = 0;
            byte Z = 0;
            
            //Variable de posicion
            byte po = 0;
            
            //Vector alternativo
            String []v_alternativo = new String[tamano_2];
            
            //Recorremos el vector v_letras y contabilizamos cada una de las letras que hay en el
            for (int i = 0; i < v_letras.length; i++) {
                switch(v_letras[i]){
                    case "A":
                        A++;
                    break;
                    case "B":
                        B++;
                    break;
                    case "C":
                        C++;
                    break;
                    case "D":
                        D++;
                    break;
                    case "E":
                        E++;
                    break;
                    case "F":
                        F++;
                    break;
                    case "G":
                        G++;
                    break;
                    case "H":
                        H++;
                    break;
                    case "I":
                        I++;
                    break;
                    case "J":
                        J++;
                    break;
                    case "K":
                        K++;
                    break;
                    case "L":
                        L++;
                    break;
                    case "M":
                        M++;
                    break;
                    case "N":
                        N++;
                    break;
                    case "O":
                        O++;
                    break;
                    case "P":
                        P++;
                    break;
                    case "Q":
                        Q++;
                    break;
                    case "R":
                        R++;
                    break;
                    case "S":
                        S++;
                    break;
                    case "T":
                        T++;
                    break;
                    case "U":
                        U++;
                    break;
                    case "V":
                        V++;
                    break;
                    case "W":
                        W++;
                    break;
                    case "X":
                        X++;
                    break;
                    case "Y":
                        Y++;
                    break;
                    case "Z":
                        Z++;
                    break;
                }
            }
            
            //Creamos 26 ciclos que nos van a permitir llenar el vector alternativo
            while(A > 0){
                v_alternativo[po] = "A";
                A--;
                po++;
            }
            while(B > 0){
                v_alternativo[po] = "B";
                B--;
                po++;
            }
            while(C > 0){
                v_alternativo[po] = "C";
                C--;
                po++;
            }
            while(D > 0){
                v_alternativo[po] = "D";
                D--;
                po++;
            }
            while(E > 0){
                v_alternativo[po] = "E";
                E--;
                po++;
            }
            while(F > 0){
                v_alternativo[po] = "F";
                F--;
                po++;
            }
            while(G > 0){
                v_alternativo[po] = "G";
                G--;
                po++;
            }
            while(H > 0){
                v_alternativo[po] = "H";
                H--;
                po++;
            }
            while(I > 0){
                v_alternativo[po] = "I";
                I--;
                po++;
            }
            while(J > 0){
                v_alternativo[po] = "J";
                J--;
                po++;
            }
            while(K > 0){
                v_alternativo[po] = "K";
                K--;
                po++;
            }
            while(L > 0){
                v_alternativo[po] = "L";
                L--;
                po++;
            }
            while(M > 0){
                v_alternativo[po] = "M";
                M--;
                po++;
            }
            while(N > 0){
                v_alternativo[po] = "N";
                N--;
                po++;
            }
            while(O > 0){
                v_alternativo[po] = "O";
                O--;
                po++;
            }
            while(P > 0){
                v_alternativo[po] = "P";
                P--;
                po++;
            }
            while(Q > 0){
                v_alternativo[po] = "Q";
                Q--;
                po++;
            }
            while(R > 0){
                v_alternativo[po] = "R";
                R--;
                po++;
            }
            while(S > 0){
                v_alternativo[po] = "S";
                S--;
                po++;
            }
            while(T > 0){
                v_alternativo[po] = "T";
                T--;
                po++;
            }
            while(U > 0){
                v_alternativo[po] = "U";
                U--;
                po++;
            }
            while(V > 0){
                v_alternativo[po] = "V";
                V--;
                po++;
            }
            while(W > 0){
                v_alternativo[po] = "W";
                W--;
                po++;
            }
            while(X > 0){
                v_alternativo[po] = "X";
                X--;
                po++;
            }
            while(Y > 0){
                v_alternativo[po] = "Y";
                Y--;
                po++;
            }
            while(Z > 0){
                v_alternativo[po] = "Z";
                Z--;
                po++;
            }
            
            v_letras = v_alternativo;
            
            //Ciclo para concatenar los elementos del vector en la variable de return
            for (int i = 0; i < v_letras.length; i++) {
                text_ret += v_letras[i] + "|";
            }
            
            return text_ret;
            
        }
        
        catch (Exception error) {
            throw new Exception("\nSe presento un error en la funcion Ordenar_vector_alfabetico_Asc " + error);
            
        }
        
        finally {
            //System.out.println("fin de la ejecución");
            
        }
    }

    //Funcion Ordenar_vector_alfabetico_As
    public static String Ordenar_vector_alfabetico_Des () throws Exception{
        try {
            //Variables
            String text_ret = "";
            
            //Contadoras
            byte A = 0;
            byte B = 0;
            byte C = 0;
            byte D = 0;
            byte E = 0;
            byte F = 0;
            byte G = 0;
            byte H = 0;
            byte I = 0;
            byte J = 0;
            byte K = 0;
            byte L = 0;
            byte M = 0;
            byte N = 0;
            byte O = 0;
            byte P = 0;
            byte Q = 0;
            byte R = 0;
            byte S = 0;
            byte T = 0;
            byte U = 0;
            byte V = 0;
            byte W = 0;
            byte X = 0;
            byte Y = 0;
            byte Z = 0;
            
            //Variable de posicion
            byte po = 0;
            
            //Vector alternativo
            String []v_alternativo = new String[tamano_2];
            
            //Recorremos el vector v_letras y contabilizamos cada una de las letras que hay en el
            for (int i = 0; i < v_letras.length; i++) {
                switch(v_letras[i]){
                    case "A":
                        A++;
                    break;
                    case "B":
                        B++;
                    break;
                    case "C":
                        C++;
                    break;
                    case "D":
                        D++;
                    break;
                    case "E":
                        E++;
                    break;
                    case "F":
                        F++;
                    break;
                    case "G":
                        G++;
                    break;
                    case "H":
                        H++;
                    break;
                    case "I":
                        I++;
                    break;
                    case "J":
                        J++;
                    break;
                    case "K":
                        K++;
                    break;
                    case "L":
                        L++;
                    break;
                    case "M":
                        M++;
                    break;
                    case "N":
                        N++;
                    break;
                    case "O":
                        O++;
                    break;
                    case "P":
                        P++;
                    break;
                    case "Q":
                        Q++;
                    break;
                    case "R":
                        R++;
                    break;
                    case "S":
                        S++;
                    break;
                    case "T":
                        T++;
                    break;
                    case "U":
                        U++;
                    break;
                    case "V":
                        V++;
                    break;
                    case "W":
                        W++;
                    break;
                    case "X":
                        X++;
                    break;
                    case "Y":
                        Y++;
                    break;
                    case "Z":
                        Z++;
                    break;
                }
            }
            
            //Creamos 26 ciclos que nos van a permitir llenar el vector alternativo
            while(Z > 0){
                v_alternativo[po] = "Z";
                Z--;
                po++;
            }
            while(Y > 0){
                v_alternativo[po] = "Y";
                Y--;
                po++;
            }
            while(X > 0){
                v_alternativo[po] = "X";
                X--;
                po++;
            }
            while(W > 0){
                v_alternativo[po] = "W";
                W--;
                po++;
            }
            while(V > 0){
                v_alternativo[po] = "V";
                V--;
                po++;
            }
            while(U > 0){
                v_alternativo[po] = "U";
                U--;
                po++;
            }
            while(T > 0){
                v_alternativo[po] = "T";
                T--;
                po++;
            }
            while(S > 0){
                v_alternativo[po] = "S";
                S--;
                po++;
            }
            while(R > 0){
                v_alternativo[po] = "R";
                R--;
                po++;
            }
            while(Q > 0){
                v_alternativo[po] = "Q";
                Q--;
                po++;
            }
            while(P > 0){
                v_alternativo[po] = "P";
                P--;
                po++;
            }
            while(O > 0){
                v_alternativo[po] = "O";
                O--;
                po++;
            }
            while(N > 0){
                v_alternativo[po] = "N";
                N--;
                po++;
            }
            while(M > 0){
                v_alternativo[po] = "M";
                M--;
                po++;
            }
            while(L > 0){
                v_alternativo[po] = "L";
                L--;
                po++;
            }
            while(K > 0){
                v_alternativo[po] = "K";
                K--;
                po++;
            }
            while(J > 0){
                v_alternativo[po] = "J";
                J--;
                po++;
            }
            while(I > 0){
                v_alternativo[po] = "I";
                I--;
                po++;
            }
            while(H > 0){
                v_alternativo[po] = "H";
                H--;
                po++;
            }
            while(G > 0){
                v_alternativo[po] = "G";
                G--;
                po++;
            }
            while(F > 0){
                v_alternativo[po] = "F";
                F--;
                po++;
            }
            while(E > 0){
                v_alternativo[po] = "E";
                E--;
                po++;
            }
            while(D > 0){
                v_alternativo[po] = "D";
                D--;
                po++;
            }
            while(C > 0){
                v_alternativo[po] = "C";
                C--;
                po++;
            }
            while(B > 0){
                v_alternativo[po] = "B";
                B--;
                po++;
            }
            while(A > 0){
                v_alternativo[po] = "A";
                A--;
                po++;
            }
            
            v_letras = v_alternativo;
            
            //Ciclo para concatenar los elementos del vector en la variable de return
            for (int i = 0; i < v_letras.length; i++) {
                text_ret += v_letras[i] + "|";
            }
            
            return text_ret;
            
        }
        
        catch (Exception error) {
            throw new Exception("\nSe presento un error en la funcion Ordenar_vector_alfabetico_Des " + error);
            
        }
        
        finally {
            //System.out.println("fin de la ejecución");
            
        }
    }

    
    //Funcion Buscar_vector_numerico
    public static String Buscar_vector_numerico (byte valor) throws Exception {
        try {
            //Variables
            String text_ret = "";
            byte posicion=0;
            boolean hallado = false;
            
            //En un ciclo, recorro el vector y busco en que posicion se localiza el vector
            for (int i = 0; i < v_numeros.length; i++) {
                if(v_numeros[i] == valor){
                    posicion = (byte)(i);
                    hallado  = true;
                }
            }
            
            //LLeno la cadena que voy a retornar con el mensaje correspondiente
            if(hallado == false){
                text_ret = "EL VALOR A CONSULTAR NO SE ENCUENTRA EN EL VECTOR";
            }
            else{
                text_ret = "V:"+valor+" - "+"P:"+posicion;
            }
            
            return text_ret;
        }
        
        catch (Exception error) {
            throw new Exception("\nSe presento un error en la funcion Buscar_vector_numerico " + error);
            
        }
        
        finally {
            //System.out.println("fin de la ejecución");    
        }
    }

    //Funcion Buscar_vector_alfabetico
    public static String Buscar_vector_alfabetico (String valor_t1) throws Exception {
        try {
            //Variables
            String text_ret = "";
            byte posicion=0;
            boolean hallado = false;
            
            //En un ciclo, recorro el vector y busco en que posicion se localiza el vector
            for (int i = 0; i < v_letras.length; i++) {
                if(v_letras[i].equals(valor_t1)){
                    posicion = (byte)(i);
                    hallado  = true;
                }
            }
            
            //LLeno la cadena que voy a retornar con el mensaje correspondiente
            if(hallado == false){
                text_ret = "EL VALOR A CONSULTAR NO SE ENCUENTRA EN EL VECTOR";
            }
            else{
                text_ret = "L:"+valor_t1+" - "+"P:"+posicion;
            }
            
            return text_ret;
        }
        
        catch (Exception error) {
            throw new Exception("\nSe presento un error en la funcion Buscar_vector_alfabetico " + error);
            
        }
        
        finally {
            //System.out.println("fin de la ejecución");    
        }
    }
}
