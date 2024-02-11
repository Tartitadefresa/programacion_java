import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numeroIntroducido = sc.nextInt();

        imprimeCuenta(numeroIntroducido);
        sc.close();
    }

    public static void imprimeCuenta(int numeroIntroducido) {
        String numeroStr = Integer.toString(numeroIntroducido);
        char primerDigito = numeroStr.charAt(0);

        String numeroSinPrimerDigito = numeroStr.substring(1);

        System.out.println(primerDigito);

        if (!numeroSinPrimerDigito.equals("")) {
            imprimeCuenta(Integer.parseInt(numeroSinPrimerDigito));
        }
    }
}
