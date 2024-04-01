import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce la ruta del directorio: ");
        String rutaDirectorio = scanner.next();

        File directorio = new File(rutaDirectorio);

        // Verificar si el directorio existe
        if (!directorio.exists() || !directorio.isDirectory()) {
            System.out.println("El directorio especificado no existe o no es válido.");
            return;
        }

        System.out.print("Ingrese la extensión de archivo (sin el punto): ");
        String extension = scanner.next();

        File[] archivos = directorio.listFiles();
        
        if (archivos == null) {
            System.out.println("El directorio está vacío.");
            return;
        }
        
        System.out.println("Archivos con la extensión ." + extension + " en el directorio '" + rutaDirectorio + "':");
        for (File archivo : archivos) {
            if (archivo.isFile() && archivo.getName().endsWith("." + extension)) {
                System.out.println(archivo.getName());
            }
        }

        scanner.close();
    }
}