import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opcionSeleccionada = 0;
        String[] arrayPalabras = almacenarArray(scanner);
       
        do {
            
                
           
           
        
            
            System.out.println("La palabra más larga de todas las introducidas es:");

            System.out.println("La palabra más corta de todas las introducidas es:");

            switch (opcionSeleccionada) {
                case 1:
                    
                    break;
            
                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;
            } scanner.close();
        } while (!false);
    
    }

    public static String[] almacenarArray(String arrayPalabras, Scanner scanner) {
        String[] palabras = new String[10];
        
        System.out.println("Ingrese 10 palabras:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            palabras[i] = scanner.next();
        }

        return palabras;
    }
}
