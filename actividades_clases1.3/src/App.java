import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Cafetera cafetera = new Cafetera();
        int opciones = 0;
        boolean salir = false;

        do {
            System.out.println("1. Crear cafetera vacía");
            System.out.println("2. Crear cafetera con contenido");
            System.out.println("3. Llenar cafetera");
            System.out.println("4. Servir tazas");
            System.out.println("5. Agregar café");
            System.out.println("6. Vaciar cafetera");
            System.out.println("7. Mostrar información de la cafetera");
            System.out.println("8. Salir");

            opciones = scanner.nextInt();

            switch (opciones) {
                case 1:
                    System.out.println("Ingrese la capacidad máxima de la cafetera");
                    double capacidadMaxima = scanner.nextDouble();
                    scanner.nextLine();
                    cafetera = new Cafetera(capacidadMaxima);
                    System.out.println("Cafetera vacía creada.");
                    break;
                
                case 2:
                    System.out.println("Ingrese la capacidad máxima de la cafetera");
                    capacidadMaxima = scanner.nextDouble();
                    System.out.println("Ingrese la cantidad actual de la cafetera");
                    double cantidadActual = scanner.nextDouble();
                    scanner.nextLine();
                    cafetera = new Cafetera(capacidadMaxima, cantidadActual);
                    break;

                case 3:
                    System.out.println("Llenando cafetera...");
                    cafetera.llenarCafetera();
                    System.out.println("Cafetera llena.");
                    break;

                case 4:
                    System.out.println("Ingrese la cantidad de tazas a servir");
                    int cantidadTazas = scanner.nextInt();
                    scanner.nextLine();
                    cafetera.servirTaza(cantidadTazas);
                    System.out.println("Tazas servidas.");    
                    break;

                case 5:
                    System.out.println("Ingrese la cantidad de café a agregar");
                    int cantidadCafe = scanner.nextInt();
                    scanner.nextLine();
                    cafetera.agregarCafe(cantidadCafe);
                    System.out.println("Café agregado.");    
                    break;

                case 6:
                    System.out.println("Vaciando cafetera...");
                    cafetera.vaciarCafetera();
                    System.out.println("Cafetera vacía.");    
                    break;

                case 7:
                    System.out.println("Información de la cafetera:");
                    cafetera.imprimirInformacionCafetera();        
                    break;

                case 8:
                    salir = true;
                    break;
            }

        } while (!salir);
    
    scanner.close();
    }

}
