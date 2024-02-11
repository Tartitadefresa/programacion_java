import interfaces.IMascota;

public abstract class Mascotas implements IMascota {
    protected String nombre;
    protected int edad;
    protected String estado;
    protected String fechaNacimiento;

    Mascotas(String nombre, int edad, String fechaNacimiento) {
        super();
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = "Vivo";
    }

    public String getNombre() {
        return this.nombre;
    }

    public abstract void muestra();

    public void cumpleaños() {
        System.out.println("La mascota nació en: " + this.fechaNacimiento);
    }

    public void morir() {
        this.estado = "Muerto";
        System.out.println("La mascota con nombre " + this.nombre + " ha muerto");
    }

    public void habla() {
        this.estado = "Hablando";
        System.out.println("La mascota con nombre " + this.nombre + " está hablando");
    }
}
