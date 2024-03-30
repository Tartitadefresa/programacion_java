public class Jugador extends ComponenteEquipo {
    private String posicion;
    private String nacionalidad;

    public Jugador(int identificador, String nombre, int edad, String nacionalidad, String posicion) {
        super(identificador, nombre, edad, nacionalidad);
        this.posicion = posicion;
    }

    public String getPosicion() {
        return posicion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Jugador [posicion=" + posicion + ", nacionalidad=" + nacionalidad + ", getIdentificador()="
                + this.getIdentificador() + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad()
                + ", getNacionalidad()=" + getNacionalidad() + "]";
    }
}
