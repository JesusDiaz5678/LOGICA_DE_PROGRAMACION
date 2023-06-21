/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_arreglos;

/**
 *
 * @author JESUS ALBERTO
 */
import java.io.*;
public class Punto_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            //Variables
            int tamano_2;
            String []v_letras = Cargar_vector();
            tamano_2 = v_letras.length;
            
            //Mostrar el vector desordenado
            System.out.println("VECTOR DESORDENADO\n"+Mostrar_vector (v_letras));
            
            //Mostrar el vector de forma ascendente
            System.out.println("\nVECTOR ORDENADO DE FORMA ASCENDENTE\n"+Ordenar_vector_asc (v_letras, tamano_2));
            
            //Mostrar el vector de forma decendente
            System.out.println("\nVECTOR ORDENADO DE FORMA ASCENDENTE\n"+Ordenar_vector_dec (v_letras, tamano_2));
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
        }
        
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
    //Funciones
    public static String[] Cargar_vector () throws Exception {
            try {
                //Variables
                String linea;
                short tamaño = 0;
                short posicion = 0;
                String []v_alternativo; 
                
                FileReader arc_letras = new FileReader("C:\\Users\\JESUS ALBERTO\\Documents\\UNIVERSIDAD\\02° SEGUNDO SEMESTRE\\LOGICA DE PROGRAMACION\\ARCHIVOS\\LETRAS.txt");
                BufferedReader dat_arc = new BufferedReader(arc_letras);
                linea = dat_arc.readLine();
                
                if(linea == null){
                    throw new Exception("El archivo esta vacio");
                }
                
                //Leo y cuento cuantas lineas hay para saber de que tamaño debe ser el vector
                while(linea != null){
                    tamaño++;
                    linea = dat_arc.readLine();
                }
                
                v_alternativo = new String [tamaño];
                
                //Cierro el archivo
                dat_arc.close();
                
                //Lo vuelvo a cargar
                arc_letras = new FileReader("C:\\Users\\JESUS ALBERTO\\Documents\\UNIVERSIDAD\\02° SEGUNDO SEMESTRE\\LOGICA DE PROGRAMACION\\ARCHIVOS\\LETRAS.txt");
                dat_arc = new BufferedReader(arc_letras);
                linea = dat_arc.readLine();
                
                //Cargo las palabras de cada linea del archivo a las posiciones de vector
                while(linea != null){
                    v_alternativo[posicion] = linea;
                    posicion++;
                    linea = dat_arc.readLine();
                }
                
                //Cierro el archivo
                dat_arc.close();
                
                return v_alternativo;
                
            }
            catch (Exception error) {
                throw new Exception ("Se presento un error en la funcion Cargar_vector " + error);
                
            }
            finally {
                //System.out.println("fin de la ejecución");
                
            }
    }

    public static String Mostrar_vector (String []v_letras) throws Exception {
        try {
            //variables
            String text_ret = "";
            
            for (int i = 0; i < v_letras.length; i++) {
                text_ret = text_ret +(v_letras[i]+"|");
            }
            return text_ret;
        }
        
        catch (Exception error) {
            throw new Exception("Se presento un error en la funcion Mostrar_vector " + error);
            
        }
        
        finally {
            //System.out.println("fin de la ejecución");    
        }
    }
    
    public static String Ordenar_vector_asc (String []v_letras, int tamano_2) throws Exception {
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
            throw new Exception("Se presento un error en la funcion Ordenar_vector_asc" + error);
            
        }
        
        finally {
            //System.out.println("fin de la ejecución");   
        }
    }
    
    public static String Ordenar_vector_dec (String []v_letras, int tamano_2) throws Exception{
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
            throw new Exception("Se presento un error en la funcion Ordenar_vector_dec" + error);
            
        }
        
        finally {
            //System.out.println("fin de la ejecución");    
        }
    }
}
