import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        ArrayList<Producto> listaProductos = new ArrayList<Producto>();
        boolean salir = false;
        Scanner scanner = new Scanner(System.in);

        while (!salir) {
            System.out.println("1. Registrar un nuevo producto");
            System.out.println("2. Eliminar un producto");
            System.out.println("3. Buscar un producto");
            System.out.println("4. Salir");

            int opciones = scanner.nextInt();

            switch (opciones) {
                case 1:
                    System.out.println("Introduce el código del producto:");
                    String codigo = scanner.next();

                    System.out.println("Introduce el nombre del producto:");
                    String nombre = scanner.next();

                    System.out.println("Introduce el precio del producto:");
                    float precio = scanner.nextFloat();

                    Producto nuevoProducto = new Producto(codigo, nombre, precio);

                    listaProductos.add(nuevoProducto);
                    System.out.println("Producto añadido correctamente");

                    break;

                case 2:
                    System.out.println("Introduce el codigo del producto:");
                    String codigoEliminado = scanner.next();

                    for (int i = 0; i < listaProductos.size(); i++) {
                        if (listaProductos.get(i).getCodigo().equals(codigoEliminado)) {
                            listaProductos.remove(i);
                            System.out.println("Producto eliminado correctamente");
                            break;
                        }
                    }

                    break;

                case 3:
                    System.out.println("Introduce el nombre del producto:");
                    String buscarProducto = scanner.next();

                    for (int i = 0; i < listaProductos.size(); i++) {
                        if (listaProductos.get(i).getNombre().equals(buscarProducto)) {
                            System.out.println("Se ha encontrado el producto");
                        } else {
                            System.out.println("No se ha encontrado el producto");
                        }
                    }
                    
                    break;
            
                case 4:
                    salir = true;
                    break;
            }
            
        }

        scanner.close();
    }

}
