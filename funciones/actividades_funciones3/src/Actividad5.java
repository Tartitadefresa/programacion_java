import java.util.Scanner;

public class Actividad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;


        do {
            System.out.println("Introduce un número");
            int numeroPar = sc.nextInt();

            if (numeroPar % 2 == 0) {
                float media = calculoMedia(numeroPar);

                if (media >= 10) {
                    System.out.println("La media de sus divisores es " + media + " y esta es mayor que 10");
                } else {
                    System.out.println("La media de sus divisores es " + media + " y es menor que 10");
                }
                cont++;
            }

        } while (cont < 4);
        sc.close();

    }

    public static float calculoMedia(int numero) {
        float media = 0;
        int cont = 0;

        for (int i = 1; i <= numero; i++) {
             if (numero % i == 0) {
                media = media + i;
                cont++;
             }
        }

        media = media / cont;

        return media;
    }
        
}
