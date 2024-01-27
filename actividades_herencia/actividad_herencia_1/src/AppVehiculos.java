import java.util.Scanner;

public class AppVehiculos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        Vehiculo[] vehiculos = new Vehiculo[4];

        do {
            System.out.println("GESTIÓN DE VEHÍCULOS");
            System.out.println("=====================");
            System.out.println("1. Crear vehículo");
            System.out.println("2. Eliminar vehículo");
            System.out.println("3. Imprimir tipos de combustible");
            System.out.println("4. Imprimir información de vehículos");
            System.out.println("5. Salir");

            int opciones = sc.nextInt();

            switch (opciones) {
                case 1:
                    Vehiculo vehiculo = Vehiculo.crearVehiculo(sc);
                    System.out.println(vehiculo);

                    if (vehiculo != null) {
                        for (int i = 0; i < vehiculos.length; i++) {
                            if (vehiculos[i] == null) {
                                vehiculos[i] = vehiculo;
                                break;
                            }
                        }
                    }
                    break;
            
                case 2:
                    System.out.println("Introduce el número del vehículo");
                    int numeroVehiculo = sc.nextInt();

                    if (numeroVehiculo > vehiculos.length - 1) {
                        System.out.println("No existe ese vehículo");
                    } else {
                        vehiculos[numeroVehiculo] = null;
                        System.out.println("Vehículo eliminado");
                    }
                    break;
                
                case 3:
                    for (int i = 0; i < vehiculos.length; i++) {
                        if (vehiculos[i] != null) {
                            System.out.println(vehiculos[i].tipoCombustible());
                        }
                    }
                    break;

                case 4:
                    Vehiculo.imprimirVehiculos(vehiculos);
                    break;

                case 5:
                    salir = true;
                    break;
            }


        } while (!salir);

        sc.close();
    }
}
