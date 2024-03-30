public abstract class ComponenteEquipo {
    private int identificador;
    private String nombre;
    private int edad;
    private String nacionalidad;

    public ComponenteEquipo(int identificador, String nombre, int edad, String nacionalidad) {
        super();
        this.identificador = identificador;
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "ComponenteEquipo [identificador=" + identificador + ", nombre=" + nombre + ", edad=" + edad
                + ", nacionalidad=" + nacionalidad + "]";
    }
}
