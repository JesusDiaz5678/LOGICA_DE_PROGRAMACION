package ClaseLP;

/**
 *
 * @author B09S115est
 */

import java.io.*;
        
public class Votacion {
    
    public static void main (String [] args){
        
        char voto;
        String linea, ganador;
        short tvka=0,tvkb=0, tvkc=0, tvb=0,tvn=0;
        
        File archivo = null;
        FileReader votaciones = null;
        BufferedReader datos = null;
                
        try{
        
            archivo = new File("C:\\Users\\B09S115est\\Downloads\\Votaciones.txt");
            votaciones = new FileReader(archivo);
            datos = new BufferedReader(votaciones);
            
            while((linea=datos.readLine())!=null){
                
                if (linea.length() > 0) {
                
                    voto = linea.charAt(0);
                
                    switch (voto){

                        case 'A': tvka++;
                                  break;
                        case 'B': tvkb++;
                                  break;
                        case 'C': tvkc++;
                                  break;
                        case '#': tvn++;
                                  break;
                        case '?': tvb++;
                                  break;
                        default:  break;
                    }
                }
                
            }
            
            if (tvka > tvkb && tvka > tvkc && tvka > tvb && tvka > tvn) ganador = "Candidato A";
            else if (tvkb > tvka && tvkb > tvkc && tvkb > tvb && tvkb > tvn) ganador = "Candidato B";
            else if (tvkc > tvka && tvkc > tvkb && tvkc > tvb && tvkc > tvn) ganador = "Candidato C";    
            else if (tvb > tvka && tvb > tvkb && tvb > tvkc && tvb > tvn) ganador = "Voto Blanco";
            else if (tvn > tvka && tvn > tvkb && tvn > tvkc && tvn > tvb) ganador = "Voto Nulo";
            else ganador = "Revise los datos, puede haber empate o problemas con los datos";
        
            System.out.println("El candidato A obtuvo un total de: " + tvka + " votos");
            System.out.println("El candidato B obtuvo un total de: " + tvkb + " votos");
            System.out.println("El candidato C obtuvo un total de: " + tvkc + " votos");
            System.out.println("El total de votos en blanco fueron: " + tvb + " votos");
            System.out.println("El total de votos nulos fueron: " + tvn + " votos");
            System.out.println("======================================================");
            System.out.println("El ganador fue: " + ganador);
            System.out.println("======================================================");
        }
        catch (IOException e){
            System.out.println("Error: " + e);
        }
        
        catch (Exception e){
            System.out.println("Error: " + e);
        }
        
        finally{
            
            try {
                datos.close();
            }
            catch (IOException e){
                System.out.println("Error: " + e);
             }
        }
    }
    
}
