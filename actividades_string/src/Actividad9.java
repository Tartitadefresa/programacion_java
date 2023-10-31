import java.util.Scanner;

public class Actividad9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
               
        System.out.println("Introduce un nombre:");
        String frase = sc.nextLine();
        sc.close();
        
        for(int i = 0; i < frase.length(); i++) {
            String letra = frase.substring(0, i + 1);

            System.out.println(letra);
        }
    }
}
