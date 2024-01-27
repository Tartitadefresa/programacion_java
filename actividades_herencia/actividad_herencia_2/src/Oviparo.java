import javax.swing.JOptionPane;

public class Oviparo extends Animal {
    private boolean tienePicoLargo;

    public Oviparo(String nombre, double peso, boolean tienePicoLargo) {
        super(nombre, peso);
        this.tienePicoLargo = tienePicoLargo;
    }

    public void comer() {
        JOptionPane.showMessageDialog(null, "Picoteando");
    }

    public void ponerHuevos() {
        JOptionPane.showMessageDialog(null, "Poniendo huevos");
    }

    public boolean getTienePicoLargo() {
        return tienePicoLargo;
    }
}
