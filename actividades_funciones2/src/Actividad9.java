import java.util.Scanner;

public class Actividad9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una palabra");
        String palabra = sc.nextLine();

        if (esPalindromo(palabra)) {
            System.out.println(palabra + " es un palíndromo.");
        } else {
            System.out.println(palabra + " no es un palíndromo.");
        }
        
        sc.close();
    }

    

    public static boolean esPalindromo(String palabra) {
            
            if (palabra.length() <= 1) {
                
                return true;
            
            } else {
                char primerChar = palabra.charAt(0);
                char ultimoChar = palabra.charAt(palabra.length() - 1);
    
                return (primerChar == ultimoChar) && esPalindromo(palabra.substring(1, palabra.length() - 1));
        }

        
    }
}
