public class Persona {
    private String nombre;
    private String apellido;

    Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String toString() {
        return "(" + this.nombre + " " + this.apellido + ")";
    }
}
