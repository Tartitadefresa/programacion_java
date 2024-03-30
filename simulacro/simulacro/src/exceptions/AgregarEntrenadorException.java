package exceptions;

public class AgregarEntrenadorException extends Exception {
    public AgregarEntrenadorException() {
        super("No se ha podido agregar el entrenador");
    }
}
