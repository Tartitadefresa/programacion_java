import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Debe proporcionar la ruta al archivo y la palabra a eliminar como argumentos de línea de comandos.");
            return;
        }

        String filePath = args[0];
        String wordToRemove = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(getOutputFilePath(filePath)))) {

            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll(wordToRemove, "");
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Se ha eliminado la palabra '" + wordToRemove + "' del archivo correctamente.");

        } catch (IOException e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }
    }

    private static String getOutputFilePath(String filePath) {
        int dotIndex = filePath.lastIndexOf(".");
        String fileName = filePath.substring(0, dotIndex);
        String fileExtension = filePath.substring(dotIndex);
        return fileName + "_2" + fileExtension;
    }
}