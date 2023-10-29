import java.lang.reflect.Array;

import javax.swing.JOptionPane;

public class Actividad3 {
    public static void main(String[] args) {
        int[] array = new int[5];
        int i = 0;
        String message = "Los números introducidos han sido:";

        do {
            String input = JOptionPane.showInputDialog(null, "Introduce el número " + (i + 1), null);
            array[i] = Integer.parseInt(input);
            i++;

        } while (i < Array.getLength(array));

        
        for (int j = 0; j < Array.getLength(array); j++) {
            message = message + "\n" + array[j];
        }

        JOptionPane.showMessageDialog(null, message, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
