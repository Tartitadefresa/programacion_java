import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Map<String, String> usuarios = new HashMap<>();
        usuarios.put("nombreusuario1", "contraseña1");
        usuarios.put("nombreusuario2", "contraseña2");
        usuarios.put("nombreusuario3", "contraseña3");

        Scanner scanner = new Scanner(System.in);
        int intentos = 3;

        while (intentos > 0) {
            System.out.print("Nombre de usuario: ");
            String username = scanner.nextLine();
            System.out.print("Contraseña: ");
            String password = scanner.nextLine();

            if (usuarios.containsKey(username) && usuarios.get(username).equals(password)) {
                System.out.println("Ha accedido al area restringida.");
                break;
            } else {
                intentos--;
                System.out.println("Nombre de usuario o contraseña incorrectos. Intentos disponibles: " + intentos);
            }
        }

        if (intentos == 0) {
            System.out.println("Lo siento, no tiene acceso al area restringida.");
        }

        scanner.close();
        
    }
}
