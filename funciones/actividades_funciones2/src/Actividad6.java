import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcionSeleccionada = 0;
        int numeroEntero1 = 0;
        int numeroEntero2 = 0;
        float numeroDecimal1 = 0;
        float numeroDecimal2 = 0;
        
        do {
        System.out.println("----SUMA APP----");
        System.out.println("1. Realizar la suma de dos números enteros");
        System.out.println("2. Realizar la suma de dos números decimales");
        System.out.println("3. Salir");
        opcionSeleccionada = sc.nextInt();

        switch (opcionSeleccionada) {
            case 1:
                System.out.println("Introduce un número entero");
                numeroEntero1 = sc.nextInt();
                System.out.println("Introduce otro número entero");
                numeroEntero2 = sc.nextInt();
                System.out.println("La suma de los dos números es " + realizarSuma(numeroEntero1, numeroEntero2));
                break;
        
            case 2:
                System.out.println("Introduce un número decimal");
                numeroDecimal1 = sc.nextFloat();
                System.out.println("Inroduce otro número decimal");
                numeroDecimal2 = sc.nextFloat();
                System.out.println("La suma de los dos números decimales es " + realizarSuma(numeroDecimal1, numeroDecimal2));
                break;

            case 3:
                salir = true;
                break;
        }
       
        } while (!salir);
        
        sc.close();
    }

    public static int realizarSuma(int numeroEntero1, int numeroEntero2) {
        int resultadoEnteros = numeroEntero1 + numeroEntero2;
        
        return resultadoEnteros;
    }

    public static float realizarSuma(float numeroDecimal1, float numeroDecimal2) {
        float resultadoDecimales = numeroDecimal1 + numeroDecimal2;
        
        return resultadoDecimales;
    }

}
