import java.util.Scanner;

import javax.swing.JOptionPane;

public class Actividad4 {
    public static void main(String[] args) {
        String[] options = {"Contar caracteres de una palabra", "Almacenar 3 enteros de una array", "Salir del programa"};

        String input = (String)JOptionPane.showInputDialog(null, "Pruebita", null, JOptionPane.INFORMATION_MESSAGE, null, options, options[1]);

        System.out.println(input);
        
        switch (input){
            case "Contar caracteres de una palabra":
                String word = JOptionPane.showInputDialog(null, "Introduce una palabra", null);
                JOptionPane.showMessageDialog(null, "La longitud de la palabra es: " + word.length(),"Resultado", JOptionPane.INFORMATION_MESSAGE );
                break;
            case "Almacenar 3 enteros de una array":
                Scanner sc = new Scanner(System.in);
                int[] array = new int[3];
                int i = 0;
                
        
        do {
            System.out.println("Introduce 3 números");
            i++;
            
            
        } while (i < array.getLength(numbers));
            JOptionPane.showMessageDialog(null, "El almacenamiento ha sido satisfactorio", "Reultado", JOptionPane.OK_OPTION);
            int  numbers = sc.nextInt();          


            break;
            
            case "Salir del programa":
           
           
            break;
        
               
        }
        
        
      
    
    
    
    }    
}
