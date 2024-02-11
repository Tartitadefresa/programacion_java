import java.util.Scanner;

public class AppCalculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float operando1;
        float operando2;
        String operacion;
        int opciones;
        boolean salir = false;
        Calculadora calculadora = new Calculadora(0, 0, "");

        do {
            System.out.println("--------CALCULADORA---------");
            System.out.println("Seleccione una opción: ");
            System.out.println("1. Introducir operación");
            System.out.println("2. Introducir operando");
            System.out.println("3. Realizar operación");
            System.out.println("4. Salir");

            opciones = scanner.nextInt();

            switch (opciones) {
                case 1:
                    System.out.println("Introduzca la operación en símbolos: ");
                    operacion = scanner.next();
                    calculadora.setOperacion(operacion);
                    break;
                case 2:
                    System.out.println("Introduzca el operando 1: ");
                    operando1 = scanner.nextFloat();
                    System.out.println("Introduzca el operando 2: ");
                    operando2 = scanner.nextFloat();
                    calculadora.setOperando(1, operando1);
                    calculadora.setOperando(2, operando2);
                    break;
                case 3:
                    System.out.println("El resultado es: " + calculadora.obtenerResultado());
                    break;
                case 4:
                    salir = true;
                    break;
            }

        } while (!salir);
        scanner.close();
    }
}
