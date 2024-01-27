import javax.swing.JOptionPane;

public  class Mamifero extends Animal {
    private boolean esDeSangreCaliente;

    public Mamifero(String nombre, double peso, boolean esDeSangreCaliente) {
        super(nombre, peso);
        this.esDeSangreCaliente = esDeSangreCaliente;
    }

    public void parir() {
        JOptionPane.showMessageDialog(null, "El mamífero está pariendo");
    }

    public boolean getEsDeSangreCaliente() {
        return esDeSangreCaliente;
    }
}
