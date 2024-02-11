public class Persona {
    private String nombre;
    private  String apellidos;
    private int edad;
    private String dni;

    public Persona(String nombre, String apellidos, int edad, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
    }

    public void esMayorDeEdad() {
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }
    }

    public String getInfoPersona() {
        return nombre + " " + apellidos + " (" + dni + "). " + edad;
    }

    public String getDni() {
        return dni;
    }

}