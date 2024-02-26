public class EdadNoPermitidaException extends Exception{
    private int edad;

    public EdadNoPermitidaException(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "La edad " + this.edad + " no es permitida.";
    }
}
