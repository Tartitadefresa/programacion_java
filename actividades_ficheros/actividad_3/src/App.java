import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la ruta de la carpeta donde desea crear los archivos: ");
        String rutaCarpeta = scanner.next();

        File carpeta = new File(rutaCarpeta);

        if (!carpeta.exists() || !carpeta.isDirectory()) {
            System.out.println("La carpeta especificada no existe o no es válida.");
            return;
        }

        for (int i = 1; i <= 10; i++) {
            String nombreArchivo = "nombre(" + i + ").txt";
            File archivo = new File(carpeta, nombreArchivo);
            try {
                if (archivo.createNewFile()) {
                    System.out.println("Archivo creado: " + nombreArchivo);
                } else {
                    System.out.println("El archivo " + nombreArchivo + " ya existe.");
                }
            } catch (IOException e) {
                System.out.println("Error al crear el archivo " + nombreArchivo + ": " + e.getMessage());
            }
        }

        scanner.close();
    }
}
