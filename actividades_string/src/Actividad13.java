import java.util.Scanner;

public class Actividad13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();

        sc.close();

        StringBuilder fraseModificada = new StringBuilder(frase);

        // Reemplazar espacios por el carácter '_'
        for (int i = 0; i < fraseModificada.length(); i++) {
            if (fraseModificada.charAt(i) == ' ') {
                fraseModificada.setCharAt(i, '_');
            }
        }

        System.out.println("El resultado de la transformación es:");
        System.out.println(fraseModificada.toString());
    }
}

