public class Cafetera {
    double capacidadMaxima;
    double cantidadActual;

    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    public Cafetera(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
    }

    public Cafetera(double capacidadMaxima, double capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;

        if (capacidadActual > capacidadMaxima) {
            this.cantidadActual = capacidadMaxima;
        } else {
            this.cantidadActual = capacidadActual;
        }
    }

    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
    }

    public void servirTaza(int cantidad) {
        if (cantidadActual >= cantidad) {
            cantidadActual -= cantidad;
        } else {
            cantidadActual = 0;
        }
    }

    public void vaciarCafetera() {
        cantidadActual = 0;
    }

    public void agregarCafe(int cantidad) {
        if (cantidadActual + cantidad <= capacidadMaxima) {
            cantidadActual += cantidad;
        } else {
            cantidadActual = capacidadMaxima;
        }
    }

    public void imprimirInformacionCafetera() {
        System.out.println("Capacidad máxima: " + capacidadMaxima);
        System.out.println("Cantidad actual: " + cantidadActual);
    }
}
