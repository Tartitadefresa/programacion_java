import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int[] arrayGenerada = new int[0];
        
        do {
            System.out.println("1. Genera un array");
            System.out.println("2. Devuelve el mínimo del array");
            System.out.println("3. Devuelve el máximo del array");
            System.out.println("4. Devuelve la media del array");
            System.out.println("5. El número esta en el array");
            System.out.println("6. Busca un número en un array y devuelve su posición");
            System.out.println("7. Dar la vuelta a un array");
            System.out.println("0. Salir");

            int opcionSeleccionada = sc.nextInt();

            switch (opcionSeleccionada) {
                case 0:
                    salir = true;
                    break;
                case 1:
                    System.out.println("Introduce la longitud de la array:");
                    int tamaño = sc.nextInt();
                    arrayGenerada = FuncionesArrays.generaArrayInt(tamaño);
                    System.out.println("El array es: " + Arrays.toString(arrayGenerada));

                    break;
            
                case 2:
                    int numeroMin = FuncionesArrays.minimoArrayInt(arrayGenerada);
                    System.out.println("El número mínimo es: " + numeroMin);

                    break;
                case 3:
                    int numeroMax = FuncionesArrays.maximoArrayInt(arrayGenerada);
                    System.out.println("El número máximo es: " + numeroMax);
                    break;
                case 4:
                    int media = FuncionesArrays.mediaArrayInt(arrayGenerada);
                    System.out.println("La media de todos los números de la array es: " + media);

                    break;
                case 5:
                    System.out.println("Introduce un número");
                    int numeroBuscado = sc.nextInt();
                    boolean seHaEncontrado = FuncionesArrays.estaEnArrayInt(arrayGenerada, numeroBuscado);

                    if (seHaEncontrado) {
                        System.out.println("Se ha encontrado el número");
                    } else {
                        System.out.println("No se ha encontrado el número");
                    }
                    break;
                case 6:
                    System.out.print("Introduce un número");
                    numeroBuscado = sc.nextInt();
                    int numeroArray = FuncionesArrays.posicionEnArray(arrayGenerada, numeroBuscado);

                    if (numeroArray == -1) {
                        System.out.println("No se ha encontrado el número");
                    } else {
                        System.out.println("Se ha encontrado el número");
                    }

                    break;
                case 7:
                    int[] arrayVolteada = FuncionesArrays.volteaArrayInt(arrayGenerada);
                    System.out.println("El array volteada es: " + Arrays.toString(arrayVolteada));

                    break;

            }
        } while (!salir);
        sc.close();
    }
}
