import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        String rutaPares = "pares.txt";
        String rutaImpares = "impares.txt";
        String rutaOrdenado = "ordenado.txt";

        List<Integer> numerosOrdenados = fusionarArchivos(rutaPares, rutaImpares);

        escribirArchivoOrdenado(rutaOrdenado, numerosOrdenados);

        System.out.println("Se ha creado el archivo '" + rutaOrdenado + "' con los números ordenados.");
    }

    private static List<Integer> fusionarArchivos(String rutaPares, String rutaImpares) {
        List<Integer> numerosOrdenados = new ArrayList<>();

        try (BufferedReader readerPares = new BufferedReader(new FileReader(rutaPares));
             BufferedReader readerImpares = new BufferedReader(new FileReader(rutaImpares))) {

            String lineaPares = readerPares.readLine();
            String lineaImpares = readerImpares.readLine();

            while (lineaPares != null && lineaImpares != null) {
                int numPares = Integer.parseInt(lineaPares);
                int numImpares = Integer.parseInt(lineaImpares);

                if (numPares < numImpares) {
                    numerosOrdenados.add(numPares);
                    lineaPares = readerPares.readLine();
                } else {
                    numerosOrdenados.add(numImpares);
                    lineaImpares = readerImpares.readLine();
                }
            }

            while (lineaPares != null) {
                int numPares = Integer.parseInt(lineaPares);
                numerosOrdenados.add(numPares);
                lineaPares = readerPares.readLine();
            }

            while (lineaImpares != null) {
                int numImpares = Integer.parseInt(lineaImpares);
                numerosOrdenados.add(numImpares);
                lineaImpares = readerImpares.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error al leer los archivos: " + e.getMessage());
        }

        return numerosOrdenados;
    }

    private static void escribirArchivoOrdenado(String rutaOrdenado, List<Integer> numerosOrdenados) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaOrdenado))) {
            for (int num : numerosOrdenados) {
                writer.write(Integer.toString(num));
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo ordenado: " + e.getMessage());
        }
    }
}
