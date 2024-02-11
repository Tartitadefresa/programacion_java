import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número;");
        int numero1 = sc.nextInt();

        System.out.println("Introduce otro número:");
        int numero2 = sc.nextInt();

        System.out.println("");
        sc.close();

        if (sonAmigos(numero1, numero2)) {
            System.out.println("Los números " + numero1 + " y " + numero2 + " son amigos");
        } else {
            System.out.println("Los números " + numero1 + " y " + numero2 + " no son amigos");
        }
    }

    public static boolean sonAmigos (int numero1, int numero2) {
        int suma1 = 0;
        int suma2 = 0;
        for (int i = (numero1 - 1); i > 1; i--) {
            if (numero1%i == 0) {
                suma1 += i;
            }

        }
        for (int i = (numero2 - 1); i > 1; i--) {
            if (numero2%i == 0) {
                suma2 += i;
            }

        }

        return (suma1 - suma2) <= 3 && (suma1 - suma2) >= -3;
    }
}
