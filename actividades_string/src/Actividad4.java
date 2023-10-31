import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;

        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();
        sc.close();

        for(int i = 0; i < frase.length(); i++) {
            switch (frase.charAt(i)) {
                case 'a':
                    contA++;
                    break;
                case 'e':
                    contE++;
                    break;
                case 'i':
                    contI++;
                    break;
                case 'o':
                    contO++;
                    break;
                case 'u':
                    contU++;
                    break;
            }
        }

        System.out.println("El número total de a es: " + contA);
        System.out.println("El número total de e es: " + contE);
        System.out.println("El número total de i es: " + contI);
        System.out.println("El número total de o es: " + contO);
        System.out.println("El número total de u es: " + contU);
    }
}
