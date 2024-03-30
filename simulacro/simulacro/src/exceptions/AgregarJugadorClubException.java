package exceptions;

public class AgregarJugadorClubException extends Exception {
    public AgregarJugadorClubException() {
        super("No se ha podido agregar el jugador");
    }
}