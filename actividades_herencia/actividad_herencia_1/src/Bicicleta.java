public  class Bicicleta extends Vehiculo {
    private String tipoBicicleta;

    public Bicicleta(
        String modelo, 
        String marca, 
        int numeroRuedas, 
        double kilometrosRecorridos, 
        String tipoBicicleta
    ) {
        super(modelo, marca, numeroRuedas, kilometrosRecorridos);
        this.tipoBicicleta = tipoBicicleta;
    }

    public String tipoCombustible() {
        return "Te toca pedalear";
    }

    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    public String toString() {
        return "🚲 " + getMarca() + " " + getModelo() + "(" + getTipoBicicleta() + "): " + getKilometrosRecorridos();
    }
}
