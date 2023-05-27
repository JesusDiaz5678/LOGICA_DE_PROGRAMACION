/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;

/**
 *
 * @author JESUS ALBERTO
 */
import java.util.Scanner;
public class clase_11_septiembre {

    /**
     * @param args the command line arguments
     */
    static Scanner on  = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        
        //MENU SIGGAA UNIVERSIDAD
        try {
            // VARIABLES
            byte opcion_1;
            byte opcion_2;
            byte opcion_3;
            byte opcion_4;
            
            
            // Inicio del Menu
            do{
                // Eleccion de tipo de usuario
                // Menu principal
                System.out.println("=================SIGAA================="+
                        "\nSeleccione su tipo de usuario: "+
                        "\n1. DOCENTE"+
                        "\n2. ESTUDIANTE"+
                        "\n3. EMPLEADO"+
                        "\n4. salir");
                opcion_1 = on.nextByte();
                
                switch(opcion_1){
                    // USUARIO DOCENTE
                    case 1: do{
                        System.out.println("\n-------------DOCENTE-------------"+
                                "\nSeleccione una opcion: "+
                                "\n1. CURSO"+
                                "\n2. REPORTE NOTAS"+
                                "\n4. Regresar al menu principal");
                        opcion_2 = on.nextByte();
                        
                        switch(opcion_2){
                            case 1: do{ //OPCION CURSO
                                System.out.println("\n-------------DOCENTE/CURSO-------------"+
                                        "\n1. SELECCION PERIODO"+
                                        "\n2. SELECCION NRC"+
                                        "\n4. Regresar al menu DOCENTE");
                                opcion_3 = on.nextByte();
                                
                                switch(opcion_3){
                                    case 1 : do{
                                        System.out.println("\n-------------DOCENTE/CURSO/SELECCION PERIODO-------------"+
                                                "\nUsted esta en la seccion de SELECCION PERIODO"+
                                                "\n4. Regresar al menu DOCENTE/CURSO");
                                        opcion_4 = on.nextByte();
                                    }while(opcion_4 != 4);
                                    break;
                                    
                                    case 2: do{
                                        System.out.println("\n-------------DOCENTE/CURSO/SELECCION NRC-------------"+
                                                "\n1. Lista de estudiantes"+
                                                "\n2. Reporte falllas"+
                                                "\n4. Regresar al menu DOCENTE/CURSO");
                                        opcion_4 = on.nextByte();
                                    }while(opcion_4 != 4);
                                    break;
                                }
                                
                            }while(opcion_3 != 4);
                            break;
                            
                            case 2: do{ // OPCION REPORTE NOTAS
                                System.out.println("-------------DOCENTE/REPORTE NOTAS-------------"+
                                        "\n1. Asignar Notas"+
                                        "\n2. Reportar Notas"+
                                        "\n4. Regresar al menu DOCENTE");
                                opcion_3 = on.nextByte();
                                
                               switch(opcion_3){
                                    case 1 : do{
                                        System.out.println("\n-------------DOCENTE/REPORTE NOTAS/ASIGNAR NOTAS-------------"+
                                                "\nUsted esta en la seccion de ASIGNAR NOTAS"+
                                                "\n4. Regresar al menu DOCENTE/REPORTE NOTAS");
                                        opcion_4 = on.nextByte();
                                    }while(opcion_4 != 4);
                                    break;
                                    
                                    case 2: do{
                                        System.out.println("\n-------------DOCENTE/REPORTE NOTAS/REPORTAR NOTAS-------------"+
                                                "\nUsted esta en la seccion de REPORTAR NOTAS"+
                                                "\n4. Regresar al menu DOCENTE/REPORTE NOTAS");
                                        opcion_4 = on.nextByte();
                                    }while(opcion_4 != 4);
                                    break;
                                }
                               
                            }while(opcion_3 != 4);
                            break;
                        }
                        
                    }while(opcion_2 != 4);
                    break;
                    
                    // USUARIO ESTUDIANTE
                    case 2: do{
                        System.out.println("\n-------------ESTUDIANTE-------------"+
                                "\nSeleccione una opcion: "+
                                "\n1. CANCELAR MATERIA"+
                                "\n2. CONSULTAR NOTA"+
                                "\n4. Regresar al menu principal");
                        opcion_2 = on.nextByte();
                        
                        switch(opcion_2){
                            case 1: do{
                                System.out.println("\n-------------ESTUDIANTE/CANCELAR MATERIA-------------"+
                                        "\nUsted esta en la seccion CANCELAR MATERIA"+
                                        "\n4. Regresar al menu ESTUDIANTE");
                                opcion_3 = on.nextByte();
                            }while(opcion_3 != 4);
                            break;
                            
                            case 2: do{
                               System.out.println("\n-------------ESTUDIANTE/CONSULTAR NOTAS-------------"+
                                        "\n1. Seleccionar NRC"+
                                        "\n4. Regresar al menu ESTUDIANTE");
                                opcion_3 = on.nextByte(); 
                                
                                switch(opcion_3){
                                    case 1: do{
                                        System.out.println("\n-------------ESTUDIANTE/CONSULTAR NOTAS/SELECCIONAR NRC"+
                                                "\nUsted esta en la seccion SELECCIONAR NRC+"+
                                                "\n4. Regresar al menu ESTUDIANTE/CONSULTAR NOTAS");
                                        opcion_4 = on.nextByte();
                                    }while(opcion_4 != 4);
                                }
                            }while(opcion_3 != 4);
                            break;
                        }
                    }while(opcion_2 != 4);
                    break;
                    
                    // USUARIO EMPLEADO
                    case 3: do{
                        System.out.println("\n-------------EMPLEADOS-------------"+
                                "\nSeleccione una opcion: "+
                                "\n1. CERTIFICADO"+
                                "\n2. SOLICITAR LICENCIA"+
                                "\n4. Regresar al menu principal");
                        opcion_2 = on.nextByte();
                        
                        switch(opcion_2){
                            case 1: do{
                                System.out.println("\n-------------EMPLEADOS/CERTIFICADO-------------"+
                                        "\n1. Carta Laboral"+
                                        "\n2. Tributarios"+
                                        "\n4. Regresar al menu EMPLEADOS");
                                opcion_3 = on.nextByte();
                                
                                switch(opcion_3){
                                    case 1: do{
                                        System.out.println("-------------EMPLEADOS/CERTIFICADO/CARTA LABORAL-------------"+
                                                "\nUsted esta en la seccion CARTA LABORAL"+
                                                "\n4. Regresar al menu EMPLEADOS/CERTIFICADO");
                                        opcion_4 = on.nextByte();
                                    }while(opcion_4 != 4);
                                    break;
                                    
                                    case 2: do{
                                        System.out.println("-------------EMPLEADOS/CERTIFICADO/TRIBUTARIOS-------------"+
                                                "\nUsted esta en la seccion TRIBUTARIOS"+
                                                "\n4. Regresar al menu EMPLEADOS/CERTIFICADO");
                                        opcion_4 = on.nextByte();
                                    }while(opcion_4 != 4);
                                    break;
                                }
                            }while(opcion_3 != 4);
                            break;
                            
                            case 2: do{
                                System.out.println("\n-------------EMPLEADOS/SOLICITAR LICENCIA-------------"+
                                        "\n1. Remunerada"+
                                        "\n2. No Remunerada"+
                                        "\n4. Regresar al menu EMPLEADOS");
                                opcion_3 = on.nextByte();
                                
                               switch(opcion_3){
                                    case 1: do{
                                        System.out.println("-------------EMPLEADOS/SOLICITAR LICENCIA/REMUNERADA-------------"+
                                                "\nUsted esta en la seccion solicitud de LICENCIA REMUNERADA"+
                                                "\n4. Regresar al menu EMPLEADOS/SOLICITAR LICENCIA");
                                        opcion_4 = on.nextByte();
                                    }while(opcion_4 != 4);
                                    break;
                                    
                                    case 2: do{
                                        System.out.println("-------------EMPLEADOS/SOLICITAR LICENCIA/NO REMUNERADA-------------"+
                                                "\nUsted esta en la seccion solicitud de LICENCIA NO REMUNERADA"+
                                                "\n4. Regresar al menu EMPLEADOS/SOLICITAR LICENCIA");
                                        opcion_4 = on.nextByte();
                                    }while(opcion_4 != 4);
                                    break;
                                } 
                            }while(opcion_3 != 4);
                            break;
                            
                        }
                    }while(opcion_2 != 4);
                    break;
                }
            }while(opcion_1 != 4);
        }
        
        catch (Exception error) {
            System.out.println("Se presento un error " + error);
            
        }
        
        finally {
            System.out.println("fin de la ejecución");
            
        }
    }
    
}
