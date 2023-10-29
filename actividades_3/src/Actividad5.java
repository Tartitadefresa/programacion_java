import javax.swing.JOptionPane;

public class Actividad5 {
    public static void main(String[] args) {
        Object[] edadOptions = new Object[11];

        for (int i = 0; i < edadOptions.length; i++) {
            edadOptions[i] = i;
        }

        String name = JOptionPane.showInputDialog(null, "Introduce un nombre de usuario", "Actividad 5", JOptionPane.QUESTION_MESSAGE);
        int edad = (int)JOptionPane.showInputDialog(null, "Selecciona una edad", "Actividad 5", JOptionPane.QUESTION_MESSAGE, null, edadOptions, edadOptions[0]);

        JOptionPane.showMessageDialog(null, name + " tiene " + edad + " años.", "Actividad 5", JOptionPane.INFORMATION_MESSAGE);
    }
}
