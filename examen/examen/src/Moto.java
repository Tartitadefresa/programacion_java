public class Moto extends Vehiculo{
    private int numeroPersonas;

    public Moto(String marca, String modelo, int unidades, double precio, int fechaRegistro, int potencia, int numeroPersonas) {
        super(marca, modelo, unidades, precio, fechaRegistro, potencia);
        this.numeroPersonas = numeroPersonas;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public String getCodigoRegistro() {
        return getMarca() + " <-> " + getModelo();
    }

    public String getNombreSimple() {
        String marca = getMarca();
        return marca.substring(0, 3).toUpperCase();
    }

    public boolean checkEsPeligrosa() {
        return getPotencia() > 100 && getNumeroPersonas() > 1;
    }

}
