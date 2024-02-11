import java.util.Scanner;

public class Actividad8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int base = sc.nextInt();
        System.out.println("Introduce otro número como exponente");
        int exponente = sc.nextInt();

        System.out.println(base + " elevado a " + exponente + " es " + elevandoNumero(base, exponente));
        sc.close();
    }

    public static int elevandoNumero(int base, int exponente) {
        if (exponente == 0) {
            
            return 1;
        } else {
            
            return base * elevandoNumero(base, exponente - 1);
        }
    }
}
