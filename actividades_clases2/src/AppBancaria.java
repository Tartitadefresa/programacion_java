import java.util.Scanner;

public class AppBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opciones;
        boolean salir = false;
        CuentaBancaria[] cuentas = new CuentaBancaria[5];

        do {
            System.out.println("--------MENÚ---------");
            System.out.println("Seleccione una opción: ");
            System.out.println("1. Crear nueva cuenta");
            System.out.println("2. Crear usuario y asignar a una cuenta");
            System.out.println("3. Obtener cuentas de usuario");
            System.out.println("4. Ingresar cantidad en cuenta");
            System.out.println("5. Retirar cantidad de cuenta");
            System.out.println("6. Mostrar información del banco");
            System.out.println("7. Salir");
            
            opciones = scanner.nextInt();

            switch (opciones) {
                case 1:
                    System.out.println("Introduce el identificador de la cuenta bancaria:");
                    int identificador = scanner.nextInt();

                    CuentaBancaria nuevaCuenta = new CuentaBancaria(identificador);

                    for (int i = 0; i < cuentas.length; i++) {
                        if (cuentas[i] == null) {
                            cuentas[i] = nuevaCuenta;
                            System.out.println("Cuenta creada con éxito.");
                            break;
                        }
                    }

                    break;
                case 2:
                    System.out.println("Introduce el identificador de la cuenta:");
                    int idCuenta = scanner.nextInt();

                    if (existeCuenta(cuentas, idCuenta)) {
                        System.out.println("Introduce el nombre del usuario:");
                        String nombre = scanner.next();
                        System.out.println("Introduce los apellidos del usuario:");
                        String apellidos = scanner.next();
                        System.out.println("Introduce la edad del usuario:");
                        int edad = scanner.nextInt();
                        System.out.println("Introduce el dni del usuario:");
                        String dni = scanner.next();

                        Persona nuevoUsuario = new Persona(nombre, apellidos, edad, dni);

                        for (int i = 0; i < cuentas.length; i++) {
                            if (cuentas[i].getIdentificador() == idCuenta) {
                                cuentas[i].añadirPropietario(nuevoUsuario);
                                break;
                            }
                        }
                    }
                    
                    break;
                case 3:
                    System.out.println("Introduce el dni del usuario:");
                    String dni = scanner.next();

                    for (int i = 0; i < cuentas.length; i++) {
                        if (cuentas[i] != null) {
                            Persona[] propietarios = cuentas[i].getPropietarios();
                            for (int j = 0; j < propietarios.length; j++) {
                                if (propietarios[j] != null && propietarios[j].getDni().equals(dni)) {
                                    System.out.println(cuentas[i].getInfoCuenta());
                                }
                            }
                        }
                    }

                    break;
                case 4:
                    System.out.println("Introduce el identificador de la cuenta:");
                    idCuenta = scanner.nextInt();

                    if (existeCuenta(cuentas, idCuenta)) {
                        System.out.println("Introduce la cantidad a ingresar:");
                        double cantidad = scanner.nextDouble();

                        for (int i = 0; i < cuentas.length; i++) {
                            if (cuentas[i].getIdentificador() == idCuenta) {
                                cuentas[i].ingresarCantidad(cantidad);
                                break;
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Introduce el identificador de la cuenta:");
                    idCuenta = scanner.nextInt();

                    if (existeCuenta(cuentas, idCuenta)) {
                        System.out.println("Introduce la cantidad a retirar:");
                        double cantidad = scanner.nextDouble();

                        for (int i = 0; i < cuentas.length; i++) {
                            if (cuentas[i].getIdentificador() == idCuenta) {
                                cuentas[i].retirarCantidad(cantidad);
                                break;
                            }
                        }
                    }
                    break;
                case 6:
                    for (int i = 0; i < cuentas.length; i++) {
                        if (cuentas[i] != null) {
                            System.out.println(cuentas[i].getInfoCuenta());
                            Persona[] propietarios = cuentas[i].getPropietarios();
                            for (int j = 0; j < propietarios.length; j++) {
                                if (propietarios[j] != null) {
                                    String info = propietarios[j].getInfoPersona();

                                    System.out.println("Propietario " + (j + 1) + ": " + info);
                                }
                            }
                        }
                    }    

                    break;
                case 7:
                    salir = true;
                    break;
            }
        
        } while (!salir);

        scanner.close();
    }

    private static boolean existeCuenta(CuentaBancaria[] cuentas, int idCuenta) {
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i] != null && cuentas[i].getIdentificador() == idCuenta) {
                return true;
            }
        }

        return false;
    }
    
}

