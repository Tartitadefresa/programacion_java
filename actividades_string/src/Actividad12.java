import java.util.Scanner;

public class Actividad12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();

        System.out.println("Introduce una palabra:");
        String palabra = sc.nextLine();
        
        sc.close();

        StringBuilder fraseSB = new StringBuilder(frase);

        String[] palabras = frase.split(" ");

        boolean encontrada = false;

        for (String palabraString : palabras) {
            if (palabra.equals(palabra)) {
                encontrada = true;
                break;
            }
        }

        if (encontrada) {
            System.out.println("La palabra '" + palabra + "' se encuentra en la frase.");
        } else {
            System.out.println("La palabra '" + palabra + "' no se encuentra en la frase.");
        }
    }
}
