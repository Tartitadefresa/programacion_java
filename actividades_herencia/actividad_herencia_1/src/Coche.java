public class Coche extends Vehiculo{
    private double diametroRueda;

    public Coche(String modelo, String marca, int numeroRuedas, double kilometrosRecorridos, double diametroRueda) {
        super(modelo, marca, numeroRuedas, kilometrosRecorridos);
        this.diametroRueda = diametroRueda;
    }

    public double getDiametroRueda() {
        return diametroRueda;
    }

    public String toString() {
        return "🚗 " + getMarca() + " " + getModelo() + "(" + getDiametroRueda() + "): " + getKilometrosRecorridos();
    }

}
