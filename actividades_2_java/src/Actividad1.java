import javax.swing.JOptionPane;

public class Actividad1 {
    public static void main(String[] args) {    
        
        String message = "";
       //Inicializo la variable a la vez que la asigno
        String strNumber = JOptionPane.showInputDialog(null, "Introduce un número", null, 3);
        
        int number = Integer.parseInt(strNumber);
        if (number >= 0 && number %2 == 0){     //para asignar =, para comparar ==
            message = "El número es positivo y par";
            
        } else if (number >= 0 && number %2 != 0) {
           message = "El número es positivo e impar";

        }
        if (number < 0 && number %2 == 0 ){
            message = "El número es negativo y par";
        
        } else if (number < 0 && number %2 != 0){
            message = "El número es negativo e impar";
        }
        JOptionPane.showMessageDialog(null, message, "Resultado", 3);    
        
    }
    
}


