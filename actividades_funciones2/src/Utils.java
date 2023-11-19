import java.util.Arrays;

public class Utils {

    public static void rellenaArray(int arrayEnteros[]) {
        for (int i = 0; i < arrayEnteros.length; i++) {
            int random = (int)(Math.random() * 101);
            arrayEnteros[i] = random;
        }
    }

    public static void imprimeMenu() {
        System.out.println("Selecciona una opción:");
        System.out.println("1. Descartar números pares");
        System.out.println("2. Descartar números impares");
        System.out.println("3. Salir");
    }

    public static int[] descartarNumerosPares(int arrayEnteros[], boolean descartar) {
        for (int i = 0; i < arrayEnteros.length; i++) {

            if (descartar == true) {
                if (arrayEnteros[i]%2 == 0) {
                    arrayEnteros[i] = -1;
                }
            } else {
                if (arrayEnteros[i]%2 != 0) {
                    arrayEnteros[i] = -1;
                }
            }
        }

        return arrayEnteros;
    }

    public static void imprimirValoresArray(int[] arrayEnteros) {
        System.out.println(Arrays.toString(arrayEnteros));
    }
}
