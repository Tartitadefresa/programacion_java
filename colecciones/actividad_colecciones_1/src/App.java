import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> listaAmigos = new ArrayList<String>();
        listaAmigos.add("Natalia");
        listaAmigos.add("Óscar");
        listaAmigos.add("Teresa");
        listaAmigos.add("Ramón");
        listaAmigos.add("Rosa");
        listaAmigos.add("Julia");

        for (int i = 0; i < listaAmigos.size(); i++) {
            System.out.println(listaAmigos.get(i));
        }
    }
}
