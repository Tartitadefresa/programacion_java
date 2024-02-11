import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int[] arrayEnteros = new int[10];
        
        
        do {
            Utils.rellenaArray(arrayEnteros);
            Utils.imprimirValoresArray(arrayEnteros);
            Utils.imprimeMenu();

            int opcionSeleccionada = sc.nextInt();
            switch (opcionSeleccionada) {
                case 1:
                    Utils.descartarNumerosPares(arrayEnteros, true);            
                    Utils.imprimirValoresArray(arrayEnteros);

                    break;
                case 2:
                    Utils.descartarNumerosPares(arrayEnteros, false);            
                    Utils.imprimirValoresArray(arrayEnteros);

                    break;
                
                case 3:
                    salir = true;
            }
            
        } while (!salir);

        sc.close();
    }
}
