import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;

        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();

        sc.close();

        for(int i = 0; i < frase.length(); i++) {
            if ("aeiou".indexOf(frase.charAt(i)) != -1) {    
                cont++;
            }
        }

        System.out.println("El número total de vocales es: " + cont);

    }
}
