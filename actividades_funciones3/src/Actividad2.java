import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        String[] arrayPalabras = new String[0];
        
        
        
        do {
            int opcionSeleccionada = 0;

            System.out.println("Selecciona una opción:");
            System.out.println("1. Creación de array de textos");
            System.out.println("2. Contar palabras con letra");
            System.out.println("3. Obtener la palabra más larga");
            System.out.println("4. Obtener la palabra más corta");
            System.out.println("5. Obtener la palabra que contiene la subcadena");
            System.out.println("6. Salir");

            opcionSeleccionada = scanner.nextInt();
            
             switch (opcionSeleccionada) {
                case 1:
                    arrayPalabras = almacenarArray(scanner);
                    break;
            
                case 2:
                    System.out.print("Introduce la letra a buscar: ");
                    char letraABuscar = scanner.next().charAt(0);
                    int contadorPalabras = contarPalabrasConLetra(arrayPalabras, letraABuscar);
                    System.out.println("La cantidad de palabras que contienen la letra '" + letraABuscar + "' es: " + contadorPalabras);
                    break;

                case 3:
                    String palabraMasLarga = getPalabraMasLarga(arrayPalabras);
                    System.out.println("La palabra más larga de todas las introducidas es: " + palabraMasLarga);
                    break;

                case 4:
                    String palabraMasCorta = getPalabraMasCorta(arrayPalabras);
                    System.out.println("La palabra más corta de todas las introducidas es: " + palabraMasCorta);
                    break;

                case 5:
                    System.out.print("Introduce la subcadena a buscar: ");
                    String subcadenaABuscar = scanner.next();
                    String palabraConSubcadena = getPalabraConSubcadena(arrayPalabras, subcadenaABuscar);
                    System.out.println("La primera palabra que contiene la subcadena '" + subcadenaABuscar + "' es: " + palabraConSubcadena);
                    break;

                case 6:
                    salir = true;
                    break;
            }
                
        }while (!salir);

        scanner.close();
            
    }


    public static String[] almacenarArray(Scanner scanner) {
        String[] palabras = new String[10];
        
        System.out.println("Ingrese 10 palabras:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            palabras[i] = scanner.next();
        }

        return palabras;
    }

    private static int contarPalabrasConLetra(String[] arrayPalabras, char letra) {
        int cont = 0;
        for (String palabra : arrayPalabras) {
            if (palabra.contains(String.valueOf(letra))) {
                cont++;
            }
        }
        return cont;
    }

    private static String getPalabraMasLarga(String[] arrayPalabras) {
        String palabraMasLarga = arrayPalabras[0];
        for (String palabra : arrayPalabras) {
            if (palabra.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabra;
            }
        }
        return palabraMasLarga;
    }

    private static String getPalabraMasCorta(String[] arrayPalabras) {
        String palabraMasCorta = arrayPalabras[0];
        for (String palabra : arrayPalabras) {
            if (palabra.length() < palabraMasCorta.length()) {
                palabraMasCorta = palabra;
            }
        }
        return palabraMasCorta;
    }

    private static String getPalabraConSubcadena(String[] arrayPalabras, String subcadena) {
        for (String palabra : arrayPalabras) {
            if (palabra.contains(subcadena)) {
                return palabra;
            }
        }
        return "No se ha encontrado ninguna palabra con la subcadena";
    }
}
