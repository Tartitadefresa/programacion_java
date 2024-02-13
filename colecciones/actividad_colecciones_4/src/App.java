import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opciones;

        do {
            System.out.println("Menú:");
            System.out.println("1. Añadir un número");
            System.out.println("2. Buscar un número");
            System.out.println("3. Modificar un número");
            System.out.println("4. Eliminar un número");
            System.out.println("5. Insertar un número en una posición dada");
            System.out.println("0. Salir");
            opciones = scanner.nextInt();

            switch (opciones) {
                case 1:
                    System.out.print("Introduce un número: ");
                    double numeroAñadido = scanner.nextDouble();
                    numeros.add(numeroAñadido);
                    System.out.println("Número añadido satisfactoriamente.");
                    break;
                case 2:
                    System.out.print("Introduce un número a buscar: ");
                    double numeroBuscado = scanner.nextDouble();
                    int index = numeros.indexOf(numeroBuscado);
                    if (index != -1) {
                        System.out.println("Número encontrado en el index " + index);
                    } else {
                        System.out.println("Número no encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Introduce el index del número a modificar: ");
                    int indexModificado = scanner.nextInt();
                    if (indexModificado >= 0 && indexModificado < numeros.size()) {
                        System.out.print("Introduce el nuevo valor: ");
                        double nuevoValor = scanner.nextDouble();
                        numeros.set(indexModificado, nuevoValor);
                        System.out.println("Número modificado satisfactoriamente.");
                    } else {
                        System.out.println("Index invalido.");
                    }
                    break;
                case 4:
                    System.out.print("Introduce el index del número a eliminar: ");
                    int indexEliminado = scanner.nextInt();
                    if (indexEliminado>= 0 && indexEliminado < numeros.size()) {
                        numeros.remove(indexEliminado);
                        System.out.println("Número eliminado satisfactoriamente.");
                    } else {
                        System.out.println("Index invalido.");
                    }
                    break;
                case 5:
                    System.out.print("Introduce el index para introducir un número: ");
                    int indexInsertado = scanner.nextInt();
                    if (indexInsertado >= 0 && indexInsertado <= numeros.size()) {
                        System.out.print("Introduce el número para insertar: ");
                        double numeroInsertado = scanner.nextDouble();
                        numeros.add(indexInsertado, numeroInsertado);
                        System.out.println("Número insertado satisfactoriamente.");
                    } else {
                        System.out.println("Index invalido.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción invalida.");
                    break;
            }
        } while (opciones != 0);

        scanner.close();
        
    }
}
