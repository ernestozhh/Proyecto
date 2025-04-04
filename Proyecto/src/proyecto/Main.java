
package proyecto;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        //Datos
        ArrayList<String> registroUsers = new ArrayList<>();
        ArrayList<String> registroPasses = new ArrayList<>();
        ArrayList<String> vipUsers = new ArrayList<>();
        ArrayList<String> vipPasses = new ArrayList<>();
        ArrayList<String> registroBigLabs = new ArrayList<>();
        ArrayList<String> registroSmallLabs = new ArrayList<>();
        ArrayList<String> horarioLabS1 = new ArrayList<>();
        ArrayList<String> horarioLabS2 = new ArrayList<>();
        ArrayList<String> horarioLabX1 = new ArrayList<>();
        ArrayList<String> compsLabS1 = new ArrayList<>();
        ArrayList<String> compsLabS2 = new ArrayList<>();
        ArrayList<String> compsLabX1 = new ArrayList<>();
        ArrayList<String> registroUsos = new ArrayList<>();
        ArrayList<String> registroProblemas = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        boolean closeSys = false;
        boolean closeMenu = false;
        boolean isUser;
        boolean isVip;
        int menu = 0;
        String user;
        String pass;
        
        
        //Agrega usuarios de estudiantes y sus contrasenas respectivas
        registroUsers.add("Carlos");
        registroPasses.add("passA1");
        registroUsers.add("Christopher");
        registroPasses.add("passB2");
        registroUsers.add("Ernesto");
        registroPasses.add("passC3");
        registroUsers.add("Leo");
        registroPasses.add("passD4");
        
        //Agrega usuarios de profesores y sus contrasenas respectivas
        vipUsers.add("Profesor1");
        vipPasses.add("SoyAdmin1");
        vipUsers.add("Profesor2");
        vipPasses.add("SoyAdmin2");
        
        //Agrega los laboratorios disponibles
        registroSmallLabs.add("LabS1");
        registroSmallLabs.add("LabS2");
        registroBigLabs.add("LabX1");
        
        //Agrega horarios para los laboratorios
        //???
        
        //Agrega computadoras en los laboratorios
        //???
        
        //Loop para mantener el sistema encendido
        while (closeSys == false) {
            
            isUser = false;
            isVip = false;
            
            //Loop para no acceder al sistema hasta haber un usuario valido
            while (isUser == false) {
                
                //Llama a crear una ventana para hacer login y retorna los datos
                user = ui.getUser();
                pass = ui.getPass();
                
                //Checks para revisar si se ingreso un usuario valido y si estudiante o profesor
                if (registroUsers.indexOf(user) != -1 && registroUsers.indexOf(user) == registroPasses.indexOf(pass)) {
                
                    isUser = true;
                    break;
                
                } else if (vipUsers.indexOf(user) != -1 && vipUsers.indexOf(user) == vipPasses.indexOf(pass)) {
                
                    isUser = true;
                    isVip = true;
                    break;
                
                }
                
            } //Fin de loop para verificar usuario
            
            //Loop para mantenerse en el menu principal
            while (closeMenu == false) {
                
                System.out.println("");
                System.out.println("Seleccione una opcion:");
                System.out.println("1. Ver Laboratorios Disponibles");
                System.out.println("2. Ver Registros");
                System.out.println("3. Salir");
                
                menu = entrada.nextInt();
                
                //Check para cerrar el menu principal
                if (menu == 3) { 
                    
                    System.out.println("");
                    System.out.println("El menu se va a cerrar");
                    break; 
                
                } // Fin de check para cerrar el menu principal
                
                //Control para el menu de opciones
                switch (menu) {
                    
                    case 1:
                        
                        System.out.println("");
                        System.out.println("Seleccione el laboratorio:");
                        System.out.println("1. LabS1");
                        System.out.println("2. LabS2");
                        System.out.println("3. LabX1");
                        System.out.println("4. Regresar");
                        
                        menu = entrada.nextInt();
                        
                        //Check para cerrar el submenu de registro
                        if (menu == 4) { break; } //Fin de check para cerrar el submenu de registro
                        
                        //Check para accesar a labs grandes
                        if (menu == 3 && isVip == false) {
                            
                            System.out.println("");
                            System.out.println("No tiene acceso a este laboratorio");
                            break;
                            
                        } //Fin de check para accesar a labs grandes
                        
                        //Control para el submenu de laboratorios
                        switch (menu) {
                            
                            case 1:
                                
                                System.out.println("");
                                
                                break;
                                
                            case 2:
                                
                                System.out.println("");
                                
                                break;
                                
                            case 3:
                                
                                System.out.println("");
                                
                                break;
                                
                            default:
                                
                                System.out.println("");
                                System.out.println("Opccion invalida, vuelva a seleccionar");
                                break;
                            
                        } //Fin de control de el submenu de laboratorios
                        
                        break;
                        
                    case 2:
                        
                        System.out.println("");
                        System.out.println("Seleccione una opcion:");
                        System.out.println("1. Observar Registro de Problemas");
                        System.out.println("2. Registrar un Problema");
                        System.out.println("3. Observar Registro de Uso");
                        System.out.println("4. Regresar");
                        
                        menu = entrada.nextInt();
                        
                        //Check para cerrar el submenu de registro
                        if (menu == 4) { break; } //Fin de check para cerrar el submenu de registro
                        
                        //Control para el submenu de registro
                        switch (menu) {
                            
                            case 1:
                                
                                System.out.println("");
                                System.out.println(registroProblemas);
                                break;
                                
                            case 2:
                                
                                System.out.println("");
                                System.out.println("Ingrese una descripcion de su problema:");
                                registroProblemas.add(entrada.next());
                                break;
                                
                            case 3:
                                
                                System.out.println("");
                                System.out.println(registroUsos);
                                break;
                                
                            default:
                                
                                System.out.println("");
                                System.out.println("Opccion invalida, vuelva a seleccionar");
                                break;
                            
                        } //Fin de control de el submenu de registro
                        
                        break;
                        
                    default:
                        
                        System.out.println("");
                        System.out.println("Opccion invalida, vuelva a seleccionar");
                        break;
                    
                } //Fin de control de el menu principal
                
            } //Fin de loop para el menu principal
            
        } //Fin de loop para mantener el sistema encendido
        
    } //Fin main
    
} // Fin clase


/*

NOTAS:

- Que tan estaticos deben ser los datos? Preguntar a Profe

*/