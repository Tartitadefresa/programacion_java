import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        do {
            System.out.println("------MENÚ------");
            System.out.println("1. Mostrar lista de animales");
            System.out.println("2. Mostrar todos los datos de un animal concreto");
            System.out.println("3. Insertar animales en el inventario");
            System.out.println("4. Eliminar animales del inventario");
            System.out.println("5. Vaciar el inventario");
            System.out.println("6. Salir");

            int opciones = sc.nextInt();
            
            switch (opciones) {
                case 1:
                    inventario.mostrarAnimales();
                    break;
            
                case 2:
                    System.out.println("Introduce el nombre del animal:");
                    String nombre = sc.next();

                    inventario.mostrarDatos(nombre);
                    break;

                case 3:
                    insertarAnimal(inventario, sc);
                    break;

                case 4:
                    System.out.println("Introduce el nombre del animal a eliminar: ");
                    String animalEliminado = sc.next();
                    inventario.eliminar(animalEliminado);
                    break;

                case 5:
                    inventario.vaciar();
                    break;

                case 6:
                    salir = true;
            }

        } while (!salir);

        sc.close();

    }

    public static void insertarAnimal(Inventario inventario, Scanner sc) {
        Mascotas mascota;

        System.out.println("Introduce el nombre de la mascota:");
        String nombre = sc.next();

        System.out.println("Introduce la edad de la mascota:");
        int edad = sc.nextInt();

        System.out.println("Introduce la fecha de nacimiento de la mascota:");
        String fechaNacimiento = sc.next();

        System.out.println("Introduce el tipo de animal (Perro, Gato, Loro, Canario):");
        String tipo = sc.next();

        switch (tipo) {
            case "Perro":
                System.out.println("Introduce la raza del perro: ");
                String raza = sc.next();

                System.out.println("¿El perro tiene pulgas?");
                boolean pulgas = sc.nextBoolean();
                
                mascota = new Perro(nombre, edad, fechaNacimiento, raza, pulgas);

                break;

            case "Gato":
                System.out.println("Introduce el color del gato: ");
                String color = sc.next();

                System.out.println("¿El gato tiene el pelo largo?");
                boolean peloLargo = sc.nextBoolean();

                mascota = new Gato(nombre, edad, fechaNacimiento, color, peloLargo);
                break;

            case "Loro":
                System.out.println("Introduce el origen del loro: ");
                String origen = sc.next();

                System.out.println("¿El loro habla? ");
                boolean habla = sc.nextBoolean();

                mascota = new Loro(nombre, edad, fechaNacimiento, origen);

                break;

            case "Canario":
                System.out.println("Introduce el color del canario: ");
                String colorCanario = sc.next();

                System.out.println("¿El canario canta?");
                boolean canta = sc.nextBoolean();

                mascota = new Canario(nombre, edad, fechaNacimiento, colorCanario);

                break;

            default:
                System.out.println("Tipo de animal no válido");
                return;
        }

        inventario.insertar(mascota);
        System.out.println("Mascota insertada");
    }
}
