import java.util.ArrayList;
import exceptions.AgregarJugadorClubException;
import exceptions.AgregarEntrenadorException;


public class Equipo {
    private String nombre;
    private String categoria;
    private ArrayList<Jugador> jugadores;
    private Entrenador entrenador;

    public Equipo(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.jugadores = new ArrayList<Jugador>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public String toString() {
        String base = "-  " + this.getNombre() + " " + "(" + this.getCategoria() 
        + ")\n  " + this.getEntrenador().toString();

        for (int i = 0; i < this.getJugadores().size(); i++) {
            base += "\n  Jugador " + (i + 1) + ": " + this.getJugadores().get(i).getNombre();
        }
        
        return base;
    }

    public void agregarJugador(Jugador jugador) throws AgregarJugadorClubException{
        if (buscarJugador(jugador.getNombre()) != null || this.jugadores.size() == 20){
            throw new AgregarJugadorClubException();
        }

        this.jugadores.add(jugador);
    }

    public void agregarEntrenador(Entrenador entrenador) throws AgregarEntrenadorException {
        if (this.getEntrenador() != null) {
            throw new AgregarEntrenadorException();
        }
        
        this.entrenador = entrenador;
    }

    private Jugador buscarJugador(String nombre) {
        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equals(nombre)) {
                return jugador;
            }
        }
        return null;
    }
}
