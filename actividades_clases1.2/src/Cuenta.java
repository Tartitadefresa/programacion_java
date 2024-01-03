public class Cuenta {
    private String titular;
    private double cantidad;

    Cuenta (String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String toString() {
        return "Titular: " + titular + ", Cantidad: " + cantidad;
    }
}