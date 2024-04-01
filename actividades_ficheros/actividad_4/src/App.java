import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la ruta de la carpeta origen: ");
        String rutaOrigen = scanner.next();

        System.out.print("Ingrese la ruta de la carpeta destino: ");
        String rutaDestino = scanner.next();

        File carpetaOrigen = new File(rutaOrigen);
        File carpetaDestino = new File(rutaDestino);

        if (!carpetaOrigen.exists() || !carpetaOrigen.isDirectory()) {
            System.out.println("La carpeta origen especificada no existe o no es válida.");
            return;
        }

        if (!carpetaDestino.exists() || !carpetaDestino.isDirectory()) {
            System.out.println("La carpeta destino especificada no existe o no es válida.");
            return;
        }

        File[] archivos = carpetaOrigen.listFiles();

        for (File archivo : archivos) {
            if (archivo.isFile()) {
                try {
                    Files.copy(archivo.toPath(), new File(carpetaDestino, archivo.getName()).toPath(),
                            StandardCopyOption.REPLACE_EXISTING);
                    System.out.println("Archivo copiado: " + archivo.getName());
                } catch (IOException e) {
                    System.out.println("Error al copiar el archivo " + archivo.getName() + ": " + e.getMessage());
                }
            }
        }

        System.out.println("Todos los archivos han sido copiados exitosamente de la carpeta origen a la carpeta destino.");

        scanner.close();
    }
}

