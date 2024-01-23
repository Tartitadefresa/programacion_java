public class Ordenador {
    private String nombre;
    private int tamañoDisco;
    private float tamañoDiscoUtilizado;
    private boolean encendido;

    public Ordenador(String nombre) {
        this.nombre = nombre;
        this.tamañoDisco = 0;
        this.tamañoDiscoUtilizado = 0;
        this.encendido = false;
    }

    public void añadirDatos(int datos) {
        if (encendido == true) {
            tamañoDiscoUtilizado += datos;
            if (tamañoDiscoUtilizado > tamañoDisco) {
                tamañoDiscoUtilizado = tamañoDisco;
            }
        } else {
            System.out.println("El ordenador está apagado");
        }
    }

    public void eliminarDatos(int datos) {
        if (encendido) {
            tamañoDiscoUtilizado -= datos;
            if (tamañoDiscoUtilizado < 0) {
                tamañoDiscoUtilizado = 0;
            }
        }
    }

    public void encender() {
        encendido = true;
    }

    public void apagar() {
        encendido = false;
    }

    public String getInfoOrdenador() {
        return "Nombre: " + nombre + "\nTamaño del disco: " + tamañoDisco + "GB\nTamaño del disco utilizado: " + tamañoDiscoUtilizado + "GB\nEncendido: " + encendido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamañoDisco() {
        return tamañoDisco;
    }

    public void setTamañoDisco(int tamañoDisco) {
        this.tamañoDisco = tamañoDisco;
    }

    public float getTamañoDiscoUtilizado() {
        return tamañoDiscoUtilizado;
    }

    public void setTamañoDiscoUtilizado(float tamañoDiscoUtilizado) {
        this.tamañoDiscoUtilizado = tamañoDiscoUtilizado;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
}

