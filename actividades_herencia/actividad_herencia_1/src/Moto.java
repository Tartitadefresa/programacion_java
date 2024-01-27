public class Moto extends Vehiculo {
    private int conductoresPermitidos;

    public Moto(String modelo, String marca, int numeroRuedas, double kilometrosRecorridos, int conductoresPermitidos) {
        super(modelo, marca, numeroRuedas, kilometrosRecorridos);
        this.conductoresPermitidos = conductoresPermitidos;
    }

    public int getConductoresPermitidos() {
        return conductoresPermitidos;
    }

    public String toString() {
        return "🏍 " + getMarca() + " " + getModelo() + "(" + getConductoresPermitidos() + "): " + getKilometrosRecorridos();
    }
}
