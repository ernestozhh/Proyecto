
package proyecto;

import javax.swing.JOptionPane;

public class ui {
    
    public static String getUser() {
    
        return JOptionPane.showInputDialog(null, "Ingrese su usuario:", "Sistema de Reserva de Laboratorios", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    public static String getPass() {
        
        return JOptionPane.showInputDialog(null, "Ingrese su clave:", "Sistema de Reserva de Laboratorios", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}

