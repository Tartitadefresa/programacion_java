import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        Cuenta cuenta = null;
        
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Crear nueva cuenta");
            System.out.println("2. Imprimir datos cuenta");
            System.out.println("3. Establecer nueva cantidad");
            System.out.println("4. Salir");

            int opciones = scanner.nextInt();
            scanner.nextLine();

            switch (opciones) {
                case 1:
                    System.out.println("Ingrese el nombre de usuario:");
                    String titular = scanner.nextLine();
                    System.out.println("Ingrese la cantidad a almacenar:");
                    double cantidad = scanner.nextDouble();
                    scanner.nextLine();
                    cuenta = new Cuenta(titular, cantidad);
                    System.out.println("Nueva cuenta creada.");
                    break;
            
                case 2:
                    if (cuenta != null) {
                        System.out.println(cuenta.toString());
                    } else {
                        System.out.println("No se ha creado una cuenta.");
                    }
                    break;

                case 3:
                    if (cuenta != null) {
                        System.out.println("Ingrese la nueva cantidad:");
                        double nuevaCantidad = scanner.nextDouble();
                        scanner.nextLine();
                        cuenta.setCantidad(nuevaCantidad);
                        System.out.println("Cantidad actualizada.");
                    } else {
                        System.out.println("No se ha creado una cuenta.");
                    }
                    break;
                
                case 4:
                    salir = true;
                    break;
            }
        } while (!salir);
    
    scanner.close();
    }
}

