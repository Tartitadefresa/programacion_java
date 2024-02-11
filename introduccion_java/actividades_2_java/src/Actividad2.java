import javax.swing.JOptionPane;

public class Actividad2 {
    public static void main(String[] args) {
        String dia = "";
        int number = 0;

        String strNumber = JOptionPane.showInputDialog(null, "Introduce un número del 1 al 7", null);
        
        if (strNumber == null) {
            JOptionPane.showMessageDialog(null, "Dia no seleccionado", "Error", JOptionPane.ERROR_MESSAGE);
        }
       
        number = Integer.parseInt(strNumber);

        while (number < 1 || number > 7) {
            strNumber = JOptionPane.showInputDialog(null, "Dia de la semana no válido, introduce otro número", "Error", JOptionPane.ERROR_MESSAGE);
            number = Integer.parseInt(strNumber);
        }
       
        switch (number) {
            case 1: 
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sábado";
                break;
            case 7:
                dia = "Domingo";
                break;
        }

        JOptionPane.showMessageDialog(null, "El dia de la semana es " + dia, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        
    } 
}
