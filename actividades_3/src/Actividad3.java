import javax.swing.JOptionPane;

public class Actividad3 {
    public static void main(String[] args) {
        
        String cadenaIntroducida = JOptionPane.showInputDialog(null, "Introduce un texto", "Actividad 3", JOptionPane.INFORMATION_MESSAGE);
        
        if (cadenaIntroducida.length() == 0) {
            cadenaIntroducida = "Nombre no introducido";
        }
        JOptionPane.showMessageDialog(null, cadenaIntroducida , "La cadena introducida es: ", JOptionPane.INFORMATION_MESSAGE);

    }
}
