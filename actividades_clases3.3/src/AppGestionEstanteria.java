import java.util.Scanner;

public class AppGestionEstanteria {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Estanteria estanteria = null;
        boolean salir = false;

        do {
            printMenu();
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce un identificador:");
                    int id = scanner.nextInt();

                    System.out.println("Introduce una descripción:");
                    String descripcion = scanner.next();

                    System.out.println("Introduce el ancho:");
                    float ancho = scanner.nextFloat();

                    System.out.println("Introduce el alto:");
                    float alto = scanner.nextFloat();

                    estanteria = new Estanteria(id, descripcion, ancho, alto);
                    break;
            
                case 2:
                    if (estanteria == null) {
                        System.out.println("Primero crea una estantería");
                        break;
                    }

                    System.out.println("Introduce un identificador:");
                    int idArticulo = scanner.nextInt();

                    System.out.println("Introduce un nombre:");
                    String nombre = scanner.next();

                    System.out.println("Introduce el peso:");
                    float peso = scanner.nextFloat();

                    Articulos articulo = new Articulos(idArticulo, nombre, peso);
                    estanteria.añadirArticulo(articulo);
                    break;

                case 3:
                    if (estanteria == null) {
                        System.out.println("Primero crea una estantería");
                        break;
                    }

                    System.out.println("Introduce un identificador:");
                    int idArticuloEliminar = scanner.nextInt();

                    boolean res = estanteria.eliminarArticulo(idArticuloEliminar);

                    if (res) {
                        System.out.println("Artículo eliminado");
                    } else {
                        System.out.println("No se ha encontrado el artículo");
                    }

                    break;

                case 4:
                    if (estanteria == null) {
                        System.out.println("Primero crea una estantería");
                        break;
                    }

                    System.out.println(estanteria.toString());
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            
        } while(!salir);

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("1. Crear estantería");
        System.out.println("2. Añadir artículo");
        System.out.println("3. Eliminar artículo");
        System.out.println("4. Mostrar estantería");
        System.out.println("5. Salir");
    }
}
