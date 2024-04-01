import java.io.File;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el directorio:");
        String directorio = scanner.next();
        
        File dir = new File(directorio);
        
        if (dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles();
            
            for (File file : files) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("El directorio no existe o no es válido.");
        }
        scanner.close();
    }
}