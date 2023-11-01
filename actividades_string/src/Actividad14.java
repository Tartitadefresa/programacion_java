import java.util.Scanner;

public class Actividad14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Cuadrado relleno");
            System.out.println("2. Cuadrado vacío");
            System.out.println("3. Rectángulo relleno");
            System.out.println("4. Rectángulo vacío");
            System.out.println("5. Salir");
            System.out.println("Selecciona una opción:");

            opcion = sc.nextInt();
            

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el ancho del cuadrado:");
                    int anchoCuadrado = sc.nextInt();
                    dibujarCuadradoRelleno(anchoCuadrado);
                    break;
                case 2:
                    System.out.println("Introduce el ancho del cuadrado:");
                    int anchoCuadradoVacio = sc.nextInt();
                    dibujarCuadradoVacio(anchoCuadradoVacio);
                    break;
                case 3:
                    System.out.println("Introduce el ancho del rectángulo:");
                    int anchoRectangulo = sc.nextInt();
                    System.out.println("Introduce la altura del rectángulo:");
                    int alturaRectangulo = sc.nextInt();
                    dibujarRectanguloRelleno(anchoRectangulo, alturaRectangulo);
                    break;
                case 4:
                    System.out.println("Introduce el ancho del rectángulo:");
                    int anchoRectanguloVacio = sc.nextInt();
                    System.out.println("Introduce la altura del rectángulo:");
                    int alturaRectanguloVacio = sc.nextInt();
                    dibujarRectanguloVacio(anchoRectanguloVacio, alturaRectanguloVacio);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
                    break;
            }
        } while (opcion != 5);
        sc.close();
    }
    
    public static void dibujarCuadradoRelleno(int ancho) {
        StringBuilder figura = new StringBuilder();
        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < ancho; j++) {
                figura.append("* ");
            }
            figura.append("\n");
        }
        System.out.println(figura.toString());
    }

    public static void dibujarCuadradoVacio(int ancho) {
        StringBuilder figura = new StringBuilder();
        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < ancho; j++) {
                if (i == 0 || i == ancho - 1 || j == 0 || j == ancho - 1) {
                    figura.append("* ");
                } else {
                    figura.append("  ");
                }
            }
            figura.append("\n");
        }
        System.out.println(figura.toString());
    }

    public static void dibujarRectanguloRelleno(int ancho, int altura) {
        StringBuilder figura = new StringBuilder();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < ancho; j++) {
                figura.append("* ");
            }
            figura.append("\n");
        }
        System.out.println(figura.toString());
    }

    public static void dibujarRectanguloVacio(int ancho, int altura) {
        StringBuilder figura = new StringBuilder();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < ancho; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == ancho - 1) {
                    figura.append("* ");
                } else {
                    figura.append("  ");
                }
            }
            figura.append("\n");
        }
        System.out.println(figura.toString());
        
        
    }
}

