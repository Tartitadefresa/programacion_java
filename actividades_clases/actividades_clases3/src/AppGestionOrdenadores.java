import java.util.Scanner;

public class AppGestionOrdenadores {
    public static void main(String[] args) {
        int opciones;
        boolean salir = false;
        Ordenador[] ordenadores = new Ordenador[5];
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("--------GESTIÓN DE ORDENADORES---------");
            System.out.println("Seleccione una opción: ");
            System.out.println("1. Crear nuevo ordenador");
            System.out.println("2. Encender ordenador");
            System.out.println("3. Apagar ordenador");
            System.out.println("4. Añadir datos a el ordenador");
            System.out.println("5. Eliminar datos de el ordenador");
            System.out.println("6. Mostrar información de el ordenador");
            System.out.println("7. Salir");

            opciones = scanner.nextInt();
            

            switch (opciones) {
                case 1:
                    String nombre = inputNombrePC(scanner);
                    Ordenador newOrdenador = new Ordenador(nombre);
                    ordenadores = insertarOrdenador(ordenadores, newOrdenador);
                    break;
                case 2:
                    String nombrePc = inputNombrePC(scanner);
                    Ordenador ordenador = buscarOrdenador(ordenadores, nombrePc);
                    if (ordenador != null) {
                        ordenador.encender();
                    } else {
                        System.out.println("No se ha encontrado el ordenador");
                    }
                    break;

                case 3:
                    String nombrePc2 = inputNombrePC(scanner);
                    Ordenador ordenador2 = buscarOrdenador(ordenadores, nombrePc2);
                    if (ordenador2 != null) {
                        ordenador2.apagar();
                    } else {
                        System.out.println("No se ha encontrado el ordenador");
                    }
                    break;
                case 4:
                    String nombrePc3 = inputNombrePC(scanner);
                    Ordenador ordenador3 = buscarOrdenador(ordenadores, nombrePc3);
                    if (ordenador3 != null) {
                        System.out.println("Introduzca los datos a añadir: ");
                        int datos = scanner.nextInt();
                        ordenador3.añadirDatos(datos);
                    } else {
                        System.out.println("No se ha encontrado el ordenador");
                    }
                    break;
                case 5:
                    String nombrePc4 = inputNombrePC(scanner);
                    Ordenador ordenador4 = buscarOrdenador(ordenadores, nombrePc4);
                    if (ordenador4 != null) {
                        System.out.println("Introduzca los datos para borrar: ");
                        int datos = scanner.nextInt();
                        ordenador4.eliminarDatos(datos);
                    } else {
                        System.out.println("No se ha encontrado el ordenador");
                    }
                    break;

                case 6:
                    String nombrePc5 = inputNombrePC(scanner);
                    Ordenador ordenador5 = buscarOrdenador(ordenadores, nombrePc5);
                    if (ordenador5 != null) {
                        System.out.println(ordenador5);
                        System.out.println(ordenador5.getInfoOrdenador());
                    } else {
                        System.out.println("No se ha encontrado el ordenador");
                    }
                    break;
                default:
                    break;
            }
        } while (!salir);
        scanner.close(); 
    }

    private static Ordenador[] insertarOrdenador(Ordenador[] ordenadores, Ordenador ordenador) {
        for (int i = 0; i < ordenadores.length; i++) {
            if (ordenadores[i] == null) {
                ordenadores[i] = ordenador;
                break;
            }
        }

        return ordenadores;
    }

    private static String inputNombrePC(Scanner scanner) {
        System.out.println("Introduzca el nombre del ordenador: ");
        String nombre = scanner.next();
        return nombre;
    }

    private static Ordenador buscarOrdenador(Ordenador[] ordenadores, String nombrePc) {
        Ordenador ordenador = null;
        for (int i = 0; i < ordenadores.length; i++) {
            if (ordenadores[i] != null && ordenadores[i].getNombre().equals(nombrePc)) {
                ordenador = ordenadores[i];
                break;
            }
        }

        return ordenador;
    }
}


