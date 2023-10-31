import javax.swing.JOptionPane;

public class Actividad8 {
    public static void main(String[] args) {
        
        String frase = JOptionPane.showInputDialog(null, "Introduce una frase", null, JOptionPane.INFORMATION_MESSAGE);
        String letras = "";

        for(int i = 0; i < frase.length(); i++) {
            letras += frase.charAt(i) + " ";
        }

        System.out.println("La palabra " + frase + " está formada por: " + letras);
    
    }
}
