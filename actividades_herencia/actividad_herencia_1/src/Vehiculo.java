import java.util.Scanner;

public class Vehiculo {
    private String modelo;
    private String marca;
    private int numeroRuedas;
    private double kilometrosRecorridos;

    public Vehiculo(
        String modelo, 
        String marca, 
        int numeroRuedas, 
        double kilometrosRecorridos
    ) {
        super();
        this.modelo = modelo;
        this.marca = marca;
        this.numeroRuedas = numeroRuedas;
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String tipoCombustible() {
        return "Carburante";
    }

    public static Vehiculo crearVehiculo(Scanner sc) {
        Vehiculo vehiculo = null;

        System.out.println("¿Qué tipo de vehículo quieres crear?");
        String tipo = sc.next();

        System.out.println("Introduce el modelo del vehículo");
        String modelo = sc.next();

        System.out.println("Introduce la marca del vehículo");
        String marca = sc.next();

        switch(tipo) {
            case "Coche":
                System.out.println("Introduce el diámetro de las ruedas del vehículo");
                double diametroRueda = sc.nextDouble();

                vehiculo = new Coche(
                    modelo, 
                    marca, 
                    4, 
                    0, 
                    diametroRueda
                );
            break;

            case "Moto":
                System.out.println("Introduce el número de conductores permitidos");
                int conductoresPermitidos = sc.nextInt();

                vehiculo = new Moto(
                    modelo, 
                    marca, 
                    2, 
                    0, 
                    conductoresPermitidos
                );
            break;

            case "Bicicleta":
                System.out.println("Introduce el tipo de bicicleta");
                String tipoBicicleta = sc.next();
                vehiculo = new Bicicleta(
                    modelo, 
                    marca, 
                    2, 
                    0, 
                    tipoBicicleta
                );
            break;

            default:
                System.out.println("Tipo de vehículo no válido");
            break;
        }

        return vehiculo;
    }

    public static void imprimirVehiculos(Vehiculo[] vehiculos) {
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] != null) {
                System.out.println(vehiculos[i].toString());
            }
        }
    }
    
}