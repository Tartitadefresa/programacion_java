package exceptions;

public class AgregarClubException extends Exception {
    public AgregarClubException() {
        super("El equipo ya existe");
    }
}
