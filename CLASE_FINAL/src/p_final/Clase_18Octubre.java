/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p_final;

/**
 *
 * @author JESUS ALBERTO
 */
import javax.swing.*;
public class Clase_18Octubre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // proyecto notas
       
        try {
            f_Nota form_notas = new f_Nota();
            form_notas.setVisible(true);
        }
            
         catch (Exception error) {
            System.out.println("Se presento un error " + error);
         }
    }
    
}
