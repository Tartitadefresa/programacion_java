import javax.swing.JOptionPane;

public class Actividad4 {
    public static void main(String[] args) {
                
        String message = "Se ha presionado";
        int option = JOptionPane.showConfirmDialog(null, "¿Lo confirmas?", "Seleccionar una Opción", JOptionPane.YES_NO_CANCEL_OPTION);


        if (option == JOptionPane.YES_OPTION) {
            message = message + " la opción Sí";
        } else if (option == JOptionPane.NO_OPTION){
            message = message + " la opción No";
        } else {
            message = message + " cancelar";
        }

        JOptionPane.showMessageDialog(null, message, "Resultado", JOptionPane.INFORMATION_MESSAGE);


    
    }
}
